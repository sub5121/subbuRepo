package com.mst.entity;




public class Contact {
private long id;
private String contactName;
private String mobile;
private long userId;
public Contact(long id, String contactName, String mobile, long userId) {
	super();
	this.id = id;
	this.contactName = contactName;
	this.mobile = mobile;
	this.userId = userId;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}


}
