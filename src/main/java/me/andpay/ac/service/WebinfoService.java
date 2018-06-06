package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Webinfo;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface WebinfoService {

	/**
	 * 新增
	 * 
	 * @param webinfo
	 * @return
	 * @throws Exception
	 */
	public int insertWebinfo(Webinfo webinfo) throws Exception;

	/**
	 * 修改
	 * 
	 * @param webinfo
	 * @return
	 * @throws Exception
	 */
	public int updateWebinfo(Webinfo webinfo) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteWebinfo(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Webinfo selectWebinfoById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Webinfo> selectWebinfoList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Webinfo> selectAllWebinfoList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectWebinfoListCount(Map<String, Object> map) throws Exception;

}