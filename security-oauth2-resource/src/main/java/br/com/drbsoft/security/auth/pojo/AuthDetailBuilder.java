package br.com.drbsoft.security.auth.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import br.com.drbsoft.security.auth.domain.AuthDetail;
import br.com.drbsoft.security.auth.domain.Grant;
import br.com.drbsoft.security.auth.domain.Resource;
import br.com.drbsoft.security.auth.domain.Role;
import br.com.drbsoft.security.auth.domain.User;

public class AuthDetailBuilder {

	public static AuthDetailPojo fromDomain(AuthDetail detail) {
		return new AuthDetailPojo(detail.getClientId(), buildUser(detail.getUser()) , buildRoles(detail.getRoles()));
	}

	private static List<RolePojo> buildRoles(List<Role> roles) {
		if(CollectionUtils.isEmpty(roles)){
			return null;
		}
		
		List<RolePojo> pojos = new ArrayList<RolePojo>();
		
		for(Role role : roles){
			RolePojo pojo = new RolePojo();
			pojo.setId(role.getId());
			pojo.setName(role.getName());
			pojo.setDescription(role.getDescription());
			
			pojo.setResources(buildResources(role.getResources()));
			
			pojos.add(pojo);
		}
		
		return pojos;
	}

	private static List<ResourcePojo> buildResources(List<Resource> resources) {
		if(CollectionUtils.isEmpty(resources)){
			return null;
		}
		
		List<ResourcePojo> pojos = new ArrayList<ResourcePojo>();
		
		for(Resource resource : resources){
			ResourcePojo pojo = new ResourcePojo();
			pojo.setId(resource.getId());
			pojo.setEndpoint(resource.getEndpoint());
			pojo.setPrefix(resource.getPrefix());
			pojo.setResourceUri(resource.getResourceUri());
			
			pojo.setGrants(buildGrants(resource.getGrants()));
			
			pojos.add(pojo);
		}
		
		return pojos;
	}

	private static List<String> buildGrants(List<Grant> grants) {
		if(CollectionUtils.isEmpty(grants)){
			return null;
		}
		
		List<String> list = new ArrayList<String>();
		
		for(Grant grant : grants){
			list.add(grant.getGrant());
		}
		
		return list;
	}

	private static UserPojo buildUser(User user) {
		if(user == null){
			return null;
		}
		
		UserPojo pojo = new UserPojo();
		pojo.setId(user.getId());
		pojo.setUsername(user.getUsername());
		
		return pojo;
	}

}
