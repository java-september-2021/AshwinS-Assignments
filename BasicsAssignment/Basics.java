import java.util.Arrays;
import java.util.ArrayList;

public class Basics{
    
    // Print 1-255
    // Write a method that prints all the numbers from 1 to 255.
    public void PrintNum(){
        System.out.println("PrintNum");
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }
    // Print odd numbers between 1-255
    // Write a method that prints all the odd numbers from 1 to 255.
    public void PrintOdd(){
        System.out.println("PrintOdd");
        for(int j = 0; j <= 255; j++){
            if(j % 2 != 0){
                System.out.println(j);
            }
        }
    }

    // Sigma of 255 AKA Sum to 255
    // Write a method that creates and eventually returns a sum variable that adds up all the numbers from 1 to 255. In this method you are not printing the sum, except to debug if you need to, the method should return the sum. Note: You do not need an array to write this function. 
    public int PrintSum(){
        System.out.println("PrintSum");
        int sum = 0;
        for(int k = 1; k <= 255; k++){
            sum += k;
        }
        return sum;
    }

    // Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.

    public void IterateArray(int[] x){
        System.out.println("IterateArray");
        for(int l = 0; l < x.length; l++){
            System.out.println(x[l]);
        }
    }

    // Find Max
    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.

    public int FindMax(int[] m){
        int max = m[0];
        for(int n = 0; n<m.length; n++){
            if(max<m[n]){
                max = m[n];
            }
        }
        return max;
    }
    // Array with Odd Numbers 
    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public ArrayList<Integer> OddArray(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int p = 0; p<=255; p++){
            if(p % 2 != 0){
                list.add(p);
            }
        }
        return list;
    }
}











