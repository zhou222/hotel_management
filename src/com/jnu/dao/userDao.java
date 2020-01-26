package com.jnu.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import com.jnu.pojo.user;

public class userDao {
	public List<user> userShowDao(String name){
		List<user> list = null;
		daoBase base = new daoBase();
		String sql = "select CustomerName,CustomerSex,Customer.CustomerType,CustomerPhone,RoomID,CustomerInDate,CustomerOutDate"+
" from Customer,InHistory"+" where Customer.CustomerID = InHistory.CustomerID"+" and CustomerName = ?";
		list = base.getBeanList(user.class, sql, name);
		return list;
	}
}
