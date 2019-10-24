package com.art.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.art.pojo.Art;
import com.art.pojo.Page;
import com.art.service.IArtService;
import com.art.service.impl.ArtServiceImpl;

/**
 * Servlet implementation class ArtPageServlet
 */
@WebServlet("/ArtPageServlet2")
public class ArtPageServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IArtService ias = new ArtServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArtPageServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strPageno = request.getParameter("no");
		String strSize = request.getParameter("size");
		
		int pageno = 1,size = 6;
		if (strPageno!=null) {
			pageno = Integer.parseInt(strPageno);
		}
		if (strSize!=null) {
			size = Integer.parseInt(strSize);
		}
		Page page = ias.getArtsByPage(size, pageno);
		request.getSession().setAttribute("page", page);
		
		response.sendRedirect("/art-mall/user-index.jsp");
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
