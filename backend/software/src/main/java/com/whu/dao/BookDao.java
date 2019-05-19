package com.whu.dao;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Book;

@Repository
public interface BookDao 
{
	public ArrayList<Book> getBooks(String skill);
}
