package com.test.service.Main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.impl.SayHelloImpl;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
 
        System.in.read();
	}
}
