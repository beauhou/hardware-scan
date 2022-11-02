package com.hardware.scan.utils;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
public class UnitTransUtils {
    public static String transformation(long size) {
        return size / 1024 / 1024 / 1024 +"";
    }
}
