package com.mst.entity;




public class Contact {
private Long id;
private String contactName;
private String mobile;
private Long userId;
public Contact(Long id, String contactName, String mobile, Long userId) {
	super();
	this.id = id;
	this.contactName = contactName;
	this.mobile = mobile;
	this.userId = userId;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
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
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}

}
