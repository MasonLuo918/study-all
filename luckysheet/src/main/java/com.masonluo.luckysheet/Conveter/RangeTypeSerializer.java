package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.masonluo.luckysheet.model.border.BorderInfo;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-10-09 11:01
 */
public class RangeTypeSerializer extends JsonSerializer<BorderInfo.RangeType> {
    @Override
    public void serialize(BorderInfo.RangeType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getType());
    }
}
