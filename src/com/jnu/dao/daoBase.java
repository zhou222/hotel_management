package com.jnu.dao;


import java.sql.Connection;
import java.util.List;

import javax.enterprise.inject.New;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.jnu.until.jdbcUtil;


public class daoBase {
	private QueryRunner runner = new QueryRunner();
	//增删改
	public int upDate(String sql,Object...params) throws Exception {
		int i = 0;
		Connection conn = jdbcUtil.getConnection();
		System.out.println(conn);
		i = runner.update(conn, sql, params);
		jdbcUtil.closeConnection(null, null, conn);
		return i;
	}
	//查询语句封装为一条users对象
	public <T>T getBean(Class<T> type,String sql,Object...params) throws Exception {
		T t = null;
		Connection conn=jdbcUtil.getConnection();
		
		t = runner.query(conn, sql, new BeanHandler<T>(type), params);
		jdbcUtil.closeConnection(null, null, conn);
		return t;
	}
	//封装多条对象
	public <T>List<T> getBeanList(Class<T> type,String sql,Object...params) {
		List<T> list = null;
		Connection conn = null;
		try {
			conn = jdbcUtil.getConnection();
			list = runner.query(conn, sql, new BeanListHandler<T>(type), params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jdbcUtil.closeConnection(null, null, conn);
		return list;
	}
}
