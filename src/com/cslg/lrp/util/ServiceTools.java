package com.cslg.lrp.util;

import java.security.MessageDigest;

/**
 * Service使用的工具类
 * @author MLP
 */
public class ServiceTools {

    /**
     * MD5加密
     * @param str 待加密字符串
     * @return 加密后字符串
     */
    public static String getMd5String(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] strByte = str.getBytes();
            md.update(strByte);
            byte[] result = md.digest();
            return byteArrayToHex(result);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 字节数组转十六进制编码字符串
     * @param byteArray 字节数组
     * @return 字符串
     */
    private static String byteArrayToHex(byte[] byteArray) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F' };
        char[] resultCharArray = new char[byteArray.length * 2];
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index ++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index ++] = hexDigits[b & 0xf];
        }
        return new String(resultCharArray);
    }

}
