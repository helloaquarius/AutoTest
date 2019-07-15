package com.zongguo.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("server test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("server test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("client tets4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("beforeGroups OnServer");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("afterGroups OnServer");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("beforeGroups OnClient");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("afterGroups OnClient");
    }
}
