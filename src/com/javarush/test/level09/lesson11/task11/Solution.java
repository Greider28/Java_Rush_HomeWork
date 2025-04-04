package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
Задача: Программа вводит два имени файла.
И копирует первый файл на место, заданное вторым именем. 
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем. 
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует." 
и еще один раз прочитать имя файла с консоли, а уже потом считывать имя файла для записи.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      /* main from the task
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
      */
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String sourceFileName = reader.readLine();
            try {
                InputStream fileInputStream = getInputStream(sourceFileName);
            } catch (FileNotFoundException e){
                System.out.println("Файл не существует.");
                sourceFileName = reader.readLine();

            }
            InputStream fileInputStream = getInputStream(sourceFileName);
            String destinationFileName = reader.readLine();
            OutputStream fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        /* main from the JR solution
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        InputStream fileInputStream = null;
        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();

        */
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

