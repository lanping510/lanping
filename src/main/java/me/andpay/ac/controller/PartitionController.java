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

import me.andpay.ac.entity.Partition;
import me.andpay.ac.biz.PartitionBiz;
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
public class PartitionController extends BaseController {

	@Resource
	private PartitionBiz partitionBiz;

	/**
	 * 查询Partition集合
	 */
	@RequestMapping(value = "/manage/partitionList")
	public void partitionList(HttpServletResponse response, Model model) {
		JSONEntity<List<Partition>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String address=request.getParameter("address");
			if (StringUtils.isNotBlank(address)) {
				map.put("address", address);
			}
			String type=request.getParameter("type");
			if (StringUtils.isNotBlank(type)) {
				map.put("type", type);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = partitionBiz.partitionList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Partition>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Partition
	 */
	@RequestMapping(value = "/manage/partitionById")
	public void partitionById(HttpServletResponse response, Model model) {
		JSONEntity<Partition> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = partitionBiz.partitionById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Partition>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Partition
	 */
	@RequestMapping(value = "/manage/addPartition")
	public void addPartition(Partition partition, HttpServletResponse response, Model model) {
		JSONEntity<Partition> jsonEntity = null;
		try {
			jsonEntity = partitionBiz.insertPartition(partition);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Partition>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Partition
	 */
	@RequestMapping(value = "/manage/updatePartition")
	public void updatePartition(Partition partition, HttpServletResponse response, Model model) {
		JSONEntity<Partition> jsonEntity = null;
		try {
			jsonEntity = partitionBiz.updatePartition(partition);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Partition>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Partition
	 */
	@RequestMapping(value = "/manage/deletePartition")
	public void deletePartition(HttpServletResponse response, Model model) {
		JSONEntity<Partition> jsonEntity = null;
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
				jsonEntity = partitionBiz.deletePartition(map);
			} else {
				jsonEntity = new JSONEntity<Partition>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Partition>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}