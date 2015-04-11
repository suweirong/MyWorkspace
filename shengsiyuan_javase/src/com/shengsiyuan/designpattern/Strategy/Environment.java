package com.shengsiyuan.designpattern.Strategy;

public class Environment {
	//动态获得对象
	private	Caculate caculate =null;
	
	public Environment(Caculate caculate) {
		this.caculate = caculate;
	}
	

	public Caculate getCaculate() {
		return caculate;
	}

	public void setCaculate(Caculate caculate) {
		this.caculate = caculate;
	}
	//自己的方法调用接口方法，通过对象引用不同动态执行不同方法
	
	public int caculate(int a, int b){
		return	caculate.caculate(a,b);
	}
	
	
	
}
