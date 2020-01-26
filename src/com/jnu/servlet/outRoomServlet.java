package com.jnu.servlet;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.room;
import com.jnu.service.roomShowService;

public class outRoomServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置接受编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//获取操作变量
		String roomid = req.getParameter("roomid");
		
		//传入值，获取操作结果
		List<room> list = null;
		roomShowService service = new roomShowService();
		try {
			list = service.roomShowServie(roomid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list != null) {
			//请求转发
			req.setAttribute("list", list);
			req.getRequestDispatcher("/jsp/outroomshow.jsp").forward(req, resp);
		}
		
	}
}
