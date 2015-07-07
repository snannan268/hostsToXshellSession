package com.sam.xml

/**
 * Unified Assurance (tm)
 * Copyright (C) 2014,  Tektronix Communications, Inc.
 * All rights reserved.
 */
class XmlMain {

    public static void main(String[] args) {
        String path = "D:\\workspace\\source_code\\iris\\trunk\\server\\ivModels\\KeyCacheModel.xml"
        def parse = new XmlParser()
        def nodes = parse.parse(path)
        println nodes
    }
}
