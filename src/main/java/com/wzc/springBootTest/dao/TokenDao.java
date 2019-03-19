package com.wzc.springBootTest.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wzc.springBootTest.bean.User;


@Mapper
@Repository
public interface TokenDao {
//	@Select("select * from user")
	public User findUser(String username, String password);

}
