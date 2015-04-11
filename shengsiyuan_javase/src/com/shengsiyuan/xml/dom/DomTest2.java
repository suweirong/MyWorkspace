package com.shengsiyuan.xml.dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class DomTest2 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbFactory =  DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new File("student.xml"));//��ø����
//		System.out.println(doc.getXmlEncoding());
//		System.out.println(doc.getXmlVersion());
//		System.out.println(doc.getXmlStandalone());
		Element	element = doc.getDocumentElement();
		NodeList list = element.getChildNodes();
		System.out.println(list.getLength());
		for(int i=0;i<list.getLength();i++){
			System.out.println((list.item(i)).getNodeName());
		}
		System.out.println("----------------------------");
		for(int i=0;i<list.getLength();i++){
			Node node2 =list.item(i);
			System.out.println(node2.getNodeType()+":"+node2.getNodeValue());
		}
		System.out.println("----------------------------");
		for(int i=0;i<list.getLength();i++){
			Node node2 =list.item(i);
			System.out.println(node2.getTextContent());
		}
		System.out.println("----------------------------");
		NodeList nodeList = doc.getElementsByTagName("ѧ��");//���ѧ�����������
		for(int i=0;i<nodeList.getLength();i++){
		   NamedNodeMap  nnMap	= nodeList.item(i).getAttributes();//���������
		   String  name = nnMap.item(0).getNodeName();//��þ������Ե�ֵ
		   String  value = nnMap.item(0).getNodeValue();
		   System.out.println(name+":"+value);
		}
	}
}
