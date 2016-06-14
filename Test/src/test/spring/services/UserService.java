package test.spring.services;

import test.spring.dao.UserDao;

public class UserService {

	    private UserDao userDao;

		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
	
	
}
