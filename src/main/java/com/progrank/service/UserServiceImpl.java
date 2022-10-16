package com.progrank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.progrank.dao.UserDao;
import com.progrank.reg.UserregDTO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao repo;

	@Override
	public boolean registerUser(UserregDTO user) 
	{
		return repo.registerUser(user)>0 ? true: false;
		
	}

}
