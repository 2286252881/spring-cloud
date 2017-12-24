package com.tangcco.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.tangcco.manager.beans.Answer;
import com.tangcco.manager.mapper.AnswerMapper;
import com.tangcco.utils.BaseService;

import tk.mybatis.mapper.common.Mapper;

@Service
@CacheConfig(cacheNames = { "answer" })
public class AnswerService extends BaseService<Answer> {

	@Autowired
	private AnswerMapper answerMapper;

	@Override
	public Mapper<Answer> getMapper() {
		return answerMapper;
	}

	public Answer findOneS(Answer answer) {
		return answerMapper.findOneS(answer);
	}

}
