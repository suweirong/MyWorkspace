package com.shengsiyuan.jdk5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>(); 
		Person p1 = new Person("÷ŸºÛ",21,"10803080235");
		Person p2 = new Person("≤Ã–À±¶",21,"10803080201");
		Person p3 = new Person("ÀÔ”Ó",22,"10803080222");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		for(Iterator<Person> iterator = set.iterator();iterator.hasNext();){
			Person person = iterator.next();
			System.out.println("name:"+person.getName());
			System.out.println("id:"+person.getId());
			System.out.println("name:"+person.getAge());
		}
	}
}


class Person{
	String name;
	int   age;
	String id;
	
	public Person(String name,int age,String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}