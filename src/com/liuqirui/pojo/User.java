package com.liuqirui.pojo;

import java.util.Date;

public class User {

	/**
	 * 1.属性
	 * 2.属性的有参无参数构造方法
	 * 3.toString()
	 * 4.set / get
	 */
	private Integer id;
	private String username;
	private String address;
	private Integer gender;
	private Date birthday;
	private Integer utype;
	
	
	public User() {
		super();
	}
	public User(Integer id, String username, String address, Integer gender, Date birthday, Integer utype) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.gender = gender;
		this.birthday = birthday;
		this.utype = utype;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getUtype() {
		return utype;
	}
	public void setUtype(Integer utype) {
		this.utype = utype;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", gender=" + gender
				+ ", birthday=" + birthday + ", utype=" + utype + "]";
	}
	
	
	
	
	
	
	
}
