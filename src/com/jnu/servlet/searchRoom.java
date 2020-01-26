package com.jnu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.room;
import com.jnu.service.searchRoomService;

public class searchRoom extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置接受编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//获取操作变量
		String roomid = req.getParameter("selected");
		
		//获取操作结果
		searchRoomService sv = new searchRoomService();
		List<room> list = sv.searRoService(roomid);
		
		System.out.println(roomid);
		System.out.println(list);
		//返回结果
		if (list!=null) {
			req.setAttribute("list", list);
			req.getRequestDispatcher("/jsp/roomshow.jsp").forward(req, resp);  //请求转发
		}
		return;
	}
}
