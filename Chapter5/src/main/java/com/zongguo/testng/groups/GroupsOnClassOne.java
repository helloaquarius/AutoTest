package com.zongguo.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
@Test(groups = "stu")
public class GroupsOnClassOne {
    public void stu1(){
        System.out.println("GroupsOnClassOne stu1 run");
    }
    public void stu2(){
        System.out.println("GroupsOnClassOne stu2 run");
    }
}
