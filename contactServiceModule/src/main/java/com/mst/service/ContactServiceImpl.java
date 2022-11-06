package com.mst.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mst.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	@Override
	public List<Contact> getContacts(Long userid) {
		List<Contact> list = List.of(
				new Contact(525L, "rana", "78525525", 1122L),
				new Contact(526L, "raja", "78525525", 1122L),
				new Contact(527L, "pinky", "78525525", 1123L),
				new Contact(528L, "rinki", "78525525", 1123L),
				new Contact(529L, "santu", "78525525", 1124L),
				new Contact(530L, "mantu", "78525525", 1124L),
				new Contact(531L, "laltu", "78525525", 1124L),
				new Contact(532L, "amina", "78525525", 1125L)
				);
		return list.stream().filter(contact -> contact.getUserId().equals(userid)).collect(Collectors.toList());
	}

}
