package com.jnu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.worker;
import com.jnu.service.workerService;

public class workManageServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置接受编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		//执行操作
		workerService service = new workerService();
		List<worker> list = service.workerShow();
		if (list!=null) {
			//重定向
			req.setAttribute("list", list);
			req.getRequestDispatcher("/jsp/workershow.jsp").forward(req, resp);
		}
		
		
		
	}
}
