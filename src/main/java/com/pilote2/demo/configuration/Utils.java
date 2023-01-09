package com.pilote2.demo.configuration;

public class Utils
{
    public static boolean isNumber(String s)
    {
        try {
            Long.parseLong(s);
            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }


    }
}