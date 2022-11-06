package com.mst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mst.entity.Contact;
import com.mst.service.ContactService;

@RestController
@RequestMapping("/mst/contact")
public class ContactController {
	@Autowired
	private ContactService contacatservice;
	@GetMapping("/{userid}")
	public List<Contact> getContact(@PathVariable("userid") Long userid) {
		
		return this.contacatservice.getContacts(userid);
	}

}
