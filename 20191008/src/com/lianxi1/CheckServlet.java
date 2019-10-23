package com.lianxi1;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡҳ����Ϣ
		String name = request.getParameter("loginname");
		String check = request.getParameter("save");
		
		//�жϸ�ѡ���Ƿ�ѡ��
		if(check != null) {//��ѡ��
			//�����û�����cookie�У�������Чʱ��Ϊһ��
			String encodeName = URLEncoder.encode(name,"utf-8");
			Cookie cookie = new Cookie("lname", encodeName);
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
		}
		
		request.getRequestDispatcher("/success.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
