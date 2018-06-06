package com.logical.vote;

import com.logical.auto.sdk.AutoCreateProject;

public class AutoFileTest {
	
	/**
	 * 相关代码生成测试
	 */
	public static void main(String[] args) {
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/store?useUnicode=true&characterEncoding=utf-8";
		String user="root";
		String password="root";
		String packageName="me.andpay.ac";
		String author="lanping";
		
		/*String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=test";
		String user="sa";
		String password="123456";*/
		
		
		/*String driver="com.ibm.db2.jcc.DB2Driver";
		String url="jdbc:db2://127.0.0.1:50000/test";
		String user="db2admin";
		String password="123456";*/
		AutoCreateProject autoCreateProject;
		try {
			autoCreateProject = new AutoCreateProject(
					driver, url, user,password,packageName,author,true);
			autoCreateProject.createFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
