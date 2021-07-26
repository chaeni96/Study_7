package com.iu.c1.string.ex1;

import java.util.Scanner;

public class Ex1Main {
	
	public static void main(String[] args) {
		
		//메인은 프로그램 실행이나 테스트 역할
		//WeatherController wc = new WeatherController();
		//wc.start();
		
		WeatherInfo weatherInfo = new WeatherInfo();
		WeatherDTO [] weatherDTOs = weatherInfo.makeWeather();
		
//		for(int i = 0;i<weatherDTOs.length;i++) {
//			System.out.println(weatherDTOs[i].getCity());
//			
//			
//		}
//		
		
		
	}

}
