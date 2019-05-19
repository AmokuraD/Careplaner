package com.whu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.DevelopDao;
import com.whu.pojo.Develop;

@Service
public class DevelopService 
{
	@Autowired
	private DevelopDao developDao=null;
	
	public Develop getDevelop(String name) 
	{
		return developDao.getDevelop(name);
	}
}
