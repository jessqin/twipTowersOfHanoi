package com.company;

import java.*;
/**
 * Created by jq210 on 1/17/17.
 */
public class TowersOfHanoi {
    private int discs;
    private String towerOne;
    private String towerTwo;
    private String towerThree;


    public TowersOfHanoi()
    {

    }
    public static void moveTower(int discs, String towerOne, String towerTwo, String towerThree)
    {

        if (discs > 10)
        {
            String s = "Please enter a smaller number";
            IllegalThreadStateException e = new IllegalThreadStateException();
            throw e;
        }
        if (discs == 1)
        {
            System.out.println("Move one disk from tower " + towerOne + " to " + towerThree);
        }
        else
        {
            moveTower(discs - 1, towerOne, towerThree, towerTwo);
            System.out.println("Move one disk from tower " + towerOne + " to " + towerThree);
            moveTower(discs - 1, towerTwo, towerOne, towerThree);
        }
    }


}
