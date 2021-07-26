package com.iu.c1.string.ex1;

public class WeatherInfo {
	
	private String info;
	private StringBuffer sb;
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("Seoul, 37, 80, 맑음, ");
		sb.append("Daegu, 43, 90, 지옥, ");
		sb.append("Busan, -32, 10, 눈, ");
		sb.append("Jeju, 3, 40, 비");
		
	}
	
	public WeatherDTO[] makeWeather() {
		
		info = sb.toString();
		System.out.println(info);
		
		String [] strings = info.split(",");
		System.out.println(strings.length);
		WeatherDTO [] weatherDTOs = new WeatherDTO[strings.length/4];
		
		
		for(int i = 0; i<strings.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[0]);
			weatherDTO.setTemper(strings[1]);
			weatherDTO.setHum(strings[2]);
			weatherDTO.setCondition(strings[3]);
		}

		return null;
	}

}
