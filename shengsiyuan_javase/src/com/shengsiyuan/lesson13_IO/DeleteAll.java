package com.shengsiyuan.lesson13_IO;

import java.io.File;

public class DeleteAll {

	public static void deleteAll(File file){
		if(file.isFile()||file.list().length==0)
		{
			file.delete();
		}
		else
		{
			File[] files = file.listFiles();
			for(File f: files)
			{
				deleteAll(f);
				f.delete();
			}
		}
	}
	public static void main(String[] args) {
		DeleteAll.deleteAll(new File("D:/abc"));
	}
}
