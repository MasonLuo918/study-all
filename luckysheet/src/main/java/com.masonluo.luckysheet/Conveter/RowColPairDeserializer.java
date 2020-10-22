package com.masonluo.luckysheet.Conveter;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.masonluo.luckysheet.model.RowColPair;

import java.io.IOException;

/**
 * @author Masonluo
 * @date 2020-10-09 10:06
 */
public class RowColPairDeserializer extends KeyDeserializer {

    @Override
    public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
        String[] str = key.split("_");
        int row = Integer.valueOf(str[0]);
        int col = Integer.valueOf(str[1]);
        return new RowColPair(row, col);
    }
}
