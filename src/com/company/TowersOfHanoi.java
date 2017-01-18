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
    public void moveTower(int discs, String towerOne, String towerTwo, String towerThree)
    {
        StringBuffer sbMoveTo = new StringBuffer("Move one disk from tower ");

        if (discs > 10)
        {
            String s = "Please enter a smaller number";
            IllegalThreadStateException e = new IllegalThreadStateException();
            throw e;
        }
        if (discs == 0)
        {
            sbMoveTo.append("1 to 3");
        }
        else
        {
            moveTower(discs - 1, towerOne, towerThree, towerTwo);
            sbMoveTo.append(towerOne + " to " + towerThree);
            moveTower(discs - 1, towerTwo, towerOne, towerThree);
        }
        String moveTo = sbMoveTo.toString();
        System.out.println(moveTo);
    }


}
