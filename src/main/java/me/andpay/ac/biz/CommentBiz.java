package me.andpay.ac.biz;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import me.andpay.ac.entity.Comment;
import me.andpay.ac.service.CommentService;
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
public class CommentBiz {

	@Resource
	private CommentService commentService;

	/**
	 * 查询Comment集合
	 */
	public JSONEntity<List<Comment>> commentList(Map<String, Object> map) throws Exception{
		List<Comment> comments = commentService.selectCommentList(map);
		int total = commentService.selectCommentListCount(map);
		return new JSONEntity<List<Comment>>(ConstantUtil.CODE_200, comments, total);
	}

	/**
	 * 根据id查询Comment
	 */
	public JSONEntity<Comment> commentById(String id) throws Exception{
		if (StringUtils.isNotBlank(id)) {
			Comment comment = commentService.selectCommentById(Integer.parseInt(id));
			return new JSONEntity<Comment>(ConstantUtil.CODE_200, comment);
		} else {
			return new JSONEntity<Comment>(ConstantUtil.CODE_404, ConstantUtil.MSG_404);
		}
	}

	/**
	 * 新增Comment
	 */
	public JSONEntity<Comment> insertComment(Comment comment) throws Exception{
		commentService.insertComment(comment);
		return new JSONEntity<Comment>(ConstantUtil.CODE_200, ConstantUtil.MSG_ADD_SUCCESS);
	}

	/**
	 * 修改Comment
	 */
	public JSONEntity<Comment> updateComment(Comment comment) throws Exception{
		commentService.updateComment(comment);
		return new JSONEntity<Comment>(ConstantUtil.CODE_200, ConstantUtil.MSG_EDIT_SUCCESS);
	}

	/**
	 * 删除Comment
	 */
	public JSONEntity<Comment> deleteComment(Map<String, Object> map) throws Exception{
		commentService.deleteComment(map);
		return new JSONEntity<Comment>(ConstantUtil.CODE_200, ConstantUtil.MSG_DEL_SUCCESS);
	}

}