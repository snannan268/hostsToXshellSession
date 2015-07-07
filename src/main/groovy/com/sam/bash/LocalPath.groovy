package com.sam.bash

/**
 * Unified Assurance (tm)
 * Copyright (C) 2014,  Tektronix Communications, Inc.
 * All rights reserved.
 */
class LocalPath {

    public static void main(String[] args) {
        File f = new File('/d/ss.txt')
        if (f.exists()) {
            f.eachLine {
                println it
            }
        } else {
            println "Not found file"
        }
    }
}
