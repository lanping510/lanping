package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.LoginrecordService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Loginrecord;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class LoginrecordServiceImpl extends BaseService implements LoginrecordService {

	/**
	 * 新增
	 * 
	 * @param loginrecord
	 * @return
	 * @throws Exception
	 */
	public int insertLoginrecord(Loginrecord loginrecord) throws Exception {
		return super.getSqlSession().insert("insertLoginrecord", loginrecord);
	}

	/**
	 * 修改
	 * 
	 * @param loginrecord
	 * @return
	 * @throws Exception
	 */
	public int updateLoginrecord(Loginrecord loginrecord) throws Exception {
		return super.getSqlSession().update("updateLoginrecord", loginrecord);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteLoginrecord(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteLoginrecord", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Loginrecord selectLoginrecordById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectLoginrecordById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Loginrecord> selectLoginrecordList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectLoginrecordList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Loginrecord> selectAllLoginrecordList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllLoginrecordList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectLoginrecordListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectLoginrecordListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}