package com.wzc.springBootTest.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, jsr250Enabled=false)
public class WebSecurityConfig extends HandlerInterceptorAdapter{
	private final static Log log = LogFactory.getLog(WebSecurityConfig.class);
	
	public void  configure(HttpSecurity httpSecurity) throws Exception{
		if (log.isTraceEnabled()) {
			log.trace("configure httpSecurity...");
		}
		
		// 默认的spring-security配置会让所有请求都必须在已登陆的状况下访问，这段代码禁止类这段操作
		httpSecurity.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeRequests().anyRequest().permitAll();
	}

}
