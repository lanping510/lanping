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

import me.andpay.ac.entity.Loginrecord;
import me.andpay.ac.biz.LoginrecordBiz;
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
public class LoginrecordController extends BaseController {

	@Resource
	private LoginrecordBiz loginrecordBiz;

	/**
	 * 查询Loginrecord集合
	 */
	@RequestMapping(value = "/manage/loginrecordList")
	public void loginrecordList(HttpServletResponse response, Model model) {
		JSONEntity<List<Loginrecord>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String userId=request.getParameter("userId");
			if (StringUtils.isNotBlank(userId)) {
				map.put("userId", userId);
			}
			String loginTime=request.getParameter("loginTime");
			if (StringUtils.isNotBlank(loginTime)) {
				map.put("loginTime", loginTime);
			}
			String endLoginTime=request.getParameter("endLoginTime");
			if (StringUtils.isNotBlank(endLoginTime)) {
				map.put("endLoginTime", endLoginTime);
			}
			String customerType=request.getParameter("customerType");
			if (StringUtils.isNotBlank(customerType)) {
				map.put("customerType", customerType);
			}
			String iP=request.getParameter("iP");
			if (StringUtils.isNotBlank(iP)) {
				map.put("iP", iP);
			}
			String port=request.getParameter("port");
			if (StringUtils.isNotBlank(port)) {
				map.put("port", port);
			}
			String sessionkey=request.getParameter("sessionkey");
			if (StringUtils.isNotBlank(sessionkey)) {
				map.put("sessionkey", sessionkey);
			}
			String logInfo=request.getParameter("logInfo");
			if (StringUtils.isNotBlank(logInfo)) {
				map.put("logInfo", logInfo);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = loginrecordBiz.loginrecordList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Loginrecord>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Loginrecord
	 */
	@RequestMapping(value = "/manage/loginrecordById")
	public void loginrecordById(HttpServletResponse response, Model model) {
		JSONEntity<Loginrecord> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = loginrecordBiz.loginrecordById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Loginrecord>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Loginrecord
	 */
	@RequestMapping(value = "/manage/addLoginrecord")
	public void addLoginrecord(Loginrecord loginrecord, HttpServletResponse response, Model model) {
		JSONEntity<Loginrecord> jsonEntity = null;
		try {
			jsonEntity = loginrecordBiz.insertLoginrecord(loginrecord);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Loginrecord>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Loginrecord
	 */
	@RequestMapping(value = "/manage/updateLoginrecord")
	public void updateLoginrecord(Loginrecord loginrecord, HttpServletResponse response, Model model) {
		JSONEntity<Loginrecord> jsonEntity = null;
		try {
			jsonEntity = loginrecordBiz.updateLoginrecord(loginrecord);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Loginrecord>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Loginrecord
	 */
	@RequestMapping(value = "/manage/deleteLoginrecord")
	public void deleteLoginrecord(HttpServletResponse response, Model model) {
		JSONEntity<Loginrecord> jsonEntity = null;
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
				jsonEntity = loginrecordBiz.deleteLoginrecord(map);
			} else {
				jsonEntity = new JSONEntity<Loginrecord>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Loginrecord>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}