package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Webinfo;
import me.andpay.ac.service.WebinfoService;
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
public class WebinfoBiz {

	@Resource
	private WebinfoService webinfoService;

	/**
	 * 查询Webinfo集合
	 */
	public JSONEntity<List<Webinfo>> webinfoList(Map<String, Object> map) throws Exception{
		List<Webinfo> webinfos = webinfoService.selectWebinfoList(map);
		int total = webinfoService.selectWebinfoListCount(map);
		return new JSONEntity<List<Webinfo>>(ConstantUtil.CODE_200, webinfos, total);
	}

	/**
	 * 根据id查询Webinfo
	 */
	public JSONEntity<Webinfo> webinfoById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Webinfo webinfo = webinfoService.selectWebinfoById(Integer.parseInt(id));
			return new JSONEntity<Webinfo>(ConstantUtil.CODE_200, webinfo);
		} else {
			return new JSONEntity<Webinfo>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Webinfo
	 */
	public JSONEntity<Webinfo> insertWebinfo(Webinfo webinfo) throws Exception{
		webinfoService.insertWebinfo(webinfo);
		return new JSONEntity<Webinfo>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Webinfo
	 */
	public JSONEntity<Webinfo> updateWebinfo(Webinfo webinfo) throws Exception{
		webinfoService.updateWebinfo(webinfo);
		return new JSONEntity<Webinfo>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Webinfo
	 */
	public JSONEntity<Webinfo> deleteWebinfo(Map<String, Object> map) throws Exception{
		webinfoService.deleteWebinfo(map);
		return new JSONEntity<Webinfo>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}