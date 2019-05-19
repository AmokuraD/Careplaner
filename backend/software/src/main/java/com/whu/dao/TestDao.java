package com.whu.dao;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Test;

@Repository
public interface TestDao 
{
public Test getTest(String name);
}
