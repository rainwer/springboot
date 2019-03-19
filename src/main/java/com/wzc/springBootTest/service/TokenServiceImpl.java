package com.wzc.springBootTest.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.wzc.springBootTest.bean.User;
import com.wzc.springBootTest.dao.TokenDao;
@Service("tokenService")
public class TokenServiceImpl implements TokenService{

	// 一般是把token和用户对应关系放在数据库或高速缓存（例如redis，/memcache等），放在一个单类的成员变量里仅适合很小规模的情形
	private Map<String, UserDetails> tokenMap = new HashMap<>();

	@Autowired
	private TokenDao tokenDao;

	/**
	 * 这个方法每次访问都会被调用；为了提示效率应该使用@Cacheable注解缓存；
	 * 
	 * @param token
	 * @return
	 */
	public UserDetails getUserFromToken(String token) {
		if (token == null) {
			return null;
		}
		return tokenMap.get("token");
	}

	/**
	 *  登陆成功返回token
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public String login(String username, String password) {
//		User ud = tokenDao.findUser(username, password);
		User ud = null;
		if (ud != null) {
			tokenMap.put(ud.getToken(), ud);
			return ud.getToken();
		}

		return null;

	}

	/**
	 * 退出，移除token
	 * @param token
	 */
	public void logout(String token) {
		tokenMap.remove(token);
	}


}
