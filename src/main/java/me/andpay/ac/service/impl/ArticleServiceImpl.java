package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.ArticleService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Article;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class ArticleServiceImpl extends BaseService implements ArticleService {

	/**
	 * 新增
	 * 
	 * @param article
	 * @return
	 * @throws Exception
	 */
	public int insertArticle(Article article) throws Exception {
		return super.getSqlSession().insert("insertArticle", article);
	}

	/**
	 * 修改
	 * 
	 * @param article
	 * @return
	 * @throws Exception
	 */
	public int updateArticle(Article article) throws Exception {
		return super.getSqlSession().update("updateArticle", article);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteArticle(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteArticle", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Article selectArticleById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectArticleById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Article> selectArticleList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectArticleList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Article> selectAllArticleList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllArticleList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectArticleListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectArticleListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}