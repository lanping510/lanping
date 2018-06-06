package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Bike_user { 

	private Integer userId;	//
	private String userName;	//
	private String password;	//
	private String telepone;	//
	private Integer sex;	//
	private Integer state;	//

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) { 
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) { 
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) { 
		this.password = password;
	}

	public String getTelepone() {
		return telepone;
	}

	public void setTelepone(String telepone) { 
		this.telepone = telepone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) { 
		this.sex = sex;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Bike_user [userId=" + userId + ",userName=" + userName + ",password=" + password + ",telepone=" + telepone + ",sex=" + sex + ",state=" + state + "]";
	}
}