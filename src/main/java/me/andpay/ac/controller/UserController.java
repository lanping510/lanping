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

import me.andpay.ac.entity.User;
import me.andpay.ac.biz.UserBiz;
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
public class UserController extends BaseController {

	@Resource
	private UserBiz userBiz;

	/**
	 * 查询User集合
	 */
	@RequestMapping(value = "/manage/userList")
	public void userList(HttpServletResponse response, Model model) {
		JSONEntity<List<User>> jsonEntity = null;
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
			String nickName=request.getParameter("nickName");
			if (StringUtils.isNotBlank(nickName)) {
				map.put("nickName", nickName);
			}
			String telephone=request.getParameter("telephone");
			if (StringUtils.isNotBlank(telephone)) {
				map.put("telephone", telephone);
			}
			String email=request.getParameter("email");
			if (StringUtils.isNotBlank(email)) {
				map.put("email", email);
			}
			String sex=request.getParameter("sex");
			if (StringUtils.isNotBlank(sex)) {
				map.put("sex", sex);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			String roleId=request.getParameter("roleId");
			if (StringUtils.isNotBlank(roleId)) {
				map.put("roleId", roleId);
			}
			String birthday=request.getParameter("birthday");
			if (StringUtils.isNotBlank(birthday)) {
				map.put("birthday", birthday);
			}
			jsonEntity = userBiz.userList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<User>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询User
	 */
	@RequestMapping(value = "/manage/userById")
	public void userById(HttpServletResponse response, Model model) {
		JSONEntity<User> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = userBiz.userById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<User>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增User
	 */
	@RequestMapping(value = "/manage/addUser")
	public void addUser(User user, HttpServletResponse response, Model model) {
		JSONEntity<User> jsonEntity = null;
		try {
			jsonEntity = userBiz.insertUser(user);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<User>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改User
	 */
	@RequestMapping(value = "/manage/updateUser")
	public void updateUser(User user, HttpServletResponse response, Model model) {
		JSONEntity<User> jsonEntity = null;
		try {
			jsonEntity = userBiz.updateUser(user);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<User>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除User
	 */
	@RequestMapping(value = "/manage/deleteUser")
	public void deleteUser(HttpServletResponse response, Model model) {
		JSONEntity<User> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			String ids = request.getParameter("ids");
			if (StringUtils.isNotBlank(id) || StringUtils.isNotBlank(ids)) {
				Map<String,Object> map=new HashMap<String, Object>();
				if (StringUtils.isNotBlank(id)) {
					map.put("id",id);
				}
				if (StringUtils.isNotBlank(ids)) {
					map.put("ids",ids);
				}
				jsonEntity = userBiz.deleteUser(map);
			} else {
				jsonEntity = new JSONEntity<User>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<User>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}