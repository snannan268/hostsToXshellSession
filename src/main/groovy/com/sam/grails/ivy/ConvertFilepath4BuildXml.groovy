package com.sam.grails.ivy

import java.util.regex.Matcher

/**
 * Unified Assurance (tm)
 * Copyright (C) 2014,  Tektronix Communications, Inc.
 * All rights reserved.
 */
class ConvertFilePath4BuildXml {

    public static final String IVY = 'ivy2'
    public static final String IVY_CACHE = '..\\ivy-cache'
    public static final String OTHERS = 'ivy2\\org.springframework.uaa\\org.springframework.uaa.client'
    public static final String PREFIX_XML = 'org.grails.internal'
    public static final String WINDOWS_SEPARATOR = '\\'
    public static final String UNIX_SEPARATOR = '/'
    public static final PATTERN = ~/org\.grails\.internal(.*?)\.xml|.*\.properties/
    public static final PATTERN_PRO = ~/.*\.properties/
    public static final PATTERN_LOCATION = ~'location="([^"]*)"'
    public static final PATTERN_LOCATION_IS = ~'location="([^"]*)".*'
    public static final PATTERN_LOCATION_IS_O = ~'.* origin-location="([^"]*)".*'
    public static final PATTERN_LOCATION_O = ~'origin-location="([^"]*)"'

    public static final PATTERN_LOCATION_IS_DO = ~/.*location=.*/
    public static final PATTERN_LOCATION_DO = ~/location=(.*)/

    //The path of xml file which need to convert the location nodes' value.
    public static final def paths = ["D:\\workspace\\source_code\\iris\\trunk\\server\\grails_work\\grails-2.1.0",
                                     "D:\\workspace\\source_code\\iris\\trunk\\server\\grails_bin\\grails-2.1.0",
                                     "D:\\workspace\\source_code\\iris\\trunk\\server\\irisPI\\ina\\inaweb\\target",
                                     "D:\\dev\\plugin\\grails-2.1.0",
                                     "C:\\Users\\XSUN5\\.grails\\2.1.0"]

    public static final def pathsMapping = ["C:\\Users\\XSUN5"                : "/home/sam",
                                            "D:\\workspace\\source_code\\iris": "/mnt/hgfs/iris",
                                            "D:\\dev\\plugin\\grails-2.1.0"   : "/mnt/hgfs/D/dev/plugin/grails-2.1.0",
                                            "C:\\Users": "/mnt/hgfs/C/Users"
    ]
    public static final def patterns = [(PATTERN_LOCATION_IS): PATTERN_LOCATION, (PATTERN_LOCATION_IS_O): PATTERN_LOCATION_O]
    public static final def patterns_properties = [(PATTERN_LOCATION_IS_DO): PATTERN_LOCATION_DO]

    public static void main(String[] args) {
//        println " location=\"C:\\Users\\XSUN5\\.grails\\2.1.0\\ivy2\\org.grails\\grails-plugin-tomcat\\ivy-2.1.0.xml\"".matches(PATTERN_LOCATION_IS)
//        println "<metadata-artifact status=\"no\" details=\"\" size=\"444\" time=\"0\" location=\"C:\\Users\\XSUN5\\.grails\\2.1.0\\ivy2\\org.grails\\grails-plugin-tomcat\\ivy-2.1.0.xml\" searched=\"false\" origin-is-local=\"false\" origin-location=\"UNKNOWN\"/>\"".matches(PATTERN_LOCATION_IS)
//        println getMatch("<metadata-artifact status=\"no\" details=\"\" size=\"444\" time=\"0\" location=\"C:\\Users\\XSUN5\\.grails\\2.1.0\\ivy2\\org.grails\\grails-plugin-tomcat\\ivy-2.1.0.xml\" searched=\"false\" origin-is-local=\"false\" origin-location=\"UNKNOWN\"/>", PATTERN_LOCATION)
//        println getMatch(" location=\"C:\\Users\\XSUN5\\.grails\\2.1.0\\ivy2\\org.grails\\grails-plugin-tomcat\\ivy-2.1.0.xml\"", PATTERN_LOCATION)

        locationsConvert(true)
//        convert(new File("C:\\Users\\XSUN5\\.grails\\2.1.0\\ivy2\\org.grails.internal-ipi-13.3-build.xml"))
    }

    //Change the xml files to the Linux format
    def public static locationsConvert(boolean windows = false) {
        println "locationsToLinux starting..."
        paths.each {
            for (String path : [IVY, IVY_CACHE, OTHERS]) {
                def filePath = it + File.separator + path
                def file = new File(filePath)
                if (file.isDirectory()) {
                    loopDir(file, windows)
                } else {
                    System.err.println("File: $filePath not exists")
                }
            }
        }
        println "locationsToLinux end!"
    }

    def public static loopDir(File file, boolean windows) {
        file.eachDir {
            loopDir(it, windows)
        }
        file.eachFileMatch(PATTERN) {
            println "Find file $it and will start to convernt"
            convert(it, windows)
        }
        file.eachFileMatch(PATTERN_PRO){
            println "Find file $it and will start to convernt"
            convertPro(it, windows)
        }
    }

    //Change the xml files to the Windows format
    def public static locationsToWin() {

    }

    def public static convertPro(File file, boolean windows = false) {
        def replaceMap = [:]
        file.eachLine {
            patterns_properties.each { pk, pv ->
                if (it.matches(pk)) {
                    String locationPath = getMatch(it, pv)
                    if (locationPath) {
                        def fileLocation = new File(locationPath)
                        pathsMapping.any { k, v ->
                            def k1 = k
                            def v1 = v
                            def target = UNIX_SEPARATOR
                            def source = WINDOWS_SEPARATOR
                            if (windows) {
                                k1 = v
                                v1 = k
                                target = WINDOWS_SEPARATOR
                                source = UNIX_SEPARATOR
                            }
                            if (fileLocation.path.contains(new File(k1).path)) {
                                def k2 = k1
                                if (windows) {
                                    k2 = k1.replace(source, target)
                                }

                                replaceMap << ["$locationPath": fileLocation.path.replace(k2, v1).replace(source, target)]

//                                println "Adding one new location path for $fileLocation"
                                return true
                            }
                        }
                    }
                }
            }
        }
        replaceFileContent(replaceMap, file)
    }

    def public static convert(File file, boolean windows = false) {
        def replaceMap = [:]
        file.eachLine {
            patterns.each { pk, pv ->
                if (it.matches(pk)) {
                    String locationPath = getMatch(it, pv)
                    if (locationPath) {
                        def fileLocation = new File(locationPath)
                        pathsMapping.any { k, v ->
                            def k1 = k
                            def v1 = v
                            def target = UNIX_SEPARATOR
                            def source = WINDOWS_SEPARATOR
                            if (windows) {
                                k1 = v
                                v1 = k
                                target = WINDOWS_SEPARATOR
                                source = UNIX_SEPARATOR
                            }
                            if (fileLocation.path.contains(new File(k1).path)) {
                                def k2 = k1
                                /*if (windows) {
                                    k2 = k1.replace(source, target)
                                }*/

                                replaceMap << ["$locationPath": fileLocation.path.replace(k2, v1).replace(source, target)]

//                                println "Adding one new location path for $fileLocation"
                                return true
                            }
                        }
                    }
                }
            }
        }

        replaceFileContent(replaceMap, file)
    }

    private static void replaceFileContent(def replaceMap, File file) {
        if (replaceMap.size() > 0) {
            println "Starting to replace the file $file"
            def fileText = file.text
            replaceMap.each { k, v ->
//                println "$k reset to $v"
                fileText = fileText.replace(k, v)
            }
            file.write(fileText)
        } else {
            System.err.println("Not found the location need to convert")
        }
    }

    /**
     * Get the regex match content
     * @param content
     * @param pattern
     * @return
     */
    def public static String getMatch(String content, def pattern) {
        Matcher matcher = pattern.matcher(content)
        while (matcher.find()) {
            return matcher.group(1);
        }
        return ""
    }
}
