package br.com.drbsoft.security.auth.service;

import br.com.drbsoft.security.auth.domain.AuthDetail;

public interface AuthDetailService {

	AuthDetail findByLogin(String token);
}
