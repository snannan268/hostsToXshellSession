package com.sam.http

/**
 * Unified Assurance (tm)
 * Copyright (C) 2014,  Tektronix Communications, Inc.
 * All rights reserved.
 */

import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import org.apache.http.conn.scheme.Scheme
import org.apache.http.conn.ssl.SSLSocketFactory

import java.security.KeyStore
import javax.net.ssl.HostnameVerifier

/**
 * Created with IntelliJ IDEA.
 * User: XSUN5
 * Date: 4/11/14
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
class TestHttp {

    public static void main(String[] args) {
//        def httpHost = "https://sh-sparc-ipi16:8443"
        def httpHost = "https://sh-ipi-main14:8543"
        def keystorePath = "/.keystore"
        def http = new HTTPBuilder(httpHost)
        def keyStore = KeyStore.getInstance(KeyStore.defaultType)
        getClass().getResource(keystorePath).withInputStream {
            keyStore.load(it, "changeit".toCharArray())
            /*Enumeration enumeration = keyStore.aliases();                          //-> I tried these only to see if it’s correctly read
            while(enumeration.hasMoreElements()) {
                String alias = (String)enumeration.nextElement();
                System.out.println("alias name: " + alias);
                Certificate certificate = keyStore.getCertificate(alias);
                System.out.println(certificate.toString());

            }*/
        }

        SSLSocketFactory socketFactory = new SSLSocketFactory(keyStore);
        HostnameVerifier hostnameVerifier = org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
        socketFactory.setHostnameVerifier((org.apache.http.conn.ssl.X509HostnameVerifier) hostnameVerifier);

        http.client.connectionManager.schemeRegistry.register(new Scheme("https", socketFactory, 443))
        http.auth.basic 'sam', '222222'

        def headersResp

        http.request(Method.GET, ContentType.ANY){ req->
            uri.path = '/irisCAS/login'
//            uri.query = 'service=https%3A%2F%2Fsh-ipi-ipi14%3A8443%2Fj_spring_cas_security_check&username=sam&password=222222'
            /*uri.query = [
                    username: 'sam',
                    password: '222222',
                    warn: true,
                    lt: 'e8s1',
                    _eventId: 'submit',
                    service: 'https://sh-ipi-main14:8443/j_spring_cas_security_check',
                    _eventId_accept: 'Accept',
                    lt: 'e1s2'

            ]*/
            headers = [
                    Host: 'sh-ipi-main14:8543',
                    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0',
                    Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
                    'Accept-Language': 'zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3',
                    'Accept-Encoding': 'gzip, deflate',
//                    'Referer': 'https://sh-ipi-main14:8543/irisCAS/login',
                    'Cookie': 'JSESSIONID=FCFF13B5AFBE266D13C0DBBFFB0EF61F',
                    'Connection': 'keep-alive'
            ]
            response.success = { resp, reader ->
                println "Got response: ${resp.statusLine}"
                headersResp = resp.headers
                println "${resp.headers.'Set-Cookie'}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
                print "${reader}"
            }
            response.failure = { resp ->
                println "Got response failure! ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
            }
        }

        http.request(Method.POST, ContentType.ANY){ req->
            uri.path = '/irisCAS/login'
//            uri.query = 'service=https%3A%2F%2Fsh-ipi-ipi14%3A8443%2Fj_spring_cas_security_check&username=sam&password=222222'
            headers = [
                    Host: 'sh-ipi-main14:8543',
                    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0',
                    Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
                    'Accept-Language': 'zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3',
                    'Accept-Encoding': 'gzip, deflate',
//                    'Referer': 'https://sh-ipi-main14:8543/irisCAS/login',
                    'Cookie': headersResp.'Set-Cookie',
                    'Connection': 'keep-alive'
            ]
            requestContentType = ContentType.JSON
            body = [
                    username: 'sam',
                    password: '222222',
                    warn: true,
                    lt: 'e8s1',
                    _eventId: 'submit',
                    service: 'https://sh-ipi-main14:8443/j_spring_cas_security_check',
                    _eventId_accept: 'Accept',
                    lt: 'e1s2'

            ]
            response.success = { resp, reader ->
                println "Got response: ${resp.statusLine}"
                println "${resp.headers.'Set-Cookie'}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
                print "${reader}"
            }
            response.failure = { resp ->
                println "Got response failure! ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
            }
        }

        //username
        //password

        http.request(Method.GET, ContentType.JSON){ req->
            uri.path = '/ipi/validation'
            uri.query = [
                    minSamples:'0',
                    appId: '1',
                    fmt: 'json',
                    nodeExpression: 'All',
                    resolution: 'HOURLY',
                    fromTime: 1397196000000,
                    toTime: 1397199600000,
                    action: 'results',
                    nodeGroupType: '-1',
                    templateName: 'na-trendVolume-kpi',
                    controller: 'data',
                    'kpi': 26665,
                    'interfaceType': 23
            ]
            headers.'User-Agent' = "IPIUpgradeValidator"
            response.success = { resp, reader ->
                println "Got response: ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
                print "${reader}"
            }
            response.failure = { resp ->
                println "Got response failure! ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
            }
        }
    }
}

