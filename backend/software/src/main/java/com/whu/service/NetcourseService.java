package com.whu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.NetcourseDao;
import com.whu.pojo.Netcourse;

@Service
public class NetcourseService 
{
	@Autowired
	private NetcourseDao netcourseDao =null;
	
	public List<Netcourse> getNetcourses(String skill)
	{
		return netcourseDao.getNetcourses(skill);
	}
}
