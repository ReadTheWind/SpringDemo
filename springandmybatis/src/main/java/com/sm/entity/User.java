package com.sm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhuan
 * user实体类
 */
@Data
public class User {
	private  int id;
	private  String name;
	private  String sex	;
	private  String age;
	private  String address;
	private Date birthday;
	private  String email;
	private  String mobile;
	private  String remark;
}
