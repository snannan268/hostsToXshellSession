package com.sam.hosts

import org.apache.commons.lang3.StringUtils
import groovy.text.SimpleTemplateEngine

/**
 * Created with IntelliJ IDEA.
 * User: xsun5
 * Date: 7/2/14
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */

public class Main {

    def static hostsMap = [:]   //hostName,IP
    public static String outputFilePath = 'D:\\workspace\\xshell\\Session_default'
    public static final String template = 'xshellSessionTemplate.xsh'
    public static final String SUFFIX = '.xsh'


    public static void main(String[] args) {
        println 'Starting...!'
        init()
        run()
        println 'Execute done!'
    }

    public static void init(){
        def config = new File(this.getClassLoader().getResource('config.groovy').getFile())
        def properties = new Properties()
        properties.load(config.newInputStream())
        outputFilePath = properties.getProperty('outputFilePath').replace("'",'')
    }

    /**
     * Main thread access
     */
    public static run() {
        readHosts()
        hostsMap.each {k,v->
            generateXshellSessionFile(v)
        }
    }

    /**
     * Read hosts file and store the hosts IP mapping
     */
    public static readHosts() {
        def hostsFile = new File('C:\\Windows\\System32\\drivers\\etc\\hosts')
        if (hostsFile.exists()) {
            hostsFile.eachLine {
                if (!it.startsWith("#") && !StringUtils.isBlank(it)) {
                    def hostsSplit = it.trim().split(/\s+/)
                    if (hostsSplit.size() == 2)
                        hostsMap[hostsSplit[0]] = hostsSplit[1]
                }
            }
        }
    }

    /**
     *
     * @param hostname Xshell session will be created hostname.
     */
    public static generateXshellSessionFile(hostname) {
        def engine = new SimpleTemplateEngine()
        def templateContent = new File(this.getClassLoader().getResource(template).getFile()).getText()
        def makeMap = ['hostname' : hostname]
        def strReplaced = engine.createTemplate(templateContent).make(makeMap).toString()
        def outputFile = new File(outputFilePath + '\\' + hostname + SUFFIX)
        outputFile.setText(strReplaced)
    }

    public printHostMap() {
        hostsMap.each {k, v ->
            println "key=${k}, value=${v}"
        }
    }
}