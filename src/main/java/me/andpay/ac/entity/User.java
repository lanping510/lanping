package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class User { 

	private Integer id;	//
	private String userName;	//登录名
	private String password;	//
	private String nickName;	//昵称
	private String telephone;	//
	private String email;	//
	private String sex;	//
	private Integer state;	//
	private Integer roleId;	//
	private String birthday;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) { 
		this.nickName = nickName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) { 
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) { 
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) { 
		this.sex = sex;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) { 
		this.roleId = roleId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) { 
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",userName=" + userName + ",password=" + password + ",nickName=" + nickName + ",telephone=" + telephone + ",email=" + email + ",sex=" + sex + ",state=" + state + ",roleId=" + roleId + ",birthday=" + birthday + "]";
	}
}