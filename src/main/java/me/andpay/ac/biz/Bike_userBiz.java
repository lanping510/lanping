package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Bike_user;
import me.andpay.ac.service.Bike_userService;
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
public class Bike_userBiz {

	@Resource
	private Bike_userService bike_userService;

	/**
	 * 查询Bike_user集合
	 */
	public JSONEntity<List<Bike_user>> bike_userList(Map<String, Object> map) throws Exception{
		List<Bike_user> bike_users = bike_userService.selectBike_userList(map);
		int total = bike_userService.selectBike_userListCount(map);
		return new JSONEntity<List<Bike_user>>(ConstantUtil.CODE_200, bike_users, total);
	}

	/**
	 * 根据userId查询Bike_user
	 */
	public JSONEntity<Bike_user> bike_userByUserId(String userId) throws Exception{
		if (StringUtils.isNotBlank(userId)) {
			Bike_user bike_user = bike_userService.selectBike_userByUserId(Integer.parseInt(userId));
			return new JSONEntity<Bike_user>(ConstantUtil.CODE_200, bike_user);
		} else {
			return new JSONEntity<Bike_user>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Bike_user
	 */
	public JSONEntity<Bike_user> insertBike_user(Bike_user bike_user) throws Exception{
		bike_userService.insertBike_user(bike_user);
		return new JSONEntity<Bike_user>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Bike_user
	 */
	public JSONEntity<Bike_user> updateBike_user(Bike_user bike_user) throws Exception{
		bike_userService.updateBike_user(bike_user);
		return new JSONEntity<Bike_user>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Bike_user
	 */
	public JSONEntity<Bike_user> deleteBike_user(Map<String, Object> map) throws Exception{
		bike_userService.deleteBike_user(map);
		return new JSONEntity<Bike_user>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}