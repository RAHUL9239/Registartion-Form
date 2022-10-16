package com.progrank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.progrank.reg.UserregDTO;
@Repository
public class UserDaoImpm implements UserDao{
	@Autowired
	JdbcTemplate jdbc;
	
	
	
	@Override
	public int registerUser(UserregDTO u) {
		String sql="insert into tbl_user(user_name, user_password, country, username, gender) values(?,?,?,?,?)";
		try
		{
			return jdbc.update(sql, u.getPassword(), u.getName(), u.getCountry(), u.getUsername(), u.getGender()+"");
		}
		catch(Exception e)
		{
			
		}
		return 0;
	}
	

}
