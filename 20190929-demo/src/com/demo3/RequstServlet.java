package com.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�����еĲ���ֵ
		String name = req.getParameter("uname");
		String pwd = req.getParameter("upwd");
		System.out.println(name+"\t"+pwd);
				
		String sex = req.getParameter("sex");
		System.out.println(sex);
		//�����е���������ֵ
		String[] hbs = req.getParameterValues("hobby");
		for(String b : hbs) {
			System.out.print(b+"\t");
		}
		System.out.println();
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='utf-8'>");
		out.print("</head>");
		out.print("<body>");

		if(name.equals("admin") && pwd.equals("123456")) {
			out.print("��¼�ɹ�");
		}else {
			out.print("��¼ʧ��");
		}
		out.print("</body>");
		out.print("</html>");
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���post�����е���������
		req.setCharacterEncoding("utf-8");
		//�����еĲ���ֵ
		String name = req.getParameter("uname");
		String pwd = req.getParameter("upwd");
		System.out.println(name+"\t"+pwd);
		
		String sex = req.getParameter("sex");
		System.out.println(sex);
		//�����е���������ֵ
		String[] hbs = req.getParameterValues("hobby");
		for(String b : hbs) {
			System.out.print(b+"\t");
		}
		System.out.println();
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='utf-8'>");
		out.print("</head>");
		out.print("<body>");

		if(name.equals("admin") && pwd.equals("123456")) {
			out.print("��¼�ɹ�");
		}else {
			out.print("��¼ʧ��");
		}
		out.print("</body>");
		out.print("</html>");

	}
}
