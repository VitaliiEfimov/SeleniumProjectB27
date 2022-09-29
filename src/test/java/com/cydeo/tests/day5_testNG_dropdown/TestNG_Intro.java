package com.cydeo.tests.day5_testNG_dropdown;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;
public class TestNG_Intro {

    @Test (priority = 1 )
    public void test1(){
        System.out.println("Test1 is running...");
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> After Method is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("--> Before Class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("--> After class is running");
    }

}
