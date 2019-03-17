//package com.wzc.springBootTest.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true, jsr250Enabled= false)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		
//		httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().
//		authorizeRequests()
//		.antMatchers("/manager").hasRole("admin")
//		.anyRequest().permitAll();
//		
//	}
//
//}
