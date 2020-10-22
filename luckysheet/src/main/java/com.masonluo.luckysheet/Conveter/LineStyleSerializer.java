package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.masonluo.luckysheet.model.border.LineStyle;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-10-09 10:39
 */
public class LineStyleSerializer extends JsonSerializer<LineStyle> {
    @Override
    public void serialize(LineStyle value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(String.valueOf(value.getId()));
    }
}
