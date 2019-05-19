package com.whu.dao;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Netcourse;

@Repository
public interface NetcourseDao 
{
	public ArrayList<Netcourse> getNetcourses(String skill);
}
