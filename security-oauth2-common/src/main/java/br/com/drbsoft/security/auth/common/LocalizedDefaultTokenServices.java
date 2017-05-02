package br.com.drbsoft.security.auth.common;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.util.StringUtils;

public class LocalizedDefaultTokenServices extends DefaultTokenServices{

	private static final String ACCESS_TOKEN_EXPIRED_MESSAGE = "Access token expired: ";
	private static final String INVALID_ACCESS_TOKEN_MESSAGE = "Invalid access token: ";

	@Override
	public OAuth2Authentication loadAuthentication(String accessTokenValue)
			throws AuthenticationException, InvalidTokenException {
		try{
			return super.loadAuthentication(accessTokenValue);
		}catch(InvalidTokenException e){
			throw translateInvalidTokenException(e);
		}
	}

	private InvalidTokenException translateInvalidTokenException(InvalidTokenException e){
		if(e.getMessage() != null && e.getMessage().contains(INVALID_ACCESS_TOKEN_MESSAGE)){
			return invalidAccessTokenExceptionTranslator(e);
		}else if(e.getMessage() != null && e.getMessage().contains(ACCESS_TOKEN_EXPIRED_MESSAGE)){
			return expiredAccessTokenExceptionTranslator(e);
		}
		
		return e;
	}

	private InvalidTokenException invalidAccessTokenExceptionTranslator(InvalidTokenException e) {
		final String message = e.getMessage();
		return new InvalidTokenException(StringUtils.replace(message, INVALID_ACCESS_TOKEN_MESSAGE, "Token de acesso inválido: "));
	}
	
	private InvalidTokenException expiredAccessTokenExceptionTranslator(InvalidTokenException e) {
		final String message = e.getMessage();
		return new InvalidTokenException(StringUtils.replace(message, ACCESS_TOKEN_EXPIRED_MESSAGE, "Token de acesso expirado: "));
	}
}
