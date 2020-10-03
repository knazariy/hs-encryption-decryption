package com.nklymok.encryptdecrypt.factory;

import com.nklymok.encryptdecrypt.strategy.io.ConsoleOutput;
import com.nklymok.encryptdecrypt.strategy.io.FileOutput;
import com.nklymok.encryptdecrypt.strategy.io.OutputStrategy;

import java.io.File;

public class OutputStrategyFactory {
    public static OutputStrategy build(File outputFile) {
        if (outputFile != null) {
            return new FileOutput(outputFile);
        } else {
            return new ConsoleOutput();
        }
    }
}
