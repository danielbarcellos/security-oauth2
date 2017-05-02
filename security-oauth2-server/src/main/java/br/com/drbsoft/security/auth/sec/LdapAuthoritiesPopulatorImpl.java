package br.com.drbsoft.security.auth.sec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import br.com.drbsoft.security.auth.common.LdapGrantedAuthority;

@Component
public class LdapAuthoritiesPopulatorImpl implements LdapAuthoritiesPopulator, java.io.Serializable {

	private static final long serialVersionUID = -6102445672226984817L;

	@Autowired
	private volatile JdbcTemplate jdbcTemplate;
	
	@Value("${clientId}")
	private String clientId;

	@Override
	public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations userData, String username) {
		
		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();

		List<String> roles = this.jdbcTemplate.queryForList(
				"SELECT r.name as role FROM auth_db.oauth_details d, auth_db.oauth_users u, auth_db.oauth_details_roles dr, auth_db.oauth_roles r WHERE d.user_id = u.id AND d.id = dr.auth_detail_id AND dr.roles_id = r.id AND u.username = ? AND d.client_id = ?", 
				new Object[] { 
						username, this.clientId 
					}, 
				String.class);
		
		

		if (!CollectionUtils.isEmpty(roles)) {
			for (String role : roles) {
				grantedAuthorities.add(new LdapGrantedAuthority(role));
			}
		}

		return grantedAuthorities;
	}
}