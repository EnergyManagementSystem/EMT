package cn.enn.EMT.service;


import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.enn.EMT.vo.WeatherInfVO;
import cn.enn.EMT.vo.OneDayWeatherInfVO;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

//需要解析的JSON数据：strPar
public class AnalysisWeatherInfService {
	public  WeatherInfVO analysisWeatherInf(String strPar) {
		JSONObject dataOfJson = JSONObject.fromObject(strPar);
		
		if(dataOfJson.getInt("error")!=0) {
			return null;
		} 
		
		/*Analysis WeatherInfvo*/
		WeatherInfVO weatherInfVO = new WeatherInfVO();
		
		//Analysis data
		String date = dataOfJson.getString("date");//获得“date”字段
		
		String localTime =date.substring(0, 10);//取出当前日期，存为String类型
		Date today = new Date();//新建Date类对象
		Calendar calendar = Calendar.getInstance();//获得系统当前时间
		calendar.setTime(today);//
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//现在日期的格式为：年-月-日
		
		/*Analysis results*/
		JSONArray results = dataOfJson.getJSONArray("results");
		JSONObject results0 = results.getJSONObject(0);
	
		String location = results0.getString("currentCity");
		int pm25;
		
		if(results0.getString("pm25").isEmpty()) {
			pm25 = 0;
		} else {
			pm25 = results0.getInt("pm25");
		}
		 
		//Analysis index
		try{
			JSONArray index = results0.getJSONArray("index");
			
			//JSONObject类型的五项建议
			JSONObject index0 = index.getJSONObject(0);//穿衣
			JSONObject index1 = index.getJSONObject(1);//洗车
			JSONObject index2 = index.getJSONObject(2);//旅行
			JSONObject index3 = index.getJSONObject(3);//感冒
			JSONObject index4 = index.getJSONObject(4);//运动
			JSONObject index5 = index.getJSONObject(5);//紫外线
			
			//String 类型的五项建议
		    String dressAdvise = index0.getString("des");//穿衣建议类型准换
		    String washCarAdvise = index1.getString("des");//洗车建议
		    String travelAdvise = index2.getString("des");//旅行
		    String coldAdvise = index3.getString("des");//感冒建议
		    String sportsAdvise = index4.getString("des");//运动建议  
            String ultravioletRaysAdvise = index5.getString("des");//紫外线建议
            
            //赋值给天气信息对象
            weatherInfVO.setDressAdvise(dressAdvise);  
            weatherInfVO.setWashCarAdvise(washCarAdvise);  
            weatherInfVO.setTravelAdvise(travelAdvise);
            weatherInfVO.setColdAdvise(coldAdvise);  
            weatherInfVO.setSportsAdvise(sportsAdvise);  
            weatherInfVO.setUltravioletRaysAdvise(ultravioletRaysAdvise);           
		} catch(JSONException jsonExp){
	         weatherInfVO.setDressAdvise("要温度，也要风度。天热缓减衣，天凉及添衣！");  
	         weatherInfVO.setWashCarAdvise("你洗还是不洗，灰尘都在那里，不增不减。");  
	         weatherInfVO.setTravelAdvise("世界很大，我想去看看");
	         weatherInfVO.setColdAdvise("一天一个苹果，感冒不来找我！多吃水果和蔬菜。");  
	         weatherInfVO.setSportsAdvise("生命在于运动！不要总宅在家里哦！");  
	         weatherInfVO.setUltravioletRaysAdvise("心灵可以永远年轻，皮肤也一样可以！"); 
		}
		
		JSONArray weather_data = results0.getJSONArray("weather_data");
		
		//存放每日天气的数组
		OneDayWeatherInfVO[] oneDayWeatherInfVOs = new OneDayWeatherInfVO[4];
		//数组每个元素是一个对象，需要NEW出来
		
		for(int i=0; i<4; i++) {
			oneDayWeatherInfVOs[i] = new OneDayWeatherInfVO();
		}
				
		for(int i=0; i<weather_data.size(); i++) {
			
			JSONObject OneDayWeatherinfvo = weather_data.getJSONObject(i); 
			String dayData = OneDayWeatherinfvo.getString("date");//天气信息的日期
			OneDayWeatherInfVO oneDayWeatherInfVO = new OneDayWeatherInfVO();//新建对象
			
			String futredate = simpleDateFormat.format(calendar.getTime());//String格式的日期
			calendar.add(Calendar.DATE,1);//增加一天	
			
			oneDayWeatherInfVO.setLocation(location);
			oneDayWeatherInfVO.setPm25(0);//后三天，无pm2.5值，输出：0
			
			if(i == 0) {//当天的天气
				int beginIndex = dayData.indexOf("实时：");
				int endIndex = dayData.indexOf(")");
				if(beginIndex>-1) {
					oneDayWeatherInfVO.setTemperatureNow(dayData.substring(beginIndex+1, endIndex));
					oneDayWeatherInfVO.setWeek(OneDayWeatherinfvo.getString("date").substring(0,2));
					oneDayWeatherInfVO.setPm25(pm25);
				} else {
					oneDayWeatherInfVO.setTemperatureNow(null);//无实时温度，输出“null”
					oneDayWeatherInfVO.setWeek(OneDayWeatherinfvo.getString("date").substring(0,2));
				}
				oneDayWeatherInfVO.setDate(localTime);//访问网站返回的日期初始化
				
			} else {
				oneDayWeatherInfVO.setWeek(OneDayWeatherinfvo.getString("date"));
				oneDayWeatherInfVO.setDate(futredate );
			}	
			
			oneDayWeatherInfVO.setTemperatureOfDay(OneDayWeatherinfvo.getString("temperature"));
			oneDayWeatherInfVO.setWeather(OneDayWeatherinfvo.getString("weather"));
			oneDayWeatherInfVO.setWind(OneDayWeatherinfvo.getString("wind")); 
			oneDayWeatherInfVOs[i] = oneDayWeatherInfVO;  
		}
		weatherInfVO.setWeatherInfs(oneDayWeatherInfVOs); 
		
		return weatherInfVO;
	}	 		
}

