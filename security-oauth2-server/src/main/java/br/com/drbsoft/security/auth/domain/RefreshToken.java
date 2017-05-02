package br.com.drbsoft.security.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_refresh_token")
public class RefreshToken implements java.io.Serializable {

	private static final long serialVersionUID = -1192777983425654263L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "refresh_token_id")
	private Long refreshTokenId;

	@Column(name = "token_id")
	private String tokenId;

	@Column(name = "token", columnDefinition="LONG VARBINARY")
	private byte[] token;

	@Column(name = "authentication", columnDefinition="LONG VARBINARY")
	private byte[] authentication;

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public byte[] getToken() {
		return token;
	}

	public void setToken(byte[] token) {
		this.token = token;
	}

	public byte[] getAuthentication() {
		return authentication;
	}

	public void setAuthentication(byte[] authentication) {
		this.authentication = authentication;
	}

}
