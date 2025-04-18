package com.javarush.task.task13.task1302;

/* 
Пиво-2. Возвращение
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

    }
  /*
  public static class AlcoholicBeer implements Drink{
        public boolean isAlcoholic(){
            return true;
        }
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

    }
  */
}
