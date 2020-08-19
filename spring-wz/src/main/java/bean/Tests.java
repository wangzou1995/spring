package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangzou1995
 * @Title: null.java
 * @Package bean
 * @Description:
 * @date 2020/8/19/ 2:35 下午
 */
public class Tests {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("ssss");
		Car car1 = (Car) context.getBean("car");
		System.out.println(car1.toString());
		Car car2 = (Car) context.getBean("car");
		System.out.println(car2.toString());
		System.out.println(car1.equals(car2));

	}
}
