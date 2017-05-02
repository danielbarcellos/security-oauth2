package br.com.drbsoft.security.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_access_token")
public class AccessToken implements java.io.Serializable {

	private static final long serialVersionUID = -3596384933572452080L;

	@Id
	@Column(name = "authentication_id")
	private String authenticationId;

	@Column(name = "token_id")
	private String tokenId;

	@Column(name = "token", columnDefinition="LONG VARBINARY")
	private byte[] token;

	@Column(name = "user_name")
	private String username;

	@Column(name = "client_id")
	private String clientId;

	@Column(name = "authentication", columnDefinition="LONG VARBINARY")
	private byte[] authentication;

	@Column(name = "refresh_token")
	private String refresh_token;

	public byte[] getToken() {
		return token;
	}

	public void setToken(byte[] token) {
		this.token = token;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(String authenticationId) {
		this.authenticationId = authenticationId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public byte[] getAuthentication() {
		return authentication;
	}

	public void setAuthentication(byte[] authentication) {
		this.authentication = authentication;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

}
