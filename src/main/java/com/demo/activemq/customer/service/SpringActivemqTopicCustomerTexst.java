package com.demo.activemq.customer.service;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringActivemqTopicCustomerTexst {
	private static ApplicationContext applicationContext;
    // ��̬��������Spring����
    static {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("������������������");
    }
    
    @Test
    public void testQueue(){
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}