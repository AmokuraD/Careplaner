package com.whu.dao;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Mf;

@Repository
public interface MfDao 
{
public Mf getMf(String name);
}
