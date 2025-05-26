package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }

    public String getDescription(){
        String result = super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
        return result;
    }
}
