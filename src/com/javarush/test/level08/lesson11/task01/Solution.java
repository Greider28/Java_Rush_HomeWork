package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat. 
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота. 
3. В методе main удалите одного кота из Set cats. 
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. 
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
      //start my code
      for (Cat cat: cats){
            cats.remove(cat);
            break;
        }
      //end my code

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
      for (Cat cat: cats){
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
  public static class Cat{

    }
}
