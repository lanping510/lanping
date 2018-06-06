package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Goods;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface GoodsService {

	/**
	 * 新增
	 * 
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public int insertGoods(Goods goods) throws Exception;

	/**
	 * 修改
	 * 
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public int updateGoods(Goods goods) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteGoods(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param gid
	 * @return
	 */
	public Goods selectGoodsByGid(Integer gid) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Goods> selectGoodsList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Goods> selectAllGoodsList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectGoodsListCount(Map<String, Object> map) throws Exception;

}