package com.han;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by han on 2017/3/20.
 */
public class fizzbuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> data = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            Integer a = i;
            String b = a.toString();
            if (i % 3 == 0 && i % 5 != 0)
                data.add("Fizz");
            else if (i % 5 == 0 && i % 3 != 0)
                data.add("Buzz");
            else if (i % 15 == 0)
                data.add("FizzBuzz");
            else
                data.add(b);


        }
        System.out.println(data);
    }
}
