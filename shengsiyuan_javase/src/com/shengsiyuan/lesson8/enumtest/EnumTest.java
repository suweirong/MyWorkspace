package com.shengsiyuan.lesson8.enumtest;

public class EnumTest {

	public static void EnArg(OpConstant opConstant){
		
		switch (opConstant) {
		case TURN_LEFT:
			System.out.println("����ת");
			break;
		case TURN_RIGHT:	
			System.out.println("����ת");
		case UP:
			System.out.println("����");
			break;
		case DOWN:
			System.out.println("����");
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