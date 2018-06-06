package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Goods;
import me.andpay.ac.service.GoodsService;
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
public class GoodsBiz {

	@Resource
	private GoodsService goodsService;

	/**
	 * 查询Goods集合
	 */
	public JSONEntity<List<Goods>> goodsList(Map<String, Object> map) throws Exception{
		List<Goods> goodss = goodsService.selectGoodsList(map);
		int total = goodsService.selectGoodsListCount(map);
		return new JSONEntity<List<Goods>>(ConstantUtil.CODE_200, goodss, total);
	}

	/**
	 * 根据gid查询Goods
	 */
	public JSONEntity<Goods> goodsByGid(String gid) throws Exception{
		if (StringUtils.isNotBlank(gid)) {
			Goods goods = goodsService.selectGoodsByGid(Integer.parseInt(gid));
			return new JSONEntity<Goods>(ConstantUtil.CODE_200, goods);
		} else {
			return new JSONEntity<Goods>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Goods
	 */
	public JSONEntity<Goods> insertGoods(Goods goods) throws Exception{
		goodsService.insertGoods(goods);
		return new JSONEntity<Goods>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Goods
	 */
	public JSONEntity<Goods> updateGoods(Goods goods) throws Exception{
		goodsService.updateGoods(goods);
		return new JSONEntity<Goods>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Goods
	 */
	public JSONEntity<Goods> deleteGoods(Map<String, Object> map) throws Exception{
		goodsService.deleteGoods(map);
		return new JSONEntity<Goods>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}