package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import com.pojo.Book;
import com.service.IBookService;
import com.service.impl.BookServiceImpl;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/servlet/*")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBookService bs = new BookServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取request中uri
		String uri = request.getRequestURI();
		if(uri.contains("ShowServlet")) {
			show(request,response);
		}else if(uri.contains("ShowBookServlet")) {
			showone(request, response);
		}
	}
	
	
	private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用service，保存结果到session中
		List<Book> list = bs.getAllBooks();
		request.getSession().setAttribute("books", list);
		//跳转显示页面
		String root = this.getServletContext().getContextPath();
		response.sendRedirect(root+"/show.jsp");
	}
	
	private void showone(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		String uri = request.getRequestURI();
		if(!uri.contains("AddBookServlet")) {
			this.doGet(request, response);
			return;
		}
		
		
		request.setCharacterEncoding("utf-8");
		Book book = new Book();
		
		DiskFileItemFactory fac = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(fac);
		try {
			List<FileItem> items = sfu.parseRequest(request);
			
			for(FileItem fi : items) {
				if(fi.isFormField()) {
					String fieldname = fi.getFieldName();
					String value = fi.getString("utf-8");
					switch(fieldname) {
					case "bname":
						book.setBname(value);
						break;
					case "pname":
						book.setPname(value);
						break;
					case "press":
						book.setPress(value);
						break;
					case "intro":
						book.setIntroduction(value);
						break;
					case "money":
						book.setMoney(Integer.parseInt(value));
						break;
					}
					
				}else {
					String pagepath = fi.getName();
					String filename = FilenameUtils.getName(pagepath);
					book.setCover("/img/"+filename);
					String path = this.getServletContext().getRealPath("/img");
					File pathFile = new File(path);
					if(!pathFile.exists()) {
						pathFile.mkdirs();
					}
					File file = new File(path, filename);
					fi.write(file);
				}
			}
		} catch (FileUploadException e) {
			// TODO Autao-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//保存图示信息
		bs.addBook(book);
		
		//跳转到showServlet
		request.getRequestDispatcher("/servlet/ShowServlet").forward(request, response);
	}

}
