
package br.com.drbsoft.security.auth.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResourcePojo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2800669596819462626L;

	@JsonIgnore
	private Long id;

	@SerializedName("resourceUri")
	@Expose
	private String resourceUri;
	
	@SerializedName("prefix")
	@Expose
	private String prefix;
	
	@SerializedName("endpoint")
	@Expose
	private String endpoint;
	
	@SerializedName("grants")
	@Expose
	private List<String> grants;

	public ResourcePojo() {
	}

	public ResourcePojo(String resourceUri, String prefix, String endpoint, List<String> grants) {
		super();
		this.resourceUri = resourceUri;
		this.prefix = prefix;
		this.endpoint = endpoint;
		this.setGrants(grants);
	}

	public String getResourceUri() {
		return resourceUri;
	}

	public void setResourceUri(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public List<String> getGrants() {
		return grants;
	}

	public void setGrants(List<String> grants) {
		this.grants = grants;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
