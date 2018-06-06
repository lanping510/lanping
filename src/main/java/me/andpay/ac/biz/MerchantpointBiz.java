package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Merchantpoint;
import me.andpay.ac.service.MerchantpointService;
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
public class MerchantpointBiz {

	@Resource
	private MerchantpointService merchantpointService;

	/**
	 * 查询Merchantpoint集合
	 */
	public JSONEntity<List<Merchantpoint>> merchantpointList(Map<String, Object> map) throws Exception{
		List<Merchantpoint> merchantpoints = merchantpointService.selectMerchantpointList(map);
		int total = merchantpointService.selectMerchantpointListCount(map);
		return new JSONEntity<List<Merchantpoint>>(ConstantUtil.CODE_200, merchantpoints, total);
	}

	/**
	 * 根据id查询Merchantpoint
	 */
	public JSONEntity<Merchantpoint> merchantpointById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Merchantpoint merchantpoint = merchantpointService.selectMerchantpointById(Integer.parseInt(id));
			return new JSONEntity<Merchantpoint>(ConstantUtil.CODE_200, merchantpoint);
		} else {
			return new JSONEntity<Merchantpoint>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Merchantpoint
	 */
	public JSONEntity<Merchantpoint> insertMerchantpoint(Merchantpoint merchantpoint) throws Exception{
		merchantpointService.insertMerchantpoint(merchantpoint);
		return new JSONEntity<Merchantpoint>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Merchantpoint
	 */
	public JSONEntity<Merchantpoint> updateMerchantpoint(Merchantpoint merchantpoint) throws Exception{
		merchantpointService.updateMerchantpoint(merchantpoint);
		return new JSONEntity<Merchantpoint>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Merchantpoint
	 */
	public JSONEntity<Merchantpoint> deleteMerchantpoint(Map<String, Object> map) throws Exception{
		merchantpointService.deleteMerchantpoint(map);
		return new JSONEntity<Merchantpoint>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}