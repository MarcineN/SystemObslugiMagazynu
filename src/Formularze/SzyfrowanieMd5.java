/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Marcin
 */
public class SzyfrowanieMd5 {

    static String sol = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";

    public static String zaszyfruj(String input) {

        String md5 = null;
        String inp = input + sol;

        if (null == input) {
            return null;
        }
        try {

            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(inp.getBytes(), 0, inp.length());
            md5 = new BigInteger(1, digest.digest()).toString(16);

        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        return md5;
    }
}
