package com.javarush.task.task12.task1231;

/* 
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась. Добавь там, где нужно, и удали там, где они не нужны.
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static abstract class Horse {//public static class Horse
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public abstract void fly() {//public void fly()

        }
    }

    public static class SwimmingPegasus extends Pegasus {//public static abstract class SwimmingPegasus extends Pegasus
        public void swim();//public abstract void swim();
    }

}
