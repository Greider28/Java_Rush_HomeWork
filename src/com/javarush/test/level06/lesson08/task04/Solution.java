package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число boolean
readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
      //end my code

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        return num;
      //end my code

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double doubNum = Double.parseDouble(reader.readLine());
        return doubNum;
      //end my code

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
      //start my code
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean booRes = Boolean.parseBoolean(reader.readLine());
        return booRes;
      //end my code

    }

    public static void main(String[] args) throws Exception {

    }
}
