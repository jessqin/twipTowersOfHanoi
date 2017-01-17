package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("How many discs?");
        Scanner discIn = new Scanner(System.in);
        int discNum = discIn.nextInt();

        TowersOfHanoi newTow = new TowersOfHanoi(discNum);
        System.out.println(newTow.moveTower());


    }
}
