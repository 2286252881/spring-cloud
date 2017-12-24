package com.tangcco.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tangcco.news.beans.News;
import com.tangcco.news.mapper.NewsMapper;
import com.tangcco.utils.BaseService;

import tk.mybatis.mapper.common.Mapper;

/**
 * 新闻服务
 * 
 * @author JiFeng
 *
 *         2017年12月20日
 */
@Service
public class NewsService extends BaseService<News> {

	@Autowired
	private NewsMapper newsMapper;

	@Override
	public Mapper<News> getMapper() {
		return newsMapper;
	}

	/**
	 * 查询最新新闻的前三条记录
	 * 
	 * @return
	 */
	public List<News> findNewsByNew() {
		return newsMapper.findNewsByNew();
	}

	/**
	 * 查询热门新闻前三条记录
	 * 
	 * @return
	 */
	public List<News> findNewsByHot() {
		return newsMapper.findNewsByHot();
	}
}
