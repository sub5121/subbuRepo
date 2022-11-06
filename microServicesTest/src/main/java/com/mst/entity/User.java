package com.mst.entity;

import java.util.ArrayList;
import java.util.List;


//@Data
public class User {
private Long id;
private String userName;
private String email;
List<Contact> contactlist = new ArrayList<>();
public User(Long id, String userName, String email, List<Contact> contactlist) {
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
	this.contactlist = contactlist;
}
public User(Long id, String userName, String email) {
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Contact> getContactlist() {
	return contactlist;
}
public void setContactlist(List<Contact> contactlist) {
	this.contactlist = contactlist;
}


}
