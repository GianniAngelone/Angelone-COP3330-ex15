/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "abc$123";
        System.out.print("What is the password? ");
        String guess = input.nextLine();

        if (guess.equals(correctPassword)) {
            System.out.print("Welcome!");
        } else {
            System.out.printf("I don't know you.");
        }
    }
}



