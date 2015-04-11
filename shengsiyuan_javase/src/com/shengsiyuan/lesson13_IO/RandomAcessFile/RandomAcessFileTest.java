package com.shengsiyuan.lesson13_IO.RandomAcessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rFile= new RandomAccessFile("randomfile.txt","rw");
		Person p1 = new Person(10,"张三",2.0);
		p1.write(rFile);
		rFile.seek(0);
		Person p2 = new Person();
		p2.read(rFile);
		System.out.println(p2.getId()+","+p2.getName()+","+p2.getSight());
	}
}

class Person{
	int id;
	String name;
	double sight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id,String name,double sight) {
		this.id=id;
		this.name =name;
		this.sight=sight;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSight() {
		return sight;
	}

	public void setSight(double sight) {
		this.sight = sight;
	}

	//方法将数据写到一个RandomAcessFile
	public void write(RandomAccessFile rdf) throws IOException{
		rdf.writeInt(this.id);
		rdf.writeUTF(this.name);
		rdf.writeDouble(this.sight);
	}
	//从一个RandomAcessFile读出来
	public void read(RandomAccessFile raFile) throws IOException{
		this.id = raFile.readInt();
		this.name = raFile.readUTF();
		this.sight = raFile.readDouble();
	}
	
	
}