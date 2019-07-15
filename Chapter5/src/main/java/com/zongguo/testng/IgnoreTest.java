package com.zongguo.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 run");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 run");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 run");
    }
}
