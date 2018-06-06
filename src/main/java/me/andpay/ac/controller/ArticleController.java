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

import me.andpay.ac.entity.Article;
import me.andpay.ac.biz.ArticleBiz;
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
public class ArticleController extends BaseController {

	@Resource
	private ArticleBiz articleBiz;

	/**
	 * 查询Article集合
	 */
	@RequestMapping(value = "/manage/articleList")
	public void articleList(HttpServletResponse response, Model model) {
		JSONEntity<List<Article>> jsonEntity = null;
		try {
			Map<String,Object> map=initMap(request);
			String title=request.getParameter("title");
			if (StringUtils.isNotBlank(title)) {
				map.put("title", title);
			}
			String content=request.getParameter("content");
			if (StringUtils.isNotBlank(content)) {
				map.put("content", content);
			}
			String type=request.getParameter("type");
			if (StringUtils.isNotBlank(type)) {
				map.put("type", type);
			}
			String createTime=request.getParameter("createTime");
			if (StringUtils.isNotBlank(createTime)) {
				map.put("createTime", createTime);
			}
			String codeImgPath=request.getParameter("codeImgPath");
			if (StringUtils.isNotBlank(codeImgPath)) {
				map.put("codeImgPath", codeImgPath);
			}
			String codeMessage=request.getParameter("codeMessage");
			if (StringUtils.isNotBlank(codeMessage)) {
				map.put("codeMessage", codeMessage);
			}
			String remark=request.getParameter("remark");
			if (StringUtils.isNotBlank(remark)) {
				map.put("remark", remark);
			}
			String state=request.getParameter("state");
			if (StringUtils.isNotBlank(state)) {
				map.put("state", state);
			}
			jsonEntity = articleBiz.articleList(map);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<List<Article>>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 根据id查询Article
	 */
	@RequestMapping(value = "/manage/articleById")
	public void articleById(HttpServletResponse response, Model model) {
		JSONEntity<Article> jsonEntity = null;
		try {
			String id = request.getParameter("id");
			jsonEntity = articleBiz.articleById(id);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Article>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 新增Article
	 */
	@RequestMapping(value = "/manage/addArticle")
	public void addArticle(Article article, HttpServletResponse response, Model model) {
		JSONEntity<Article> jsonEntity = null;
		try {
			jsonEntity = articleBiz.insertArticle(article);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Article>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 修改Article
	 */
	@RequestMapping(value = "/manage/updateArticle")
	public void updateArticle(Article article, HttpServletResponse response, Model model) {
		JSONEntity<Article> jsonEntity = null;
		try {
			jsonEntity = articleBiz.updateArticle(article);
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Article>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

	/**
	 * 删除Article
	 */
	@RequestMapping(value = "/manage/deleteArticle")
	public void deleteArticle(HttpServletResponse response, Model model) {
		JSONEntity<Article> jsonEntity = null;
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
				jsonEntity = articleBiz.deleteArticle(map);
			} else {
				jsonEntity = new JSONEntity<Article>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
			}
		} catch (Exception e) {
			jsonEntity = new JSONEntity<Article>(ConstantUtil.CODE_500, ConstantUtil.MSG_500);
			e.printStackTrace();
		}
		output(response, jsonEntity.toString(),"application/json;charset=UTF-8");
	}

}