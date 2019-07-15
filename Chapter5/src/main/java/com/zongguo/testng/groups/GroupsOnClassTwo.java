package com.zongguo.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by zongguo on 2019/7/13.
 */
@Test(groups = "stu")
public class GroupsOnClassTwo {
    public void stu11(){
        System.out.println("GroupsOnClassTwo stu11 run");
    }
    public void stu22(){
        System.out.println("GroupsOnClassTwo stu22 run");
    }
}
