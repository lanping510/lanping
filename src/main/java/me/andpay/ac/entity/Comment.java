package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Comment { 

	private Integer id;	//
	private String content;	//评论内容
	private Integer userId;	//用户Id
	private String commentTime;	//评论时间
	private Integer state;	//状态
	private Integer merchantId;	//商户id
	private String imgs;	//
	private String memo;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) { 
		this.content = content;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) { 
		this.userId = userId;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) { 
		this.commentTime = commentTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) { 
		this.merchantId = merchantId;
	}

	public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) { 
		this.imgs = imgs;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) { 
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ",content=" + content + ",userId=" + userId + ",commentTime=" + commentTime + ",state=" + state + ",merchantId=" + merchantId + ",imgs=" + imgs + ",memo=" + memo + "]";
	}
}