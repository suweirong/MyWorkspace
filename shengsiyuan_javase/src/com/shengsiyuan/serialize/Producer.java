package com.shengsiyuan.serialize;

public class Producer {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("小酸奶");
		//序列化,保存到磁盘上
		SerializationUtils.writeObject(person);
	}
}
