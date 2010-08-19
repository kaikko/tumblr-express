package com.thesaguaros.tumblrexpress.turmblr.api;

import java.util.Properties;

import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.scribe.oauth.Token;

import com.thesaguaros.tumblrexpress.pojo.castor.Authenticate;

public class Services {
	
	private Properties scribeProps;
	private Token accessToken;

	public Services () {
		//TODO to remove and parametrize
		scribeProps = new Properties();
		scribeProps.put("consumer.key", "ejSCe5ukH349uIQ342mlvFT8HgjUA3fej51VJNhrm3lu9DsgGT");
		scribeProps.put("consumer.secret", "64OUs098C4uQZgbJjfWD257GPURVVLql501BYfHQ8tpCFO38Vp"); 
		scribeProps.put("request.token.verb", "POST");
		scribeProps.put("request.token.url", "http://www.tumblr.com/oauth/request_token");
		scribeProps.put("access.token.verb", "POST");
		scribeProps.put("access.token.url", "http://www.tumblr.com/oauth/access_token");
		scribeProps.put("callback.url", "http://localhost:8080/callback");
		scribeProps.put("oauth_version", "1.0");
		
	    String accessTokenStr = "qdsVmfWENWgwSLtalY5X5KbRXAz6ofkKHBQVrmeIZvkSuId4K8";
	    String accessTokenSecretStr = "aUXcxFLmuDkMrxlpl8KGlLEzGFYPzyGPqfxu7n1TS5EwPEDTj7";
		accessToken = new Token(accessTokenStr, accessTokenSecretStr);
	}
	
	public Authenticate getInfo(boolean includeTheme) {
		try {
			Authenticate authenticate = AuthenticateService.getInfo(scribeProps, accessToken, includeTheme);
			return authenticate;
		} catch (MarshalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
