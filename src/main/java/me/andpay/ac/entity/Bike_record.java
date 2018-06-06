package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Bike_record { 

	private String runId;	//
	private Integer bid;	//
	private String createTime;	//
	private Integer state;	//

	public String getRunId() {
		return runId;
	}

	public void setRunId(String runId) { 
		this.runId = runId;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) { 
		this.bid = bid;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) { 
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Bike_record [runId=" + runId + ",bid=" + bid + ",createTime=" + createTime + ",state=" + state + "]";
	}
}