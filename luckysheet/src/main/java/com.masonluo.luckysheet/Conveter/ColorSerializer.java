package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.masonluo.luckysheet.model.Color;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-09-27 16:12
 */
public class ColorSerializer extends JsonSerializer<Color> {
    @Override
    public void serialize(Color value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.toString());
    }
}
