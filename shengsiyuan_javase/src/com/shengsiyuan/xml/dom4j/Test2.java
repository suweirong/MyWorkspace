package com.shengsiyuan.xml.dom4j;

import java.util.Iterator;
import java.util.List;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;

public class Test2 {

	public static void main(String[] args) throws Exception {
		SAXReader saxReader = new SAXReader();
		Document document =	saxReader.read(new File("dom4j2.xml"));
		Element root = document.getRootElement();
		List<Element> eleList = root.elements();
		for(int i = 0;i<eleList.size();i++){
			Element element = eleList.get(i);
			System.out.println(element.getName());
		}
		List list2 = root.elements("hello");
		System.out.println(list2.size());
		Element elemtn1 = root.element("hello");
		System.out.println(elemtn1.getName());
		System.out.println(elemtn1.attributeValue("age"));
		
		for(Iterator iterator =root.elementIterator();iterator.hasNext();){
			Element element2 = (Element)iterator.next();
			System.out.println(element2.getName());
		}
		
		System.out.println("---------------------------");
		
		DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		org.w3c.dom.Document document2 =db.parse(new File("student.xml")) ;
		//将jaxp的Document转换为dom4j的Document
		DOMReader domReader = new DOMReader();
		Document d = domReader.read(document2);
		Element rootElement = d.getRootElement();
		System.out.println(rootElement.getName());
		
	}
}
