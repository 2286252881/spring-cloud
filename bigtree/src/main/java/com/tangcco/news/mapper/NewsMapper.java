package com.tangcco.news.mapper;

import java.util.List;

import com.tangcco.news.beans.News;
import com.tangcco.utils.MyMapper;

public interface NewsMapper extends MyMapper<News> {

	/**
	 * 查询最新新闻
	 * 
	 * @return
	 */
	public List<News> findNewsByNew();

	/**
	 * 查询最热新闻
	 * 
	 * @return
	 */
	public List<News> findNewsByHot();

}