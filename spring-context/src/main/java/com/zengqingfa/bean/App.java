package com.zengqingfa.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @fileName: App
 * @author: zengqf3
 * @date: 2021-2-25 20:31
 * @description:
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.name);
	}
}
