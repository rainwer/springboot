package com.wzc.springBootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.wzc.springBootTest.dao.TokenDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {
	
	@Autowired
	TokenDao tokendao;

	@Test
	public void contextLoads() {
//		tokendao.insert();
	}
	
	@Autowired
	@Qualifier("redisTemplate")
	RedisTemplate redis;
	
	@Test
	public void test() {
		
		redis.opsForValue().set("aaa", 11111);
		
		Object object = redis.opsForValue().get("aaa");
		
		System.out.println(object);
		
	}

}
