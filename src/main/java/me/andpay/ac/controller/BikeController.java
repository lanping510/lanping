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

import me.andpay.ac.entity.Bike;
import me.andpay.ac.biz.BikeBiz;
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
public class BikeController extends BaseController {

	@Resource
	private BikeBiz bikeBiz;

	/**
	 * 查询Bike集合
	 */
	@RequestMapping(value = "/manage/bikeList")
	public void bikeList(HttpServletResponse response, Model model) {
		JSONEntity<List<Bike>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String bike_num=request.getParameter("bike_num");
			if (StringUtils.isNotBlank(bike_num)) {
				map.put("bike_num", bike_num);
			}
			String password=request.getParameter("password");
			if (StringUtils.isNotBlank(password)) {
				map.put("password", password);
			}
			String type=request.getParameter("type");
			if (StringUtils.isNotBlank(type)) {
				map.put("type", type);
			}
			String count=request.getParameter("count");
			if (StringUtils.isNotBlank(count)) {
				map.put("count", count);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = bikeBiz.bikeList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Bike>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据bid查询Bike
	 */
	@RequestMapping(value = "/manage/bikeByBid")
	public void bikeByBid(HttpServletResponse response, Model model) {
		JSONEntity<Bike> jsonEntity = null;
		try {
			String bid = request.getParameter("bid");
			jsonEntity = bikeBiz.bikeByBid(bid);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Bike
	 */
	@RequestMapping(value = "/manage/addBike")
	public void addBike(Bike bike, HttpServletResponse response, Model model) {
		JSONEntity<Bike> jsonEntity = null;
		try {
			jsonEntity = bikeBiz.insertBike(bike);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Bike
	 */
	@RequestMapping(value = "/manage/updateBike")
	public void updateBike(Bike bike, HttpServletResponse response, Model model) {
		JSONEntity<Bike> jsonEntity = null;
		try {
			jsonEntity = bikeBiz.updateBike(bike);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Bike
	 */
	@RequestMapping(value = "/manage/deleteBike")
	public void deleteBike(HttpServletResponse response, Model model) {
		JSONEntity<Bike> jsonEntity = null;
		try {
			String bid = request.getParameter("bid");
			String bids = request.getParameter("bids");
			if (StringUtils.isNotBlank(bid) || StringUtils.isNotBlank(bids)) {
				Map<String,Object> map=new HashMap<String, Object>();
				if (StringUtils.isNotBlank(bid)) {
					map.put("bid",bid);
				}
				if (StringUtils.isNotBlank(bids)) {
					map.put("bids",bids);
				}
				jsonEntity = bikeBiz.deleteBike(map);
			} else {
				jsonEntity = new JSONEntity<Bike>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Bike>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}