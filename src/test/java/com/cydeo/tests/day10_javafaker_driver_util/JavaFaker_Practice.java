package com.cydeo.tests.day10_javafaker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {

    @Test
    public void java_faker_test() {

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.animal() = " + faker.animal().name());
        System.out.println("faker.backToTheFuture().quote() = " + faker.backToTheFuture().quote());
        System.out.println("faker.superhero().name() = " + faker.superhero().name());
        System.out.println("faker.superhero().descriptor() = " + faker.superhero().descriptor());
       String name = faker.superhero().name();
        System.out.println(name);

        System.out.println("faker.numerify(\"123-####\") = " + faker.numerify("123-####"));
        System.out.println("faker.letterify(\"???????????\") = " + faker.letterify("??????????"));
        System.out.println("faker.bothify(\"###???#?#?#?\") = " + faker.bothify("###???#?#?#?"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));

    }
}
