package cn.supreme.ws.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/**
 * @content cxf服务端发布
 * @author donghao
 * @date 2018-12-02
 */
public class WeatherServer {

	public static void main(String[] args) {

		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		//服务url
		bean.setAddress("http://127.0.0.1/weather");
		//服务接口
		bean.setServiceClass(WeatherInterface.class);
		//服务实现类
		bean.setServiceBean(new WeatherInterfaceImpl());
		//
		bean.create();
	}

}
