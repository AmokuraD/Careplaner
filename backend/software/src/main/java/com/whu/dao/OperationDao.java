package com.whu.dao;
import org.springframework.stereotype.Repository;
import com.whu.pojo.Operation;

@Repository
public interface OperationDao
{
public Operation getOperation(String name);
}
