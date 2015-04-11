package com.shengsiyuan.thread._case;

import java.util.ArrayList;

/*
 * ����Runnable 
 * ������������������synchronized��֤������������ͬʱִ��
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
				wait();//�ͷ���������һ����ִ��
			}
			else{
				ZT zt = new ZT();
				list.add(zt);
				Thread.sleep(100);
				System.out.println("����һ��שͷ  ,���ڹ���"+list.size()+"��");
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
				System.out.println("������һ��שͷ"+list.size()+"��");
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