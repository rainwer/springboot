//package com.wzc.springBootTest.security;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Service;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.wzc.springBootTest.service.TokenService;
//
///**
// * 从request中获取token，并把token转换成用户，放置到当前的spring context内。
// * 这个类必须写一个@Service注解，否则spring不会加载它作为filter
// */
//@Service
//public class AuthenticationTokenFilter extends OncePerRequestFilter {
//
//	private final static Log log = LogFactory.getLog(AuthenticationTokenFilter.class);
//	@Autowired
//	private TokenService tokenService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String authToken = null;
//		String requestHeader = request.getHeader("Authorization");
//		if (requestHeader != null && requestHeader.startsWith("bearer ")) {
//			authToken = requestHeader.substring(7);
//
//		}
//		if (log.isTraceEnabled()) {
//			log.trace("token is " + authToken);
//		}
//		if (authToken != null) {
//			UserDetails user = null;
//			user = tokenService.getUserFromToken(authToken);
//
//			if (user != null) {
//				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null,
//						user.getAuthorities());
//				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(authentication);
//			}
//		}
//
//		filterChain.doFilter(request, response);
//
//	}
//
//}
