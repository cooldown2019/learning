package com.task.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class MD5Util {

    public static String getMd5(String psd, String salt) {
        try {
            StringBuffer stingBuffer = new StringBuffer();
            // 1.指定加密算法
            MessageDigest digest = MessageDigest.getInstance("MD5");
            // 2.将需要加密的字符串转化成byte类型的数据，然后进行哈希过程
            byte[] bs = digest.digest((psd + salt).getBytes());
            // 3.遍历bs,让其生成32位字符串，固定写法

            // 4.拼接字符串
            for (byte b : bs) {
                int i = b & 0xff;
// 此方法返回的字符串表示的无符号整数参数所表示的值以十六进制（基数为16）
                String hexString = Integer.toHexString(i);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stingBuffer.append(hexString);
            }
            return stingBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 根据输入的字符串生成固定的32位MD5码
     *
     * @param
     * @return MD5码
     */
//    public final static String getMd5(String str) {
//        MessageDigest mdInst = null;
//        try {
//            mdInst = MessageDigest.getInstance("MD5");
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        // 使用指定的字节更新摘要
//        mdInst.update(str.getBytes());
//        // 获得密文
//        byte[] md = mdInst.digest();
//        return StrConvertUtil.byteArrToHexStr(md);
//    }

    public static String salt(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(r.nextInt(15945461)).append(r.nextInt(41945619));
        int len = sb.length();
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        String salt = sb.toString();
        return salt;
    }

}

