/*
Давай напишем Фабрику (Factory) по производству кур (Hen): 
Создай класс Hen.
Сделай его абстрактным.
Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
Создай класс RussianHen, который наследуется от Hen.
Создай класс UkrainianHen, который наследуется от Hen.
Создай класс MoldovanHen, который наследуется от Hen.
Создай класс BelarusianHen, который наследуется от Hen.
В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth. Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов напиши свою реализацию метода getDescription.
Методы должны возвращать строку вида: <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц."> где Sssss - название страны где N - количество яиц в месяц
В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
Все созданные классы должны быть в отдельных файлах.
  */

package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals("Ukraine")){
                hen = new UkrainianHen();
            } else if (country.equals("Russia")){
                hen = new RussianHen();
            } else if (country.equals("Moldova")){
                hen = new MoldovanHen();
            } else if (country.equals("Belarus")){
                hen = new BelarusianHen();
            }
            return hen;
        }
    }


}
