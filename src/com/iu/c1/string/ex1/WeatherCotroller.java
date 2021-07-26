package com.iu.c1.string.ex1;

import java.util.Scanner;

public class WeatherCotroller {
	
	public void start() {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) { 
			System.out.println("번호를 입력해주세요 1.날씨 정보 전체 출력 2. 지역검색 정보출력 3. 지역 정보 추가 4. 프로그램 종료");	
			
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("1");
			}else if(select == 2){
				System.out.println("2");
			}else if(select ==3 ) {
				System.out.println("3");
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		System.out.println("Finish");
	}

}
