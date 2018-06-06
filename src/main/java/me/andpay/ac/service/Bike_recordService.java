package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Bike_record;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface Bike_recordService {

	/**
	 * 新增
	 * 
	 * @param bike_record
	 * @return
	 * @throws Exception
	 */
	public int insertBike_record(Bike_record bike_record) throws Exception;

	/**
	 * 修改
	 * 
	 * @param bike_record
	 * @return
	 * @throws Exception
	 */
	public int updateBike_record(Bike_record bike_record) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike_record(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param runId
	 * @return
	 */
	public Bike_record selectBike_recordByRunId(String runId) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_record> selectBike_recordList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_record> selectAllBike_recordList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBike_recordListCount(Map<String, Object> map) throws Exception;

}