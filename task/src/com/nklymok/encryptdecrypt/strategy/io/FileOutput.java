package com.nklymok.encryptdecrypt.strategy.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput implements OutputStrategy {
    private final File outputFile;

    public FileOutput(File outputFile) {
        this.outputFile = outputFile;
    }


    @Override
    public void execute(String output) {
        try (PrintWriter printWriter = new PrintWriter(outputFile)) {
            printWriter.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
