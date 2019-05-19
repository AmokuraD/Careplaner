package com.whu.dao;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Course;

@Repository
public interface CourseDao 
{
	public ArrayList<Course> getCourses(String skill);
}
