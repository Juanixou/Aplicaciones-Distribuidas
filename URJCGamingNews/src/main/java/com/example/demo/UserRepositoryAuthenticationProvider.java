package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserRepository repositorioUsuario;
	
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
 
		List<User> listaUser = repositorioUsuario.findByUsuario(auth.getName());
		User user = listaUser.get(0);

		
		if (user == null) {
			 throw new BadCredentialsException("User not found");
			 }
		System.out.println(user.getEmail()+" "+user.getId());
			 String password = (String) auth.getCredentials();
			 if (!new BCryptPasswordEncoder().matches(password, user.getPassword())) {
			 throw new BadCredentialsException("Wrong password");
			 }

			 List<GrantedAuthority> roles = new ArrayList<>();
			 for (String role : user.getRoles()) {
			 roles.add(new SimpleGrantedAuthority(role));
			 }
			 return new UsernamePasswordAuthenticationToken(user.getUsuario(), password, roles);

	}

	@Override
	public boolean supports(Class<?> authenticationObject) {
		// TODO Auto-generated method stub
		return true;
	}

}
