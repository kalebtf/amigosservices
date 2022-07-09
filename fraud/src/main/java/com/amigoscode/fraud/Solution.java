package com.amigoscode.fraud;

public class Solution {

    public static void main(String[] args) {

    }

    public static int[] productExcludeIndexArray (int[] array){

        int[] productArray = new int[4];

        for(int i = 0; i < array.length; i++){


            productArray[i] = array[i+1] * array[i+2] * array[i+3];
        }

return productArray;

    }
}
