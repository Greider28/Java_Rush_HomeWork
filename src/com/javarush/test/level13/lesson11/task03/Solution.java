package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно: 
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) {// throws IOException
        // напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        InputStream inStream = new FileInputStream(path);

        while (inStream.available() > 0){
            char data = (char)inStream.read();
            System.out.print(data);
        }

        inStream.close();
        reader.close();
    }
}
