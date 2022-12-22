package com.keyin.solosprint;


import org.junit.Assert;
import org.junit.Test;


public class ResultTest {
//    @Test
//    public void return_of_sorted_array_to_tree_is_good(){
//        TreeNode testerNode = new TreeNode();
//        Result testerResult = new Result();
//        Integer[] testIntArray = (new Integer[]{1,2,3});
//        Assert.assertEquals(testerResult.sortedArrayToTree(testIntArray));
//    }

    @Test
    public void test_result_constructor(){
        Result testResult = new Result();



        Assert.assertNotNull(testResult);
    }
}
