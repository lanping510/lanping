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

import me.andpay.ac.entity.Webinfo;
import me.andpay.ac.biz.WebinfoBiz;
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
public class WebinfoController extends BaseController {

	@Resource
	private WebinfoBiz webinfoBiz;

	/**
	 * 查询Webinfo集合
	 */
	@RequestMapping(value = "/manage/webinfoList")
	public void webinfoList(HttpServletResponse response, Model model) {
		JSONEntity<List<Webinfo>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String endTime=request.getParameter("endTime");
			if (StringUtils.isNotBlank(endTime)) {
				map.put("endTime", endTime);
			}
			String startTime=request.getParameter("startTime");
			if (StringUtils.isNotBlank(startTime)) {
				map.put("startTime", startTime);
			}
			String ip=request.getParameter("ip");
			if (StringUtils.isNotBlank(ip)) {
				map.put("ip", ip);
			}
			String dnsUrl=request.getParameter("dnsUrl");
			if (StringUtils.isNotBlank(dnsUrl)) {
				map.put("dnsUrl", dnsUrl);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			String webName=request.getParameter("webName");
			if (StringUtils.isNotBlank(webName)) {
				map.put("webName", webName);
			}
			String sysos=request.getParameter("sysos");
			if (StringUtils.isNotBlank(sysos)) {
				map.put("sysos", sysos);
			}
			jsonEntity = webinfoBiz.webinfoList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Webinfo>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Webinfo
	 */
	@RequestMapping(value = "/manage/webinfoById")
	public void webinfoById(HttpServletResponse response, Model model) {
		JSONEntity<Webinfo> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = webinfoBiz.webinfoById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Webinfo>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Webinfo
	 */
	@RequestMapping(value = "/manage/addWebinfo")
	public void addWebinfo(Webinfo webinfo, HttpServletResponse response, Model model) {
		JSONEntity<Webinfo> jsonEntity = null;
		try {
			jsonEntity = webinfoBiz.insertWebinfo(webinfo);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Webinfo>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Webinfo
	 */
	@RequestMapping(value = "/manage/updateWebinfo")
	public void updateWebinfo(Webinfo webinfo, HttpServletResponse response, Model model) {
		JSONEntity<Webinfo> jsonEntity = null;
		try {
			jsonEntity = webinfoBiz.updateWebinfo(webinfo);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Webinfo>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Webinfo
	 */
	@RequestMapping(value = "/manage/deleteWebinfo")
	public void deleteWebinfo(HttpServletResponse response, Model model) {
		JSONEntity<Webinfo> jsonEntity = null;
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
				jsonEntity = webinfoBiz.deleteWebinfo(map);
			} else {
				jsonEntity = new JSONEntity<Webinfo>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Webinfo>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}