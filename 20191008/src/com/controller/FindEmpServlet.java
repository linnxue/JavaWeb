package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Employee;
import com.service.EmployeeService;

/**
 * Servlet implementation class FindEmpServlet
 */
@WebServlet("/FindEmp")
public class FindEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmployeeService es = new EmployeeService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�����е�ֵ
		String ename = request.getParameter("ename");//����ı�����ֵ ����""
		String pname = request.getParameter("pname");
		//���������е�ֵ����Employee
		Employee emp = new Employee();
		if(!"".equals(ename)) {
			emp.setName(ename);
		}
		if(!"".equals(pname)) {
			emp.getPost().setName(pname);
		}
		//����Service�еĶ�Ӧ����
		List<Employee> list = es.getEmpsByNameOrPost(emp);
		//��Ӧ���ͻ���
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset='utf-8'>");
		out.print("<style>");
		out.println("tbody tr:nth-child(even){background-color:pink;}");
		out.println("tbody tr:nth-child(odd){background-color:orange;}");
		out.print("</style>");
		out.print("</head>");
		out.println("<body>");
		if(list.size()==0) {
			out.print("<h3>�޷��������ļ�¼</h3>");
		}else {
			out.print("<table width='600' border='1' align='center'>");
			out.print("<tr style='background-color:blue;'>");
			out.print("<td>Ա�����</td>");			
			out.print("<td>Ա��ְλ</td>");
			out.print("<td>Ա������</td>");
			out.print("<td>Ա���Ա�</td>");
			out.print("<td>Ա������</td>");
			out.print("<td>Ա������</td>");
			out.print("<td>Ա������</td>");
			out.print("</tr>");
			out.print("<tbody>");
			for(int i=0; i<list.size(); i++) {
				Employee e = list.get(i);
				out.print("<tr>");
				out.print("<td>"+e.getId()+"</td>");
				out.print("<td>"+e.getPost().getName()+"</td>");
				out.print("<td>"+e.getName()+"</td>");
				if("1".equals(e.getSex())) {
					out.print("<td>��</td>");
				}else {
					out.print("<td>Ů</td>");
				}
				out.print("<td>"+e.getAge()+"</td>");
				out.print("<td>"+e.getDepart()+"</td>");
				out.print("<td>"+e.getYear()+"</td>");
				out.print("</tr>");
//				if(i%2==0) {
//					out.print("<tr style='background-color:red'>");
//					out.print("<td>"+e.getId()+"</td>");
//					out.print("<td>"+e.getPost().getName()+"</td>");
//					out.print("<td>"+e.getName()+"</td>");
//					out.print("<td>"+e.getSex()+"</td>");
//					out.print("<td>"+e.getAge()+"</td>");
//					out.print("<td>"+e.getDepart()+"</td>");
//					out.print("<td>"+e.getYear()+"</td>");
//					out.print("</tr>");
//				}else {
//					out.print("<tr style='background-color:yellow'>");
//					out.print("<td>"+e.getId()+"</td>");
//					out.print("<td>"+e.getPost().getName()+"</td>");
//					out.print("<td>"+e.getName()+"</td>");
//					out.print("<td>"+e.getSex()+"</td>");
//					out.print("<td>"+e.getAge()+"</td>");
//					out.print("<td>"+e.getDepart()+"</td>");
//					out.print("<td>"+e.getYear()+"</td>");
//					out.print("</tr>");
//				}
			}
			out.print("</tbody>");
			out.print("</table>");
			
		}
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
