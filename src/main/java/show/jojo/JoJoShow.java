package show.jojo;

import java.util.ArrayList;
import java.util.Random;

public class JoJoShow 
{

    public String status;

    public JoJoShow()
    {

    }

    public static void StartShow()
    {
        //Initiate random 
        Random random = new Random();

        //Variables used for random attack roles
        int minValue = 30;
        int maxValue = 100;
        
        //Variable for number of fights
        int nFights = 30;

        //Line spaces for readability
        readability();

        //Initiating Joestars
        ArrayList<Joestar> lJoestars = new ArrayList<>();
        lJoestars.add(new Joestar("Josuke Higashkita", 16, false, true, false));
        lJoestars.add(new Joestar("Johnny Joestar", 19, false, true, true));
        lJoestars.add(new Joestar("Jonathan Joestar", 18, true, false, false));

        //For loop to display Joestars' age
        for(Joestar js:lJoestars)
        {
            
            if (js.age >= 18 && js.name.contains("Joestar"))
            {
                System.out.println(js.name + " is an adult Joestar");
            }
            else 
            {
                System.out.println(js.name + " cannot enroll in the race");
            }
            
            readability();
            
        }

        //Initiate arraylist of villains
        ArrayList<Villain> lVillains = new ArrayList<>();
        lVillains.add(new Villain("Dio Brando", 123, true, true, true));
        lVillains.add(new Villain("Kars", 102000, false, true, false));
        lVillains.add(new Villain("Funny Valentine", 49, true, false, false));

        //Display villains' voter eligability 
        for(Villain v:lVillains) 
        {
            if (v.age >= 118)
            {
                System.out.println(v.name + " is able to vote");
            }
            else 
            {
                System.out.println(v.name + " cannot vote");
            }

            readability();
        }

        //Let's attack!
        for(int i = 0; i < nFights; i++)
        {

            Joestar js = lJoestars.get(random.nextInt(3));
            Villain vn = lVillains.get(random.nextInt(2));

            js.attackRoll = random.nextInt((maxValue - minValue) + 1) + minValue;
            vn.attackRoll = random.nextInt((maxValue - minValue) + 1) + minValue;

            if(js.attackRoll >= vn.attackRoll)
            {
                js.wins++;
                System.out.println(js.name + " retired " + vn.name);
            }
            else 
            {
                vn.wins++;
                System.out.println(vn.name + " retired " + js.name);
            }

            //readability();
        }

        readability();

        for(Joestar js : lJoestars)
        {
            System.out.println(js.name + " has won " + js.wins + " matches.");
        }

        for(Villain vn : lVillains)
        {
            System.out.println(vn.name + " has won " + vn.wins + " matches.");
        }

        readability();
        
    }//End of StartShow Function


    private static void readability()
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println(" ");
        }
    }
}


