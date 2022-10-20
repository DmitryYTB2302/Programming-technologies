package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("1 лабораторная работа");
        Dog dog = new Dog("Шарик",5,"Белый",500,300);
        Cat cat = new Cat("Барсик",4,"Черный",350,400);
        Cat cat2 = new Cat("Топ",6,"Серый",450,350);
        Tiger tiger = new Tiger("Амур",6,"Рыже-черный",600,450);
        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество тигров: " + Tiger.getCount());
        int countAllAnimal = Cat.getCount()+Dog.getCount()+Tiger.getCount();
        System.out.println("Количество всех животных: " + countAllAnimal);
        Animal[] animals = new Animal[countAllAnimal];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = cat2;
        animals[3] = tiger;
        System.out.println("Результат бега: ");
        for(Animal a: animals)
        {
            a.run(400);
        }
        System.out.println("Результат плаванья: ");
        for(Animal a: animals)
        {
            a.swim(400);
        }

    }
}