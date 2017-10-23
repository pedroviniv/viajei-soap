/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.soap.viajei.transport.infra.http.client;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 *
 * @author kieckegard
 */
public class SSLClientFactory implements ClientFactory {

    @Override
    public Client create() {
        try {
            
            SSLContext sc = SSLContext.getInstance("TLSv1");
            System.setProperty("https.protocols", "TLSv1");
            
            TrustManager[] trustAllCerts = { new MyTrustManager() };
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HostnameVerifier allHostValid = HttpsURLConnection.getDefaultHostnameVerifier();
            
            Client client = ClientBuilder.newBuilder().sslContext(sc)
                    .hostnameVerifier(allHostValid).build();
            
            return client;

        } catch (NoSuchAlgorithmException | KeyManagementException ex) {
            throw new RuntimeException("Error", ex);
        }
    }
    
}
