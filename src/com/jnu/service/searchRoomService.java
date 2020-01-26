package com.jnu.service;

import java.util.List;

import com.jnu.dao.searRoDao;
import com.jnu.pojo.room;

public class searchRoomService {
	public List<room> searRoService(String roomid){
		searRoDao sa = new searRoDao();
		return sa.searchRoomDao(roomid);
	}
}
