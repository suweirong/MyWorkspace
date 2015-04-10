package com.xml.demos;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class JaxpDomTest {

	/**
	 * 1.获取XML的根节点对象  //遍历根节点下面的所有子节点
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@Test
	public void test() throws ParserConfigurationException, SAXException, IOException{
		
		//调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象
		DocumentBuilder builder =  builderFactory.newDocumentBuilder();
		//通过文件的方式获取Document对象
		/*File file = new File("src//parsers//java.xml");
		System.out.println(file+"----");
		Document document = builder.parse(file);*/
		//解析指定的文件
		InputStream is= this.getClass().getClassLoader()
                              .getResourceAsStream("jaxpdomtest.xml");
		Document document = builder.parse(is);
	    
	    //document.getDocumentElement()获取根节点的元素对象
		Element root = document.getDocumentElement();
		//遍历根节点下面的所有子节点
		JaxpDom.listNodes(root);
	}

	@Test
	public void test02() throws ParserConfigurationException, SAXException, IOException{
		
		//调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象
		DocumentBuilder builder =  builderFactory.newDocumentBuilder();
		//通过文件的方式获取Document对象
		/*File file = new File("src//parsers//java.xml");
		System.out.println(file+"----");
		Document document = builder.parse(file);*/
		//解析指定的文件
		InputStream is= this.getClass().getClassLoader()
                              .getResourceAsStream("jaxpdomtest.xml");
		Document document = builder.parse(is);
	    
		
		JaxpDom jaxpDom = new JaxpDom();
		
		NodeList nodelist=jaxpDom.findNode(document, "teacher");
		//遍历
		for (int i = 0; i <nodelist.getLength(); i++) {
			//得到具体的某个节点对象
			Node node = nodelist.item(i);
			System.out.println(node.getNodeName());
			jaxpDom.listNodes(node);
		}
		
	}
}
