package com.niit.blogbackend.dao;

import java.util.List;

import com.niit.blogbackend.model.Blog;

public interface BlogDAO {

	public Blog getBlog(Integer id);

	public List<Blog> getAllBlogs();

	public List<Blog> getAllBlogs(String userID);

	public boolean update(Blog blog);

	public boolean save(Blog blog);
}
