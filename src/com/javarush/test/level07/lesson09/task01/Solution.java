package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам: Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка. Порядок объявления списков очень важен. 
2. Метод printList должен выводить на экран все элементы списка с новой строки. 
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        ArrayList<Integer> divby3 = new ArrayList<Integer>();
        ArrayList<Integer> divby2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++){
            Integer a = list.get(i);
            if (a % 3 == 0){
                divby3.add(a);
                if (a % 2 == 0){
                    divby2.add(a);
                }
            }
            else if (a % 2 == 0){
                divby2.add(a);
            }
            else {
                other.add(a);
            }
        }

        printList(divby3);
        printList(divby2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
      for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

