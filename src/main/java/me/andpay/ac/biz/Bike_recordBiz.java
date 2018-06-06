package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Bike_record;
import me.andpay.ac.service.Bike_recordService;
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
public class Bike_recordBiz {

	@Resource
	private Bike_recordService bike_recordService;

	/**
	 * 查询Bike_record集合
	 */
	public JSONEntity<List<Bike_record>> bike_recordList(Map<String, Object> map) throws Exception{
		List<Bike_record> bike_records = bike_recordService.selectBike_recordList(map);
		int total = bike_recordService.selectBike_recordListCount(map);
		return new JSONEntity<List<Bike_record>>(ConstantUtil.CODE_200, bike_records, total);
	}

	/**
	 * 根据runId查询Bike_record
	 */
	public JSONEntity<Bike_record> bike_recordByRunId(String runId) throws Exception{
		if (StringUtils.isNotBlank(runId)) {
			Bike_record bike_record = bike_recordService.selectBike_recordByRunId(runId);
			return new JSONEntity<Bike_record>(ConstantUtil.CODE_200, bike_record);
		} else {
			return new JSONEntity<Bike_record>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Bike_record
	 */
	public JSONEntity<Bike_record> insertBike_record(Bike_record bike_record) throws Exception{
		bike_recordService.insertBike_record(bike_record);
		return new JSONEntity<Bike_record>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Bike_record
	 */
	public JSONEntity<Bike_record> updateBike_record(Bike_record bike_record) throws Exception{
		bike_recordService.updateBike_record(bike_record);
		return new JSONEntity<Bike_record>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Bike_record
	 */
	public JSONEntity<Bike_record> deleteBike_record(Map<String, Object> map) throws Exception{
		bike_recordService.deleteBike_record(map);
		return new JSONEntity<Bike_record>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}