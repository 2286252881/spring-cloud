package com.tangcco.employee.mapper;

import java.util.List;

import com.tangcco.employee.beans.Employee;

public interface EmployeeMapper {
	/**
	 * 查询职位等级大于等于2的前13个人
	 * 
	 * @return
	 */
	public List<Employee> findEmployeeByLevel();
}