package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.masonluo.luckysheet.model.border.BorderInfo;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-10-09 11:02
 */
public class RangeTypeDeserializer extends JsonDeserializer<BorderInfo.RangeType> {
    @Override
    public BorderInfo.RangeType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return BorderInfo.RangeType.getByType(p.getText());
    }
}
