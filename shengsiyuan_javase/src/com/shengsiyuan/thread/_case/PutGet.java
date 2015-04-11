package com.shengsiyuan.thread._case;

import java.util.ArrayList;

/*
 * 先用Runnable 
 * 两个方法，给方法加synchronized保证两个方法不能同时执行
 */
public class PutGet {

	ArrayList<ZT> list;
	
	public PutGet(ArrayList<ZT> list) {
		this.list = list;
	}

	
	public  synchronized void put() throws Exception{
		
		while(true){
		
			if(list.size()>=30){
//			if(list.size()!=0){
				wait();//释放锁，让另一方法执行
			}
			else{
				ZT zt = new ZT();
				list.add(zt);
				Thread.sleep(100);
				System.out.println("放了一个砖头  ,现在共有"+list.size()+"个");
				notify();
			}
		}	
	}
	
	public synchronized void get() throws Exception{
		while(true){
			if(list.size()==0){
				wait();
			}
			else {
				list.remove(list.size()-1);
				Thread.sleep(100);
				System.out.println("拿走了一个砖头"+list.size()+"个");
				notify();
			}
		}	
	}
	
}


class GetThread extends Thread{
	
	PutGet pg ;
	
	public GetThread(PutGet pg) {
		this.pg = pg;
	}
	
	@Override
	public void run() {
		try {
			pg.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class PutThread extends Thread{
	
	PutGet pg ;
	
	public PutThread(PutGet pg) {
		this.pg = pg;
	}
	
	@Override
	public void run() {
		try {
			pg.put();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}