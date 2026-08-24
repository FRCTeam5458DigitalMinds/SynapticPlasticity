package show.jojo;

public class Joestar 
{
    public String name;
    public int age = 0;
    public boolean ripple = false;
    public boolean stand = false;
    public boolean spin = false;
    public int attackRoll = 0;
    public int wins = 0;

    public Joestar() 
    {

    }

    public Joestar(String sName, int nAge)
    {
        this.name = sName;
        this.age = nAge;

    }

    public Joestar(String name, int age, boolean ripple, boolean stand, boolean spin)
    {
        this.name = name;
        this.age = age;
        this.ripple = ripple;
        this.stand = stand;
        this.spin = spin;
    }
}
