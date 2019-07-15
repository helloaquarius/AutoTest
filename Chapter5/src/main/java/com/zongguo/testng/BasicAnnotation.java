package com.zongguo.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public  void  afterMethod(){
        System.out.println("AfterMethod这是测试方法之后运行的");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("BeforeClass这是类运行之前运行的方法");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("AfterClass这是类运行之后运行的方法");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是测试套件运行的方法");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是测试套件运行的方法");
    }
}
