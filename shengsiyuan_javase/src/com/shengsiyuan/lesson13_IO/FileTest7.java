package com.shengsiyuan.lesson13_IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest7 {

	public static void main(String[] args) {
		File file = new File("D:\\abc\\a");
		String[] names = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("txt")){
					return true;
				}
				return false;
			}
		});
		for(String name:names){
			System.out.println(name);
		}
	}
}
