package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.masonluo.luckysheet.model.Color;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Masonluo
 * @date 2020-09-27 16:14
 */
public class ColorDeserializer extends JsonDeserializer<Color> {
    @Override
    public Color deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (p != null && p.getText() != null && !p.getText().equals("")) {
            String regex = "rgb\\((\\d+), (\\d+), (\\d+)\\)";
        }
        return null;
    }

    public static void main(String[] args) {
        String regex = "rgb\\((\\d+), (\\d+), (\\d+)\\)";
        String color = "rgb(123, 123, 123)";
        System.out.println(color.matches(regex));
/*
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(color);
        while (matcher.find()) {
            System.out.println(matcher.groupCount());
        } 　
*/
    }
}
