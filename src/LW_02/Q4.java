package LW_02;

import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        int[] numbers=new int[5];

        System.out.println("Enter 5 integers:");
        for(int a=0; a<numbers.length; a++){
            numbers[a]=reader.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int element:numbers){
            if(element>max){
                secondMax=max;
                max=element;
            }else if(element>secondMax && element<max){
                secondMax=element;
            }
        }

        if(secondMax==Integer.MIN_VALUE){
            System.out.println("No distinct second-largest element found.");
        }else{
            System.out.println("The second-largest element is: " + secondMax);
        }
    }
}

