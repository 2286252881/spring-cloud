package com.tangcco.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangcco.employee.beans.Recruit;
import com.tangcco.employee.mapper.RecruitMapper;

/**
 * 招聘信息服务
 * 
 * @author JiFeng
 *
 *         2017年12月22日
 */
@Service
@CacheConfig(cacheNames = { "recruit" })
public class RecruitService {

	@Autowired
	private RecruitMapper recruitMapper;

	/**
	 * 查询所有的招聘信息
	 * 
	 * @return
	 */
	@Cacheable
	public List<Recruit> findAllRecuit() {
		return recruitMapper.findAllRecruit();
	}

}
