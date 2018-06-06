package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Bike;
import me.andpay.ac.service.BikeService;
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
public class BikeBiz {

	@Resource
	private BikeService bikeService;

	/**
	 * 查询Bike集合
	 */
	public JSONEntity<List<Bike>> bikeList(Map<String, Object> map) throws Exception{
		List<Bike> bikes = bikeService.selectBikeList(map);
		int total = bikeService.selectBikeListCount(map);
		return new JSONEntity<List<Bike>>(ConstantUtil.CODE_200, bikes, total);
	}

	/**
	 * 根据bid查询Bike
	 */
	public JSONEntity<Bike> bikeByBid(String bid) throws Exception{
		if (StringUtils.isNotBlank(bid)) {
			Bike bike = bikeService.selectBikeByBid(Integer.parseInt(bid));
			return new JSONEntity<Bike>(ConstantUtil.CODE_200, bike);
		} else {
			return new JSONEntity<Bike>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Bike
	 */
	public JSONEntity<Bike> insertBike(Bike bike) throws Exception{
		bikeService.insertBike(bike);
		return new JSONEntity<Bike>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Bike
	 */
	public JSONEntity<Bike> updateBike(Bike bike) throws Exception{
		bikeService.updateBike(bike);
		return new JSONEntity<Bike>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Bike
	 */
	public JSONEntity<Bike> deleteBike(Map<String, Object> map) throws Exception{
		bikeService.deleteBike(map);
		return new JSONEntity<Bike>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}