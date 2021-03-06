package com.example.order_wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * My first service
 *
 * This class was generated by Apache CXF 3.3.2
 * 2021-05-15T22:54:49.406+02:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "OrderService",
                  wsdlLocation = "file:/C:/Users/sharm/git/InnervationOrder/order.innervation.service/src/main/resources/wsdl/TestService.wsdl",
                  targetNamespace = "http://example.com/order.wsdl")
public class OrderService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://example.com/order.wsdl", "OrderService");
    public final static QName OrderPort = new QName("http://example.com/order.wsdl", "OrderPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/sharm/git/InnervationOrder/order.innervation.service/src/main/resources/wsdl/TestService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/sharm/git/InnervationOrder/order.innervation.service/src/main/resources/wsdl/TestService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrderService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OrderPortType
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPortType getOrderPort() {
        return super.getPort(OrderPort, OrderPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderPortType
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPortType getOrderPort(WebServiceFeature... features) {
        return super.getPort(OrderPort, OrderPortType.class, features);
    }

}
