package com.nklymok.encryptdecrypt.strategy.io;

public class ConsoleOutput implements OutputStrategy {
    @Override
    public void execute(String output) {
        System.out.println(output);
    }
}
