package show.jojo;

public class Villain 
{
    public String name = "";
    public int age = 0;
    public boolean hasStand = false;
    public boolean isImmortal = false;
    public boolean isVampire = false;
    public int attackRoll = 0;
    public int wins = 0;

    public Villain() 
    {

    }

    public Villain(String name, int age, boolean hasStand, boolean isImmortal, boolean isVampire)
    {
        this.name = name;
        this.age = age;
        this.hasStand = hasStand;
        this.isImmortal = isImmortal;
        this.isVampire = isVampire;
    }
}
