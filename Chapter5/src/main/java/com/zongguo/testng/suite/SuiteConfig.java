package com.zongguo.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by zongguo on 2019/7/13.
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite run");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite run");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void  afterTest(){
        System.out.println("After Test");
    }
}
