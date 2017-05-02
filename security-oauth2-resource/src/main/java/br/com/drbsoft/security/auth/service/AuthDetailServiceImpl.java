package br.com.drbsoft.security.auth.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.drbsoft.security.auth.domain.AuthDetail;
import br.com.drbsoft.security.auth.repository.AuthDetailJpaRepository;

@Service
@Transactional
public class AuthDetailServiceImpl implements AuthDetailService {

	private AuthDetailJpaRepository repository;

	@Autowired
	public AuthDetailServiceImpl(AuthDetailJpaRepository repository) {
		this.repository = repository;
	}

	@Override
	public AuthDetail findByLogin(String token) {
		return this.repository.findByLogin(token);
	}

}
