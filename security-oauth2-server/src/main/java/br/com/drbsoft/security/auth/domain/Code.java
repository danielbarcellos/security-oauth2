package br.com.drbsoft.security.auth.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_code")
public class Code implements java.io.Serializable {

	private static final long serialVersionUID = 8165081837199468732L;
	
	@Id
	@Column(name = "code_id")
	private Long codeId;

	@Column(name = "code")
	private String code;

	@Column(name = "authentication", columnDefinition="LONG VARBINARY")
	private byte[] authentication;

	public Code() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public byte[] getAuthentication() {
		return authentication;
	}

	public void setAuthentication(byte[] authentication) {
		this.authentication = authentication;
	}

}
