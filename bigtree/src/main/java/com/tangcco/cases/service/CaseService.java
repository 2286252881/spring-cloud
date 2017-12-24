package com.tangcco.cases.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangcco.cases.beans.Case;
import com.tangcco.cases.mapper.CaseMapper;
import com.tangcco.utils.BaseService;

import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 案例服务
 * 
 * @author JiFeng
 *
 *         2017年12月20日
 */
@Service
@CacheConfig(cacheNames = { "case" })
public class CaseService extends BaseService<Case> {

	@Autowired
	private CaseMapper caseMapper;

	@Override
	public Mapper<Case> getMapper() {
		return caseMapper;
	}

	/**
	 * 查询首页案例展示 查询热门的前八个案例
	 * 
	 * @return
	 */
	@Cacheable
	public List<Case> findCaseByHot() {
		return caseMapper.findCaseByHot();
	}

	/**
	 * 查询前十条最新的案例
	 * 
	 * @return
	 */
	@Cacheable
	public List<Case> findCaseByNew() {
		return caseMapper.findCaseByNew();
	}

}
