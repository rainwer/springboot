package com.wzc.springBootTest.config;

import java.util.Collection;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 这个类不起作用
 * @author wuzhongcheng
 *
 */
//@Configuration
//@EnableWebSecurity
public class WebSecurityConfigNotUsedHere extends WebSecurityConfigurerAdapter{
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserDetailsService uds = new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				return new UserDetails() {

					/**
					 * serialVersionUID
					 */
					private static final long serialVersionUID = -4417255901059928339L;

					@Override
					public Collection<? extends GrantedAuthority> getAuthorities() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public String getPassword() {
						return null;
					}

					@Override
					public String getUsername() {
						return username;
					}

					@Override
					public boolean isAccountNonExpired() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public boolean isAccountNonLocked() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public boolean isCredentialsNonExpired() {
						// TODO Auto-generated method stub
						return false;
					}

					@Override
					public boolean isEnabled() {
						// TODO Auto-generated method stub
						return false;
					}
					
				};
			}

			
		};
		auth.userDetailsService(uds);
	}

}
