package com.tangcco.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangcco.employee.beans.Employee;
import com.tangcco.employee.beans.Recruit;
import com.tangcco.employee.service.EmployeeService;
import com.tangcco.employee.service.RecruitService;

/**
 * 员工模块
 * 
 * @author JiFeng
 *
 *         2017年12月21日
 */
@Controller
public class EmployeeController {

	// 注入员工服务
	@Autowired
	private EmployeeService employeeService;

	// 注入招聘信息服务
	@Autowired
	private RecruitService recruitService;

	/**
	 * 去到 team 页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/teams")
	private String loadTeamPage(Model model) {
		// 查询部门大于等于2的前13个人
		List<Employee> employeeList = employeeService.findEmployeeByLevel();
		// 查询全部招聘信息
		List<Recruit> recruitList = recruitService.findAllRecuit();
		
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("recruitList", recruitList);
		model.addAttribute("menuId", 5);
		return "team";
	}
}
