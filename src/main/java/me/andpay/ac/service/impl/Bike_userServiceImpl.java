package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.Bike_userService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Bike_user;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class Bike_userServiceImpl extends BaseService implements Bike_userService {

	/**
	 * 新增
	 * 
	 * @param bike_user
	 * @return
	 * @throws Exception
	 */
	public int insertBike_user(Bike_user bike_user) throws Exception {
		return super.getSqlSession().insert("insertBike_user", bike_user);
	}

	/**
	 * 修改
	 * 
	 * @param bike_user
	 * @return
	 * @throws Exception
	 */
	public int updateBike_user(Bike_user bike_user) throws Exception {
		return super.getSqlSession().update("updateBike_user", bike_user);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteBike_user(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteBike_user", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Bike_user selectBike_userByUserId(Integer userId) throws Exception {
		return super.getSqlSession().selectOne("selectBike_userByUserId",userId);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Bike_user> selectBike_userList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectBike_userList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Bike_user> selectAllBike_userList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllBike_userList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectBike_userListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectBike_userListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}