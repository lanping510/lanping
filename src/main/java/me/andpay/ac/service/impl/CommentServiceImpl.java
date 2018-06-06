package me.andpay.ac.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.andpay.ac.service.CommentService;
import me.andpay.ac.service.BaseService;
import me.andpay.ac.entity.Comment;

/**
 * 实现类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Service
public class CommentServiceImpl extends BaseService implements CommentService {

	/**
	 * 新增
	 * 
	 * @param comment
	 * @return
	 * @throws Exception
	 */
	public int insertComment(Comment comment) throws Exception {
		return super.getSqlSession().insert("insertComment", comment);
	}

	/**
	 * 修改
	 * 
	 * @param comment
	 * @return
	 * @throws Exception
	 */
	public int updateComment(Comment comment) throws Exception {
		return super.getSqlSession().update("updateComment", comment);
	}

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteComment(Map<String, Object> map) throws Exception {
		return super.getSqlSession().delete("deleteComment", map);
	}

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Comment selectCommentById(Integer id) throws Exception {
		return super.getSqlSession().selectOne("selectCommentById",id);
	}

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Comment> selectCommentList(Map<String, Object> map) throws Exception {
		if (map != null && map.containsKey("pageIndex") && map.containsKey("pageSize")) {
			Integer index = (Integer)map.get("pageIndex");
			Integer size = (Integer)map.get("pageSize");
			Integer count = (index-1)*size;
			map.put("countIndex", count);
		}
		return super.getSqlSession().selectList("selectCommentList",map);
	}

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Comment> selectAllCommentList(Map<String, Object> map) throws Exception {
		return super.getSqlSession().selectList("selectAllCommentList",map);
	}

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectCommentListCount(Map<String, Object> map) throws Exception {
		Object obj = super.getSqlSession().selectOne("selectCommentListCount",map);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}
		return 0;
	}

}