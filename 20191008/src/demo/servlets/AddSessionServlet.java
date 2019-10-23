package demo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSessionServlet")
public class AddSessionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡsession����
		HttpSession  session = request.getSession();
		//session��������
		session.setAttribute("name", "��ķ");
		User u = new User(1,"Tom","123456","��",18);
		session.setAttribute("user", u);
		
		//����ʱ��
		session.setMaxInactiveInterval(100);
		
		System.out.println("session save data ok");
		response.getWriter().print(session.getId());
	}

}
