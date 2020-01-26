package com.jnu.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import com.jnu.pojo.room;

public class outRoomDao {
	public List<room> roomShowDao(String roomid){
		List<room> r = null;
		daoBase base = new daoBase();
		String sql = "select * from Room where RoomID = ?";
		r = base.getBeanList(room.class, sql, roomid);
		return r;
	}
}
