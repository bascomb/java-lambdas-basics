package com.bascomb;

public interface FuncInterface {

    public static String staticText(String text) {
        return text;
    }

    public default Integer defaultNumber(int n) {
        return n;
    }

    public String function(String x);

}
