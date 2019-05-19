package com.whu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.BookDao;
import com.whu.pojo.Book;

@Service
public class BookService 
{
	@Autowired
	private BookDao bookDao =null;
	
	public List<Book> getBooks(String skill)
	{
		return bookDao.getBooks(skill);
	}
}
