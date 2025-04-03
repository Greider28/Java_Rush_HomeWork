package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
Вот что тебе нужно сделать в этой задаче: 
Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat {
    }

    public class Dog {
    }

    public class Tiger extends Cat {
    }

    public class Duck {
    }
  /*
  public class Cat implements CanClimb, CanRun{
        public void climb(){

        };
        public void run(){

        };
    }

    public class Dog implements CanRun{
        public void run(){

        }
    }

    public class Tiger extends Cat{
        public void climb(){

        }
        public void run(){

        }
    }

    public class Duck implements CanRun, CanFly{
        public void run(){

        }
        public void fly(){

        }
    }

    public interface CanFly{
        void fly();
    }

    public interface CanClimb{
        void climb();
    }

    public interface CanRun{
        void run();
    }
  */
}
