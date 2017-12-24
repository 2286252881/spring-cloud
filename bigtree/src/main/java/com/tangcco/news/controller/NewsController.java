package com.tangcco.news.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangcco.cases.beans.Case;
import com.tangcco.cases.service.CaseService;
import com.tangcco.news.beans.News;
import com.tangcco.news.service.NewsService;
import com.tangcco.other.beans.Menu;
import com.tangcco.other.beans.OtherPicture;
import com.tangcco.other.service.MenuService;
import com.tangcco.other.service.OtherPictureService;

@Controller
public class NewsController {

	// 注入新闻服务
	@Autowired
	private NewsService newsService;

	// 注入菜单服务
	@Autowired
	private MenuService menuService;

	// 注入案例服务
	@Autowired
	private CaseService caseService;

	// 注入其他图片服务
	@Autowired
	private OtherPictureService otherPictureService;

	/**
	 * 加载到首页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		// 获得新闻最新新闻
		List<News> newList = newsService.findNewsByNew();
		// 获得一级菜单信息
		List<Menu> menuList = menuService.loadMenu();
		// 获得热门的前八条案例信息
		List<Case> caseList = caseService.findCaseByHot();
		// 获得其他中轮播图片的四条记录
		List<OtherPicture> otherPicList = otherPictureService.findBinnerPic();

		// 存入session后其他页面可以引入
		session.setAttribute("menuList", menuList);
		session.setAttribute("otherPicList", otherPicList);
		model.addAttribute("newList", newList);
		model.addAttribute("caseList", caseList);
		model.addAttribute("menuId", 1);
		return "index";
	}

	/**
	 * ajax加载2级菜单
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/loadSecondMenuu")
	@ResponseBody
	public List<Menu> load(String id, Model model) {
		// 得到二级菜单
		List<Menu> secondMenu = menuService.loadSecondMenu(Integer.parseInt(id));
		model.addAttribute("secondMenu", secondMenu);
		return secondMenu;
	}

}
