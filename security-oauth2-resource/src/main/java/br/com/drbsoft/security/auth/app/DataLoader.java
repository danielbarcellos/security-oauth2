package br.com.drbsoft.security.auth.app;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.drbsoft.security.auth.domain.AuthDetail;
import br.com.drbsoft.security.auth.domain.Grant;
import br.com.drbsoft.security.auth.domain.Resource;
import br.com.drbsoft.security.auth.domain.Role;
import br.com.drbsoft.security.auth.domain.User;
import br.com.drbsoft.security.auth.repository.AuthDetailJpaRepository;

@Component
@Transactional
public class DataLoader implements ApplicationRunner {

	@Autowired
	private AuthDetailJpaRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		final String CLIENTID = "lojaAssinaturasId";

		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"alessandra_maia"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"alice_rech"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"amanda_teixeira"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"ana_kremer"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"ana_souza"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"anderson_rodrigues2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"andrea_rodrigues"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"angela_tolfo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("bruna_pereira3"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"bruna_pereira3"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"bruna_pozzan"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"bruna_rosa"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"bruno_vidor"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"camila_leal"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"camila_lima"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("carlos_silva8"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"carlos_silva8"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"carolina_pinto"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("celina_bastos"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"celina_bastos"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"christiane_flores"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"cristine_borges"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"deise_straccioni"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"dennis_cavalheiro"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"douglas_richter"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"everton_bittencourt"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"fabiana_garcias"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"fabrizio_marmitt"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("felipe_munareto"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"felipe_munareto"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("felipe_vigel"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"felipe_vigel"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("fernanda_razzolini"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"fernanda_razzolini"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("fernanda_silva10"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"fernanda_silva10"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"flavia_azevedo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"gabriella_stoduto"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"geovane_bellinazo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"gian_mella"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"guilherme_pereira4"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"guilherme_roehe"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("guilherme_seleser"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"guilherme_seleser"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"gustavo_altreiter"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"henrique_oliveira"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"jakiel_oliveira"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("jenie_rodrigues"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"jenie_rodrigues"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"joana_souza"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"jonathan_silva2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("joseane_silva"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"joseane_silva"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"joyce_santos"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("juliana_constante"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"juliana_constante"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"juliane_merigo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("juliano_felix"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"juliano_felix"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("juliano_scurssel"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"juliano_scurssel"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"karine_bruch"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("karla_silva"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"karla_silva"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("keethlyn_dambros"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"keethlyn_dambros"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("kelly_oliveira2"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"kelly_oliveira2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("laion_escouto"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"laion_escouto"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"larissa_oliveira3"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("laura_baick"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"laura_baick"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"lilian_solano"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"lisandro_ramos"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"luciana_silva"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"mara_soares"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("marcelo_rodrigues2"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"marcelo_rodrigues2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("marcelo_santos4"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"marcelo_santos4"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"marcio_da_silva"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"mariana_santos4"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("matheus_motta"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"matheus_motta"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"maurens_rosa"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"maximiliano.lannes"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"maximiliano_lannes"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("miriam_caetano"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"miriam_caetano"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"natacha_de_moraes"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("natasha_schmeing"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"natasha_schmeing"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"patricia_flores"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"paulo_soliman"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("priscila_souza"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"priscila_souza"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"priscilla_oliveira2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"rafaela_mendes"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("rafaela_signor"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"rafaela_signor"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"raquel_fabris"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("renata_cervo"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"renata_cervo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"ricardo_valiati"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"robson_farias"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"rodrigo_favarin"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("rodrigo_reis2"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"rodrigo_reis2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"rui_ledur"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"sabrina_raczinoski"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("shani_patrocinio"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"shani_patrocinio"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"silvana_justo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-bruno_pelicoli"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-bruno_pelicoli"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-cassiane_schuch"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-cassiane_schuch"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-daniel_barcellos"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-henrique_davila"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-henrique_davila"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-jader_cunha"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-jefersongoncalves"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-liliane_vicente"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-liliane_vicente"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-luana_melo"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-luana_melo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-lucas_cardozo"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-lucas_cardozo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-lucas_fernandes"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-lucas_fernandes"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-maria_lentz"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-maria_lentz"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-mateus_silveira"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-mateus_silveira"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-renata_raythz"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-renata_raythz"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-roberta_oliveira"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-roberta_oliveira"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-robson_cardoso"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-simone_morales"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-simone_morales"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("tc-taina_dutra"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tc-taina_dutra"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("thaleana_moncorvo"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"thaleana_moncorvo"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("thiago_ferreira2"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"thiago_ferreira2"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"tiago_steiner"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("vanessa_alsina"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"vanessa_alsina"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"vanessa_santos5"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"viviane_peter"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
		repository.save(new AuthDetail(CLIENTID, new User("yasmim_euzebio"),
				Arrays.asList(new Role[] { new Role("ROLE_COLABORACAO", "ROLE_COLABORACAO",
						Arrays.asList(new Resource[] {
								new Resource("/loja/carrinhos", "loja", "carrinhos",
										Arrays.asList(new Grant[] { new Grant("read"), new Grant("update"),
												new Grant("create") })),
						new Resource("/loja/backoffice", "loja", "backoffice", Arrays.asList(
								new Grant[] { new Grant("read"), new Grant("update"), new Grant("create") })) })) })));
		repository
				.save(new AuthDetail(CLIENTID,
						new User(
								"yasmim_euzebio"),
						Arrays.asList(
								new Role[] {
										new Role("ROLE_CONTROLE_TOTAL", "ROLE_CONTROLE_TOTAL",
												Arrays.asList(new Resource[] {
														new Resource("/loja/carrinhos", "loja", "carrinhos",
																Arrays.asList(new Grant[] { new Grant("read"),
																		new Grant("update"), new Grant("create"),
																		new Grant("delete") })),
												new Resource("/loja/backoffice", "loja", "backoffice",
														Arrays.asList(new Grant[] { new Grant("read"),
																new Grant("update"), new Grant("create"),
																new Grant("delete") })) })) })));
	}

}
