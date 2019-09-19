package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     *
     */
    @Test
    public void powerLevelAnonClassTest()
    {
        PowerLevel powerLevel = new PowerLevel() {
            @Override
            public String printPowerLevel() {
                return "Power Level  = 1000";
            }
        };


        assertEquals(powerLevel.printPowerLevel(), "Power Level  = 1000");
    }

    @Test
    public void powerLevelLambdaTest()
    {

        PowerLevel powerLevel = () -> { return "Power Level = 1000"; };


        assertEquals("Power Level = 1000", powerLevel.printPowerLevel());
    }

    @Test
    public void comparePowerLambdaTest()
    {
        int racquetOne = 1000;
        int racquetTwo = 1000;

        ComparePowerLevel comparePowerLevel = (one, two) -> { return 0;};




        assertEquals(0, comparePowerLevel.compare(racquetOne,racquetTwo));
    }
}
