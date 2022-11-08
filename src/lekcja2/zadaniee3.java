package lekcja2;

import java.util.Scanner;

public class zadaniee3 {



    public static void main(String[] args) {

            Scanner klawiatura = new Scanner(System.in);


            double waga;

            System.out.println("Podaj wage w kg:");
            waga = klawiatura.nextDouble();

            double wzrost;

            System.out.println("Podaj wzrost w Metrach:");
            wzrost = klawiatura.nextDouble();


            double wzrost2;
            wzrost2 = 2*wzrost;

            double BMI;
            BMI = waga / wzrost2;

            System.out.println("twoje BMI wynosi: "+ BMI);



        }
    }

