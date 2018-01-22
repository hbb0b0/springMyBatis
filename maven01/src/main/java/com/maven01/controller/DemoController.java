package com.maven01.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maven01.dto.*;
import com.maven01.pojo.Employee;
import com.maven01.service.IEmployeeService;

@Controller
@RequestMapping("/mvc")
public class DemoController {

	@Resource
	private IEmployeeService employeeService;

	
	@RequestMapping(method = RequestMethod.GET, value = "/getEmployeeList", produces = "application/json")
	public @ResponseBody List<Employee> getEmployeeList() {

		return employeeService.getAll();
	}

}