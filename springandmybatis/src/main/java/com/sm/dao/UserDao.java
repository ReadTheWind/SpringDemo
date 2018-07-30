package com.sm.dao;


import com.sm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author  liuhuan
 * java dao
 */
@Mapper
@Component
public interface UserDao {

	/**
	 * 查询所有user
	 * @return
	 */
	public List<User> getAll();
}
