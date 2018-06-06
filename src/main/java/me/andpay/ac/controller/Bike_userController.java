package me.andpay.ac.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.andpay.ac.entity.Bike_user;
import me.andpay.ac.biz.Bike_userBiz;
import me.andpay.ac.utils.ConstantUtil;
import me.andpay.ac.utils.JSONEntity;

/**
 * 控制器
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Controller
public class Bike_userController extends BaseController {

	@Resource
	private Bike_userBiz bike_userBiz;

	/**
	 * 查询Bike_user集合
	 */
	@RequestMapping(value = "/manage/bike_userList")
	public void bike_userList(HttpServletResponse response, Model model) {
		JSONEntity<List<Bike_user>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String userName=request.getParameter("userName");
			if (StringUtils.isNotBlank(userName)) {
				map.put("userName", userName);
			}
			String password=request.getParameter("password");
			if (StringUtils.isNotBlank(password)) {
				map.put("password", password);
			}
			String telepone=request.getParameter("telepone");
			if (StringUtils.isNotBlank(telepone)) {
				map.put("telepone", telepone);
			}
			String sex=request.getParameter("sex");
			if (StringUtils.isNotBlank(sex)) {
				map.put("sex", sex);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = bike_userBiz.bike_userList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Bike_user>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据userId查询Bike_user
	 */
	@RequestMapping(value = "/manage/bike_userByUserId")
	public void bike_userByUserId(HttpServletResponse response, Model model) {
		JSONEntity<Bike_user> jsonEntity = null;
		try {
			String userId = request.getParameter("userId");
			jsonEntity = bike_userBiz.bike_userByUserId(userId);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_user>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Bike_user
	 */
	@RequestMapping(value = "/manage/addBike_user")
	public void addBike_user(Bike_user bike_user, HttpServletResponse response, Model model) {
		JSONEntity<Bike_user> jsonEntity = null;
		try {
			jsonEntity = bike_userBiz.insertBike_user(bike_user);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_user>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Bike_user
	 */
	@RequestMapping(value = "/manage/updateBike_user")
	public void updateBike_user(Bike_user bike_user, HttpServletResponse response, Model model) {
		JSONEntity<Bike_user> jsonEntity = null;
		try {
			jsonEntity = bike_userBiz.updateBike_user(bike_user);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_user>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Bike_user
	 */
	@RequestMapping(value = "/manage/deleteBike_user")
	public void deleteBike_user(HttpServletResponse response, Model model) {
		JSONEntity<Bike_user> jsonEntity = null;
		try {
			String userId = request.getParameter("userId");
			String userIds = request.getParameter("userIds");
			if (StringUtils.isNotBlank(userId) || StringUtils.isNotBlank(userIds)) {
				Map<String,Object> map=new HashMap<String, Object>();
				if (StringUtils.isNotBlank(userId)) {
					map.put("userId",userId);
				}
				if (StringUtils.isNotBlank(userIds)) {
					map.put("userIds",userIds);
				}
				jsonEntity = bike_userBiz.deleteBike_user(map);
			} else {
				jsonEntity = new JSONEntity<Bike_user>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_user>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}