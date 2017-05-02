
package br.com.drbsoft.security.auth.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthDetailPojo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8371513488026505797L;

	@JsonIgnore
	private Long id;

	@Expose(serialize = false)
	@JsonIgnore
	private String clientId;

	@SerializedName("user")
	@Expose
	private UserPojo user;

	@SerializedName("roles")
	@Expose
	private List<RolePojo> roles;

	public AuthDetailPojo() {
	}

	public AuthDetailPojo(String clientId, UserPojo user, List<RolePojo> roles) {
		this.clientId = clientId;
		this.roles = roles;
		this.user = user;
	}

	public UserPojo getUser() {
		return user;
	}

	public void setUser(UserPojo user) {
		this.user = user;
	}

	public List<RolePojo> getRoles() {
		return roles;
	}

	public void setRoles(List<RolePojo> roles) {
		this.roles = roles;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}
