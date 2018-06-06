package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Bike_user;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface Bike_userService {

	/**
	 * 新增
	 * 
	 * @param bike_user
	 * @return
	 * @throws Exception
	 */
	public int insertBike_user(Bike_user bike_user) throws Exception;

	/**
	 * 修改
	 * 
	 * @param bike_user
	 * @return
	 * @throws Exception
	 */
	public int updateBike_user(Bike_user bike_user) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike_user(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param userId
	 * @return
	 */
	public Bike_user selectBike_userByUserId(Integer userId) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_user> selectBike_userList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_user> selectAllBike_userList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBike_userListCount(Map<String, Object> map) throws Exception;

}