package com.javarush.task.task10.task1011;

/* 
Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец: Я не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату 
 е хочу изучать Java, я хочу большую зарплату 
  хочу изучать Java, я хочу большую зарплату 
  хочу изучать Java, я хочу большую зарплату 
  ... 
  зарплату
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
      for (int i = 0; i < 40; i++){
            String newStr = text.substring(i, text.length());
            System.out.println(newStr);
        }
    }

}
