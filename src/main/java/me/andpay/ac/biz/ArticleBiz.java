package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Article;
import me.andpay.ac.service.ArticleService;
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
public class ArticleBiz {

	@Resource
	private ArticleService articleService;

	/**
	 * 查询Article集合
	 */
	public JSONEntity<List<Article>> articleList(Map<String, Object> map) throws Exception{
		List<Article> articles = articleService.selectArticleList(map);
		int total = articleService.selectArticleListCount(map);
		return new JSONEntity<List<Article>>(ConstantUtil.CODE_200, articles, total);
	}

	/**
	 * 根据id查询Article
	 */
	public JSONEntity<Article> articleById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Article article = articleService.selectArticleById(Integer.parseInt(id));
			return new JSONEntity<Article>(ConstantUtil.CODE_200, article);
		} else {
			return new JSONEntity<Article>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Article
	 */
	public JSONEntity<Article> insertArticle(Article article) throws Exception{
		articleService.insertArticle(article);
		return new JSONEntity<Article>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Article
	 */
	public JSONEntity<Article> updateArticle(Article article) throws Exception{
		articleService.updateArticle(article);
		return new JSONEntity<Article>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Article
	 */
	public JSONEntity<Article> deleteArticle(Map<String, Object> map) throws Exception{
		articleService.deleteArticle(map);
		return new JSONEntity<Article>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}