package com.javarush.task.task14.task1417;

public abstract class Money {

    private double amount;//add

    public Money(double amount) {
        this.amount = amount;//add
    }

    public double getAmount(){//move abstract
        return this.amount;//add return
    };

    public abstract String getCurrencyName();
}
