//package com.shengsiyuan.xml.jdom;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//
//import javax.print.Doc;
//
//import org.jdom.Attribute;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.JDOMException;
//import org.jdom.input.SAXBuilder;
//import org.jdom.output.Format;
//import org.jdom.output.XMLOutputter;
//
//public class JdomTest2 {
//
//	public static void main(String[] args) throws JDOMException, IOException {
//		SAXBuilder builder = new SAXBuilder();//获得解析器
//		
//		Document document = builder.build(new File("jdom1.xml"));//解析文档返回document对象
//		Element root = document.getRootElement();//获得根元素
//		System.out.println(root.getName());//打印根元素名称
//		Element e1 = root.getChild("学生1");//返回指定元素
//		System.out.println(e1.getText());
//		List list = e1.getAttributes();
//		for(int i=0;i<list.size();i++){
//			Attribute attribute =(Attribute)list.get(i);
//			String name = attribute.getName();
//			String value = attribute.getValue();
//			System.err.println(name+":"+value);
//		}
//		root.removeChild("学生2");
//		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat().setIndent("    "));
//		outputter.output(document,new FileOutputStream(new File("jdom2.xml")));
//	}
//		
//}
