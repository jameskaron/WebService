package com.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.15
 * 2015-10-21T15:21:00.656+08:00
 * Generated source version: 2.7.15
 * 
 */
@WebServiceClient(name = "ScfMobileSoap", 
				  wsdlLocation = "file:/C:/Users/80575749/Desktop/OnePNS/SoapNotification.wsdl",
                  targetNamespace = "rm:soap") 
public class ScfMobileSoap extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("rm:soap", "ScfMobileSoap");
    public final static QName ScfPccSoapServiceEndpointPort = new QName("rm:soap", "ScfPccSoapServiceEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/80575749/Desktop/OnePNS/SoapNotification.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ScfMobileSoap.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/80575749/Desktop/OnePNS/SoapNotification.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ScfMobileSoap(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScfMobileSoap(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScfMobileSoap() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScfMobileSoap(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScfMobileSoap(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ScfMobileSoap(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ScfPccSoapServiceEndpoint
     */
    @WebEndpoint(name = "ScfPccSoapServiceEndpointPort")
    public ScfPccSoapServiceEndpoint getScfPccSoapServiceEndpointPort() {
        return super.getPort(ScfPccSoapServiceEndpointPort, ScfPccSoapServiceEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScfPccSoapServiceEndpoint
     */
    @WebEndpoint(name = "ScfPccSoapServiceEndpointPort")
    public ScfPccSoapServiceEndpoint getScfPccSoapServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(ScfPccSoapServiceEndpointPort, ScfPccSoapServiceEndpoint.class, features);
    }

}


