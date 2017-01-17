package com.company;

import java.*;
/**
 * Created by jq210 on 1/17/17.
 */
public class TowersOfHanoi {
    private int discs;
    StringBuffer sbMoveTo = new StringBuffer("Move one disk from tower ");

    public TowersOfHanoi(int n)
    {
        discs = n;
    }
    public String moveTower()
    {

        if (discs > 10)
        {
            String s = "Please enter a smaller number";
            IllegalThreadStateException e = new IllegalThreadStateException();
            throw e;
        }
        if (discs == 1)
        {
            sbMoveTo.append("1 to 3");
        }
        else
        {
            discs
        }
        String moveTo = sbMoveTo.toString();
        return moveTo;
    }


}
