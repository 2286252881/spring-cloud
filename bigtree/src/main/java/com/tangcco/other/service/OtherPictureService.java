package com.tangcco.other.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangcco.other.beans.OtherPicture;
import com.tangcco.other.mapper.OtherPictureMapper;
import com.tangcco.utils.BaseService;

import tk.mybatis.mapper.common.Mapper;

/**
 * 其他图片服务
 * 
 * @author JiFeng
 *
 *         2017年12月20日
 */
@Service
@CacheConfig(cacheNames = { "other_pic" })
public class OtherPictureService extends BaseService<OtherPicture> {

	@Autowired
	private OtherPictureMapper otherPictureMapper;

	@Override
	public Mapper<OtherPicture> getMapper() {
		return otherPictureMapper;
	}

	/**
	 * 查询轮播图片
	 * 
	 * @return
	 */
	@Cacheable
	public List<OtherPicture> findBinnerPic() {
		List<OtherPicture> list = otherPictureMapper.findBinnerPic();
		return list;
	}

}
