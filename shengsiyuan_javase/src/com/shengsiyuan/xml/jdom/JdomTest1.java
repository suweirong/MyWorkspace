//package com.shengsiyuan.xml.jdom;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.jdom.Attribute;
//import org.jdom.Comment;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.output.Format;
//import org.jdom.output.XMLOutputter;
//
//public class JdomTest1 {
//
//	public static void main(String[] args) throws Exception, IOException {
//		Document document = new Document();
//		Element root = new Element("root");
//		document.addContent(root);
//		Comment comment1 = new Comment("����ע��");
//		root.addContent(comment1);
//		Element e1 = new Element("ѧ��1");
//		Element e2 = new Element("ѧ��2");
//		Element e3 = new Element("ѧ��3");
//		root.addContent(e1);
//		root.addContent(e2);
//		root.addContent(e3);
//		e1.setAttribute("�绰","15123141458").setAttribute("�Ա�","��");//metod chain ���ض���
//		Attribute attribute = new Attribute("�Ա�","Ů");
//		e2.setAttribute(attribute);
//		//ѧ��1��
//		Element e11 = new Element("����");
//		Element e12 = new Element("�༶");
//		Element e13 = new Element("ѧ��");
//		e1.addContent(e11);
//		e1.addContent(e12);
//		e1.addContent(e13);
//		Format format = Format.getPrettyFormat();//�෽�����ض���ʵ�����������Լ�������
//		format.setIndent("    ");
//		XMLOutputter outputter = new XMLOutputter(format);
//		outputter.output(document,new FileOutputStream(new File("jdom1.xml")));
//	}
//}
