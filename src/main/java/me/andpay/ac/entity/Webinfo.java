package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Webinfo { 

	private Integer id;	//
	private String endTime;	//
	private String startTime;	//
	private String ip;	//
	private String dnsUrl;	//
	private Integer state;	//
	private String webName;	//
	private String sysos;	//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) { 
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) { 
		this.startTime = startTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) { 
		this.ip = ip;
	}

	public String getDnsUrl() {
		return dnsUrl;
	}

	public void setDnsUrl(String dnsUrl) { 
		this.dnsUrl = dnsUrl;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) { 
		this.state = state;
	}

	public String getWebName() {
		return webName;
	}

	public void setWebName(String webName) { 
		this.webName = webName;
	}

	public String getSysos() {
		return sysos;
	}

	public void setSysos(String sysos) { 
		this.sysos = sysos;
	}

	@Override
	public String toString() {
		return "Webinfo [id=" + id + ",endTime=" + endTime + ",startTime=" + startTime + ",ip=" + ip + ",dnsUrl=" + dnsUrl + ",state=" + state + ",webName=" + webName + ",sysos=" + sysos + "]";
	}
}