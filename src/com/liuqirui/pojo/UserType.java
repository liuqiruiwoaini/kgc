package com.liuqirui.pojo;

public class UserType {
	
	private Integer id;
	private String persontype;
	
	public UserType() {
		super();
	}
	public UserType(Integer id, String persontype) {
		super();
		this.id = id;
		this.persontype = persontype;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersontype() {
		return persontype;
	}
	public void setPersontype(String persontype) {
		this.persontype = persontype;
	}
	@Override
	public String toString() {
		return "UserType [id=" + id + ", persontype=" + persontype + "]";
	}
	
	

}
