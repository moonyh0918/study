package com.example.service;

import java.security.MessageDigest;

import org.springframework.stereotype.Service;


@Service
public class UserPLasswordHash {
	
	public String getSHA256(String plainText) {
		String shaString = "";
		
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256"); //암호화 방식지ㅣ정
			sh.update(plainText.getBytes("utf-8"));
			byte byteDate[]= sh.digest();
			StringBuffer stringBuffer = new StringBuffer();
			
			int bytSize =byteDate.length;	
			

			
			for(int i =0; i<bytSize;i++) {
				stringBuffer.append(Integer.toString((byteDate[i] & 0xff)+ 0x100, 16).substring(1));
				
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			shaString = null;
		}
		return shaString;
	}

}
