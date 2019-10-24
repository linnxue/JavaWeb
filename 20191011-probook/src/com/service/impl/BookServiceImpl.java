package com.service.impl;

import java.util.List;

import com.dao.IBookDao;
import com.dao.impl.BookDaoImpl;
import com.pojo.Book;
import com.service.IBookService;

public class BookServiceImpl implements IBookService {
	private IBookDao bd = new BookDaoImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bd.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bd.getBookById(id);
	}

	@Override
	public boolean addBook(Book book) {
		int rs = bd.addBook(book);
//		if(rs >0) {
//			return true;
//		}else {
//			return false;
//		}
		return rs > 0;
	}

}
