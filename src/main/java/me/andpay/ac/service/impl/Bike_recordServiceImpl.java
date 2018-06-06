package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.Bike_recordService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Bike_record;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class Bike_recordServiceImpl extends BaseService implements Bike_recordService {

	/**
	 * 新增
	 * 
	 * @param bike_record
	 * @return
	 * @throws Exception
	 */
	public int insertBike_record(Bike_record bike_record) throws Exception {
		return super.getSqlSession().insert("insertBike_record", bike_record);
	}

	/**
	 * 修改
	 * 
	 * @param bike_record
	 * @return
	 * @throws Exception
	 */
	public int updateBike_record(Bike_record bike_record) throws Exception {
		return super.getSqlSession().update("updateBike_record", bike_record);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike_record(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteBike_record", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Bike_record selectBike_recordByRunId(String runId) throws Exception {
		return super.getSqlSession().selectOne("selectBike_recordByRunId",runId);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Bike_record> selectBike_recordList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectBike_recordList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_record> selectAllBike_recordList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllBike_recordList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBike_recordListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectBike_recordListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}