package com.K1ez.util;

/**
 * ����Ϊ�����ķ��������࣬����ֱ�����ڼ���ַ����Ƿ�Ϊ��
 * ����ֵ��true/false
 * ����ֵ���ͣ�boolean
 */

public class StringUtil {
    public static boolean isEmpty(String str){
        if("".equals(str) || str == null) return true;
        return false;
    }
}
