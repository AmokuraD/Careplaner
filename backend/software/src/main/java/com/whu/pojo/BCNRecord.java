package com.whu.pojo;
import java.util.List;
import org.apache.ibatis.type.Alias;

@Alias(value="bcRecord")
public class BCNRecord 
{
private int id;
private String skill;
private List<Book> bookList;
private List<Course> courseList;
private List<Netcourse> netcourseList;

public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public List<Book> getBookList() 
{
	return bookList;
}
public void setBookList(List<Book> bookList) 
{
	this.bookList = bookList;
}
public List<Course> getCourseList() 
{
	return courseList;
}
public void setCourseList(List<Course> courseList) 
{
	this.courseList = courseList;
}
public String getSkill()
{
	return skill;
}
public void setSkill(String skill) 
{
	this.skill = skill;
}
public List<Netcourse> getNetcourseList() 
{
	return netcourseList;
}
public void setNetcourseList(List<Netcourse> netcourseList) 
{
	this.netcourseList = netcourseList;
}
}
