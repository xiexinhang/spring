package com.xiezhe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiezhe
 * @date 2020/1/17 22:39
 * @mondify TODO
 * @copyright gofun
 */
public class Test {

	@Autowired
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService bean = context.getBean(TestService.class);
		System.out.println(bean);
	}
}
