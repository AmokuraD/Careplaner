package com.whu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.MfDao;
import com.whu.pojo.Mf;

@Service
public class MfService 
{
	@Autowired
	private MfDao mfDao=null;
	
	public Mf getMf(String name) 
	{
		return mfDao.getMf(name);
	}
}
