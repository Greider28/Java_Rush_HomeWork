package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
В этой задаче тебе нужно: 
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
*/

public class Solution {
    public static void main(String[] args) {//throws IOException
        // напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String line;

        while (!(line = reader.readLine()).equals("exit")) {// Прерывание цикла при написании строки exit
            writer.write(line);//пишем строку
            writer.newLine();//переводим на новую строку в файле
        }
        if (line.equals("exit")){
            writer.write(line);//пишем и последнее слово exit
        }
        writer.close();
    }
}

