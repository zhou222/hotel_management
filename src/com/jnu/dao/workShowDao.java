package com.jnu.dao;

import java.util.List;

import com.jnu.pojo.worker;

public class workShowDao {
	public List<worker> workerShow(){
		List<worker> list = null;
		String sql = "select * from Worker";
		daoBase base = new daoBase();
		list = base.getBeanList(worker.class, sql);
		return list;
	}
}
