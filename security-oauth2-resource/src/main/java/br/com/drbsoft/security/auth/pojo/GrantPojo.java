package br.com.drbsoft.security.auth.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class GrantPojo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3312329076591927188L;

	@JsonIgnore
	private Long id;
	
	private String grant;
	
	public GrantPojo() {
	}
	
	public GrantPojo(String grant) {
		this.grant = grant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGrant() {
		return grant;
	}

	public void setGrant(String grant) {
		this.grant = grant;
	}
}
