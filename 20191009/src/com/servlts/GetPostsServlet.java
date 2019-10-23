package com.servlts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Post;

/**
 * Servlet implementation class GetPostsServlet
 */
@WebServlet("/GetPostsServlet")
public class GetPostsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPostsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Post> list = new ArrayList<Post>();
		list.add(new Post(1,"��������","����������Ա"));
		list.add(new Post(2,"��������","����������"));
		list.add(new Post(3,"ҵ����","ҵ������"));
		list.add(new Post(4,"ҵ�����","ҵ����Ա"));
		list.add(new Post(5,"�ܾ���","��˾������"));
		
		HttpSession session = request.getSession();
		session.setAttribute("ps", list);
		
		response.sendRedirect("/20191009/showPost.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
