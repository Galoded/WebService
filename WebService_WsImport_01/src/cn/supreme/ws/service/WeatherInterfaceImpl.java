
package cn.supreme.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://service.ws.supreme.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://service.ws.supreme.cn/", className = "cn.supreme.ws.service.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://service.ws.supreme.cn/", className = "cn.supreme.ws.service.QueryWeatherResponse")
    @Action(input = "http://service.ws.supreme.cn/WeatherInterfaceImpl/queryWeatherRequest", output = "http://service.ws.supreme.cn/WeatherInterfaceImpl/queryWeatherResponse")
    public String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}