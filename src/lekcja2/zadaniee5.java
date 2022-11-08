package lekcja2;

import java.util.Scanner;

public class zadaniee5 {


    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj mase obieku:");
        double masa= klawiatura.nextDouble();

        double ciezar;

        double zmienna = 9.8;

        ciezar = masa * zmienna;

        if(ciezar >= 1000)
        {
            System.out.println("obiekt jest za ciężki");
        }
        else if (ciezar < 10)
        {
        System.out.println("Obiekt jest za lekki:");
        }
        else
        {
            System.out.println("obiekt ma prawidłową mase");
        }




    }


    }
