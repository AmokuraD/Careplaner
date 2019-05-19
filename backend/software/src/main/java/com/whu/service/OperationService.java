package com.whu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.whu.dao.OperationDao;
import com.whu.pojo.Operation;

@Service
public class OperationService 
{
	@Autowired
	private OperationDao operationDao=null;
	
	public Operation getOperation(String name) 
	{
		return operationDao.getOperation(name);
	}
}
