package com.test.interview;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrubber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");




        String s = scanner.nextLine();
        s = s.trim();
        String arr[]=s.split(",\\s");
        String pat="([^"+arr[1].trim()+"])";
        Pattern p=Pattern.compile(pat);
        Matcher m=p.matcher(arr[0].trim());
        while(m.find())
        {
            System.out.print(m.group(0));
        }
        System.out.println();
    }
}
