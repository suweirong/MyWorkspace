package com.java.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args){
		/*PersonFactory facoty = new MCFctory();
		Girl girl = facoty.getGirl();
		girl.drawWomen();*/
		
		PersonFactory facoty = new HNFactory();
		Boy boy =  facoty.getBoy();
		boy.drawMan();
		

	}
}
