package com.rahulit.blog_app_api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rahulit.blog_app_api.constants.AppConstants;
import com.rahulit.blog_app_api.entity.User;
import com.rahulit.blog_app_api.exception.ResourceNotFoundException;
import com.rahulit.blog_app_api.repository.UserRepository;
@Service
public class CustomUserDetailServce implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	//load user from database by username
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = this.userRepository.findByEmail(userName)
				.orElseThrow(() -> new ResourceNotFoundException("User", "email: " + userName, 0));
		return user;
	}

}
