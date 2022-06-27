package spring.core.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ComputerContext.xml");
		Student obj1 = ctx.getBean(Student.class);
	
		System.out.println(obj1);
	
	}

}

