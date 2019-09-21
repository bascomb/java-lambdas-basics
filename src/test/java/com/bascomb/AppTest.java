package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testFuncIntDefaultStaticMeth() {
        String input = "repeat";
        FuncInterface funcInterface = (String s) -> {
            s = s + " " + s;
            return s;
        };

        Integer n = funcInterface.defaultNumber(10);

        System.out.println("Default Method - " + n);

        System.out.println("Static Method -> " + FuncInterface.staticText(input));

        String actual = funcInterface.function(input);

        assertEquals(input + " " + input, actual);
    }
    /**
     *ß
     */
    @Test
    public void powerLevelAnonClassTest()
    {
        int power = 1000;

        PowerLevel powerLevel = new PowerLevel() {
            @Override
            public String printPowerLevel(int power) {
                return "Power Level = " + power;
            }
        };


        assertEquals(powerLevel.printPowerLevel(power), "Power Level = " + power);
    }

    @Test
    public void powerLevelLambdaTest()
    {
    int power = 1000;

    PowerLevel powerLevel = (int pwr) -> { return "Power Level = " + pwr; };

    assertEquals("Power Level = " + power, powerLevel.printPowerLevel(power));
    }

    @Test
    public void powerLevelLambdaTestShorter()
    {
        int power = 1000;

        PowerLevel powerLevel = (int pwr) -> "Power Level = " + pwr;

        assertEquals("Power Level = " + power, powerLevel.printPowerLevel(power));
    }

    @Test
    public void comparePowerLambdaTest()
    {
        int racquetOne = 1000;
        int racquetTwo = 1000;

        ComparePowerLevel comparePowerLevel = (one, two) -> 0;

        assertEquals(0, comparePowerLevel.compare(racquetOne,racquetTwo));
    }

    @Test
    public void noArgLambdaTest() {
        String brand = "Prince";
        String prefix = "Racquet Brand = ";
        Racquet racquet = new Racquet(brand);
        RacquetPrinter racquetBrand = () -> prefix + racquet.getBrand();
        String actual = racquetBrand.print();
        assertEquals(prefix + brand, racquetBrand.print());
    }
}
