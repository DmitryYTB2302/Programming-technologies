package org.example;

public class Cat extends Animal
{
    private static int count;
    public Cat(String name, int age, String color, int run, int swim)
    {
        super(name, age, color, run, swim);
        count++;
    }
    public static int getCount()
    {
        return count;
    }
    public static void setCount(int count)
    {
        Cat.count = count;
    }
}
