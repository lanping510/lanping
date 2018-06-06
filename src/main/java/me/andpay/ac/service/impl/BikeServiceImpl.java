package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.BikeService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Bike;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class BikeServiceImpl extends BaseService implements BikeService {

	/**
	 * 新增
	 * 
	 * @param bike
	 * @return
	 * @throws Exception
	 */
	public int insertBike(Bike bike) throws Exception {
		return super.getSqlSession().insert("insertBike", bike);
	}

	/**
	 * 修改
	 * 
	 * @param bike
	 * @return
	 * @throws Exception
	 */
	public int updateBike(Bike bike) throws Exception {
		return super.getSqlSession().update("updateBike", bike);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteBike", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Bike selectBikeByBid(Integer bid) throws Exception {
		return super.getSqlSession().selectOne("selectBikeByBid",bid);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Bike> selectBikeList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectBikeList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike> selectAllBikeList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllBikeList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBikeListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectBikeListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}