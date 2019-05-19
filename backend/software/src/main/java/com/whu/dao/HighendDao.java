package com.whu.dao;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Highend;

@Repository
public interface HighendDao 
{
	public Highend getHighend(String name);
}
