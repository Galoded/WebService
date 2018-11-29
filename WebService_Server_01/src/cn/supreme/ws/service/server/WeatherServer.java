package cn.supreme.ws.service.server;

import javax.xml.ws.Endpoint;

import cn.supreme.ws.service.WeatherInterfaceImpl;

/**
 * 发布服务：Endpoint
 * 
 * @author ASUS
 *
 */
public class WeatherServer {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
	}

}
