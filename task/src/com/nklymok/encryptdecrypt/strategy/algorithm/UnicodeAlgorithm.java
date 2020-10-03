package com.nklymok.encryptdecrypt.strategy.algorithm;

public class UnicodeAlgorithm extends EncryptionAlgorithm {

    public UnicodeAlgorithm(int key) {
        setKey(key);
    }

    @Override
    protected char processChar(char ch) {
        return (char) (ch + key);
    }
}
