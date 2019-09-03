package com.cslg.lrp.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CipherProcessing {
    public String encoderByMd5(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        String newpassword = base64en.encode(md5.digest(password.getBytes("utf-8")));
        return newpassword;
    }

    public boolean checkpassword(String newpassword,String oldpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if(encoderByMd5(newpassword).equals(oldpassword)){
            return true;
        }
        return false;
    }
}
