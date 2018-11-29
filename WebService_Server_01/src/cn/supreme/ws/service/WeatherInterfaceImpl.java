package cn.supreme.ws.service;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client ...." + cityName);

		return "晴天";
	}

}
