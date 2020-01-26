package com.jnu.service;

import java.util.List;

import com.jnu.dao.outRoomDao;
import com.jnu.pojo.room;

public class roomShowService {
	public List<room> roomShowServie(String roomid) throws Exception{
		outRoomDao dao = new outRoomDao();
		return dao.roomShowDao(roomid);
	}
}
