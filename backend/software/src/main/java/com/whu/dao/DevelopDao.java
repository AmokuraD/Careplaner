package com.whu.dao;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Develop;

@Repository
public interface DevelopDao 
{
public Develop getDevelop(String name);
}
