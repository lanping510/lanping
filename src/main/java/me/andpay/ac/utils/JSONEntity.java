package me.andpay.ac.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * JSON数据模板
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class JSONEntity<T> {

	private T result;

	private String msg;

	private Integer total;

	private Integer error_code;

	private int flag = 0;

	public JSONEntity(Integer error_code, String msg) {
		this.msg = msg;
		this.error_code = error_code;
		flag = 1;
	}

	public JSONEntity(Integer error_code, T result) {
		this.result = result;
		this.error_code = error_code;
		flag = 2;
	}

	public JSONEntity(Integer error_code, T result, Integer total) {
		this.result = result;
		this.error_code = error_code;
		this.total = total;
		flag = 3;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) { 
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) { 
		this.msg = msg;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) { 
		this.total = total;
	}

	public Integer getError_code() {
		return error_code;
	}

	public void setError_code(Integer error_code) { 
		this.error_code = error_code;
	}

	@Override
	public String toString() {
		JSONObject jsonObject = (JSONObject) JSON.toJSON(this);
		if (flag == 1) {
			jsonObject.remove("result");
			jsonObject.remove("total");
		} else if (flag == 2) {
			jsonObject.remove("total");
			jsonObject.remove("msg");
		} else if (flag == 3) {
			jsonObject.remove("msg");
		}
		return jsonObject.toString();
	}
}