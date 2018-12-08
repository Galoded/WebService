package cn.supreme.ws.publicmobile.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2018-12-07T07:48:13.401+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "MobileCodeWSSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface MobileCodeWSSoap {

    /**
     * <br /><h3>获得国内手机号码归属地数据库信息</h3><p>输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。</p><br />
     */
    @WebResult(name = "getDatabaseInfoResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getDatabaseInfo", targetNamespace = "http://WebXml.com.cn/", className = "cn.supreme.ws.publicmobile.service.GetDatabaseInfo")
    @WebMethod(action = "http://WebXml.com.cn/getDatabaseInfo")
    @ResponseWrapper(localName = "getDatabaseInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.supreme.ws.publicmobile.service.GetDatabaseInfoResponse")
    public cn.supreme.ws.publicmobile.service.ArrayOfString getDatabaseInfo();

    /**
     * <br /><h3>获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。</p><br />
     */
    @WebResult(name = "getMobileCodeInfoResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getMobileCodeInfo", targetNamespace = "http://WebXml.com.cn/", className = "cn.supreme.ws.publicmobile.service.GetMobileCodeInfo")
    @WebMethod(action = "http://WebXml.com.cn/getMobileCodeInfo")
    @ResponseWrapper(localName = "getMobileCodeInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.supreme.ws.publicmobile.service.GetMobileCodeInfoResponse")
    public java.lang.String getMobileCodeInfo(
        @WebParam(name = "mobileCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String mobileCode,
        @WebParam(name = "userID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );
}
