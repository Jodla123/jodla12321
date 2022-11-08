package lekcja2;

import java.util.Scanner;

public class zadaniee4 {


    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        double wynik1;

        System.out.println("Podaj wynik pierwszego testu:");
        wynik1 = klawiatura.nextDouble();

        double wynik2;

        System.out.println("Podaj podaj wynik drugiego testu:");
        wynik2 = klawiatura.nextDouble();

        double wynik3;

        System.out.println("Podaj wynik trzeciego testu testu:");
        wynik3 = klawiatura.nextDouble();

        double wynik;
        wynik = (wynik1 + wynik2 + wynik3) / 3;

        if(wynik < 60)
        {
            System.out.println("Ocena którą dostałeś to 1");
        }
        if(wynik >=60 && wynik <69)
        {
            System.out.println("Ocena którą dostałeś to 2");
        }
        if(wynik >=70 && wynik <79)
        {
            System.out.println("Ocena którą dostałeś to 3");
        }
        if(wynik >=80 && wynik <89)
        {
            System.out.println("Ocena którą dostałeś to 4");
        }
        if(wynik >=90 && wynik <100)
        {
            System.out.println("Ocena którą dostałeś to 5");
        }

    }
}