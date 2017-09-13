package com.epure;
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
import java.util.Scanner;

/**
 * Created by V on 13/09/2017.
 */
public class ArrayChallenge {

    private int[] array;
    private int[] sorterDescArray;

    public void getIntegers(int number){

        Scanner scan = new Scanner(System.in);
        int[] values = new int[number];
        System.out.println("Please input the array values ("+number+" values):");
        for (int i=0; i<number; i++){
            values[i]=scan.nextInt();
        }
        array=values;
    }


    public void printArray(int[] printoutArray){
        System.out.print("{");

        for (int i=0;i<printoutArray.length;i++){
            System.out.print(printoutArray[i]);
            System.out.print(i==printoutArray.length-1?"":",");
        }
        System.out.println("}");
    }

    public void printArray(){
        printArray(array);
    }

    public void sortIntegers(){
        sorterDescArray=array;
        for (int i=0;i<sorterDescArray.length;i++) {
            for (int j=0;j<sorterDescArray.length;j++){
                if (sorterDescArray[i]<sorterDescArray[j]){
                    sorterDescArray[i]+=sorterDescArray[j];
                    sorterDescArray[j]=sorterDescArray[i]-sorterDescArray[j];
                    sorterDescArray[i]=sorterDescArray[i]-sorterDescArray[j];
                }
            }
        }
        printArray(sorterDescArray);

    }
}
