package com.tangcco.manager.mapper;

import java.util.List;

import com.tangcco.manager.beans.Manager;

public interface ManagerMapper {

	/**
	 * 登陆判断
	 * 
	 * @return
	 */
	public Manager findByAccAndPas(Manager manager);

	/**
	 * 查询所有的管理员信息
	 * 
	 * @return
	 */
	public List<Manager> findAllManager(Manager manager);
}