package com.iu.c1.string;

import java.util.Scanner;

public class StringMain5 {
	
	public static void main(String[] args) {
		String n = "Hello World";
		
		String n2 = n.replace("ll", "korea");
		
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf("W"), 8);
		System.out.println(n3);
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장할 파일명을 입력");
		String fileName = sc.next();
		//a.txt, iu.jpg, study.pdf
		//입력받은 파일이 이미지 파일인지 아닌지 구분
		//jpg, gif, png, svg...
		
		String [] files = {"jpg","gif", "png", "svg"};
		
		//1. '.'의 인덱스 번호 찾기
		int idx = fileName.lastIndexOf('.');
	
		//2. 확장자 가지고 오기
		String etx = fileName.substring(idx+1); 
		
		
		boolean check = false;
		
		for(int i= 0; i<files.length;i++) {
			if(etx.equals(files[i])) {
				check= true;
				break;
			}
			
		}
		
		if(check) {
			System.out.println("이미지 파일");
		}else{
			System.out.println("이미지 파일 아님");
		}
		
		System.out.println(etx);	
	}
	

}
