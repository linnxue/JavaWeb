package com.service;

import java.util.List;

import com.pojo.Book;

public interface IBookService {
		//����ȫ��ͼ����Ϣ
		public List<Book> getAllBooks();
		//����id����ͼ����Ϣ
		public Book getBookById(int id);
		//���ͼ����Ϣ
		public boolean addBook(Book book);

}
