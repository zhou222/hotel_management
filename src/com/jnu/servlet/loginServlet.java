package com.jnu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.worker;
import com.jnu.service.loginService;

public class loginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置接受编码格式
		req.setCharacterEncoding("utf-8");
		//设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		//获取值
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		
		//传值
		loginService service = new loginService();
		worker w = null;
		try {
			w = service.checkLoginService(username, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (w != null) {
			//登陆成功,重定向
			resp.sendRedirect("/HotelManage/jsp/main.jsp");
		}else {
			//登陆失败
			resp.getWriter().print("<script>alert('账号或密码错误');window.location.href='/HotelManage/login.jsp'</script>");
		}
	}
}
