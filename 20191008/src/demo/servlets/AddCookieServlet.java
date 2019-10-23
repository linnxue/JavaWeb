package demo.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
@WebServlet("/servlets/cookie/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����Cookie
		Cookie ck1 = new Cookie("ck1","Cookie1");
		
		//����
		response.addCookie(ck1);
		
		Cookie ck2 = new Cookie("ck2","Cookie2");
		//��Ч��Χ
		String root = this.getServletContext().getContextPath();
		ck2.setPath(root+"/servlet/");//�ͻ���
		//��Чʱ��
		ck2.setMaxAge(60*60*24);
		response.addCookie(ck2);
		
		
		Cookie ck3 = new Cookie("ck3",URLEncoder.encode("���", "utf-8"));
		ck3.setPath("/");// ��Ŀ��������Դcookie������
		ck3.setMaxAge(60*60*24);
		response.addCookie(ck3);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
