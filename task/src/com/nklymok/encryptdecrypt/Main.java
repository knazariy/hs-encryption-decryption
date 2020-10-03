package com.nklymok.encryptdecrypt;

import com.nklymok.encryptdecrypt.factory.AlgorithmFactory;
import com.nklymok.encryptdecrypt.strategy.algorithm.EncryptionAlgorithm;
import com.nklymok.encryptdecrypt.strategy.io.OutputStrategy;
import com.nklymok.encryptdecrypt.factory.OutputStrategyFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String func = "enc";
        String alg = "shift";
        String input = "";
        int key = 0;

        File outputFile = null;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    func = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    input = args[i + 1];
                    break;
                case "-in":
                    File inputFile = new File(args[i + 1]);
                    try (Scanner sc = new Scanner(inputFile)) {
                        input = sc.nextLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
                case "-out":
                    outputFile = new File(args[i + 1]);
                    break;
            }
        }

        EncryptionAlgorithm encryptor = AlgorithmFactory.build(func, alg, key);
        OutputStrategy output = OutputStrategyFactory.build(outputFile);
        String result = encryptor.execute(input);
        output.execute(result);
    }
}
