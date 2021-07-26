package com.iu.c1.string;

public class StringMain3 {
	
	public static void main(String[] args) {
		
		String name = "Hello World";
		
		char ch = 'o';
		
		//'o' 문자가 몇개 있습니까?
		boolean check  = true;
		int num = 0;
		int count = 0;
		while(check) {	
			num = name.indexOf(ch, num);
			if(num>0) {
				num = num+1;
				count = count+1; 
			}else {
				System.out.println("검색이 종료됩니다");
				break;
			}
		
		}
		
		System.out.println(ch+"는 총"+count + "개 있습니다");	
		
		name = "";
		name = new String();
	}

}
