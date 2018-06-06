package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Loginrecord;
import me.andpay.ac.service.LoginrecordService;
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
public class LoginrecordBiz {

	@Resource
	private LoginrecordService loginrecordService;

	/**
	 * 查询Loginrecord集合
	 */
	public JSONEntity<List<Loginrecord>> loginrecordList(Map<String, Object> map) throws Exception{
		List<Loginrecord> loginrecords = loginrecordService.selectLoginrecordList(map);
		int total = loginrecordService.selectLoginrecordListCount(map);
		return new JSONEntity<List<Loginrecord>>(ConstantUtil.CODE_200, loginrecords, total);
	}

	/**
	 * 根据id查询Loginrecord
	 */
	public JSONEntity<Loginrecord> loginrecordById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Loginrecord loginrecord = loginrecordService.selectLoginrecordById(Integer.parseInt(id));
			return new JSONEntity<Loginrecord>(ConstantUtil.CODE_200, loginrecord);
		} else {
			return new JSONEntity<Loginrecord>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Loginrecord
	 */
	public JSONEntity<Loginrecord> insertLoginrecord(Loginrecord loginrecord) throws Exception{
		loginrecordService.insertLoginrecord(loginrecord);
		return new JSONEntity<Loginrecord>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Loginrecord
	 */
	public JSONEntity<Loginrecord> updateLoginrecord(Loginrecord loginrecord) throws Exception{
		loginrecordService.updateLoginrecord(loginrecord);
		return new JSONEntity<Loginrecord>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Loginrecord
	 */
	public JSONEntity<Loginrecord> deleteLoginrecord(Map<String, Object> map) throws Exception{
		loginrecordService.deleteLoginrecord(map);
		return new JSONEntity<Loginrecord>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}