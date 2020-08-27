package com.stackroute;
import java.util.Scanner;
public class MaximumNumber {                //This class is used to find maximum number from the given array elements

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size;
        int i;
        int j;
        int temp;
        System.out.println("Enter size of the array ");
        size = reader.nextInt();
        int[] myarray = new int[size];
        System.out.println("Enter array elements");           //Reads array elements from the user
        for (i = 0; i < size; i++) {
            myarray[i] = reader.nextInt();
        }
        System.out.println("Maximun number is " + Maximum(myarray));
    }

    public static int  Maximum(int[] array) {             //This function is used to find maximum number
        int max = array[0];
        int i;
        for (i = 0; i < array.length; i++) {              //checks each element in an array and maximum number is stored in max
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}