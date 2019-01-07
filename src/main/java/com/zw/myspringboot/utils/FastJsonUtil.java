package com.zw.myspringboot.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtil {

    public static String toJson(Object obj, SerializerFeature... serializerFeature) {
        return JSON.toJSONString(obj, serializerFeature);
    }

    public static String toJson(Object obj) {
        return JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    public static <T> T fromJsons(String json, TypeReference<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

}
