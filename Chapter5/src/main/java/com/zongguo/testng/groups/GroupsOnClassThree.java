package com.zongguo.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
@Test(groups = "teacher")
public class GroupsOnClassThree {
    public void teacher1(){
        System.out.println("GroupsOnClassThree teacher1 run");
    }
    public void teacher2(){
        System.out.println("GroupsOnClassThree teacher2 run");
    }

}
