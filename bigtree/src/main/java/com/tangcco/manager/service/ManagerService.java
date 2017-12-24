package com.tangcco.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tangcco.manager.beans.Manager;
import com.tangcco.manager.mapper.ManagerMapper;

/**
 * 管理员服务
 * 
 * @author JiFeng
 *
 *         2017年12月23日
 */
@Service
@CacheConfig(cacheNames = { "manager" })
public class ManagerService {

	@Autowired
	private ManagerMapper managerMapper;

	/**
	 * 判断用户的登陆
	 * 
	 * @param managers
	 * @return
	 */
	public Manager findByAccAndPas(Manager manager) {
		return managerMapper.findByAccAndPas(manager);
	}

	/**
	 * 查询所有的管理员信息
	 * 
	 * 分页
	 * 
	 * @return
	 */
	@Cacheable
	public List<Manager> findAllManager(Integer currentPage, Manager manager) {
		System.out.println(manager.getName());
		PageHelper.startPage(currentPage, 2);
		List<Manager> managerList = managerMapper.findAllManager(manager);
		PageInfo<Manager> pageDate = new PageInfo<Manager>();
		pageDate.setList(managerList);
		return pageDate.getList();
	}

}
