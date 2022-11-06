package com.mst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mst.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//List<User> list = new ArrayList<User>();
	List<User> list = List.of(
			new User(1122L , "subrata1" ,"subrata1@gmail.com" ),
			new User(1123L , "subrata2" ,"subrata2@gmail.com" ),
			new User(1124L , "subrata3" ,"subrata3@gmail.com" ),
			new User(1125L , "subrata4" ,"subrata4@gmail.com" )
			);
			
	
	
	
	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
	}

}
