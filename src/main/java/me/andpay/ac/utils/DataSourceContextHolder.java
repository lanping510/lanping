package me.andpay.ac.utils;

/**
 * 数据源上下文设置
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class DataSourceContextHolder {

	public static final String dataSource = "dataSource";

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDbType() {
		return ((String) contextHolder.get());
	}

	public static void clearDbType() {
		contextHolder.remove();
	}
}