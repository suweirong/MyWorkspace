package org.example.mywsdl;

import javax.xml.ws.Endpoint;

public class MyServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8989/ms", new MyServiceImpl());
	}

}
