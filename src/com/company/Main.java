package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("How many discs?");
        Scanner discIn = new Scanner(System.in);
        int discNum = discIn.nextInt();

        System.out.println("What will you call the first tower?");
        Scanner towOneIn = new Scanner(System.in);
        String towOne = towOneIn.next();

        System.out.println("What will you call the second tower?");
        Scanner towTwoIn = new Scanner(System.in);
        String towTwo = towTwoIn.next();

        System.out.println("What will you call the third tower?");
        Scanner towThreeIn = new Scanner(System.in);
        String towThree = towThreeIn.next();

        TowersOfHanoi.moveTower(discNum, towOne, towTwo, towThree);


    }
}
