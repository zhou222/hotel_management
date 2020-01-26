package com.jnu.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

import com.jnu.dao.daoBase;
import com.jnu.pojo.room;
import com.jnu.until.jdbcUtil;

public class jdbctest {

	@Test
	public void test() throws Exception {
		Connection conn = jdbcUtil.getConnection();
		if (conn!=null) {
			System.out.println("成功");
		}
		daoBase dao = new daoBase();
		String sql = "insert into Room values('301','单人',158,'未入住')";
		 
		daoBase bas = new daoBase();
		
		int room = bas.upDate(sql);
		System.out.println(room);
	}

}
