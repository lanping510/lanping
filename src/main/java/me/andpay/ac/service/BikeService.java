package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Bike;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface BikeService {

	/**
	 * 新增
	 * 
	 * @param bike
	 * @return
	 * @throws Exception
	 */
	public int insertBike(Bike bike) throws Exception;

	/**
	 * 修改
	 * 
	 * @param bike
	 * @return
	 * @throws Exception
	 */
	public int updateBike(Bike bike) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param bid
	 * @return
	 */
	public Bike selectBikeByBid(Integer bid) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike> selectBikeList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike> selectAllBikeList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBikeListCount(Map<String, Object> map) throws Exception;

}