package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.masonluo.luckysheet.model.Color;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Masonluo
 * @date 2020-09-27 16:14
 */
public class ColorDeserializer extends JsonDeserializer<Color> {
    @Override
    public Color deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (p != null && p.getText() != null && !p.getText().equals("")) {
            String regex = "rgb\\((\\d+), (\\d+), (\\d+)\\)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(p.getText());
            if (matcher.find()) {
                int r = Integer.valueOf(matcher.group(1));
                int g = Integer.valueOf(matcher.group(2));
                int b = Integer.valueOf(matcher.group(3));
                return new Color(r, g, b);
            }
        }
        return null;
    }
}
