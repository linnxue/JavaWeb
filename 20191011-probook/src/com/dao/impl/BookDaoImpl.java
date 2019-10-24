package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.IBookDao;
import com.pojo.Book;
import com.service.impl.BookServiceImpl;
import com.utils.DBUtil;

public class BookDaoImpl implements IBookDao{

	@Override
	public List<Book> getAllBooks() {
		String sql = "select * from books";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		 List<Book> books = new ArrayList<Book>();
		try {
			conn = DBUtil.getConnetion();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setBname(rs.getString("bname"));
				book.setCover(rs.getString("cover"));
				book.setId(rs.getInt("id"));
				book.setIntroduction(rs.getString("introduction"));
				book.setMoney(rs.getInt("money"));
				book.setPname(rs.getString("pname"));
				book.setPress(rs.getString("press"));
				
				books.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return books;
	}

	@Override
	public Book getBookById(int id) {
		String sql = "select * from books where id =?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Book book = null;
		try {
			conn = DBUtil.getConnetion();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				book = new Book();
				book.setBname(rs.getString("bname"));
				book.setCover(rs.getString("cover"));
				book.setId(rs.getInt("id"));
				book.setIntroduction(rs.getString("introduction"));
				book.setMoney(rs.getInt("money"));
				book.setPname(rs.getString("pname"));
				book.setPress(rs.getString("press"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return book;
	}

	@Override
	public int addBook(Book book) {
		String sql = "insert into books values (default, ?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int cnt = 0;
		try {
			conn = DBUtil.getConnetion();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBname());
			pstmt.setString(2, book.getPname());
			pstmt.setString(3, book.getPress());
			pstmt.setInt(4, book.getMoney());
			pstmt.setString(5, book.getIntroduction());
			pstmt.setString(6, book.getCover());
			
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		BookDaoImpl bd = new BookDaoImpl();
		//System.out.println(bd.getAllBooks());
		//System.out.println(bd.getBookById(3));
		
		Book b = new Book();
		b.setBname("JavaWeb基础");
		b.setPname("编程爱好者");
		b.setMoney(58);
		b.setIntroduction("适用于初学者");
		b.setPress("清华出版社");
		b.setCover("/img/web.jpg");
		
		System.out.println(bd.addBook(b));
	}

}
