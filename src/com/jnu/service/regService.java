package com.jnu.service;

import com.jnu.dao.regDao;
import com.jnu.pojo.reg;

public class regService {
	public int regService(reg re) throws Exception {
		regDao dao = new regDao();
		return dao.regDao(re);
	}
}
