package com.shengsiyuan.jdk5.enm;

public enum Color {

	RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
	// 构造枚举值，比如RED(255,0,0)
	private Color(int rv, int gv, int bv) {
		this.redValue = rv;
		this.greenValue = gv;
		this.blueValue = bv;
	}

	public String toString() { // 覆盖了父类Enum的toString()
		return super.toString() + "(" + redValue + "," + greenValue + ","
				+ blueValue + ")";
	}

	private int redValue; // 自定义数据域，private为了封装。
	private int greenValue;
	private int blueValue;
	
	
	
	/**
	 * @param args
	 */
	public static void main(String args[])  
	{  
	        // Color colors=new Color(100,200,300);  //wrong  
	           Color color=Color.RED;  
	           System.out.println(color);  // 调用了toString()方法  
	}    

}
