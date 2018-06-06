package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Merchantpoint { 

	private Integer id;	//
	private Integer userId;	//
	private String pointTime;	//
	private Integer state;	//
	private Integer merchantId;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) { 
		this.userId = userId;
	}

	public String getPointTime() {
		return pointTime;
	}

	public void setPointTime(String pointTime) { 
		this.pointTime = pointTime;
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

	@Override
	public String toString() {
		return "Merchantpoint [id=" + id + ",userId=" + userId + ",pointTime=" + pointTime + ",state=" + state + ",merchantId=" + merchantId + "]";
	}
}