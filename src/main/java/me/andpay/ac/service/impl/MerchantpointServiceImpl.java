package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.MerchantpointService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Merchantpoint;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class MerchantpointServiceImpl extends BaseService implements MerchantpointService {

	/**
	 * 新增
	 * 
	 * @param merchantpoint
	 * @return
	 * @throws Exception
	 */
	public int insertMerchantpoint(Merchantpoint merchantpoint) throws Exception {
		return super.getSqlSession().insert("insertMerchantpoint", merchantpoint);
	}

	/**
	 * 修改
	 * 
	 * @param merchantpoint
	 * @return
	 * @throws Exception
	 */
	public int updateMerchantpoint(Merchantpoint merchantpoint) throws Exception {
		return super.getSqlSession().update("updateMerchantpoint", merchantpoint);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteMerchantpoint(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteMerchantpoint", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Merchantpoint selectMerchantpointById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectMerchantpointById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Merchantpoint> selectMerchantpointList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectMerchantpointList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Merchantpoint> selectAllMerchantpointList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllMerchantpointList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectMerchantpointListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectMerchantpointListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}