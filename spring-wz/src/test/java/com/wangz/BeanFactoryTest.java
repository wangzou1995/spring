package com.wangz;

import bean.Car;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package com.wangz
 * @Description:
 * @date 2020/8/19/ 5:45 下午
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("classpath:spring-config.xml"));
		Car car = (Car) beanFactory.getBean("car");
		System.out.println(car.toString());
	}
}
