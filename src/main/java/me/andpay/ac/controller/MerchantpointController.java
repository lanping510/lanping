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

import me.andpay.ac.entity.Merchantpoint;
import me.andpay.ac.biz.MerchantpointBiz;
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
public class MerchantpointController extends BaseController {

	@Resource
	private MerchantpointBiz merchantpointBiz;

	/**
	 * 查询Merchantpoint集合
	 */
	@RequestMapping(value = "/manage/merchantpointList")
	public void merchantpointList(HttpServletResponse response, Model model) {
		JSONEntity<List<Merchantpoint>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String userId=request.getParameter("userId");
			if (StringUtils.isNotBlank(userId)) {
				map.put("userId", userId);
			}
			String pointTime=request.getParameter("pointTime");
			if (StringUtils.isNotBlank(pointTime)) {
				map.put("pointTime", pointTime);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			String merchantId=request.getParameter("merchantId");
			if (StringUtils.isNotBlank(merchantId)) {
				map.put("merchantId", merchantId);
			}
			jsonEntity = merchantpointBiz.merchantpointList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Merchantpoint>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Merchantpoint
	 */
	@RequestMapping(value = "/manage/merchantpointById")
	public void merchantpointById(HttpServletResponse response, Model model) {
		JSONEntity<Merchantpoint> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = merchantpointBiz.merchantpointById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchantpoint>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Merchantpoint
	 */
	@RequestMapping(value = "/manage/addMerchantpoint")
	public void addMerchantpoint(Merchantpoint merchantpoint, HttpServletResponse response, Model model) {
		JSONEntity<Merchantpoint> jsonEntity = null;
		try {
			jsonEntity = merchantpointBiz.insertMerchantpoint(merchantpoint);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchantpoint>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Merchantpoint
	 */
	@RequestMapping(value = "/manage/updateMerchantpoint")
	public void updateMerchantpoint(Merchantpoint merchantpoint, HttpServletResponse response, Model model) {
		JSONEntity<Merchantpoint> jsonEntity = null;
		try {
			jsonEntity = merchantpointBiz.updateMerchantpoint(merchantpoint);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchantpoint>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Merchantpoint
	 */
	@RequestMapping(value = "/manage/deleteMerchantpoint")
	public void deleteMerchantpoint(HttpServletResponse response, Model model) {
		JSONEntity<Merchantpoint> jsonEntity = null;
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
				jsonEntity = merchantpointBiz.deleteMerchantpoint(map);
			} else {
				jsonEntity = new JSONEntity<Merchantpoint>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchantpoint>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}