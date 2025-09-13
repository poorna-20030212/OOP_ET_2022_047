package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter your first name:");
        String fName=reader.nextLine();

        System.out.println("Enter your middle name:");
        String mName=reader.nextLine();

        System.out.println("Enter your last name:");
        String lName=reader.nextLine();

        char midInitial=mName.charAt(0);

        System.out.println(lName+","+" "+fName+" "+midInitial+".");
    }
}

