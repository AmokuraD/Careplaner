package com.whu.pojo;
import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias(value="book")
public class Book implements Serializable
{
private static final long serialVersionUID = 1L;
private int id;
private String skill;
private String name;
private String author;
private String publisher;
private String intro;
private String image;
private String url;

public String getSkill() 
{
	return skill;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getIntro() {
	return intro;
}
public void setIntro(String intro) {
	this.intro = intro;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public void setSkill(String skill) 
{
	this.skill = skill;
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
}
