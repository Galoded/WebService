package cn.supreme.ws.cxf.wsdl2java;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2018-12-02T08:59:31.308+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "WeatherInterfaceService", 
                  wsdlLocation = "http://127.0.0.1/weather?wsdl",
                  targetNamespace = "http://server.cxf.ws.supreme.cn/") 
public class WeatherInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.cxf.ws.supreme.cn/", "WeatherInterfaceService");
    public final static QName WeatherInterfacePort = new QName("http://server.cxf.ws.supreme.cn/", "WeatherInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort() {
        return super.getPort(WeatherInterfacePort, WeatherInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfacePort")
    public WeatherInterface getWeatherInterfacePort(WebServiceFeature... features) {
        return super.getPort(WeatherInterfacePort, WeatherInterface.class, features);
    }

}
