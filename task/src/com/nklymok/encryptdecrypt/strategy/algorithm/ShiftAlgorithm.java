package com.nklymok.encryptdecrypt.strategy.algorithm;

public class ShiftAlgorithm extends EncryptionAlgorithm {

    public ShiftAlgorithm(int key) {
        setKey(key);
    }

    @Override
    protected char processChar(char ch) {
        if (!Character.isAlphabetic(ch)) {
            return ch; // return if does not belong to abc
        }

        boolean upperCase = Character.isUpperCase(ch); // used to avoid checks for register
        ch = Character.toLowerCase(ch);
        int charNum = (int) (ch) - 97;
        charNum += key;
        while (charNum < 0) {
            charNum += 26;
        }

        while (charNum > 25) {
            charNum -= 26;
        }

        ch = (char) charNum;
        return upperCase ? Character.toUpperCase((char) (ch + 97)) : (char) (ch + 97);
    }
}
