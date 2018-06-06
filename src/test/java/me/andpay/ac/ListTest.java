package me.andpay.ac;

import java.util.ArrayList;
import java.util.List;

import me.andpay.ac.model.User;

public class ListTest {

	public static void main(String[] args) {
		
		List<User> users=new ArrayList<User>();
		
		User user=new User();
		user.setUserId(1);
		user.setName("lanping");
		user.setTelephone("19099990000");
		users.add(user);
		
		User user2=new User();
		user2.setUserId(2);
		user2.setName("andpay");
		user2.setTelephone("7913279312381237132");
		users.add(user2);
		
		List<User> backUsers=new ArrayList<User>();
		
		int index=0;
		for(int i=0;i<users.size();i++) {
			if(i==index) {
				User user3=new User();
				user3.setUserId(users.get(i).getUserId());
				user3.setName(users.get(i).getName());
				String telephone=users.get(i).getTelephone();
				user3.setTelephone(telephone.length()==11?telephone.substring(0, 7)+"****":telephone);
				backUsers.add(user3);
			}else {
				String telephone=users.get(i).getTelephone();
				users.get(i).setTelephone(telephone.length()==11?telephone.substring(0, 7)+"****":telephone);
				backUsers.add(users.get(i));
			}
		}
		System.out.println(backUsers.toString());
	}
}
