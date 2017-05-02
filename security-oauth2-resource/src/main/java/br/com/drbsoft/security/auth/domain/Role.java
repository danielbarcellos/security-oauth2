
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
@Table(name = "oauth_roles")
public class Role implements java.io.Serializable{
	
	private static final long serialVersionUID = -6000629526474684977L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String name;
    
    private String description;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Resource> resources;
    
    public Role() {
	}
    
    public Role(String name, String description, List<Resource> resources) {
		this.name = name;
		this.description = description;
		this.resources = resources;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
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
