package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Loginrecord;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface LoginrecordService {

	/**
	 * 新增
	 * 
	 * @param loginrecord
	 * @return
	 * @throws Exception
	 */
	public int insertLoginrecord(Loginrecord loginrecord) throws Exception;

	/**
	 * 修改
	 * 
	 * @param loginrecord
	 * @return
	 * @throws Exception
	 */
	public int updateLoginrecord(Loginrecord loginrecord) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteLoginrecord(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Loginrecord selectLoginrecordById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Loginrecord> selectLoginrecordList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Loginrecord> selectAllLoginrecordList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectLoginrecordListCount(Map<String, Object> map) throws Exception;

}