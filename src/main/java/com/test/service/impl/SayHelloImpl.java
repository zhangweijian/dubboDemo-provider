package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.service.SayHello;

@Service("sayHello")
public class SayHelloImpl implements SayHello{

	public void hello() {
		
		System.out.println("sayhello....................");
	}

}
