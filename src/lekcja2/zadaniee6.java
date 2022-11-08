package lekcja2;

import java.util.Scanner;

public class zadaniee6 {


    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int sekundy;

        System.out.println("wprowadz liczbe sekund:");
        sekundy= klawiatura.nextInt();

        int minuty;
        minuty = sekundy / 60;

        int godziny;
        godziny = sekundy / 3600;

        int dni;
        dni = sekundy / 86400;

        if (sekundy<60)
        {
            System.out.println("Sekundy:" + sekundy);
        }

        if (sekundy >60 && sekundy < 3600);
        {
            System.out.println("minuty:" + minuty);
        }

        if (sekundy >= 3600 && sekundy <= 86400);
        {
            System.out.println("godziny:" + godziny);
        }

        if(sekundy >86400)
        {
            System.out.println("Dni:" + dni);
        }



    }
}