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

import me.andpay.ac.entity.Bike_record;
import me.andpay.ac.biz.Bike_recordBiz;
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
public class Bike_recordController extends BaseController {

	@Resource
	private Bike_recordBiz bike_recordBiz;

	/**
	 * 查询Bike_record集合
	 */
	@RequestMapping(value = "/manage/bike_recordList")
	public void bike_recordList(HttpServletResponse response, Model model) {
		JSONEntity<List<Bike_record>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String runId=request.getParameter("runId");
			if (StringUtils.isNotBlank(runId)) {
				map.put("runId", runId);
			}
			String bid=request.getParameter("bid");
			if (StringUtils.isNotBlank(bid)) {
				map.put("bid", bid);
			}
			String createTime=request.getParameter("createTime");
			if (StringUtils.isNotBlank(createTime)) {
				map.put("createTime", createTime);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = bike_recordBiz.bike_recordList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Bike_record>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据runId查询Bike_record
	 */
	@RequestMapping(value = "/manage/bike_recordByRunId")
	public void bike_recordByRunId(HttpServletResponse response, Model model) {
		JSONEntity<Bike_record> jsonEntity = null;
		try {
			String runId = request.getParameter("runId");
			jsonEntity = bike_recordBiz.bike_recordByRunId(runId);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_record>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Bike_record
	 */
	@RequestMapping(value = "/manage/addBike_record")
	public void addBike_record(Bike_record bike_record, HttpServletResponse response, Model model) {
		JSONEntity<Bike_record> jsonEntity = null;
		try {
			jsonEntity = bike_recordBiz.insertBike_record(bike_record);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_record>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Bike_record
	 */
	@RequestMapping(value = "/manage/updateBike_record")
	public void updateBike_record(Bike_record bike_record, HttpServletResponse response, Model model) {
		JSONEntity<Bike_record> jsonEntity = null;
		try {
			jsonEntity = bike_recordBiz.updateBike_record(bike_record);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_record>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Bike_record
	 */
	@RequestMapping(value = "/manage/deleteBike_record")
	public void deleteBike_record(HttpServletResponse response, Model model) {
		JSONEntity<Bike_record> jsonEntity = null;
		try {
			String runId = request.getParameter("runId");
			String runIds = request.getParameter("runIds");
			if (StringUtils.isNotBlank(runId) || StringUtils.isNotBlank(runIds)) {
				Map<String,Object> map=new HashMap<String, Object>();
				if (StringUtils.isNotBlank(runId)) {
					map.put("runId",runId);
				}
				if (StringUtils.isNotBlank(runIds)) {
					map.put("runIds",runIds);
				}
				jsonEntity = bike_recordBiz.deleteBike_record(map);
			} else {
				jsonEntity = new JSONEntity<Bike_record>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike_record>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}