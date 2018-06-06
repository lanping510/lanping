package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Merchant;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface MerchantService {

	/**
	 * 新增
	 * 
	 * @param merchant
	 * @return
	 * @throws Exception
	 */
	public int insertMerchant(Merchant merchant) throws Exception;

	/**
	 * 修改
	 * 
	 * @param merchant
	 * @return
	 * @throws Exception
	 */
	public int updateMerchant(Merchant merchant) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteMerchant(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Merchant selectMerchantById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchant> selectMerchantList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchant> selectAllMerchantList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectMerchantListCount(Map<String, Object> map) throws Exception;

}