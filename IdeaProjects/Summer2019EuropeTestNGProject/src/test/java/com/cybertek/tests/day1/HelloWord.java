package com.cybertek.tests.day1;

import com.github.javafaker.Faker;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Faker faker=new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());

    }
}
