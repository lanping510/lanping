package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Article;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface ArticleService {

	/**
	 * 新增
	 * 
	 * @param article
	 * @return
	 * @throws Exception
	 */
	public int insertArticle(Article article) throws Exception;

	/**
	 * 修改
	 * 
	 * @param article
	 * @return
	 * @throws Exception
	 */
	public int updateArticle(Article article) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteArticle(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Article selectArticleById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Article> selectArticleList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Article> selectAllArticleList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectArticleListCount(Map<String, Object> map) throws Exception;

}