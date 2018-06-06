package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.PartitionService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Partition;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class PartitionServiceImpl extends BaseService implements PartitionService {

	/**
	 * 新增
	 * 
	 * @param partition
	 * @return
	 * @throws Exception
	 */
	public int insertPartition(Partition partition) throws Exception {
		return super.getSqlSession().insert("insertPartition", partition);
	}

	/**
	 * 修改
	 * 
	 * @param partition
	 * @return
	 * @throws Exception
	 */
	public int updatePartition(Partition partition) throws Exception {
		return super.getSqlSession().update("updatePartition", partition);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deletePartition(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deletePartition", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Partition selectPartitionById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectPartitionById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Partition> selectPartitionList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectPartitionList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Partition> selectAllPartitionList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllPartitionList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectPartitionListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectPartitionListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}