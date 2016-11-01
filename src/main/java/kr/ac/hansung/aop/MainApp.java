package kr.ac.hansung.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"kr/ac/hansung/aop/beans/ApplicationContext.xml");
		
		PetOwner petOwner=(PetOwner)context.getBean("petOwner");
		petOwner.petTalk();
	}		
	
}
