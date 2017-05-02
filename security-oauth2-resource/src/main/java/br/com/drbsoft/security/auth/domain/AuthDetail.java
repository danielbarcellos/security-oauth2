
package br.com.drbsoft.security.auth.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "oauth_details")
public class AuthDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6688628584140556525L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@Expose(serialize = false)
	@JsonIgnore
	private String clientId;

	@SerializedName("user")
	@Expose
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	@SerializedName("roles")
	@Expose
	@OneToMany(cascade = CascadeType.ALL)
	private List<Role> roles;

	public AuthDetail() {
	}

	public AuthDetail(String clientId, User user, List<Role> roles) {
		this.clientId = clientId;
		this.roles = roles;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}