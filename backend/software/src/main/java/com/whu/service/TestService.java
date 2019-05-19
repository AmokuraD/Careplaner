package com.whu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.TestDao;
import com.whu.pojo.Test;

@Service
public class TestService 
{
	@Autowired
	private TestDao testDao=null;
	
	public Test getTest(String name) 
	{
		return testDao.getTest(name);
	}
}
