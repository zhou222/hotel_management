package com.jnu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jnu.pojo.reg;
import com.jnu.service.regService;

public class regServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//设置接受编码格式
				req.setCharacterEncoding("utf-8");
				//设置响应编码格式
				resp.setContentType("text/html;charset=utf-8");
				//获取操作变量
				String name = req.getParameter("name");
				String phone = req.getParameter("phone");
				String sex = req.getParameter("sex");
				String type = req.getParameter("type");
				String incredit = req.getParameter("incredit");
				String indate = req.getParameter("indate");
				String outdate = req.getParameter("outdate");
				String cname = req.getParameter("cname");
				String roomid = req.getParameter("roomid");
				
				//给对象赋值
				reg re = new reg();
				
				re.setCustomername(name);
				re.setCustomerphone(phone);
				re.setSex(sex);
				re.setCustomertype(type);
				re.setIncreditnumber(incredit);
				re.setCustomerindate(indate);
				re.setCustomeroutdate(outdate);
				re.setWorkname(cname);
				re.setRoomid(roomid);
				
				regService sv = new regService();
				int i = 0;
				try {
					i = sv.regService(re);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
				if(i!=0)
				{
					resp.getWriter().print("<script>alert('办理成功,按确认键返回');window.location.href='/HotelManage/jsp/show.jsp'</script>");
				}
	}
}
