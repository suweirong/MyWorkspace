package com.thread.demos.threadpool02;


/**
 * 任务类1
 * 正常执行的工作任务 
 */
public class WorkTaskAImp implements WorkTask {

	protected String param;
	public WorkTaskAImp(){
	}
	public WorkTaskAImp(String param){
		this.param=param;
	}
	
	
	//业务方法
    @Override
    public void runTask() {
       // 
        System.out.println("=============>Task1"+this.param);
    }

    @Override
    public void cancelTask() {
        // TODO Auto-generated method stub
       
    }

    @Override
    public int getProgress() {
        // TODO Auto-generated method stub
        return 0;
    }
	
}
