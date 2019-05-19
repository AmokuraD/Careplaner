package com.whu.pojo;
import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias(value="netcourse")
public class Netcourse implements Serializable
{
private static final long serialVersionUID = 6L;
private int id;
private String skill;
private String name;
private String ts;
private String image;
private String type;
private String url;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTs() {
	return ts;
}
public void setTs(String ts) {
	this.ts = ts;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
}
