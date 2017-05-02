package br.com.drbsoft.security.auth.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_approvals")
public class Approval implements java.io.Serializable {

	private static final long serialVersionUID = -7694804462822268842L;
	
	@Id
	@Column(name = "approval_id")
	private Long approvalId;

	@Column(name = "userId")
	private String userId;

	@Column(name = "clientId")
	private String clientId;

	@Column(name = "scope")
	private String scope;

	@Column(name = "status")
	private String status;

	@Column(name = "expiresAt")
	private Timestamp expiresAt;

	@Column(name = "lastModifiedAt")
	private Timestamp lastModifiedAt;

	public Approval() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Timestamp expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Timestamp getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Timestamp lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

}
