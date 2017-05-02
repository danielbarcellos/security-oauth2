package br.com.drbsoft.security.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_client_token")
public class ClientToken implements java.io.Serializable{
	
	private static final long serialVersionUID = -8903239626536470304L;

	@Id
	@Column(name = "authentication_id")
	private String authenticationId;

	@Column(name = "token_id")
	private String tokenId;
	
	@Column(name = "token")
	private String token;

	@Column(name = "user_name")
	private String username;

	@Column(name = "client_id")
	private String clientId;
	
	public ClientToken() {
	}
	
	
}
