package br.com.drbsoft.security.auth.common;

import org.springframework.security.core.GrantedAuthority;

public class LdapGrantedAuthority implements GrantedAuthority{
	
	private static final long serialVersionUID = -2228637207227657616L;
	
	private String authority;
	
	public LdapGrantedAuthority(String authority) {
		this.authority = authority; 
	}

	@Override
	public String getAuthority() {
		return authority;
	}

}
