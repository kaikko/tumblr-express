package com.thesaguaros.tumblrexpress;

import static org.junit.Assert.assertEquals;

import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.XMLContext;
import org.junit.Test;
import org.scribe.http.Request;
import org.scribe.http.Request.Verb;
import org.scribe.http.Response;
import org.scribe.oauth.Scribe;
import org.scribe.oauth.Token;
import org.xml.sax.InputSource;

import com.thesaguaros.tumblrexpress.pojo.Dashboard;


public class DashboardTest {

	@Test
	public void basicTest() throws MappingException, MarshalException, ValidationException {
		Properties props = new Properties();
		props.put("consumer.key", "ejSCe5ukH349uIQ342mlvFT8HgjUA3fej51VJNhrm3lu9DsgGT");
		props.put("consumer.secret", "64OUs098C4uQZgbJjfWD257GPURVVLql501BYfHQ8tpCFO38Vp"); 
		props.put("request.token.verb", "POST");
		props.put("request.token.url", "http://www.tumblr.com/oauth/request_token");
		props.put("access.token.verb", "POST");
		props.put("access.token.url", "http://www.tumblr.com/oauth/access_token");
		props.put("callback.url", "http://localhost:8080/callback");
		props.put("oauth_version", "1.0");
		
		Scribe scribe = new Scribe(props);
		
	    String accessTokenStr = "qdsVmfWENWgwSLtalY5X5KbRXAz6ofkKHBQVrmeIZvkSuId4K8";
	    String accessTokenSecretStr = "aUXcxFLmuDkMrxlpl8KGlLEzGFYPzyGPqfxu7n1TS5EwPEDTj7";
		Token accessToken = new Token(accessTokenStr, accessTokenSecretStr);
		
		Request request = new Request(Verb.POST, "https://www.tumblr.com/api/dashboard");
		request.addBodyParameter("num", "5");
		scribe.signRequest(request, accessToken);
		Response response = request.send();
		
		InputSource input = new InputSource(ClassLoader.getSystemResourceAsStream("com/thesaguaros/tumblrexpress/xml/mapping/tumblr-mapping-dashboard.xml"));
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
		//assertEquals("931346077", dashboard.getPosts().getPosts().get(0).getId());
		assertEquals(5, dashboard.getPosts().getPosts().size());
		
	}
	
	
}
