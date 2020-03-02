package severice.impl;

import Dao.userdao;
import Dao.impl.UserDaoImpl;
import entity.User;
import severice.UserService;

public class UserServiceImp implements UserService {
	userdao dao=new UserDaoImpl();
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
