package com.nklymok.encryptdecrypt.factory;

import com.nklymok.encryptdecrypt.strategy.algorithm.EncryptionAlgorithm;
import com.nklymok.encryptdecrypt.strategy.algorithm.ShiftAlgorithm;
import com.nklymok.encryptdecrypt.strategy.algorithm.UnicodeAlgorithm;

public class AlgorithmFactory {

    public static EncryptionAlgorithm build(String func, String alg, int key) {
        EncryptionAlgorithm algorithm;
        key = func.equals("enc") ? key : -key;

        switch (alg.toLowerCase()) {
            case "unicode":
                algorithm = new UnicodeAlgorithm(key);
                break;
            default:
                algorithm = new ShiftAlgorithm(key);
        }

        return algorithm;
    }
}
