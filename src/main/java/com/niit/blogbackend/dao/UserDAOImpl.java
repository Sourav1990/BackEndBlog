package com.niit.blogbackend.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.blogbackend.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public List<User> getAll() {
		@SuppressWarnings("unchecked")
		List<User> getAll = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return getAll;
	}

	@Transactional
	public User getById(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Transactional
	public User getByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean save(User user) {
		
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
