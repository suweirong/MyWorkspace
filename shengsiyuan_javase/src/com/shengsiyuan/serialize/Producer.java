package com.shengsiyuan.serialize;

public class Producer {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("С����");
		//���л�,���浽������
		SerializationUtils.writeObject(person);
	}
}
