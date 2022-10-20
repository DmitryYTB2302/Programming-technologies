package org.example;

public class Dog extends Animal
{
    private static int count;

    public Dog(String name, int age, String color, int run, int swim)
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
        Dog.count = count;
    }
}
