package com.iu.c1.string;

public class StringMain2 {
	
	public static void main(String [] args) {
		//String name = new String ("hello World");
		
		String name  = "hello world";
		
		char ch = name.charAt(1);
		System.out.println(ch);
		
		name = "991021-3234567";
		
		//남녀 판별
		ch = name.charAt(7);
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		}else {
		System.out.println("여자");
		}
		
		ch = name.charAt(200);
		System.out.println(ch);

	}
}

