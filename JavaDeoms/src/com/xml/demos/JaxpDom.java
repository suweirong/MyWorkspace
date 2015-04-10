package com.xml.demos;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class JaxpDom {
	/**
	 * 遍历根据节点对象下面的所有的节点对象
	 * @param node
	 */
	public static void listNodes(Node node) {
		// 节点是什么类型的节点
		if (node.getNodeType() == Node.ELEMENT_NODE) {// 判断是否是元素节点
			Element element = (Element) node;
			//判断此元素节点是否有属性
			if(element.hasAttributes()){
				//获取属性节点的集合
				NamedNodeMap namenm = 	element.getAttributes();//Node
				//遍历属性节点的集合
			    for(int k=0;k<namenm.getLength();k++){
			    	//获取具体的某个属性节点   System.out.print(String.format("%-10s", "a"));
			    	Attr attr = (Attr) namenm.item(k);
			    	System.out.println("属性name:"+String.format("%-10s", attr.getNodeName())+" 属性value:"
                                     +String.format("%-10s", attr.getNodeValue())+"属性type:"+String.format("%-10s", attr.getNodeType()));
			    }
			}
			//获取元素节点的所有孩子节点
			NodeList listnode = element.getChildNodes();
			//遍历
			for (int j = 0; j < listnode.getLength(); j++) {
				//得到某个具体的节点对象
				Node nd = listnode.item(j);
				System.out.println("属性name:" + String.format("%-10s",nd.getNodeName()) + "属性value:"
						+ String.format("%-15s",nd.getNodeValue()) + "属性type:" + String.format("%-10s",nd.getNodeType()));
				//重新调用遍历节点的操作的方法
				listNodes(nd);
			}

		}
	}
	
	/**
	 * 根据标签的名称查找所有该名称的节点对象
	 */
	public NodeList findNode(Document document,String nodeName) {
		//根据标签名称获取该名称的所有节点对象
		/*NodeList nodelist = document.getElementsByTagName("teacher");*/
		NodeList nodelist = document.getElementsByTagName(nodeName);

		return nodelist;
	}

	/**
	 * 根据属性的值 查询某个节点对象
	 * 属性值是唯一（假设）
	 * @param document
	 * @param value
	 * @return
	 */
	public Node findNodeByAttrValue(Document document, String value) {
		//根据标签名称获取该名称的节点对象集合
		NodeList nodelist = document.getElementsByTagName("teacher");
		//遍历
		for (int i = 0; i < nodelist.getLength(); i++) {
			//获取某个具体的元素节点对象
			Element node = (Element) nodelist.item(i);
			//根据属性名称获取该节点的属性节点对象
			Attr attr = node.getAttributeNode("name");
			//获取属性节点的值是否给指定的节点属性值相同
			if (attr.getNodeValue().equals(value)) {
				//返回此节点
				return node;
			}
		}
		return null;
	}

	/**
	 * 根据id获取某个节点对象
	 * 
	 * @param document
	 * @param id
	 * @return
	 */
	public Node findNodeById(Document document, String id) {
		return document.getElementById(id);
	}
	
	
	
}
