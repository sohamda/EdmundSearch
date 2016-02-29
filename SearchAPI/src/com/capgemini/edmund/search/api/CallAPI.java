package com.capgemini.edmund.search.api;

import com.capgemini.edmund.search.SecureRestClientTrustManager;

import com.car.api.make.MakeApiResponse;
import com.car.api.style.StyleApiResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import static com.sun.jersey.client.urlconnection.HTTPSProperties.PROPERTY_HTTPS_PROPERTIES;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

public class CallAPI {
    
    private static CallAPI instance = null;
    private WebResource defaultWebResource = null;
    
    protected CallAPI() {
        super();
    }
    
    public static CallAPI getInstance() {
      if(instance == null) {
         instance = new CallAPI();
      }
      return instance;
    }
    
    private HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String string, SSLSession sSLSession) {
                return true;
            }
        };
    }
    
    private WebResource getDefaultWebResource() throws NoSuchAlgorithmException, KeyManagementException {
        
        if(defaultWebResource == null) {
            SecureRestClientTrustManager secureRestClientTrustManager = new SecureRestClientTrustManager();
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new javax.net.ssl.TrustManager[] { secureRestClientTrustManager }, null);
            DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
            defaultClientConfig.getClasses().add(JacksonJaxbJsonProvider.class);
            defaultClientConfig.getProperties().put(PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(getHostnameVerifier(), sslContext));
            defaultClientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
            Client defaultClient = Client.create(defaultClientConfig);
            defaultWebResource = defaultClient.resource("https://api.edmunds.com/api/vehicle/v2");
        }
        
        return defaultWebResource;
    }
    
    private Cookie getCookies() {
        Cookie cookie = new Cookie("device-characterization", "false, false");
        return cookie;
    }
    
    private MultivaluedMap<String, String> getDefaultQueryParams() {
        
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        queryParams.add("fmt", "json");
        queryParams.add("api_key", "ajbj59h95qs3pbuwb79fq2pz");
        return queryParams;
    }
    
    public MakeApiResponse callMakesApi() throws NoSuchAlgorithmException, KeyManagementException {
        
        WebResource webResource = getDefaultWebResource().path("/makes").queryParams(getDefaultQueryParams());
        WebResource.Builder builder = webResource.getRequestBuilder();
        builder.accept("text/html,application/xhtml+xml,application/xml");
        builder.type(MediaType.APPLICATION_JSON_TYPE);
        builder.header("Set-Cookie", "device-characterization=false, false");
        ClientResponse makeApiResponse = builder.get(ClientResponse.class);
        System.out.println(makeApiResponse.getHeaders());
        //System.out.println(makeApiResponse.getEntity(String.class));
        return makeApiResponse.getEntity(new GenericType<MakeApiResponse>(){});
    }
    
    public StyleApiResponse callStyleApi(String makeNickName, String modelNickName, Integer modelYear) throws NoSuchAlgorithmException, KeyManagementException {
        
        MultivaluedMap<String, String> queryParams = getDefaultQueryParams();
        queryParams.add("view", "full");
        WebResource webResource = getDefaultWebResource().path("/"+makeNickName+"/"+modelNickName+"/"+modelYear+"/styles").queryParams(queryParams);
        WebResource.Builder builder = webResource.getRequestBuilder();
        builder.accept(MediaType.APPLICATION_JSON_TYPE);
        builder.type(MediaType.APPLICATION_JSON_TYPE);
        
        builder.header("Set-Cookie", "device-characterization=false, false");
        ClientResponse styleApiResponse = builder.get(ClientResponse.class);
        System.out.println(styleApiResponse.getHeaders());
        //System.out.println(styleApiResponse.getEntity(String.class));
        return styleApiResponse.getEntity(new GenericType<StyleApiResponse>(){});   
    }
    
    public static void main(String[] a) {
        CallAPI callMakesAPI = CallAPI.getInstance();
        try {
            System.out.println(callMakesAPI.callMakesApi()); 
            System.out.println(callMakesAPI.callStyleApi("lexus","es-300", 1995).getStyles()[0].getEngine().getCode());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        } 
    }
}
