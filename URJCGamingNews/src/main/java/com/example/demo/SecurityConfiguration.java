package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public UserRepositoryAuthenticationProvider authenticationProvider;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
			
		//URLs publicas
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/login").permitAll();
		http.authorizeRequests().antMatchers("/categoria").permitAll();
		http.authorizeRequests().antMatchers("/categorias").permitAll();
		http.authorizeRequests().antMatchers("/evento").permitAll();
		http.authorizeRequests().antMatchers("/eventos").permitAll();
		http.authorizeRequests().antMatchers("/noticia").permitAll();
		http.authorizeRequests().antMatchers("/checklogin").permitAll();
		
		//URLs privadas
		//http.authorizeRequests().antMatchers("/escribirNoticia").hasAnyRole("ADMIN");
		http.authorizeRequests().antMatchers("/escribirNoticia").hasAnyRole("ROLE_ADMIN");
		
		//Login
		 http.formLogin().loginPage("/login");
		 http.formLogin().usernameParameter("uname");
		 http.formLogin().passwordParameter("psw");
		 http.formLogin().defaultSuccessUrl("/escribirNoticia");
		 http.formLogin().failureUrl("/login");



	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		//Usuario
		auth.authenticationProvider(authenticationProvider);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/resources/**");
	}
	
}
