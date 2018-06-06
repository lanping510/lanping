package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Merchantpoint;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface MerchantpointService {

	/**
	 * 新增
	 * 
	 * @param merchantpoint
	 * @return
	 * @throws Exception
	 */
	public int insertMerchantpoint(Merchantpoint merchantpoint) throws Exception;

	/**
	 * 修改
	 * 
	 * @param merchantpoint
	 * @return
	 * @throws Exception
	 */
	public int updateMerchantpoint(Merchantpoint merchantpoint) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteMerchantpoint(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Merchantpoint selectMerchantpointById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchantpoint> selectMerchantpointList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchantpoint> selectAllMerchantpointList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectMerchantpointListCount(Map<String, Object> map) throws Exception;

}