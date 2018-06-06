package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Goods { 

	private Integer gid;	//主键 自增
	private String goodsName;	//商品名称
	private String baseName;	//基地名称
	private String address;	//地址
	private String joinTime;	//成鱼入塘时间
	private String lastPreventionTime;	//最后防疫日期
	private String catchTime;	//捕捞时间
	private String feedName;	//常用饲料
	private String feedUnit;	//饲料生产资料
	private String codeImgPath;	//二维码图片地址
	private String codeMessage;	//
	private String createTime;	//创建时间
	private String remark;	//备注
	private Integer state;	//有效状态

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) { 
		this.gid = gid;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) { 
		this.goodsName = goodsName;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) { 
		this.baseName = baseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) { 
		this.address = address;
	}

	public String getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(String joinTime) { 
		this.joinTime = joinTime;
	}

	public String getLastPreventionTime() {
		return lastPreventionTime;
	}

	public void setLastPreventionTime(String lastPreventionTime) { 
		this.lastPreventionTime = lastPreventionTime;
	}

	public String getCatchTime() {
		return catchTime;
	}

	public void setCatchTime(String catchTime) { 
		this.catchTime = catchTime;
	}

	public String getFeedName() {
		return feedName;
	}

	public void setFeedName(String feedName) { 
		this.feedName = feedName;
	}

	public String getFeedUnit() {
		return feedUnit;
	}

	public void setFeedUnit(String feedUnit) { 
		this.feedUnit = feedUnit;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) { 
		this.createTime = createTime;
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
		return "Goods [gid=" + gid + ",goodsName=" + goodsName + ",baseName=" + baseName + ",address=" + address + ",joinTime=" + joinTime + ",lastPreventionTime=" + lastPreventionTime + ",catchTime=" + catchTime + ",feedName=" + feedName + ",feedUnit=" + feedUnit + ",codeImgPath=" + codeImgPath + ",codeMessage=" + codeMessage + ",createTime=" + createTime + ",remark=" + remark + ",state=" + state + "]";
	}
}