package com.masonluo.java.advance.course.prepare.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-20 16:42
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
        File file = new File("java-advance-course/Hello.class");
        FileInputStream fis = new FileInputStream(file);
        int len = (int) file.length();
        byte[] bytes = new byte[len];
        fis.read(bytes);
        System.out.println(encoder.encodeToString(bytes));
    }
}
