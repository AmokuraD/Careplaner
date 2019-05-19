package com.whu.pojo;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias(value="record")
public class Record
{
private int id;
private String table;
private String name;
private List<String> skillList;
public String getTable()
{
	return table;
}
public void setTable(String table) 
{
	this.table = table;
}
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
public List<String> getSkillList() 
{
	return skillList;
}
public void setSkillList(List<String> skillList) 
{
	this.skillList = skillList;
}
}
