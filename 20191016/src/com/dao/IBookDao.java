package com.dao;

import java.util.List;

import com.pojo.Book;

public interface IBookDao {
	
	//����ȫ��ͼ����Ϣ
	public List<Book> getAllBooks();
	//����id����ͼ����Ϣ
	public Book getBookById(int id);
	//���ͼ����Ϣ
	public int addBook(Book book);
}
