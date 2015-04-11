package com.shengsiyuan.test;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = new String("12342");
		String s2 = new String("12342");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Person1{
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Person1 other = (Person1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}