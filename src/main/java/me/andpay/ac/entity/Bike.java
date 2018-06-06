package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Bike { 

	private Integer bid;	//
	private String bike_num;	//
	private String password;	//
	private Integer type;	//
	private Integer count;	//
	private Integer state;	//

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) { 
		this.bid = bid;
	}

	public String getBike_num() {
		return bike_num;
	}

	public void setBike_num(String bike_num) { 
		this.bike_num = bike_num;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) { 
		this.password = password;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) { 
		this.type = type;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) { 
		this.count = count;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Bike [bid=" + bid + ",bike_num=" + bike_num + ",password=" + password + ",type=" + type + ",count=" + count + ",state=" + state + "]";
	}
}