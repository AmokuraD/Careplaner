package com.whu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.CourseDao;
import com.whu.pojo.Course;

@Service
public class CourseService 
{
	@Autowired
	private CourseDao courseDao=null;
	
	public List<Course> getCourses(String skill)
	{
		return courseDao.getCourses(skill);
	}
}
