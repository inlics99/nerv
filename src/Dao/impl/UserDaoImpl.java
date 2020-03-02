package Dao.impl;

import java.util.ArrayList;
import java.util.List;

import Dao.userdao;
import entity.User;

public class UserDaoImpl implements userdao {
	//实现dao中的接口操作类
	List<User> list=new ArrayList<User>();
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		//创建集合保存用户信息
		list.add(user);
		for(User user2:list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}

	@Override
	public void updata(User user) {
		// TODO Auto-generated method stub
		System.out.println("执行修改用户信息的操作");
	}

}
