package cn.supreme.ws.cxf_rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class StudentServer {

	public static void main(String[] args) {

		//发布rest服务
		JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
		//服务实现类
		bean.setServiceBean(new StudentInterfaceImpl());
		//服务资源类
		bean.setResourceClasses(StudentInterfaceImpl.class);
		//设置服务地址
		bean.setAddress("http://127.0.0.1:12345/user");
		
		bean.create();

	}

}
