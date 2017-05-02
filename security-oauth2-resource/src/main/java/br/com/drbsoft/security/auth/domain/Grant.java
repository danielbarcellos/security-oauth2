package br.com.drbsoft.security.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "oauth_grants")
public class Grant implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7323432853415248739L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "grant_")
	private String grant;
	
	public Grant() {
	}
	
	public Grant(String grant) {
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
