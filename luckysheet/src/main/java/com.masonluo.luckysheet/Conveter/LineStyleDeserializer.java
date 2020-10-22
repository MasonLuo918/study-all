package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.masonluo.luckysheet.model.border.LineStyle;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-10-09 10:40
 */
public class LineStyleDeserializer extends JsonDeserializer<LineStyle> {
    @Override
    public LineStyle deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return LineStyle.getById(Integer.valueOf(p.getValueAsString()));
    }
}
