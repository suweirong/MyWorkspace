package com.shengsiyuan.designpattern.Strategy;

public class Environment {
	//��̬��ö���
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
	//�Լ��ķ������ýӿڷ�����ͨ���������ò�ͬ��ִ̬�в�ͬ����
	
	public int caculate(int a, int b){
		return	caculate.caculate(a,b);
	}
	
	
	
}
