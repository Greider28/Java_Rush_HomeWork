package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false 
2. String date передается в формате FEBRUARY 1 2013 
Не забудь учесть первый день года.
Пример: 
JANUARY 1 2000 = true 
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStart = new Date();
        yearStart.setMonth(0);
        yearStart.setDate(1);
        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setSeconds(0);
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d y", Locale.ENGLISH);
        Date dateNow = formatter.parse(date);
        //String date2 = formatter.format(date1);
        yearStart.setYear(dateNow.getYear());
        long msDistance = dateNow.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount = (int) (msDistance/msDay);

        if (dayCount % 2 == 0){
            return false;
        } else {
            return true;
        }
      /*
        alternative solution
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
      */
      
    }
}

