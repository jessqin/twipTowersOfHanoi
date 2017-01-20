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
        StringBuffer sb = new StringBuffer("Move one disk from tower ");
        if (discs > 10)
        {
            String s = "Please enter a smaller number";
            IllegalThreadStateException e = new IllegalThreadStateException();
            throw e;
        }
        if (discs == 1)
        {
            sb.append(towerOne + " to " + towerThree);
            System.out.println(sb.toString());
        }
        else
        {
            moveTower(discs - 1, towerOne, towerThree, towerTwo);
            sb.append(towerOne + " to " + towerThree);
            System.out.println(sb.toString());
            moveTower(discs - 1, towerTwo, towerOne, towerThree);
        }
    }


}
