package com.shengsiyuan.jdk5.enm;

public enum Color {

	RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
	// ����ö��ֵ������RED(255,0,0)
	private Color(int rv, int gv, int bv) {
		this.redValue = rv;
		this.greenValue = gv;
		this.blueValue = bv;
	}

	public String toString() { // �����˸���Enum��toString()
		return super.toString() + "(" + redValue + "," + greenValue + ","
				+ blueValue + ")";
	}

	private int redValue; // �Զ���������privateΪ�˷�װ��
	private int greenValue;
	private int blueValue;
	
	
	
	/**
	 * @param args
	 */
	public static void main(String args[])  
	{  
	        // Color colors=new Color(100,200,300);  //wrong  
	           Color color=Color.RED;  
	           System.out.println(color);  // ������toString()����  
	}    

}
