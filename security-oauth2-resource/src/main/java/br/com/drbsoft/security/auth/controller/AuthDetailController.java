package br.com.drbsoft.security.auth.controller;

import static br.com.drbsoft.security.auth.util.Utils.extractToken;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.drbsoft.security.auth.domain.AuthDetail;
import br.com.drbsoft.security.auth.pojo.AuthDetailBuilder;
import br.com.drbsoft.security.auth.pojo.AuthDetailPojo;
import br.com.drbsoft.security.auth.service.AuthDetailService;

@RestController
@RequestMapping("/user")
public class AuthDetailController {

	@Autowired
	AuthDetailService service;

	@Resource(name = "tokenStore")
	TokenStore tokenStore;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthDetailPojo> user(@RequestHeader(HttpHeaders.AUTHORIZATION) String header) {
		if (StringUtils.isEmpty(header)) {
			return new ResponseEntity<AuthDetailPojo>(HttpStatus.UNAUTHORIZED);
		}
		

		String extractToken = extractToken(header);
		
		OAuth2Authentication authentication = tokenStore.readAuthentication(extractToken);
		Authentication userAuthentication = authentication.getUserAuthentication();
		String login = userAuthentication.getName();
		
		AuthDetail detail = this.service.findByLogin(login);
		if (detail == null) {
			return new ResponseEntity<AuthDetailPojo>(HttpStatus.NOT_FOUND);
		}
		
		AuthDetailPojo pojo = AuthDetailBuilder.fromDomain(detail);

		return new ResponseEntity<AuthDetailPojo>(pojo, HttpStatus.OK);
	}
}