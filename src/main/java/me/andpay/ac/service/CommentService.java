package me.andpay.ac.service;

import java.util.List;
import java.util.Map;

import me.andpay.ac.entity.Comment;

/**
 * 接口
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public interface CommentService {

	/**
	 * 新增
	 * 
	 * @param comment
	 * @return
	 * @throws Exception
	 */
	public int insertComment(Comment comment) throws Exception;

	/**
	 * 修改
	 * 
	 * @param comment
	 * @return
	 * @throws Exception
	 */
	public int updateComment(Comment comment) throws Exception;

	/**
	 * 删除
	 * 
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public int deleteComment(Map<String, Object> map) throws Exception;

	/**
	 * 查询单个
	 * 
	 * @param id
	 * @return
	 */
	public Comment selectCommentById(Integer id) throws Exception;

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	public List<Comment> selectCommentList(Map<String, Object> map) throws Exception;

	/**
	 * 查询所有
	 * 
	 * @param map
	 * @return
	 */
	public List<Comment> selectAllCommentList(Map<String, Object> map) throws Exception;

	/**
	 * 查询总数
	 * 
	 * @param map
	 * @return
	 */
	public int selectCommentListCount(Map<String, Object> map) throws Exception;

}