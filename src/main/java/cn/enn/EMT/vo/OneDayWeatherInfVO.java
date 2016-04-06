package cn.enn.EMT.vo;

public class OneDayWeatherInfVO {

    //一天的天气信息类
	private String location;//地址
	private String date;//日期
	private String week;//周几
	private String temperatureOfDay;//一天温度
	private String temperatureNow;//实时温度
	private String wind;//室外风速
	private String weather;//天气???
	private String picture;//异常插图
	private int pm25;//室外pm2.5

	public OneDayWeatherInfVO() {
		location = "";
		date = "";
		week = "";
		temperatureOfDay = "";
		temperatureNow = "";
		
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate () {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getWeek() {
		return week;
	} 
	
	public void setWeek(String week) {
		this.week = week;
	} 
	
	public String  getTemperatureOfDay() {
		return temperatureOfDay;
	}
	
	public void setTemperatureOfDay(String  temperatureOfDay) {
		this.temperatureOfDay = temperatureOfDay;
	}
	
	public String getTemperatureNow() {
		return temperatureNow;
	}
	
	public void setTemperatureNow(String temperatureNow) {
		this.temperatureNow = temperatureNow;
	}
	
	public String getWind() {
		return wind;
	}
	
	public void setWind(String wind) {
		this.wind = wind;
	}
	
	public String getWeather() {
		return weather;
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public int getPm25() {
		return pm25;
	}
	
	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}		
}
