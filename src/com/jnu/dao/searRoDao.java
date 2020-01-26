package com.jnu.dao;

import java.util.List;

import com.jnu.pojo.room;

public class searRoDao {
	public List<room> searchRoomDao(String roomid) {
		daoBase base = new daoBase();
		String sql = "select * from Room where RoomType = ?";
		
		List<room> list = base.getBeanList(room.class, sql,roomid);
		return list;
	}
}
