package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.User;
import me.andpay.ac.service.UserService;
import me.andpay.ac.utils.ConstantUtil;

import me.andpay.ac.utils.JSONEntity;

/**
 * 业务处理类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class UserBiz {

	@Resource
	private UserService userService;

	/**
	 * 查询User集合
	 */
	public JSONEntity<List<User>> userList(Map<String, Object> map) throws Exception{
		List<User> users = userService.selectUserList(map);
		int total = userService.selectUserListCount(map);
		return new JSONEntity<List<User>>(ConstantUtil.CODE_200, users, total);
	}

	/**
	 * 根据id查询User
	 */
	public JSONEntity<User> userById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			User user = userService.selectUserById(Integer.parseInt(id));
			return new JSONEntity<User>(ConstantUtil.CODE_200, user);
		} else {
			return new JSONEntity<User>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增User
	 */
	public JSONEntity<User> insertUser(User user) throws Exception{
		userService.insertUser(user);
		return new JSONEntity<User>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改User
	 */
	public JSONEntity<User> updateUser(User user) throws Exception{
		userService.updateUser(user);
		return new JSONEntity<User>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除User
	 */
	public JSONEntity<User> deleteUser(Map<String, Object> map) throws Exception{
		userService.deleteUser(map);
		return new JSONEntity<User>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}