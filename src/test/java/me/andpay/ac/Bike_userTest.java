package me.andpay.ac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.andpay.ac.entity.Bike_user;
import me.andpay.ac.service.Bike_userService;

/**
 * 测试类
 * 
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application.xml"})
public class Bike_userTest {

	@Resource
	private Bike_userService bike_userService;

	@Test
	public void testBike_userListBiz(){
		try {
			Map<String,Object> map=new HashMap<String, Object>();
			List<Bike_user> list= bike_userService.selectAllBike_userList(map);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}