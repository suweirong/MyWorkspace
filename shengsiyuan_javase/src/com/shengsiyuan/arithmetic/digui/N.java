package com.shengsiyuan.arithmetic.digui;

public class N {

	/*һ����������ĳ�����Ľ׳�
	 * �����Բ�����ʽ���ݣ�ȷ������ֵ����
	 * 1.�趨���������������ɾ�ֵ�Ƴ���ֵ
	 * 			��ʽ1���趨Ϊ��ʼ�������
	 * 2.�������ƣ����ƺ�ʱ�ý���
	 * 			��ʽ1�������������ټ������¼��㣬�ɽ��о����������������ֵ�жϣ����в���
	 * 3.������ϵʽ����ԭ�б���ֵ�Ƶ�����һ����ֵ
	 * 			��ʽ1������
	 *  		��ʽ2������
	 */
	
	public int jc(int n){
		int result=n;
		if(n==1){
			return 1;
		}
		else {
			return result*jc(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		N  n1 = new N();
		System.out.println(n1.jc(3));
	}
	
}
