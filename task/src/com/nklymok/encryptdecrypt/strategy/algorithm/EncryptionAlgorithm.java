package com.nklymok.encryptdecrypt.strategy.algorithm;

public abstract class EncryptionAlgorithm {
    protected int key;

    public final String execute(String s) {
        StringBuilder result = new StringBuilder("");
        char[] input = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            result.append(processChar(input[i]));
        }
        return result.toString();
    }

    protected abstract char processChar(char ch);

    public void setKey(int key) {
        this.key = key;
    }

}
