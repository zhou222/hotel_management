package com.jnu.service;

import static org.hamcrest.CoreMatchers.nullValue;

import com.jnu.dao.loginDao;
import com.jnu.pojo.worker;

public class loginService {
	public worker checkLoginService(String uname,String pwd) throws Exception{
		worker w = null;
		loginDao dao = new loginDao();
		w = dao.checkLogin(uname, pwd);
		return w;
	}
}
