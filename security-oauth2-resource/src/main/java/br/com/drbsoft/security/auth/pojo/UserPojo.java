
package br.com.drbsoft.security.auth.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserPojo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2044369900193757581L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@SerializedName("username")
	@Expose
	private String username;
	
	public UserPojo() {
	}
	
	public UserPojo(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
