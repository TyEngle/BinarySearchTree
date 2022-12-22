package com.keyin.solosprint;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.io.File;
import java.io.IOException;


//Demo class to demo the project and create the tree
public class Demo {


    public static void main(String[] args){
        Scanner userIn = new Scanner( System.in );
        ArrayList<Integer> integerArray = new ArrayList<Integer>();
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("Welcome to Garbonzo's Binary Search Tree Program!!!");
        System.out.println("***************************************************");


        while ( true ){
            System.out.println("");
            System.out.println("enter any key to continue, x to end: ");

            if( userIn.next().startsWith("x")){
                break;

            } else{
                System.out.println("");
                System.out.println("Please enter integer to add to list: ");

                int inputVariable = Integer.parseInt( userIn.next() );

                integerArray.add(inputVariable);
                System.out.println("Integer succesfully added to array");
                System.out.println("Current array: " + integerArray);
            }
        }


        TreeNode nodeOne = new TreeNode();

        Result resultOne = new Result();
        ArrayList<Object> arrayOne = new ArrayList<Object>();


        for(int i=0; i < integerArray.size(); i++){
            System.out.println(resultOne.sortedArrayToTree(new Integer[]{integerArray.get(i)}));
            Object newObject = resultOne.sortedArrayToTree(new Integer[]{integerArray.get(i)});
            arrayOne.add(newObject);
        }

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("Tree.json");
        try {
            mapper.writeValue(file, arrayOne);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }







    }



}
//object mapper -- reference jamie's link in document
//create array above for oop and convert things from array to objects

