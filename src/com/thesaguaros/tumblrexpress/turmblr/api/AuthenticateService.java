package com.thesaguaros.tumblrexpress.turmblr.api;

import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLContext;
import org.scribe.http.Request;
import org.scribe.http.Request.Verb;
import org.scribe.http.Response;
import org.scribe.oauth.Scribe;
import org.scribe.oauth.Token;
import org.xml.sax.InputSource;

import com.thesaguaros.tumblrexpress.pojo.castor.Authenticate;

public class AuthenticateService {

	protected static Authenticate getInfo(Properties scribeProps, Token accessToken, boolean includeTheme) throws MappingException, MarshalException, ValidationException {
		
		Scribe scribe = new Scribe(scribeProps);
		
		Request request = new Request(Verb.POST, "https://www.tumblr.com/api/authenticate");
		if (includeTheme) {
			request.addBodyParameter("include-theme", "1");
		}
		scribe.signRequest(request, accessToken);
		Response response = request.send();
		
		InputSource input = new InputSource(ClassLoader.getSystemResourceAsStream("com/thesaguaros/tumblrexpress/xml/castor/mapping/tumblr-mapping-authenticate.xml"));
		Mapping mapping = new Mapping();
		mapping.loadMapping(input);
		// initialize and configure XMLContext
		XMLContext context = new XMLContext();
		context.addMapping(mapping);

		// Create a Reader to the file to unmarshal from
		Reader reader = new StringReader(response.getBody());

		// Create a new Unmarshaller
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(Authenticate.class);

		// Unmarshal the person object
		Authenticate authenticate = (Authenticate) unmarshaller.unmarshal(reader);
		return authenticate;
	}
	
	
}
