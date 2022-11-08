package lekcja2;

import java.util.Scanner;

public class zadaniee8 {


    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double pakiet = 99;
        double cena;
        double sztuki;

        System.out.println("podale liczbe kupioych pakietów:");
        pakiet = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("podale liczbe sztuk:");
        sztuki = klawiatura.nextDouble();
        klawiatura.nextLine();

        if(sztuki >10 && sztuki <19)
        {
            System.out.println("rabat wynosi 20%:");
            pakiet = cena * sztuki * 0.8;
            System.out.println("cena z rabatem wynosi:" + cena);
        }

        if(sztuki >20 && sztuki <49)
        {
            System.out.println("rabat wynosi 30%:");
            pakiet = cena * sztuki * 0.8;
            System.out.println("cena z rabatem wynosi:" + cena);
        }

        if(sztuki >50 && sztuki <99)
        {
            System.out.println("rabat wynosi 40%:");
            pakiet = cena * sztuki * 0.8;
            System.out.println("cena z rabatem wynosi:" + cena);
        }

        if(sztuki >100)
        {
            System.out.println("rabat wynosi 50%:");
            pakiet = cena * sztuki * 0.8;
            System.out.println("cena z rabatem wynosi:" + cena);
        }






    }
}