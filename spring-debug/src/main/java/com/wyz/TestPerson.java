package com.wyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangyz
 * @version 1.0
 * @date 2021-01-14 09:36
 **/
public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
}
