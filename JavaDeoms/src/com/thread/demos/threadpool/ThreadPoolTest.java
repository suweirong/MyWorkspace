package com.thread.demos.threadpool;

import java.io.IOException;

import org.junit.Test;

public class ThreadPoolTest {
	
	@Test
	public void test01(){
		
		ThreadPoolManager threadPoolManager = new  ThreadPoolManager();
		//threadPoolManager.start();
		WorkThread workThread = new WorkThread(threadPoolManager);
		
		
		Task task01=new TaskImpl();
		
		workThread.runIt(task01);
		
		
		
		
	}

}
