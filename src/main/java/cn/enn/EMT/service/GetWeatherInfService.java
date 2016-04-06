/**
 * 
 */
/**
 * @author 
 *
 */
package cn.enn.EMT.service;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
//import java.nio.charset.Charset;
//import java.util.Date
//import java.util.HashMap;
//import java.util.Map;

public class GetWeatherInfService {
	public  String getWeatherInform(String cityName) {
		//百度天气网站API
		String baiduUrl = "http://api.map.baidu.com/telematics/v3/weather?location=廊坊&output=json&ak=W69oaDTCfuGwzNwmtVvgWfGH";
		StringBuffer strBuf = new StringBuffer();
		
		try {
			baiduUrl = "http://api.map.baidu.com/telematics/v3/weather?location="
			+ URLEncoder.encode(cityName, "utf-8")  + "&output=json&ak=W69oaDTCfuGwzNwmtVvgWfGH";			
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		try{
			URL url = new URL(baiduUrl);
			URLConnection conn = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			String line = null;
			while ((line = reader.readLine()) != null)
				strBuf.append(line + " ");
			reader.close();	
		}catch (MalformedURLException e2) {
			e2.printStackTrace();
		}catch (IOException e3) {
			e3.printStackTrace();
		}
		
		return strBuf.toString();	
	}
}












