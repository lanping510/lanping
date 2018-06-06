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

import me.andpay.ac.entity.Goods;
import me.andpay.ac.biz.GoodsBiz;
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
public class GoodsController extends BaseController {

	@Resource
	private GoodsBiz goodsBiz;

	/**
	 * 查询Goods集合
	 */
	@RequestMapping(value = "/manage/goodsList")
	public void goodsList(HttpServletResponse response, Model model) {
		JSONEntity<List<Goods>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String goodsName=request.getParameter("goodsName");
			if (StringUtils.isNotBlank(goodsName)) {
				map.put("goodsName", goodsName);
			}
			String baseName=request.getParameter("baseName");
			if (StringUtils.isNotBlank(baseName)) {
				map.put("baseName", baseName);
			}
			String address=request.getParameter("address");
			if (StringUtils.isNotBlank(address)) {
				map.put("address", address);
			}
			String joinTime=request.getParameter("joinTime");
			if (StringUtils.isNotBlank(joinTime)) {
				map.put("joinTime", joinTime);
			}
			String lastPreventionTime=request.getParameter("lastPreventionTime");
			if (StringUtils.isNotBlank(lastPreventionTime)) {
				map.put("lastPreventionTime", lastPreventionTime);
			}
			String catchTime=request.getParameter("catchTime");
			if (StringUtils.isNotBlank(catchTime)) {
				map.put("catchTime", catchTime);
			}
			String feedName=request.getParameter("feedName");
			if (StringUtils.isNotBlank(feedName)) {
				map.put("feedName", feedName);
			}
			String feedUnit=request.getParameter("feedUnit");
			if (StringUtils.isNotBlank(feedUnit)) {
				map.put("feedUnit", feedUnit);
			}
			String codeImgPath=request.getParameter("codeImgPath");
			if (StringUtils.isNotBlank(codeImgPath)) {
				map.put("codeImgPath", codeImgPath);
			}
			String codeMessage=request.getParameter("codeMessage");
			if (StringUtils.isNotBlank(codeMessage)) {
				map.put("codeMessage", codeMessage);
			}
			String createTime=request.getParameter("createTime");
			if (StringUtils.isNotBlank(createTime)) {
				map.put("createTime", createTime);
			}
			String remark=request.getParameter("remark");
			if (StringUtils.isNotBlank(remark)) {
				map.put("remark", remark);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = goodsBiz.goodsList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Goods>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据gid查询Goods
	 */
	@RequestMapping(value = "/manage/goodsByGid")
	public void goodsByGid(HttpServletResponse response, Model model) {
		JSONEntity<Goods> jsonEntity = null;
		try {
			String gid = request.getParameter("gid");
			jsonEntity = goodsBiz.goodsByGid(gid);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Goods>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Goods
	 */
	@RequestMapping(value = "/manage/addGoods")
	public void addGoods(Goods goods, HttpServletResponse response, Model model) {
		JSONEntity<Goods> jsonEntity = null;
		try {
			jsonEntity = goodsBiz.insertGoods(goods);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Goods>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Goods
	 */
	@RequestMapping(value = "/manage/updateGoods")
	public void updateGoods(Goods goods, HttpServletResponse response, Model model) {
		JSONEntity<Goods> jsonEntity = null;
		try {
			jsonEntity = goodsBiz.updateGoods(goods);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Goods>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Goods
	 */
	@RequestMapping(value = "/manage/deleteGoods")
	public void deleteGoods(HttpServletResponse response, Model model) {
		JSONEntity<Goods> jsonEntity = null;
		try {
			String gid = request.getParameter("gid");
			String gids = request.getParameter("gids");
			if (StringUtils.isNotBlank(gid) || StringUtils.isNotBlank(gids)) {
				Map<String,Object> map=new HashMap<String, Object>();
				if (StringUtils.isNotBlank(gid)) {
					map.put("gid",gid);
				}
				if (StringUtils.isNotBlank(gids)) {
					map.put("gids",gids);
				}
				jsonEntity = goodsBiz.deleteGoods(map);
			} else {
				jsonEntity = new JSONEntity<Goods>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Goods>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}