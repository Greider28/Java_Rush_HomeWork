package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли. Если ничья и никто не выиграл, возвращаем false.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int countThis = 0;
        int countOther = 0;

        if (this.age > anotherCat.age){
            countThis++;
        } else if (this.age < anotherCat.age){
            countOther++;
        } else {
            countThis++;
            countOther++;
        }

        if (this.weight > anotherCat.weight){
            countThis++;
        } else if (this.weight < anotherCat.weight){
            countOther++;
        } else {
            countThis++;
            countOther++;
        }

        if (this.strength > anotherCat.strength){
            countThis++;
        } else if (this.strength < anotherCat.strength){
            countOther++;
        } else {
            countThis++;
            countOther++;
        }

        if (countThis >= countOther){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
