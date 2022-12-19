@Table(title = "Dogs")
public class Dog
{
    @Column
    int age;
    @Column
    String name;
    @Column
    String breed;
    int field;
    int rendel;
    public  Dog(int age, String name, String breed, int field, int rendel)
    {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.field = field;
        this.rendel = rendel;
    }
    public int getAge()
    {
        return age;
    }
    public  String getName()
    {
        return  name;
    }
    public  String getBreed()
    {
        return  breed;
    }
    public  int getField()
    {
        return  field;
    }
    public  int getRendel()
    {
        return  rendel;
    }


}
