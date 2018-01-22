package com.maven01.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.maven01.pojo.Employee;

public interface IEmployeeDao {

	public List<Employee> getAll();
}
