package LW_02;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of rows you want for the pyramid: ");
        int rows=reader.nextInt();

        for(int a=1; a<=rows; a++){
            for(int b=1; b<=rows-a; b++){
                System.out.print(" ");
            }
            for(int c=1; c<=(2*a-1); c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


