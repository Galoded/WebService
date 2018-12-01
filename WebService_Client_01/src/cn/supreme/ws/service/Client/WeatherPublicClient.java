package cn.supreme.ws.service.Client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.supreme.ws.publicweather.Client.ArrayOfString;
import cn.supreme.ws.publicweather.Client.WeatherWSSoap;

/**
 * 标准创建服务的方法
 * @author donghao
 * Date 20181201
 */
public class WeatherPublicClient {

	public static void main(String[] args) throws Exception {
		// wsdl文件url
		URL wsdlUrl = new URL("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
		// 服务标识
		QName qName = new QName("http://WebXml.com.cn/", "WeatherWS");
		// 创建服务实例
		Service service = Service.create(wsdlUrl, qName);
		// 获取服务接入
		WeatherWSSoap weatherWSSoap = service.getPort(WeatherWSSoap.class);
		// 调用服务方法
		ArrayOfString arr = weatherWSSoap.getWeather("杭州", null);
		for (String str : arr.getString()) {
			System.out.println(str);
		}
	}

}
