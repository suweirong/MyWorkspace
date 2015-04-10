package com.ecnryption.des;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class Ecnryption {

	static String string="SU WEI RONG";
	
	public static void main(String[] args) {
		jdkDES();
	}
	
	public static void jdkDES(){
		try {
			KeyGenerator keyGenerator=KeyGenerator.getInstance("DES");
			keyGenerator.init(56);
			SecretKey secretKey=keyGenerator.generateKey();
			byte[] bytestKey=secretKey.getEncoded();
			
			DESKeySpec desKeySpec=new DESKeySpec(bytestKey);
			SecretKeyFactory factory=SecretKeyFactory.getInstance("DES");
			Key convertSecretKey=factory.generateSecret(desKeySpec);
			
			Cipher cipher=Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
			byte[] result= cipher.doFinal(string.getBytes());
			//System.out.println("jdk des encrypt :"+ Hex.encodeHexString(result ));
			
			
			cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
			result=cipher.doFinal(result);
			System.out.println("jdk des encrypt :"+new String(result) );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
