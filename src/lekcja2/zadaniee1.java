package lekcja2;

import java.util.Scanner;

public class zadaniee1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        double liczba;

        System.out.println("Podaj  dzien miesiąca:");
        int NumerDnia = klawiatura.nextInt();


        System.out.println("Podaj miesiąc:");
        int NumerMiiesiąca = klawiatura.nextInt();


        System.out.println("Podaj dwie ostatnie cyfry roku:");
        double dwieOstatniecyfry = klawiatura.nextDouble();


        double info1 = NumerDnia*NumerMiiesiąca;

        if(info1 == dwieOstatniecyfry)
        {
            System.out.println("Data jest magiczna");
        }

        if(info1 != dwieOstatniecyfry)
        {
            System.out.println("Data nie jest magiczna");
        }
    }

    }

