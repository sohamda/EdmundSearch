package com.capgemini.edmund.search;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class SecureRestClientTrustManager implements X509TrustManager {
    public SecureRestClientTrustManager() {
        super();
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificate, String string) throws CertificateException {
        // TODO Implement this method

    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificate, String string) throws CertificateException {
        // TODO Implement this method

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        // TODO Implement this method
        return new X509Certificate[0];
    }
    
    public boolean isClientTrusted(X509Certificate[] arg0) {
        return true;
    }
    
    public boolean isServerTrusted(X509Certificate[] arg0) {
        return true;
    }
}
