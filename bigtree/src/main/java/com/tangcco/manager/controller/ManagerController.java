package com.tangcco.manager.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangcco.manager.beans.Manager;
import com.tangcco.manager.service.ManagerService;

/**
 * 管理员控制层
 * 
 * @author JiFeng
 *
 *         2017年12月23日
 */
@Controller
public class ManagerController {

	// 注入答案服务
	// @Autowired
	// private AnswerService answerService;

	// 注入管理员服务
	@Autowired
	private ManagerService managerService;

	/**
	 * 登陆操作
	 * 
	 * @param manager
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(Manager manager, HttpServletRequest request) {
		Manager loginManager = managerService.findByAccAndPas(manager);
		if (loginManager != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginManager);
			return "SUCCESS";
		}
		return "ERROR";
	}

	/**
	 * 查询所有的管理员信息
	 * 
	 * @return
	 */
	@RequestMapping("/findManager")
	@ResponseBody
	public List<Manager> findAllManager(Integer currentPage, Manager manager) {
		if (currentPage == null || currentPage == 0) {
			currentPage = 1;
		}
		List<Manager> managerList = managerService.findAllManager(currentPage, manager);
		return managerList;
	}

}
