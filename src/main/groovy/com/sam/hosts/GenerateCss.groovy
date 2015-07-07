package com.sam.hosts

import groovy.text.SimpleTemplateEngine

/**
 * Unified Assurance (tm)
 * Copyright (C) 2014,  Tektronix Communications, Inc.
 * All rights reserved.
 */
class GenerateCss {

    public static void main(String[] args) {
        String path = //'D:\\personal\\photo\\孙一柳百岁照'
        'D:\\workspace\\4Ide\\IDEA\\Sam\\practice\\css\\slice-box\\images'
        String templatePath = "D:\\workspace\\4Ide\\IDEA\\Sam\\practice\\css\\slice-box\\template"
        String outputFilePath = "D:\\workspace\\4Ide\\IDEA\\Sam\\practice\\css\\slice-box\\"
        String lineFeed = "\n"

        def file = new File(path)
        int total = 0;
        def p = ~/.*?\.(?i)JPG/
        def map = [div:'',photo:'', span: '', title: '宝宝百岁照']
        file.eachFileMatch(p)  {
            total++;
            String photoPath = it.toString().replace('\\','/')
            // style='width:1400px; height:923px'
            map.photo += "<li><a href='' target='_blank'><img src='${photoPath}' alt='image1'/></a><div class='sb-description'><h3>Selfless Philantropist</h3></div></li>" + lineFeed
            map.div += "<div class='panel'><img src='${photoPath}' alt='Image 1'/></div>"
        }
        for (int i = 1; i < total; i++) {
            map.span += "<span></span>" + lineFeed
        }

        println map


        new File(templatePath).eachFile {
            def make = new SimpleTemplateEngine()
            String strMake = make.createTemplate(it.getText()).make(map)
            new File(outputFilePath + it.name).setText(strMake)
        }
    }
}
