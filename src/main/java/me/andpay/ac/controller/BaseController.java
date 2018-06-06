package me.andpay.ac.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;

/**
 * 基础工具控制器
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Controller
public class BaseController {
	protected HttpSession session;
	protected HttpServletRequest request;
	private PrintWriter out;

	@Resource
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Resource
	public void setSession(HttpSession session) {
		this.session = session;
	}

	/**
	 * 数据输出
	 * @param response
	 * @param data 返回的数据
	 * @param contentType  返回数据类型
	 * json格式： application/json;charset=UTF-8
	 * html：text/html;charset=UTF-8
	 */
	public void output(HttpServletResponse response,String data,String contentType){
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType(contentType);
			out=response.getWriter();
			out.print(data);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取分页参数
	 */
	protected Map<String, Object> initMap(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		String pageIndex = request.getParameter("pageIndex");
		if (StringUtils.isNotBlank(pageIndex)) {
			map.put("pageIndex", Integer.parseInt(pageIndex));
		}

		String pageSize = request.getParameter("pageSize");
		if (StringUtils.isNotBlank(pageSize)) {
			map.put("pageSize", Integer.parseInt(pageSize));
		}

		String sortname = request.getParameter("sortname");
		if (StringUtils.isNotBlank(sortname)) {
			map.put("sortname", sortname);
		}

		String sortorder = request.getParameter("sortorder");
		if (StringUtils.isNotBlank(sortorder)) {
			map.put("sortorder", sortorder);
		}
		return map;
	}

	/**
	 * 转换map
	 */
	protected static String setMap(Map<String, Object> map) {
		String message = "";
		if (map != null) {
			for (Entry<String, Object> entry : map.entrySet()) {
				message += entry.getKey() + "=" + entry.getValue() + "&";
			}
		}
		return message;
	}

}