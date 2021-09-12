package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

public class App {
    public static int wholePizzas (int num1, int num2, int num3) //whole pizzas
    {
        int res;
        res= num1 * num2;
        int a;
        a = (res + num3-1)/num3;
        return a;
    }
    public static int leftOverPizzas (int num1, int num2, int num3, int num4) //whole pizzas
    {
        int b;
        b= num1 * num2;
        int left;
        left = (num3 * num4)%b;
        return left;
    }

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("How many people? ");
        String str1 = input1.nextLine();
        int people;
        try {
            people = Integer.valueOf(str1);
            if (people <= 0) {
                throw new IllegalArgumentException("Please no negative numbers and at least one person.");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("How many slices per pizza? ");
        String str2 = input2.nextLine();
        int slicesPizza;
        try {
            slicesPizza = Integer.valueOf(str2);
            if (slicesPizza <= 0) {
                throw new IllegalArgumentException("Please no negative numbers and at least one slice.");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.print("How many slices per person? ");
        String str3 = input3.nextLine();
        int slicesPerson;
        try {
            slicesPerson = Integer.valueOf(str3);
            if (slicesPerson < 0) {
                throw new IllegalArgumentException("Please no negative numbers.");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("You must enter a number.");
        }

        int wholePizza;

        wholePizza = wholePizzas(people, slicesPerson, slicesPizza);

        int leftOver;

        leftOver= leftOverPizzas(people, slicesPerson, slicesPizza, wholePizza);

        if ((people<=1) && (slicesPerson<=1)){
            System.out.print(people + " person with " + slicesPerson +" slice.\n");
        }
        else if ((people>1) && (slicesPerson>1)){
            System.out.print(people + " people with " + slicesPerson +" slices per person.\n");
        }
        else if ((people<=1) && (slicesPerson>1)){
            System.out.print(people + " person with " + slicesPerson +" slices per person.\n");
        }
        else{
            System.out.print(people + " people with " + slicesPerson +" slice.\n");
        }
        if (wholePizza<=1){
            System.out.print("We need " + wholePizza + " whole pizza.\n");
        }
        else{
            System.out.print("We need " + wholePizza + " whole pizzas.\n");
        }
        if (leftOver<=1){
            System.out.print("There will be " + leftOver + " leftover pizza slice.\n");
        }
        else{
            System.out.print("There will be " + leftOver + " leftover pizza slices.\n");
        }

    }
}
