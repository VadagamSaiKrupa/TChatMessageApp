package com.message.app.service;

import java.util.List;

import com.message.app.dto.UserDto;
import com.message.app.exception.UserException;
import com.message.app.model.User;
import com.message.app.request.UpdateUserRequest;

public interface UserService {
	
	public User findUserProfile(String jwt);
	
	public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public List<User> searchUser(String query);
}
