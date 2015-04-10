package com.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.junit.AfterClass;
import org.junit.Test;

public class ZipOutputStreamDemo {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void ZipOutputStreamDemo01() throws IOException {
		File file = new File("c:" + File.separator + "hello.txt");
		File zipFile = new File("c:" + File.separator + "hello.zip");
		InputStream input = new FileInputStream(file);
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(
				zipFile));
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		// 设置注释
		zipOut.setComment("hello");
		int temp = 0;
		while ((temp = input.read()) != -1) {
			zipOut.write(temp);
		}
		input.close();
		zipOut.close();
	}

	@Test
	public void ZipOutputStreamDemo02() throws IOException {
		// 要被压缩的文件夹
		File file = new File("c:" + File.separator + "temp");
		File zipFile = new File("c:" + File.separator + "zipFile.zip");
		InputStream input = null;
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(
				zipFile));
		zipOut.setComment("hello");
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; ++i) {
				input = new FileInputStream(files[i]);
				zipOut.putNextEntry(new ZipEntry(file.getName()
						+ File.separator + files[i].getName()));
				int temp = 0;
				while ((temp = input.read()) != -1) {
					zipOut.write(temp);
				}
				input.close();
			}
		}
		zipOut.close();
	}
	
	
	
	@Test
	public void ZipFileDemo() throws IOException {
		File file = new File("c:" + File.separator +"hello.zip");
	       ZipFile zipFile = new ZipFile(file);
	       System.out.println("压缩文件的名称为：" + zipFile.getName());
		
	}
	
	/**
	 * 解压缩文件（压缩文件中只有一个文件的情况）
	 * */
	@Test
	public void ZipFileDemo2() throws IOException {
		 File file = new File("c:" + File.separator +"hello.zip");
	       File outFile = new File("c:" + File.separator +"unZipFile.txt");
	       ZipFile zipFile = new ZipFile(file);
	       ZipEntry entry =zipFile.getEntry("hello.txt");
	       InputStream input = zipFile.getInputStream(entry);
	       OutputStream output = new FileOutputStream(outFile);
	       int temp = 0;
	       while((temp = input.read()) != -1){
	           output.write(temp);
	       }
	       output.close();
		
	}
	
	/**
	 * 解压缩一个压缩文件中包含多个文件的情况
	 * */
	@Test
	public void ZipFileDemo3() throws IOException {
		 File file = new File("c:" +File.separator + "zipFile.zip");
	       File outFile = null;
	       ZipFile zipFile = new ZipFile(file);
	       ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
	       ZipEntry entry = null;
	        InputStream input = null;
	       OutputStream output = null;
	       while((entry = zipInput.getNextEntry()) != null){
	           System.out.println("解压缩" + entry.getName() + "文件");
	           outFile = new File("d:" + File.separator + entry.getName());
	           if(!outFile.getParentFile().exists()){
	               outFile.getParentFile().mkdir();
	           }
	           if(!outFile.exists()){
	                outFile.createNewFile();
	           }
	           input = zipFile.getInputStream(entry);
	           output = new FileOutputStream(outFile);
	           int temp = 0;
	           while((temp = input.read()) != -1){
	                output.write(temp);
	           }
	           input.close();
	           output.close();
	       }
	}
}
