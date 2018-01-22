package com.maven01.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven01.dao.IEmployeeDao;
import com.maven01.pojo.Employee;
import com.maven01.service.*;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl  implements IEmployeeService
{

	@Autowired
	private IEmployeeDao dao ;
	 
	public EmployeeServiceImpl()
	{
		
	}

	
	 public List<Employee> getAll() {
		return dao.getAll();
	}
	

}
