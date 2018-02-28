package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {


    public String readInputText() throws IOException {
// TODO: add error handling here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        return br.readLine();
    }

    public String processText(String inputText) {
        Pattern p = Pattern.compile("pasword:[A-Za-z0-9]{10}");
        Matcher m = p.matcher(inputText);
        StringBuilder finalStr = new StringBuilder("");

        while (m.find()) {

            String subStr = inputText.substring(m.start(), m.end());
            int paswordIndex = subStr.indexOf("pasword:")+8;
            String temp = subStr.substring(paswordIndex);

            String s = temp;
            String pat = "(?=.*[a-z])(?=.*[A-Z])";
            if (s.matches(pat)) {
                finalStr.append("pasword:" + temp + " ");
            }
            else {
                finalStr.append("pasword:UNSECURED ");
            }



        }



        return finalStr.toString();



    }



    public void showResult(String resultText){
        System.out.println(resultText);
    }
}