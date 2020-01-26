package com.jnu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.user;
import com.jnu.service.userService;

public class userRecordServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置接受编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		//获取变量
		String name = req.getParameter("name");
		
		//传值
		List<user> list = null;
		userService service = new userService();
		list = service.userShowService(name);
		//请求转发
		if(list!=null){
		req.setAttribute("list", list);
		req.getRequestDispatcher("/jsp/usershow.jsp").forward(req, resp);
		}
		
	}
}
