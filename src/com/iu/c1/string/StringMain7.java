package com.iu.c1.string;

public class StringMain7 {
	
	public static void main(String[] args) {
		
		String n = "abc";
		String n2 = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		sb.append(n2);
		sb.append(3);
		
		String str = sb.toString();
		
		System.out.println(sb); //sb.toString()
		System.out.println(str);
	}

}
