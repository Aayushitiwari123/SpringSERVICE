package com.p1.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.HelloObject;

@RestController
public class SpringBootEurekaController {
	private AtomicLong counter = new AtomicLong();
	
	@GetMapping("/hello")
	public HelloObject getHelloWordObject(){
		HelloObject hello = new HelloObject();
		hello.setMessage("Hi there you are visitor number:"+counter.incrementAndGet());
		return hello;
	}
}
