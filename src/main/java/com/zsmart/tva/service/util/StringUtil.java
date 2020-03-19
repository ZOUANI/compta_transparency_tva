package com.zsmart.tva.service.util;
 
 
 
/**
 *
 * @author ELMassafi
 */
public class StringUtil {

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }
}