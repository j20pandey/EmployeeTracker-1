package com.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.one.model.User;
import com.one.model.UserDetailsImpl;
import com.one.repository.UserRepository;

@Service
public class AppService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByuserName(username);
		if(user == null)
			throw new UsernameNotFoundException("Bad Credantials");
		else {
			return new UserDetailsImpl(user);
		}
		
		
	}

}
