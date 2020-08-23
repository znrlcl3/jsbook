package com.board.web.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.board.web.security.CampAuthenticationFailHandler;
import com.board.web.security.CampAuthenticationSuccessHandler;
import com.board.web.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	// 어떤페이지에서 인증이필요한지
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/board/list").authenticated().and()

				.formLogin().loginPage("/member/login").loginProcessingUrl("/member/login")
				.defaultSuccessUrl("/board/list").successHandler(new CampAuthenticationSuccessHandler())
				.failureHandler(new CampAuthenticationFailHandler()).and()

				.logout().logoutUrl("/member/logout").logoutSuccessUrl("/member/login").invalidateHttpSession(true)
				.and()

				.csrf().disable();
	}

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetailsService service = new MyUserDetailsService();

		return service;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());

		/*
		 * auth .jdbcAuthentication() .dataSource(dataSource)
		 * .usersByUsernameQuery("SELECT ID, PWD PASSWORD, 1 ENABLED FROM MEMBER WHERE ID=?"
		 * )
		 * .authoritiesByUsernameQuery("SELECT ID, 'ROLE_ADMIN' AUTHORITY FROM MEMBER WHERE ID=?"
		 * ) .passwordEncoder(new BCryptPasswordEncoder());
		 */
	}

}
