package me.andpay.ac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.andpay.ac.entity.Loginrecord;
import me.andpay.ac.service.LoginrecordService;

/**
 * 测试类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application.xml"})
public class LoginrecordTest {

	@Resource
	private LoginrecordService loginrecordService;

	@Test
	public void testLoginrecordListBiz(){
		try {
			Map<String,Object> map=new HashMap<String, Object>();
			List<Loginrecord> list= loginrecordService.selectAllLoginrecordList(map);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}