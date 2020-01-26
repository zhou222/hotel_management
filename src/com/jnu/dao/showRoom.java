package com.jnu.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import com.jnu.pojo.room;

public class showRoom {
	public List<room> roomshow() {
		List<room> list = null;
		String sql = "select * from Room";
		daoBase base = new daoBase();
		list = base.getBeanList(room.class, sql);
		return list;
	}
}
