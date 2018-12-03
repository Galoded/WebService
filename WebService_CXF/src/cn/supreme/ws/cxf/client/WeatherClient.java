package cn.supreme.ws.cxf.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @content cxf客户端
 * @author donghao
 * @date 2018-12-02
 */
public class WeatherClient {

	public static void main(String[] args) {
		/**
		 * 一般的java开发
		 */
		/*
		 * JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean(); // 设置服务url
		 * bean.setAddress("http://127.0.0.1/weather"); // 设置服务接口
		 * bean.setServiceClass(WeatherInterface.class); // 获取服务接口
		 * WeatherInterface weatherBean = (WeatherInterface) bean.create();
		 * String str = weatherBean.queryWeather("杭州"); System.out.println(str);
		 */

		/**
		 * 整合spring开发
		 */
		// 初始化spring上下文，web工程中是用listener监听获取spring的配置上下文
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		WeatherInterface weather = (WeatherInterface) context.getBean("weatherClient");
		String str = weather.queryWeather("");
		System.out.println(str);
		

	}

}
