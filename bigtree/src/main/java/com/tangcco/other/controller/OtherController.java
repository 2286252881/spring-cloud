package com.tangcco.other.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangcco.news.beans.News;
import com.tangcco.news.service.NewsService;
import com.tangcco.other.beans.Menu;
import com.tangcco.other.service.MenuService;

@Controller
public class OtherController {

	// 注入新闻服务
	@Autowired
	private NewsService newsService;

	// 注入菜单服务
	@Autowired
	private MenuService menuService;

	/**
	 * 加载集团风采
	 * 
	 * 为了不让用户显示的看到id的传值 并且 一级菜单修改很好，故此这里写成死数据id
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/group")
	public String loadGroupPage(Model model) {
		// 获得新闻最新新闻
		List<News> hotNewList = newsService.findNewsByHot();
		// 获得二级菜单
		List<Menu> secondMenuList = menuService.loadSecondMenu(2);

		model.addAttribute("hotNewList", hotNewList);
		model.addAttribute("secondMenuList", secondMenuList);
		model.addAttribute("menuId", 2);
		return "group";
	}

	/**
	 * 加载服务页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/server")
	public String laodServerPage(Model model) {
		model.addAttribute("menuId", 4);
		return "serve";
	}
	
	/**
	 * 加载关于我们页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/about")
	public String loadAboutPage(Model model){
		model.addAttribute("menuId", 6);
		return "about";
	}

}
