package com.sm.service.impl;

import com.sm.dao.UserDao;
import com.sm.entity.User;
import com.sm.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuhuan
 * service 实现类
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserServcie {

	@Autowired
	UserDao userDao;

	public List<User> getAll() {
		return null;
	}
}
