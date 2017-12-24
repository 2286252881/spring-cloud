package com.tangcco.cases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangcco.cases.beans.Case;
import com.tangcco.cases.service.CaseService;
import com.tangcco.other.beans.Menu;
import com.tangcco.other.service.MenuService;

@Controller
public class CaseController {

	// 注入菜单服务
	@Autowired
	private MenuService menuService;

	// 注入案例服务
	@Autowired
	private CaseService caseService;

	/**
	 * 案例页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/case")
	public String loadCasePage(Model model) {
		// 查询前十条最新案例
		List<Case> caseList = caseService.findCaseByNew();
		// 获得二级菜单
		List<Menu> secondMenuList = menuService.loadSecondMenu(3);
		model.addAttribute("caseList", caseList);
		model.addAttribute("secondMenuList", secondMenuList);
		model.addAttribute("menuId", 3);
		return "case";
	}
}
