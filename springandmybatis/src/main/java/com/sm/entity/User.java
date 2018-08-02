package com.sm.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 1.实现序列化接口
 * 2.不能使用lombok的@Data注解，否则页面报反序列化错误
 * @author liuhuan
 * user实体类
 */
public class User implements Serializable{
	private  int id;
	private  String name;
	private  String sex	;
	private  String age;
	private  String address;
	private Date birthday;
	private  String email;
	private  String mobile;
	private  String remark;

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age='" + age + '\'' +
				", address='" + address + '\'' +
				", birthday=" + birthday +
				", email='" + email + '\'' +
				", mobile='" + mobile + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}
