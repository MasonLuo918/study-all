package com.masonluo.luckysheet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.masonluo.luckysheet.model.LuckySheetFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @author Masonluo
 * @date 2020-10-09 10:00
 */
public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL url = Main.class.getClassLoader().getResource("Cell.json");
        File file = new File(url.toURI());
        ObjectMapper obj = new ObjectMapper();
        long start = System.currentTimeMillis();
        LuckySheetFile luckySheetFile = obj.readValue(url, LuckySheetFile.class);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        String str = obj.writeValueAsString(luckySheetFile);
        System.out.println(System.currentTimeMillis() - start);
        FileOutputStream fos = new FileOutputStream("Cell_output.json");
        fos.write(str.getBytes());
    }
}
