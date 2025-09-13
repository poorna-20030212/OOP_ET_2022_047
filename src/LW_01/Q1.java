package LW_01;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter an odd-length word:");
        String term=reader.nextLine();

        if(term.length()%2==1){
            int centerIndex=term.length()/2;
            char centerChar=term.charAt(centerIndex);
            System.out.println("Middle Character: "+centerChar);
        }else{
            System.out.println("The word length is not odd!");
        }
    }
}