package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String phrase=reader.nextLine();

        StringTokenizer tokenizer=new StringTokenizer(phrase, " ");

        StringBuilder filtered=new StringBuilder();
        while(tokenizer.hasMoreTokens()){
            String word=tokenizer.nextToken().toLowerCase();
            word=word.replaceAll("[^a-z0-9]", "");
            filtered.append(word);
        }

        String filteredStr=filtered.toString();
        String backwardStr=filtered.reverse().toString();

        if(filteredStr.equals(backwardStr)){
            System.out.println("The sentence is a palindrome.");
        }else{
            System.out.println("The sentence is not a palindrome.");
        }
    }
}
