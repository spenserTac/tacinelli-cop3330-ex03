/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();

        System.out.print("Who said it? ");
        String author = scanner.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
