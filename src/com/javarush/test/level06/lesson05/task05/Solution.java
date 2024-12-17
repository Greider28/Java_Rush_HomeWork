package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numString = reader.readLine();
        int count = numString.length();
        int num = Integer.parseInt(numString);
        even = 0;
        odd = 0;
        for (int i = 0; i < count; i++) {
            if (num % 10 == 0) {
                num = num / 10;
            } else {
                int currentNum = num % 10;
                if (currentNum % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                num = num / 10;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
      //end my code
    }
}
