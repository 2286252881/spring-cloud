package com.tangcco.cases.mapper;

import java.util.List;

import com.tangcco.cases.beans.Case;
import com.tangcco.utils.MyMapper;

public interface CaseMapper extends MyMapper<Case> {
	/**
	 * 
	 * 查询前八条热门的案例
	 * 
	 * @return
	 */
	List<Case> findCaseByHot();

	/**
	 * 查询前十条最新的案例
	 * 
	 * @return
	 */
	List<Case> findCaseByNew();

}