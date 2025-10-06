import java.util.Random;

public class Hund
{
    public static void Hunde()
    {
        String hund;


        hund = "hunde";

        Random randomantalHunde = new Random();
        int antalHunde = randomantalHunde.nextInt(100) + 1;

        System.out.println("Der er " + antalHunde +" " +hund+ " " +  "i haven");


    }

}
