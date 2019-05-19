package com.whu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.HighendDao;
import com.whu.pojo.Highend;

@Service
public class HighendService 
{
	@Autowired
	private HighendDao highendDao=null;
	
	public Highend getHighend(String name) 
	{
		return highendDao.getHighend(name);
	}
}
