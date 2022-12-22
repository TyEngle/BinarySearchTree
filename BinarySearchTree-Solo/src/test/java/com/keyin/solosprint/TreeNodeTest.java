package com.keyin.solosprint;

import org.junit.Assert;
import org.junit.Test;

public class TreeNodeTest {
    @Test
    public void test_set_value(){
        TreeNode testerNode = new TreeNode(3,1,5);

        testerNode.setValue(10);


        Assert.assertEquals(10, testerNode.getValue());
    }

    @Test
    public void test_get_right(){
        TreeNode testerNodeRight = new TreeNode(5,2,12);
        TreeNode testerCompareNode = new TreeNode(12,1,1);
        Assert.assertEquals(testerCompareNode.getRight(), testerNodeRight.getRight());
    }



}
