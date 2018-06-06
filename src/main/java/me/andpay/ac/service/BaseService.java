package me.andpay.ac.service;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import me.andpay.ac.utils.DataSourceContextHolder;

/**
 * SqlSession基础类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@Component
public class BaseService {

	private SqlSession sqlSession;

	/**
	 * 获取sqlSession
	 * 
	 * @return
	 */
	public SqlSession getSqlSession() {
		DataSourceContextHolder.setDbType(DataSourceContextHolder.dataSource);
		return sqlSession;
	}

	@Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}