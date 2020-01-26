package com.jnu.until;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class jdbcUtil {
	private static DataSource dataSource;
	
	static{
		//1.提取数据配置文件内容
		InputStream is = jdbcUtil.class.getClassLoader().getResourceAsStream("druid.properties");
		Properties info = new Properties();
		try {
			info.load(is);
			//2.给数据池传参
			dataSource = DruidDataSourceFactory.createDataSource(info);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取链接
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		conn = dataSource.getConnection();
		System.out.println(conn);
		return conn;
	}
	//关闭链接资源
	public static void closeConnection(ResultSet rs,Statement sm,Connection conn) {
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sm!=null)
		{
			try {
				sm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
