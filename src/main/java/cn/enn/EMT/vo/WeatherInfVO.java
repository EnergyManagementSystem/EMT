package cn.enn.EMT.vo;

import java.lang.System;

//包含所有天气信息的类
public class WeatherInfVO {
	
	private OneDayWeatherInfVO[] weatherInfs;//存放每日天气信息的数组
	private String dressAdvise;//穿衣建议
	private String washCarAdvise;//洗车建议
	private String coldAdvise;//感冒建议
	private String sportsAdvise;//运动建议
	private String ultravioletRaysAdvise;//紫外线建议
	
	//构造函数
	public WeatherInfVO() {
		dressAdvise = "";
		washCarAdvise = "";
		coldAdvise = "";
		sportsAdvise = "";
		ultravioletRaysAdvise = "";
		
	}
	
	//输出五项件建议、每一天的天气信息
	public void printInf() {
		System.out.println(dressAdvise);
		System.out.println(washCarAdvise);
		System.out.println(coldAdvise);
		System.out.println(sportsAdvise);
		System.out.println(ultravioletRaysAdvise);
		for(int i = 0; i < weatherInfs.length; i++) {
			System.out.println(weatherInfs[i]);	
		}
	}
	
	//一天的天气信息
	public OneDayWeatherInfVO[] getWeatherInfs() {
		return weatherInfs;
	}
	
	public void setWeatherInfs(OneDayWeatherInfVO[] weatherInfs) {
		this.weatherInfs = weatherInfs;
	}
	
	//穿衣建议
	public String getDressAdvise() {
		return dressAdvise;
	}
	
	public void setDressAdvise(String dressAdvise) {
		this.dressAdvise = dressAdvise;
	}
	
	//洗车建议
	public String getWashCarAdvise() {
		return washCarAdvise;
	}
	
	public void setWashCarAdvise(String washCarAdvise) {
		this.washCarAdvise = washCarAdvise;
	}
	
	//预防感冒建议
	public String getColdAdvise() {
		return coldAdvise;
	}

	public void setColdAdvise(String coldAdvise) {
		this.coldAdvise = coldAdvise;
	}

	//运动建议
	public String getSportsAdvise() {
		return sportsAdvise;
	}
	
	public void setSportsAdvise(String sportsAdvise) {
		this.sportsAdvise = sportsAdvise; 
	}
	
	//紫外线建议
	public String getUltravioletRaysAdvise() {
		return ultravioletRaysAdvise;
	}
	
	public void setUltravioletRaysAdvise(String utravioletRaysAdvise) {
		this.ultravioletRaysAdvise = utravioletRaysAdvise; 
	}

}










	