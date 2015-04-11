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
		 * ��ý�������
		 */
		DocumentBuilderFactory dbFactory =  DocumentBuilderFactory.newInstance();
//		System.out.println(dbFactory.getClass().getName());//���ع���ʵ���̳���D������Factory
		/*
		 * ��þ��������
		 */
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//		System.out.println(dBuilder.getClass().getName());//���ع���ʵ���̳���D������Builder

		
		Document document = dBuilder.parse(new File("candidate.xml"));//��ø����
		
		NodeList list = document.getElementsByTagName("PERSON");//����Ԫ������
		System.out.println(list.getLength());
		for(int i=0;i<list.getLength();i++){
			Element element = (Element)list.item(i);//���ض�����Node�洢������ת��
			String content  = element.getElementsByTagName("NAME").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
			content  = element.getElementsByTagName("ADDRESS").item(0).getFirstChild().getNodeValue();//����ı���㣬Ȼ����ֵ
			System.out.println(content);
			content  = element.getElementsByTagName("TEL").item(0).getFirstChild().getNodeValue();//����ӽӿ����ͣ����ø��ӿ����ͷ���
			System.out.println(content);
			content  = element.getElementsByTagName("FAX").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
			content  = element.getElementsByTagName("EMAIL").item(0).getFirstChild().getNodeValue();
			System.out.println(content);
		}
	}
}
