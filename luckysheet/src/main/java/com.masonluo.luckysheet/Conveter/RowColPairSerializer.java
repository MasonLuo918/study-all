package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.masonluo.luckysheet.model.RowColPair;

import java.io.IOException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author Masonluo
 * @date 2020-10-09 10:05
 */
public class RowColPairSerializer extends JsonSerializer<RowColPair> {
    @Override
    public void serialize(RowColPair value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String str = value.toString();
        gen.writeString(str);
    }
}
