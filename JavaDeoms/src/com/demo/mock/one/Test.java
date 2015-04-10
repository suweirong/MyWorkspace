package com.demo.mock.one;

/**
 *  Object o = mocklist.get(UserDAOImpl.class.getName());  这个类似于spring获取bean，不过在这里经过了代理。
    只是简单阐述了下，当然不同的单元测试有自己独特的解决方案，我只是想让mock不这么神秘而已。
 * @author stevensu
 *
 */
public class Test extends Mock{
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		new MockUp<UserDAOImpl>(){
			
			@SuppressWarnings("unused")
			//@MockMe
			public String getUserByName(String username){
				return "MOCK HAHA";
			}
		};
		
		Object o = mocklist.get(UserDAOImpl.class.getName());
		UserDAO dao = (UserDAO) o;
		String name = dao.getUserByName("proxy");
	}
}