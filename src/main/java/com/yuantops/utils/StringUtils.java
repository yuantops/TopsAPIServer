package com.yuantops.utils;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;

/**
 * Created by yuan on 2015/8/13.
 */
public class StringUtils {

    /**
     * 判断给定字符串是否空白串。 空白串是指由空格、制表符、回车符、换行符组成的字符串 若输入字符串为null或空字符串，返回true
     *
     * @param input
     * @return boolean
     */
    public static boolean isEmpty(String input) {
        if (input == null || "".equals(input))
            return true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                return false;
            }
        }
        return true;
    }

    /**
     * Get Json format String from an object. Only non-empty fields will be presented.
     * @param object
     * @return String
     */
    public static String getJsonStringFromObject(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
        String resultStr = null;
        try {
            resultStr = mapper.writeValueAsString(object);
        } catch (IOException e) {
//            e.printStackTrace();
            resultStr = null;
        }
        return resultStr;
    }
}
