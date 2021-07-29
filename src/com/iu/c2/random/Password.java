package com.iu.c2.random;

import java.util.Random;

public class Password {
	
	//makePassword
	//랜덤한 패스워드 생성
	//대문자, 소문자, 숫자 조합
	//8글자
	//a4bcD5P0
	//1.대문자, 소문자, 숫자 결정 랜덤하게 random.nextInt(3)+1; 
	//2. 글자 랜덤  아스키 코드     
	// 아스키코드 A : 65, Z : 90, a : 97, z : 122
	
	public String makePassword() {
		Random random = new Random();
		
		String result = "";
		StringBuffer sb = new StringBuffer();
		
		
		for(int i =0; i<8; i++) {
			
			int select = random.nextInt(100);
		
			if(select%3 == 0) {
				System.out.println("대문자 사용");
				int num = random.nextInt(26)+65;
				char ch = (char)num;
				sb.append(ch);
				System.out.println(ch);
				
			}else if(select%3 == 1) {
				System.out.println("소문자 사용");
				int num = random.nextInt(26)+97;
				char ch = (char)num;
				sb.append(ch);
				System.out.println(ch);
				
			}else {
				System.out.println("숫자 사용");
				int num = random.nextInt(10);
				sb.append(num);
				
				System.out.println(num);
			}
			
		}//for 끝
		
		return sb.toString();

	}//method 끝
	
	

}
