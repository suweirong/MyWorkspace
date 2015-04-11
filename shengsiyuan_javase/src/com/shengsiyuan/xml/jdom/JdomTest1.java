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
//		Comment comment1 = new Comment("我是注释");
//		root.addContent(comment1);
//		Element e1 = new Element("学生1");
//		Element e2 = new Element("学生2");
//		Element e3 = new Element("学生3");
//		root.addContent(e1);
//		root.addContent(e2);
//		root.addContent(e3);
//		e1.setAttribute("电话","15123141458").setAttribute("性别","男");//metod chain 返回对象
//		Attribute attribute = new Attribute("性别","女");
//		e2.setAttribute(attribute);
//		//学生1下
//		Element e11 = new Element("姓名");
//		Element e12 = new Element("班级");
//		Element e13 = new Element("学号");
//		e1.addContent(e11);
//		e1.addContent(e12);
//		e1.addContent(e13);
//		Format format = Format.getPrettyFormat();//类方法返回对象实例，对象有自己的数据
//		format.setIndent("    ");
//		XMLOutputter outputter = new XMLOutputter(format);
//		outputter.output(document,new FileOutputStream(new File("jdom1.xml")));
//	}
//}
