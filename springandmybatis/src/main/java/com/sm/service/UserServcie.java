package com.sm.service;

import com.sm.entity.User;

import java.util.List;

/**
 * @author  liuhuan
 * java service
 */
public interface UserServcie {
	/**
	 * 查询所有user
	 * @return
	 */
	public List<User> getAll();
}
