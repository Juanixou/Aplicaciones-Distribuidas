package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public UserRepositoryAuthenticationProvider authenticationProvider;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
			
		//URLs publicas
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/login").permitAll();
		http.authorizeRequests().antMatchers("/logout").permitAll();
		http.authorizeRequests().antMatchers("/categoria").permitAll();
		http.authorizeRequests().antMatchers("/categorias").permitAll();
		http.authorizeRequests().antMatchers("/evento").permitAll();
		http.authorizeRequests().antMatchers("/eventos").permitAll();
		http.authorizeRequests().antMatchers("/noticia").permitAll();
		http.authorizeRequests().antMatchers("/newsletter").permitAll();
		
		//URLs privadas

		http.authorizeRequests().antMatchers("/escribirNoticia").hasAnyRole("ADMIN");
		http.authorizeRequests().antMatchers("/checkNew").hasAnyRole("ADMIN");
		http.authorizeRequests().antMatchers(HttpMethod.GET, "https://127.0.0.1:8443/checklogin").hasAnyRole("USER");
		
		//Login
		 http.formLogin().loginPage("/login");
		 http.formLogin().loginProcessingUrl("https://127.0.0.1:8443/checklogin");
		 http.formLogin().usernameParameter("uname");
		 http.formLogin().passwordParameter("psw");
		 http.formLogin().defaultSuccessUrl("/");
		 http.formLogin().failureUrl("/login");
		 
		 //Logout
		 http.logout().logoutUrl("/logout");
		 http.logout().logoutSuccessUrl("/");

		 //http.csrf().disable();

	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		//Usuario
		auth.authenticationProvider(authenticationProvider);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    //web.ignoring().antMatchers("/resources/**");
	}
	
}
