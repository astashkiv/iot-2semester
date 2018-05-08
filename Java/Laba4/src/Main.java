package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();
        String str = "t";

        try {
            str = processor.readInputText();
        } catch(Exception e) {
            e.printStackTrace();
        }

        processor.showResult(processor.processText(str));
    }
}