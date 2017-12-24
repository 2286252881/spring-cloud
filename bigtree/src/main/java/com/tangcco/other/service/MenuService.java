package com.tangcco.other.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangcco.other.beans.Menu;
import com.tangcco.other.mapper.MenuMapper;
import com.tangcco.utils.BaseService;

import tk.mybatis.mapper.common.Mapper;

/**
 * 菜单列表服务类
 * 
 * @author JiFeng
 *
 *         2017年12月20日
 */
@Service
@CacheConfig(cacheNames = { "menu" })
public class MenuService extends BaseService<Menu> {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public Mapper<Menu> getMapper() {
		return menuMapper;
	}

	/**
	 * 加载一级菜单列表
	 */
	@Cacheable
	public List<Menu> loadMenu() {
		return menuMapper.loadMenu();
	}

	/**
	 * 加载二级菜单
	 * 
	 * @param id
	 * @return
	 */
	@Cacheable
	public List<Menu> loadSecondMenu(Integer id) {
		return menuMapper.loadSecondMenu(id);
	}

}
