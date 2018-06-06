package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Merchant;
import me.andpay.ac.service.MerchantService;
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
public class MerchantBiz {

	@Resource
	private MerchantService merchantService;

	/**
	 * 查询Merchant集合
	 */
	public JSONEntity<List<Merchant>> merchantList(Map<String, Object> map) throws Exception{
		List<Merchant> merchants = merchantService.selectMerchantList(map);
		int total = merchantService.selectMerchantListCount(map);
		return new JSONEntity<List<Merchant>>(ConstantUtil.CODE_200, merchants, total);
	}

	/**
	 * 根据id查询Merchant
	 */
	public JSONEntity<Merchant> merchantById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Merchant merchant = merchantService.selectMerchantById(Integer.parseInt(id));
			return new JSONEntity<Merchant>(ConstantUtil.CODE_200, merchant);
		} else {
			return new JSONEntity<Merchant>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Merchant
	 */
	public JSONEntity<Merchant> insertMerchant(Merchant merchant) throws Exception{
		merchantService.insertMerchant(merchant);
		return new JSONEntity<Merchant>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Merchant
	 */
	public JSONEntity<Merchant> updateMerchant(Merchant merchant) throws Exception{
		merchantService.updateMerchant(merchant);
		return new JSONEntity<Merchant>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Merchant
	 */
	public JSONEntity<Merchant> deleteMerchant(Map<String, Object> map) throws Exception{
		merchantService.deleteMerchant(map);
		return new JSONEntity<Merchant>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}