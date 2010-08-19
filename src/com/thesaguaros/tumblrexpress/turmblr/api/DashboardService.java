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

import com.thesaguaros.tumblrexpress.pojo.castor.Dashboard;

public class DashboardService {

	
	
	/*
	 * 
	 * 
	 * start, num, type, filter (optional) - Identical to /api/read above. The maximum value of start is 250.
likes (optional) - 1 or 0, default 0. If 1, liked posts will have the liked="true" attribute.
	 * 
	 * 
	 */
	
	
	protected static Dashboard getPosts(Properties scribeProps, Token accessToken) throws MappingException, MarshalException, ValidationException {
		Scribe scribe = new Scribe(scribeProps);
		Request request = new Request(Verb.POST, "https://www.tumblr.com/api/dashboard");
		//TODO request.addBodyParameter("num", "5");
		scribe.signRequest(request, accessToken);
		Response response = request.send();
		
		InputSource input = new InputSource(ClassLoader.getSystemResourceAsStream("com/thesaguaros/tumblrexpress/xml/castor/mapping/tumblr-mapping-dashboard.xml"));
		Mapping mapping = new Mapping();
		mapping.loadMapping(input);
		// initialize and configure XMLContext
		XMLContext context = new XMLContext();
		context.addMapping(mapping);

		// Create a Reader to the file to unmarshal from
		Reader reader = new StringReader(response.getBody());
		
		// Create a new Unmarshaller
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setClass(Dashboard.class);

		// Unmarshal the person object
		Dashboard dashboard = (Dashboard) unmarshaller.unmarshal(reader);
		return dashboard;
	}
}
