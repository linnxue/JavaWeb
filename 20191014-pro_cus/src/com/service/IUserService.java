package com.service;

import java.util.List;

import com.pojo.User;

public interface IUserService {
	public List<User> getAllUsers();
	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
	public User getUserById(int id);
	public List<User> getUsersByDepa(String depa);
}
