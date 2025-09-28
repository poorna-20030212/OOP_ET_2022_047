package LW_02;

import java.util.Scanner;

public class Q2{
    public static int getDigits(int inputValue){
        if(inputValue==0){
            return 1;
        }

        int counter=0;
        while(inputValue!=0){
            inputValue/=10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        while(true){
            System.out.print("Enter an integer (Enter a negative number to stop): ");
            int numberEntered=reader.nextInt();

            if(numberEntered<0){
                break;
            }

            int length=getDigits(numberEntered);
            System.out.println(numberEntered + " has " + length + " digit(s).");
        }
    }
}
