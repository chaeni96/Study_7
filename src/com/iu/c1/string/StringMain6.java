package com.iu.c1.string;

public class StringMain6 {
	
	public static void main(String[] args) {
		String weather = "서울- 대구 - 대전 - 광주 - 부산 - 제주";
		
		String [] cities = weather.split("-");
		
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
		}
		System.out.println("----------------------");
		//
		weather = "32 89 45 67";
		
		String [] wh = weather.split(" ");
		
		for(int i= 0; i<wh.length;i++) {
			System.out.println(wh[i]);
		}
		
		String name = "Te st             ";
		name = name.trim();
		name = name.replace(" ", "");
		System.out.println(name.equals("Test"));
		
		
	}

}
