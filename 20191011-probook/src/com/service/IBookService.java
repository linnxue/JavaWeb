package com.service;

import java.util.List;

import com.pojo.Book;

public interface IBookService {
		//查找全部图书信息
		public List<Book> getAllBooks();
		//根据id查找图书信息
		public Book getBookById(int id);
		//添加图书信息
		public boolean addBook(Book book);

}
