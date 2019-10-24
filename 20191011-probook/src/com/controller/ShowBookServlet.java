package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Book;
import com.service.IBookService;
import com.service.impl.BookServiceImpl;

/**
 * Servlet implementation class ShowBookServlet
 */
//@WebServlet("/servlet/ShowBookServlet")
public class ShowBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IBookService bs = new BookServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取id，调用查询图书，保存，跳转
		String sid = request.getParameter("id");
		Book book = bs.getBookById(Integer.parseInt(sid));
		request.getSession().setAttribute("book", book);
		String root = this.getServletContext().getContextPath();
		response.sendRedirect(root+"/book.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
