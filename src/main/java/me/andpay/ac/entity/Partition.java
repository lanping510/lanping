package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Partition { 

	private Integer id;	//
	private String address;	//
	private Integer type;	//
	private Integer state;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) { 
		this.address = address;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) { 
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Partition [id=" + id + ",address=" + address + ",type=" + type + ",state=" + state + "]";
	}
}