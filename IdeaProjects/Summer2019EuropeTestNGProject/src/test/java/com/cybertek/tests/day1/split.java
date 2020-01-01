package com.cybertek.tests.day1;

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String[] s1=email.split("_");
        String i=s1[0];
        String i1=Character.toUpperCase(i.charAt(0)) + i.substring(1);
        String[] s2=s1[1].split("@");
        String j=s2[0];
        String j1=Character.toUpperCase(j.charAt(0)) + j.substring(1);
        String[] s3=s2[1].split(".");
        String k=s3[0];
        String l=s3[1];

        System.out.println("First Name: "+i1);
        System.out.println("Last name: "+j1);
        System.out.println("Domain: "+k);
        System.out.println("Top-Level Domain: "+l);
    }
}
