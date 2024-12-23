package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь. Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
Пример ввода: дедушка Вася бабушка Мурка папа Котофей мама Василиса сын Мурчик дочь Пушинка
Пример вывода: The cat's name is дедушка Вася, no mother, no father 
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father 
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей 
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      /*  old code from the task
      String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
      */
      //my code
      String grandFaName = reader.readLine();
        Cat catGrandFa = new Cat(grandFaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catGrandFa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
      //end of my code
    }

    public static class Cat {
        private String name;
        private Cat parent;
      private Cat father;//add

        Cat(String name) {
            this.name = name;
        }

      /*  old code from the task
      Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
      */
      //start my code
      Cat(String name, Cat parent, Cat father) {//add father
            this.name = name;
            this.parent = parent;
            this.father = father;
        }
      //end my code

      /*  old code from the task
      @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
      */
      //start my code
      @Override
        public String toString() {
            if (parent == null && father == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            }
            else if (parent == null){
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            }
            else if (father == null){
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father ";
            }
            else {
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + father.name;
            }

        }
      //end my code
    }

}
