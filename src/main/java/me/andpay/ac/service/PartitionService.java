package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Partition;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface PartitionService {

	/**
	 * 新增
	 * 
	 * @param partition
	 * @return
	 * @throws Exception
	 */
	public int insertPartition(Partition partition) throws Exception;

	/**
	 * 修改
	 * 
	 * @param partition
	 * @return
	 * @throws Exception
	 */
	public int updatePartition(Partition partition) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deletePartition(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Partition selectPartitionById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Partition> selectPartitionList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Partition> selectAllPartitionList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectPartitionListCount(Map<String, Object> map) throws Exception;

}