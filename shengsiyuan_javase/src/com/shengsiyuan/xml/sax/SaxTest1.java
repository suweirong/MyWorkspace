package com.shengsiyuan.xml.sax;

import java.io.File;
import java.io.IOException;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class SaxTest1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		//step1:获得SAX解析器工厂实例
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//step2:获得SAX解析器实例
		SAXParser parser = factory.newSAXParser();
		parser.parse(new File("student.xml"),new MyHandler());
	}

}

class MyHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("parse began");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("parse finished");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("start element");
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("finish element");
	}
	
}