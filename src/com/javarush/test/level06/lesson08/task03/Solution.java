package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками. Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
      //start my code
      //d = √((хА – хВ)2 + (уА – уВ)2)
        double d;
        double distance;
        d = ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        distance = Math.sqrt(d);
        return distance;
      //end my code
    }

    public static void main(String[] args) {

    }
}
