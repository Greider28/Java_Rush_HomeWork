package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
1. Создай список чисел. 
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14: 3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
      List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int subsequence = 1;
        int maxSubsequence = 1;
        for (int i = 1; i < list.size(); i++){
            if ((list.get(i)).equals(list.get(i - 1))){//насчет equals смотри ниже коммент
                subsequence++;
                if (subsequence > maxSubsequence){
                    maxSubsequence = subsequence;
                }
            } else {
                subsequence = 1;
            }
        }
        System.out.println(maxSubsequence);
      /*
         Integer является ссылочным типом данных. Числа Integer могут сравниваться через ==  только в радиусе -128 до 127. 
         Причина - кэширование этого диапазона чисел. Данный диапазон чисел уже имеется в памяти , и при создании ,например, new Integer(120), 
         мы создадим не новый объект , а лишь ссылку на ячейку памяти кэша с числом 120.
         То есть new integer(120) == new Integer(120) будет true , так как оба объекта являются лишь ссылками на уже имеющийся в кэше памяти.
         А new Integer(1000) == Integer(1000) будет false , так как оба числа не существует в памяти , и создаются два разных объекта,даже если
          содержимое будет одинаковым.
          -То есть , если  памяти нет объекта , создаётся новый объект.
          -Если в памяти есть объект(был создан вами или уже имеется по умолчанию), то создаётся ссылка на этот объект.
          Любое сравнение ссылочных типов данных делается через equals. Character, Integer, String, Long, Cat, Dog Object...
           все сравнения делаются через equals, если мы хотим сравнить конкретно содержимое ссылок.
           По этому New Integer(1000).equals(New Integer(1000)) будет одним из наиболее верных вариантом.
            Можно так же вызвать у Integer само число , которое хранится в виде int и сравнивать уже их . но это больше кода.
         */

    }
}
