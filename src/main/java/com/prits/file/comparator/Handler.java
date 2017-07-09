package com.prits.file.comparator;

import java.io.File;

/**
 * Created by priteshpatel on 7/9/17.
 */
public class Handler {

    public String handleString(String input) {
        System.out.println("Copying text: " + input);
        return input.toUpperCase();
    }

    public File handleFile(File input) {
        System.out.println("Copying file: " + input.getAbsolutePath());
        return input;
    }

    public byte[] handleBytes(byte[] input) {
        System.out.println("Copying " + input.length + " bytes ...");
        return new String(input).toUpperCase().getBytes();
    }
}
