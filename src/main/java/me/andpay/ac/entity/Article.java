package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Article { 

	private Integer id;	//
	private String title;	//
	private String content;	//
	private Integer type;	//
	private String createTime;	//
	private String codeImgPath;	//
	private String codeMessage;	//
	private String remark;	//
	private Integer state;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) { 
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) { 
		this.content = content;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) { 
		this.type = type;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) { 
		this.createTime = createTime;
	}

	public String getCodeImgPath() {
		return codeImgPath;
	}

	public void setCodeImgPath(String codeImgPath) { 
		this.codeImgPath = codeImgPath;
	}

	public String getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(String codeMessage) { 
		this.codeMessage = codeMessage;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) { 
		this.remark = remark;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ",title=" + title + ",content=" + content + ",type=" + type + ",createTime=" + createTime + ",codeImgPath=" + codeImgPath + ",codeMessage=" + codeMessage + ",remark=" + remark + ",state=" + state + "]";
	}
}