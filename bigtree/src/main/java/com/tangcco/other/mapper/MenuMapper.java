package com.tangcco.other.mapper;

import java.util.List;

import com.tangcco.other.beans.Menu;
import com.tangcco.utils.MyMapper;

public interface MenuMapper extends MyMapper<Menu> {

	/**
	 * 加载一级菜单
	 * @return
	 */
	public List<Menu> loadMenu();

	/**
	 * 加载二级菜单
	 * @param id
	 * @return
	 */
	public List<Menu> loadSecondMenu(Integer id);
}