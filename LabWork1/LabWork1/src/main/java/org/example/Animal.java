package org.example;

import javax.swing.plaf.PanelUI;

public class Animal
{
    private String name;
    private int age;
    private String color;
    private int run;
    private int swim;
    private String voice;
    private static int count;

    public Animal(String name,int age,String color,int run,int swim)
    {
        this.name = name;
        this.age = age;
        this.color = color;
        this.run = run;
        this.swim = swim;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int Age)
    {
        this.age = age;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getRun()
    {
        return run;
    }
    public void setRun(int Run)
    {
        this.run = run;
    }
    public int getSwim()
    {
        return swim;
    }
    public void setSwim(int Swim)
    {
        this.swim = swim;
    }
    public void run(int distance)
    {
        if(run>=distance)
        {
            System.out.println(this.name + " успешно пробежал " + distance);
        }
        else
        {
            System.out.println(this.name + " не пробежал " + distance);
        }
    }
    public void swim(int distance)
    {
        if(swim>=distance)
        {
            System.out.println(this.name + " успшно проплыл " + distance);
        }
        else
        {
            System.out.println(this.name + " не проплыл " + distance);
        }
    }



}
