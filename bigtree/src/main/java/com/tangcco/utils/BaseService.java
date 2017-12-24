package com.tangcco.utils;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

/**
 * BaseService
 * 
 * @author JiFeng
 *
 *         2017年12月19日
 */
public abstract class BaseService<T> {

	public abstract Mapper<T> getMapper();

	/**
	 * 根据Id查询实体
	 * 
	 * @param id
	 * @return
	 */
	public T findById(Integer id) {
		return getMapper().selectByPrimaryKey(id);
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<T> findAll() {
		return getMapper().selectAll();
	}

	/**
	 * 根据不同的条件查询
	 * 
	 * @param param
	 * @return
	 */
	public List<T> findListByCondition(T param) {
		return getMapper().selectByExample(param);
	}

	/**
	 * 根据属性查询记录数量
	 * 
	 * @param param
	 * @return
	 */
	public Integer findAllCount(T param) {
		return getMapper().selectCount(param);
	}

	/**
	 * 根据条件查询数量
	 * 
	 * @return
	 */
	public Integer findCountByCondition(T param) {
		return getMapper().selectCountByExample(param);
	}

	/**
	 * 根据条件 分页查询
	 * 
	 * @param param
	 * @param page
	 * @param rows
	 * @return
	 */
	public PageInfo<T> findPageListByCondition(T param, Integer page, Integer rows) {
		PageHelper.offsetPage(page, rows);
		List<T> list = this.findListByCondition(param);
		return new PageInfo<T>(list);
	}

	/**
	 * 根据实体中的属性 查询一条记录
	 * 
	 * @param param
	 * @return
	 */
	public T findOne(T param) {
		return getMapper().selectOne(param);
	}

	/**
	 * 保存一个实体值,NULL值也会保存,不会使用数据库默认的值
	 * 
	 * @param param
	 * @return
	 */
	public Integer save(T param) {
		return getMapper().insert(param);
	}

	/**
	 * 保存一个实体值,NULL值不会保存,会使用数据库默认的值
	 * 
	 * @return
	 */
	public Integer saveNotNullParm(T param) {
		return getMapper().insertSelective(param);
	}

	/**
	 * 根据主键更新
	 * 
	 * @param para
	 * @return
	 */
	public Integer update(T param) {
		return getMapper().updateByPrimaryKey(param);
	}

	/**
	 * 根据主键更新非空的字段
	 * 
	 * @param param
	 * @return
	 */
	public Integer updateNotNullParam(T param) {
		return getMapper().updateByPrimaryKeySelective(param);
	}

	/**
	 * 根据传入的条件更新 NULL会被更新
	 * 
	 * @param param
	 * @param example
	 * @return
	 */
	public Integer updateByCondition(T param, Object example) {
		return getMapper().updateByExample(param, example);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param param
	 * @return
	 */
	public Integer removeById(T param) {
		return getMapper().deleteByPrimaryKey(param);
	}

	/**
	 * 批量删除
	 * 
	 * @param clazz
	 * @param values
	 * @return
	 */
	public Integer removeByIds(Class<T> clazz, List<Object> values) {
		Example example = new Example(clazz);
		example.createCriteria().andIn("id", values);
		return getMapper().deleteByExample(example);
	}

}
