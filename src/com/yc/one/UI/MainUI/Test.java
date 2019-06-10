package com.yc.one.UI.MainUI;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Test {
    private static String str="[MySeat{x=2, y=6}, MySeat{x=2, y=7}, MySeat{x=3, y=7}, MySeat{x=3, y=6}]";
    public static void main(String[] args) {
        //str= str.toString(Pattern.compile("MySeat").split(str,5));
        str= Arrays.toString(Pattern.compile("=").split(str,9));
        System.out.println(str);
    }
}
