package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter the length in centimetres:");
        double cm=reader.nextDouble();

        double in=cm/2.54;
        int ft=(int)in/12;
        in%=12;

        System.out.println("The entered length is: "+ft+"feet"+" "+in+"inches");
    }
}
