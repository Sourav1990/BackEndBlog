package com.niit.blogbackend.dao;

import java.util.List;

import com.niit.blogbackend.model.User;

public interface UserDAO {
	public List<User> getAll();

	public User getById(String id);
	
	public User getByUsername(String name);

	public boolean save(User user);
	public boolean update(User user);

	public boolean delete(String id);
}
