package com.whu.pojo;
import java.io.Serializable;
import org.apache.ibatis.type.Alias;

@Alias(value="course")
public class Course implements Serializable
{
	private static final long serialVersionUID = 2L;
	private int id;
	private String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
}
