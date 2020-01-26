package com.jnu.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import com.jnu.pojo.user;
import com.jnu.pojo.worker;

public class loginDao {
	public worker checkLogin(String uname,String pwd) throws Exception {
		worker w = null;
		daoBase base = new daoBase();
		String sql = "select * from Worker where WorkerName = ? and WorkerPassword = ?";
		w = base.getBean(worker.class, sql, uname, pwd);
		return w;
	}
}
