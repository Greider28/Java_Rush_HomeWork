package com.javarush.task.task13.task1301;

/* 
Пиво
В этой задаче тебе нужно: 
Подумать, какой из двух интерфейсов нужно реализовать в классе BeerLover.
Добавить к классу BeerLover этот интерфейс и реализовать все его методы.
Подумать, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
Вернуть значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover {

    }
  /*
  public static class BeerLover implements Alcoholic{
       public void sleepOnTheFloor(){

       }
       public void askForMore(String message){

       }
       public void sayThankYou(){
           System.out.println("thanks");
       }

       public boolean isReadyToGoHome(){
               return READY_TO_GO_HOME;
       }


    }
  */
}

