package Dao.impl;

import java.util.ArrayList;
import java.util.List;

import Dao.userdao;
import entity.User;

public class UserDaoImpl implements userdao {
	//ʵ��dao�еĽӿڲ�����
	List<User> list=new ArrayList<User>();
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		//�������ϱ����û���Ϣ
		list.add(user);
		for(User user2:list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}

	@Override
	public void updata(User user) {
		// TODO Auto-generated method stub
		System.out.println("ִ���޸��û���Ϣ�Ĳ���");
	}

}
