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

import me.andpay.ac.entity.Comment;
import me.andpay.ac.biz.CommentBiz;
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
public class CommentController extends BaseController {

	@Resource
	private CommentBiz commentBiz;

	/**
	 * 查询Comment集合
	 */
	@RequestMapping(value = "/manage/commentList")
	public void commentList(HttpServletResponse response, Model model) {
		JSONEntity<List<Comment>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String content=request.getParameter("content");
			if (StringUtils.isNotBlank(content)) {
				map.put("content", content);
			}
			String userId=request.getParameter("userId");
			if (StringUtils.isNotBlank(userId)) {
				map.put("userId", userId);
			}
			String commentTime=request.getParameter("commentTime");
			if (StringUtils.isNotBlank(commentTime)) {
				map.put("commentTime", commentTime);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			String merchantId=request.getParameter("merchantId");
			if (StringUtils.isNotBlank(merchantId)) {
				map.put("merchantId", merchantId);
			}
			String imgs=request.getParameter("imgs");
			if (StringUtils.isNotBlank(imgs)) {
				map.put("imgs", imgs);
			}
			String memo=request.getParameter("memo");
			if (StringUtils.isNotBlank(memo)) {
				map.put("memo", memo);
			}
			jsonEntity = commentBiz.commentList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Comment>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Comment
	 */
	@RequestMapping(value = "/manage/commentById")
	public void commentById(HttpServletResponse response, Model model) {
		JSONEntity<Comment> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = commentBiz.commentById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Comment>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Comment
	 */
	@RequestMapping(value = "/manage/addComment")
	public void addComment(Comment comment, HttpServletResponse response, Model model) {
		JSONEntity<Comment> jsonEntity = null;
		try {
			jsonEntity = commentBiz.insertComment(comment);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Comment>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Comment
	 */
	@RequestMapping(value = "/manage/updateComment")
	public void updateComment(Comment comment, HttpServletResponse response, Model model) {
		JSONEntity<Comment> jsonEntity = null;
		try {
			jsonEntity = commentBiz.updateComment(comment);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Comment>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Comment
	 */
	@RequestMapping(value = "/manage/deleteComment")
	public void deleteComment(HttpServletResponse response, Model model) {
		JSONEntity<Comment> jsonEntity = null;
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
				jsonEntity = commentBiz.deleteComment(map);
			} else {
				jsonEntity = new JSONEntity<Comment>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Comment>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}