package com.thread.demos.threadpool02;

/** 
 * 线程池测试类,测试功能如下： 
 * 1、测试线程池创建功能 
 * 2、测试处理并发请求功能 
 * 3、测试关闭功能 
 **/ 
public class TestThreadPool { 
    public static void main(String[] args){ 
        //创建线程池,开启处理请求服务 
        final int threadCount=10; 
        
        PoolManage pool=PoolManage.getInstance(); 
        pool.init(); //默认为最大的线程数
        
        //接收客户端请求 
        WorkTask task1=new  WorkTaskAImp("执行超时任务1..."); 
        TaskManager.addTask(task1); 
        
        System.out.println("--------------------------------------------分割线--------------------------------------------");
        final int requestCount=15; 
        for(int i=0;i<requestCount;i++){ 
            WorkTask task=new WorkTaskImp("执行第"+i+"个增加用户操作....."); 
            TaskManager.addTask(task); 
        } 
        
    } 
} 