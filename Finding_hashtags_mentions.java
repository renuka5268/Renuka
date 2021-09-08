package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Twitter {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter twitter tweet ");
        String string = sc.nextLine();
        Matcher matcher = Pattern.compile("^[@#]\\w+|(?<=\\s)[@#]\\w+").matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
