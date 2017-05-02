
package br.com.drbsoft.security.auth.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_resources")
public class Resource implements java.io.Serializable {

	private static final long serialVersionUID = -6793320747808991594L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String resourceUri;

	private String prefix;

	private String endpoint;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Grant> grants;

	public Resource() {
	}

	public Resource(String resourceUri, String prefix, String endpoint, List<Grant> grants) {
		super();
		this.resourceUri = resourceUri;
		this.prefix = prefix;
		this.endpoint = endpoint;
		this.grants = grants;
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

	public List<Grant> getGrants() {
		return grants;
	}

	public void setGrants(List<Grant> grants) {
		this.grants = grants;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
