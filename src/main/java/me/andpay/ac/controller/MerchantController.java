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

import me.andpay.ac.entity.Merchant;
import me.andpay.ac.biz.MerchantBiz;
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
public class MerchantController extends BaseController {

	@Resource
	private MerchantBiz merchantBiz;

	/**
	 * 查询Merchant集合
	 */
	@RequestMapping(value = "/manage/merchantList")
	public void merchantList(HttpServletResponse response, Model model) {
		JSONEntity<List<Merchant>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String merchantName=request.getParameter("merchantName");
			if (StringUtils.isNotBlank(merchantName)) {
				map.put("merchantName", merchantName);
			}
			String chargeName=request.getParameter("chargeName");
			if (StringUtils.isNotBlank(chargeName)) {
				map.put("chargeName", chargeName);
			}
			String telephone=request.getParameter("telephone");
			if (StringUtils.isNotBlank(telephone)) {
				map.put("telephone", telephone);
			}
			String licence=request.getParameter("licence");
			if (StringUtils.isNotBlank(licence)) {
				map.put("licence", licence);
			}
			String businessScope=request.getParameter("businessScope");
			if (StringUtils.isNotBlank(businessScope)) {
				map.put("businessScope", businessScope);
			}
			String certificate=request.getParameter("certificate");
			if (StringUtils.isNotBlank(certificate)) {
				map.put("certificate", certificate);
			}
			String certificateStartTime=request.getParameter("certificateStartTime");
			if (StringUtils.isNotBlank(certificateStartTime)) {
				map.put("certificateStartTime", certificateStartTime);
			}
			String remark=request.getParameter("remark");
			if (StringUtils.isNotBlank(remark)) {
				map.put("remark", remark);
			}
			String healthCertificate=request.getParameter("healthCertificate");
			if (StringUtils.isNotBlank(healthCertificate)) {
				map.put("healthCertificate", healthCertificate);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			String sequenceId=request.getParameter("sequenceId");
			if (StringUtils.isNotBlank(sequenceId)) {
				map.put("sequenceId", sequenceId);
			}
			String codeImgPath=request.getParameter("codeImgPath");
			if (StringUtils.isNotBlank(codeImgPath)) {
				map.put("codeImgPath", codeImgPath);
			}
			String codeMessage=request.getParameter("codeMessage");
			if (StringUtils.isNotBlank(codeMessage)) {
				map.put("codeMessage", codeMessage);
			}
			String licencePath=request.getParameter("licencePath");
			if (StringUtils.isNotBlank(licencePath)) {
				map.put("licencePath", licencePath);
			}
			String storeIcon=request.getParameter("storeIcon");
			if (StringUtils.isNotBlank(storeIcon)) {
				map.put("storeIcon", storeIcon);
			}
			String certificateEndTime=request.getParameter("certificateEndTime");
			if (StringUtils.isNotBlank(certificateEndTime)) {
				map.put("certificateEndTime", certificateEndTime);
			}
			String company=request.getParameter("company");
			if (StringUtils.isNotBlank(company)) {
				map.put("company", company);
			}
			String createTime=request.getParameter("createTime");
			if (StringUtils.isNotBlank(createTime)) {
				map.put("createTime", createTime);
			}
			String certificatePath=request.getParameter("certificatePath");
			if (StringUtils.isNotBlank(certificatePath)) {
				map.put("certificatePath", certificatePath);
			}
			String healthPath=request.getParameter("healthPath");
			if (StringUtils.isNotBlank(healthPath)) {
				map.put("healthPath", healthPath);
			}
			String partitionId=request.getParameter("partitionId");
			if (StringUtils.isNotBlank(partitionId)) {
				map.put("partitionId", partitionId);
			}
			String address=request.getParameter("address");
			if (StringUtils.isNotBlank(address)) {
				map.put("address", address);
			}
			String detailAddress=request.getParameter("detailAddress");
			if (StringUtils.isNotBlank(detailAddress)) {
				map.put("detailAddress", detailAddress);
			}
			String storeImage=request.getParameter("storeImage");
			if (StringUtils.isNotBlank(storeImage)) {
				map.put("storeImage", storeImage);
			}
			String commitmentImg=request.getParameter("commitmentImg");
			if (StringUtils.isNotBlank(commitmentImg)) {
				map.put("commitmentImg", commitmentImg);
			}
			String goodsRegisterImg=request.getParameter("goodsRegisterImg");
			if (StringUtils.isNotBlank(goodsRegisterImg)) {
				map.put("goodsRegisterImg", goodsRegisterImg);
			}
			jsonEntity = merchantBiz.merchantList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Merchant>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Merchant
	 */
	@RequestMapping(value = "/manage/merchantById")
	public void merchantById(HttpServletResponse response, Model model) {
		JSONEntity<Merchant> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = merchantBiz.merchantById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchant>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Merchant
	 */
	@RequestMapping(value = "/manage/addMerchant")
	public void addMerchant(Merchant merchant, HttpServletResponse response, Model model) {
		JSONEntity<Merchant> jsonEntity = null;
		try {
			jsonEntity = merchantBiz.insertMerchant(merchant);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchant>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Merchant
	 */
	@RequestMapping(value = "/manage/updateMerchant")
	public void updateMerchant(Merchant merchant, HttpServletResponse response, Model model) {
		JSONEntity<Merchant> jsonEntity = null;
		try {
			jsonEntity = merchantBiz.updateMerchant(merchant);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchant>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Merchant
	 */
	@RequestMapping(value = "/manage/deleteMerchant")
	public void deleteMerchant(HttpServletResponse response, Model model) {
		JSONEntity<Merchant> jsonEntity = null;
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
				jsonEntity = merchantBiz.deleteMerchant(map);
			} else {
				jsonEntity = new JSONEntity<Merchant>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Merchant>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}