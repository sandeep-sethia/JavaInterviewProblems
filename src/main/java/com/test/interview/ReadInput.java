package com.test.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadInput {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            String[] arr = line.split(",\\s");
            String pat = "([^" + arr[1] + "])";
            Pattern p = Pattern.compile(pat);
            Matcher m = p.matcher(arr[0]);
            while (m.find()) {
                System.out.print(m.group(0));
            }
            System.out.println();
        }
    }
}
