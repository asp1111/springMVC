package com.mqs.springMVCDemo.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mqs.springMVCDemo.dao.IUserDao;
import com.mqs.springMVCDemo.entity.User;
import com.mqs.springMVCDemo.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}
