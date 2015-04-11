package com.shengsiyuan.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;


public class DomTest1 {

	public static void main(String[] args) throws Exception {
		/*
		 * 获得解析工厂
		 */
		DocumentBuilderFactory dbFactory =  DocumentBuilderFactory.newInstance();
//		System.out.println(dbFactory.getClass().getName());//返回工厂实例继承自D。。。Factory
		/*
		 * 获得具体解析器
		 */
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//		System.out.println(dBuilder.getClass().getName());//返回工厂实例继承自D。。。Builder

		
		Document document = dBuilder.parse(new File("candidate.xml"));//获得根结点
		
		NodeList list = document.getElementsByTagName("PERSON");//返回元素数组
		System.out.println(list.getLength());
		for(int i=0;i<list.getLength();i++){
			Element element = (Element)list.item(i);//返回对象用Node存储，向下转型
			String content  = element.getElementsByTagName("NAME").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
			content  = element.getElementsByTagName("ADDRESS").item(0).getFirstChild().getNodeValue();//获得文本结点，然后获得值
			System.out.println(content);
			content  = element.getElementsByTagName("TEL").item(0).getFirstChild().getNodeValue();//获得子接口类型，调用父接口类型方法
			System.out.println(content);
			content  = element.getElementsByTagName("FAX").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
			content  = element.getElementsByTagName("EMAIL").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
		}
	}
}
