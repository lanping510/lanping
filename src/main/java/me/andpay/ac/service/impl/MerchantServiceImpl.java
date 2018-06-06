package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.MerchantService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Merchant;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class MerchantServiceImpl extends BaseService implements MerchantService {

	/**
	 * 新增
	 * 
	 * @param merchant
	 * @return
	 * @throws Exception
	 */
	public int insertMerchant(Merchant merchant) throws Exception {
		return super.getSqlSession().insert("insertMerchant", merchant);
	}

	/**
	 * 修改
	 * 
	 * @param merchant
	 * @return
	 * @throws Exception
	 */
	public int updateMerchant(Merchant merchant) throws Exception {
		return super.getSqlSession().update("updateMerchant", merchant);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteMerchant(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteMerchant", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Merchant selectMerchantById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectMerchantById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Merchant> selectMerchantList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectMerchantList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchant> selectAllMerchantList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllMerchantList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectMerchantListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectMerchantListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}