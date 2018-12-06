package cn.supreme.ws.cxf_soap.server;

public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		
		return "好天气";
	}

}
