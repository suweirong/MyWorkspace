package com.shengsiyuan.lesson8.enumtest;

public class EnumTest {

	public static void EnArg(OpConstant opConstant){
		
		switch (opConstant) {
		case TURN_LEFT:
			System.out.println("向左转");
			break;
		case TURN_RIGHT:	
			System.out.println("向右转");
		case UP:
			System.out.println("向上");
			break;
		case DOWN:
			System.out.println("向下");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		EnumTest.EnArg(OpConstant.UP);
	}
	
}

enum OpConstant{
	TURN_LEFT,TURN_RIGHT,UP,DOWN
	
	
}