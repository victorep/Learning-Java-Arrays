package com.epure;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] numbers1 = new int[10];
        int[] numbers2 = {1,2,3,4,5,6,9,0,8,5,4,5,5};
        int[] numbers3 = getIntegers(5);
        System.out.println(numbers2[5]);
        printArray(numbers2);
        printArray(numbers3);
        System.out.println(getAverage(numbers3));
    }


    public static void printArray(int[] array){
        System.out.print("{");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(i==array.length-1?"":",");
        }
        System.out.println("}");
    }

    public static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer values.\r" );
        int[] values = new int[number];

        for (int i=0; i<number; i++){
            values[i]=scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array ){
        double avg=0d;
        for (int i=0;i<array.length;i++){
            avg+=array[i];
        }
        avg/=array.length;
        return avg;
    }
}
