package com.jnu.dao;

import java.util.Random;

import com.jnu.pojo.reg;

public class regDao {
	public int regDao(reg r) throws Exception {
		int i=0;
		String sql = "insert into Customer values(?,?,?,?,?,?)";
		daoBase base = new daoBase();
		int idi = (int) (Math.random()*5);
		String id = idi + "c";
		int j = base.upDate(sql, id,r.getCustomername(),r.getSex(),r.getCustomertype(),r.getCustomerphone(),r.getCustomerindate());
		int iidi = (int) (Math.random()*5);
		String id2 = iidi + "i";
		String sql2 = "insert into InHistory values(?,?,?,?,?,?,?)";
		int z = base.upDate(sql2,id2, id,r.getCustomertype(), r.getCustomerindate(),r.getCustomeroutdate(),r.getRoomid(),r.getWorkname());
		
		//更新房间状态
		String sql3 = "update Room set RoomState = '已入住' where RoomID = ?";
		base.upDate(sql3, r.getRoomid());
		return j+z;
	}
}
