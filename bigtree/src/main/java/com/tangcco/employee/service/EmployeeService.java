package com.tangcco.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangcco.employee.beans.Employee;
import com.tangcco.employee.mapper.EmployeeMapper;

/**
 * 员工服务
 * 
 * @author JiFeng
 *
 *         2017年12月21日
 */
@Service
@CacheConfig(cacheNames = { "employee" })
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * 查询职位最高的前13个人
	 * 
	 * @return
	 */
	@Cacheable
	public List<Employee> findEmployeeByLevel() {
		return employeeMapper.findEmployeeByLevel();
	}
}
