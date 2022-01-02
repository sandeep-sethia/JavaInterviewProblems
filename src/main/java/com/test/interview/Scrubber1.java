package com.test.interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrubber1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");

        String s = scanner.nextLine();
        s = s.trim();
        String arr[]=s.split(",\\s");
        String patternString = ".*"+ arr[1] +".*";
        Pattern p=Pattern.compile(patternString);
        Matcher m=p.matcher(arr[0]);
        while(m.find())
        {
            System.out.print(m.group(0));
        }
        System.out.println();
    }
}
