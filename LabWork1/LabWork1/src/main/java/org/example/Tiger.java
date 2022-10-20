package org.example;

public class Tiger extends Animal
{
    private static int count;

    public Tiger(String name, int age, String color, int run, int swim)
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
        Tiger.count = count;
    }
}
