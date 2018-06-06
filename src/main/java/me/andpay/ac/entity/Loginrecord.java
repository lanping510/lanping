package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Loginrecord { 

	private Integer id;	//编号
	private Integer userId;	//用户编号
	private String loginTime;	//录登时间
	private String endLoginTime;	//最后登录时间
	private Integer customerType;	//客户端 0:web  1:安卓 2:苹果
	private String iP;	//IP地址
	private Integer port;	//端口
	private String sessionkey;	//唯一值
	private String logInfo;	//日志信息
	private Integer state;	//

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

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) { 
		this.loginTime = loginTime;
	}

	public String getEndLoginTime() {
		return endLoginTime;
	}

	public void setEndLoginTime(String endLoginTime) { 
		this.endLoginTime = endLoginTime;
	}

	public Integer getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Integer customerType) { 
		this.customerType = customerType;
	}

	public String getIP() {
		return iP;
	}

	public void setIP(String iP) { 
		this.iP = iP;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) { 
		this.port = port;
	}

	public String getSessionkey() {
		return sessionkey;
	}

	public void setSessionkey(String sessionkey) { 
		this.sessionkey = sessionkey;
	}

	public String getLogInfo() {
		return logInfo;
	}

	public void setLogInfo(String logInfo) { 
		this.logInfo = logInfo;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	@Override
	public String toString() {
		return "Loginrecord [id=" + id + ",userId=" + userId + ",loginTime=" + loginTime + ",endLoginTime=" + endLoginTime + ",customerType=" + customerType + ",iP=" + iP + ",port=" + port + ",sessionkey=" + sessionkey + ",logInfo=" + logInfo + ",state=" + state + "]";
	}
}