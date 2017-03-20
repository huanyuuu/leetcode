package com.han;

/**
 * Created by han on 2017/3/20.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] sa = s.toCharArray();
        char[] res = new char[sa.length];
        for(int i = 0;i<sa.length;i++){
            res[i] = sa[Math.abs(sa.length-i-1)];
        }
        String text = String.valueOf(res);
        System.out.println(text);
    }
}
