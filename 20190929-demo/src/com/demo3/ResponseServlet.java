package com.demo3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> list = new ArrayList<String>();
		list.add("С��");
		list.add("С��");
		list.add("С��");
		list.add("С��");
		list.add("С��");
		//��Ӧ�ͻ���<h1>��������ͨ��Servlet����</h1>
		// HttpServletResponse ��Ӧ���� resp��Ӧ����
		//������Ӧ�ı��뷽ʽ
		resp.setContentType("text/html;charset=utf-8");
		//��ȡ��ӡ��
		PrintWriter out = resp.getWriter();
		//��Ӧ����
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='utf-8'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hello World</h1>");
		out.print("<h1>��������ͨ��Servlet����</h1>");
		out.print("<table border='1' width='200'>");
		out.print("<tr>");
		out.print("<td>���</td>");
		out.print("<td>����</td>");
		out.print("</tr>");
		for(int i=0; i < list.size(); i++) {
			out.print("<tr>");
			out.print("<td>"+(i+1)+"</td>");
			out.print("<td>"+list.get(i)+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
	}
}
