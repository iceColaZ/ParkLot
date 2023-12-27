package com.K1ez.util;

/**
 * 此类为单纯的方法引用类，可以直接用于检测字符串是否为空
 * 返回值：true/false
 * 返回值类型：boolean
 */

public class StringUtil {
    public static boolean isEmpty(String str){
        if("".equals(str) || str == null) return true;
        return false;
    }
}
