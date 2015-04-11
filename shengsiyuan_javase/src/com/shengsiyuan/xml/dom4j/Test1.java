package com.shengsiyuan.xml.dom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Test1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
//		//创建文档并设置根元素第一种
//		Document document = DocumentHelper.createDocument();
//		Element	root = DocumentHelper.createElement("student");
//		document.setRootElement(root);
		//创建文档并设置根元素第二种
		Element	root = DocumentHelper.createElement("student");
		Document document = DocumentHelper.createDocument(root);
		root.addAttribute("name","zhangsan");
		Element helloElement = root.addElement("hello");
		Element worldElement = root.addElement("world");
		helloElement.addAttribute("age","20");
		
		XMLWriter xmlWriter1 = new XMLWriter();
		xmlWriter1.write(document);
		
		OutputFormat outFormat = new OutputFormat("    ",true);
		XMLWriter xmlWriter2 = new XMLWriter(new FileOutputStream(new File("dom4j1.xml")),outFormat);
		xmlWriter2.write(document);
		
		XMLWriter xmlWriter3 = new XMLWriter(new FileWriter(new File("dom4j2.xml")),outFormat);
		xmlWriter3.write(document);
		xmlWriter3.close();
//		xmlWriter3.flush();
		
	}
}
