package com.javarush.task.task11.task1119;

/* 
Четвертая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: House (дом), Cat (кот), Dog (собака), Car (машина).
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class House extends Cat {

    }

    public class Cat extends Car {

    }

    public class Car extends Dog {

    }

    public class Dog extends House {

    }
  /*
  public static void main(String[] args) {
    }

    public class House {

    }

    public class Cat {

    }

    public class Car {

    }

    public class Dog {

    }
  */
}
