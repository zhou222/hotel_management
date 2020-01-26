package com.jnu.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import com.jnu.dao.userDao;
import com.jnu.pojo.user;

public class userService {
	public List<user> userShowService(String name){
		userDao dao = new userDao();
		return dao.userShowDao(name);
		
	}
}
