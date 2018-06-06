package me.andpay.ac.utils;

/**
 * 定义常量类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class ConstantUtil {

	/**
	 * 错误代号值
	 */
	public static Integer CODE_200=200; //操作成功
	public static Integer CODE_401=401; //验证码错误
	public static Integer CODE_402=402; //用户名或密码错误
	public static Integer CODE_403=403; //没有操作权限
	public static Integer CODE_404=404; //参数错误
	public static Integer CODE_406=406; //账号在另一地点登录
	public static Integer CODE_407=407; //该值已经存在
	public static Integer CODE_500=500; //系统异常

	/**
	 * 错误消息
	 */
	public static String MSG_ADD_SUCCESS="新增成功";
	public static String MSG_EDIT_SUCCESS="修改成功";
	public static String MSG_DEL_SUCCESS="删除成功";
	public static String MSG_401="验证码错误";
	public static String MSG_402="用户名或密码错误";
	public static String MSG_403="没有操作权限";
	public static String MSG_404="参数错误";
	public static String MSG_406="您的账号在另一地点登录";
	public static String MSG_500="网络异常";

}