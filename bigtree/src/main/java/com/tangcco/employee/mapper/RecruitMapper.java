package com.tangcco.employee.mapper;

import java.util.List;

import com.tangcco.employee.beans.Recruit;

public interface RecruitMapper {

	/**
	 * 查询所有招聘信息
	 * 
	 * @return
	 */
	public List<Recruit> findAllRecruit();
}