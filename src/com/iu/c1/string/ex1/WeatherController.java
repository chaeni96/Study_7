package com.iu.c1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
	}
	
	
	
	public void start() {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		weatherInfo.makeWeather();
		
		while(flag) { 
			System.out.println("1. 전체날씨정보출력");
			System.out.println("2. 지역검색정보출력");
			System.out.println("3. 지역 정보  추가");
			System.out.println("4. 프로 그램  종료");
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
