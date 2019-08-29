package com.cslg.lrp.Dao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CipherProcessing {
    public String EncoderByMd5(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        String newpassword = base64en.encode(md5.digest(password.getBytes("utf-8")));
        return newpassword;
    }

    public boolean checkpassword(String newpassword,String oldpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if(EncoderByMd5(newpassword).equals(oldpassword)){
            return true;
        }
        return false;
    }
}
