
package br.com.drbsoft.security.auth.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RolePojo implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7750096214509265203L;

	@JsonIgnore
	private Long id;

    @SerializedName("name")
    @Expose
    private String name;
    
    @SerializedName("description")
    @Expose
    private String description;
    
    @SerializedName("resources")
    @Expose
    private List<ResourcePojo> resources;
    
    public RolePojo() {
	}
    
    public RolePojo(String name, List<ResourcePojo> resources) {
		this.name = name;
		this.resources = resources;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ResourcePojo> getResources() {
        return resources;
    }

    public void setResources(List<ResourcePojo> resources) {
        this.resources = resources;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
