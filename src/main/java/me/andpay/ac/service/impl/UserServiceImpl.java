package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.UserService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.User;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

	/**
	 * 新增
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int insertUser(User user) throws Exception {
		return super.getSqlSession().insert("insertUser", user);
	}

	/**
	 * 修改
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int updateUser(User user) throws Exception {
		return super.getSqlSession().update("updateUser", user);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteUser(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteUser", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public User selectUserById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectUserById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<User> selectUserList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectUserList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<User> selectAllUserList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllUserList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectUserListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectUserListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}