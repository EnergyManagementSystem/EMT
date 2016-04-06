package cn.enn.EMT.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.EMT.vo.WeatherInfVO;
import cn.enn.EMT.webResponse.JsonResponse;
import cn.enn.EMT.service.GetWeatherInfService;
import cn.enn.EMT.service.AnalysisWeatherInfService;

@RestController
public class GetAndAnalysisWeatherInfController {
@RequestMapping(value = "/GetAndAnalysisWeatherInf", method = RequestMethod.POST)
public static JsonResponse<ArrayList< WeatherInfVO>> getAndAnalysisWeatherInf() {
	
	//新建存放WeatherInfVO类实例的ArrayList
	ArrayList<WeatherInfVO> arrWeatherInfVO = new ArrayList<WeatherInfVO >();
	
	//新建WeatherInfVO/OneDayWeatherInfVO/GetWeatherInfService/AnalysisWeatherInfService实例
	WeatherInfVO weatherInfVO = new WeatherInfVO();
	GetWeatherInfService getWeatherInfService = new GetWeatherInfService();
	AnalysisWeatherInfService analysisWeatherInfService = new AnalysisWeatherInfService();
	
	//调用GetWeatherInfService中的方法getWeatherInform和AnalysisWeatherInfService中的方法analysisWeatherInf
	String str = getWeatherInfService.getWeatherInform("廊坊");
	weatherInfVO = analysisWeatherInfService.analysisWeatherInf(str);
	
	//将解析得到的返回值（WeatherInfVO对象）添加到ArryList
	arrWeatherInfVO.add(weatherInfVO);
	
	//封装成JSON格式，并返回
	return new JsonResponse<ArrayList<WeatherInfVO>>(arrWeatherInfVO);	
	}
}
