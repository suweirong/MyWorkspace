package com.shengsiyuan.lesson13_IO;

import java.io.File;
import java.io.IOException;

public class FileTest1_CreateFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File file =new File("D:"+File.separator+"EXT.txt");
//		try {
//			System.out.println(file.createNewFile());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		File file = new File(File.separator);//获得当盘符目录
		File file2 = new File(file,"xxx.txt");
		System.out.println(file2.createNewFile());
	}

}
