package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
  /*
  ArrayList - это коллекция (список), в которую можно добавлять объекты.
ArrayList<Cat> - в скобках указывается объекты какого типа можно добавить в этот список
cats - это название списка
new Cat() - команда создает новый объект типа Cat. но не кладет его в переменную, а выполняет с ним другое действие:
cats.add(new Cat()) - созданный объект помещается в список cats
for (Cat cat : cats) - цикл перебирает все элементы в коллекции. Поскольку в списке cats лежат коты (Cat), то цикл перебирает всех котов в списке.
  */
    //напишите тут ваш код
  //start my code
   public static ArrayList<Cat> cats = new ArrayList<>();
  //end my code

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
      //start my code
      for (int i = 0; i < 10; i++){
            cats.add(new Cat());
        }
      //end my code
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
      //start my code
      for (Cat cat : cats){
            System.out.println(cat);
        }
      //end my code
    }
}
