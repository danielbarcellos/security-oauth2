package br.com.drbsoft.security.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.drbsoft.security.auth.domain.AuthDetail;

public interface AuthDetailJpaRepository extends JpaRepository<AuthDetail, Long> {

	@Query("FROM AuthDetail WHERE user.username = ?1")
	AuthDetail findByLogin(String token);
}
