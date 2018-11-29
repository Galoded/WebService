package cn.supreme.ws.service.Client;

import cn.supreme.ws.service.WeatherInterfaceImpl;
import cn.supreme.ws.service.WeatherInterfaceImplService;

public class WeatherClient {

	public static void main(String[] args) {
		// 调用远程服务
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();

		// 调用服务接口
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);

		// 调用接口方法
		String wt = weatherInterfaceImpl.queryWeather("北京");
		System.out.println(wt);
	}

}
