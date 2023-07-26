package com.qa.arrays;

import com.qa.classes.classExercise.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        // Array will store first 10 even numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
        }

        // Print contents of numbers array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Showing in-line creation of an array and enhanced for loop for  printing
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        for (char character: chars){
            System.out.println(character);
        }

        // Creating a list
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add((i+1) * 3); // Three times-table
        }
        for (Integer num:nums){
            System.out.println(num);
        }
        System.out.println(nums); // You can actually print out a list



    }
}
