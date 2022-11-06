package com.mst.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mst.entity.User;
import com.mst.multithreading.RunnableDemoCLass;
import com.mst.multithreading.ThreadTest;
import com.mst.service.UserService;

@RestController
@RequestMapping("/mst")
public class UserController {
@Autowired
private UserService userService;

@Autowired
private RestTemplate restTemplate;
//@RequestMapping( "/mst" )
//public String echo() {
//   return "Hello mst!";
//}


	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid) {
		
		User user =  this.userService.getUser(userid);
		//http://localhost:9002/mst/contact/1122
		List list = this.restTemplate.getForObject("http://localhost:9002/mst/contact/1122", List.class);
		System.out.println(list);
		user.setContactlist(list);
		return user;
		
	}
	@GetMapping("/thread")
	public void getThread() {
		ThreadTest threadTest = new ThreadTest(); 
		threadTest.start();
		//threadTest.start();
		RunnableDemoCLass runnableDemoCLass = new RunnableDemoCLass();
		Thread th=new Thread(runnableDemoCLass);
		th.start();
	}
}
