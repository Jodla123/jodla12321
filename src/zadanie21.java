import java.util.Scanner;
public class zadanie21  {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double kwota;

        System.out.println("ile pieniedzy chcesz płacic: ");
        kwota = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double oprocentowanie1;

        System.out.println("oprocentowanie: ");
        oprocentowanie1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double oprocentowanie;
        oprocentowanie = oprocentowanie1/100;

        Double liczbaodsetek;
        System.out.println("jak wiele razy mają doliczane być odsetkii: ");
        liczbaodsetek = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double lata;
        System.out.println("czas (w latach): ");
        lata = klawiatura.nextDouble();
        klawiatura.nextLine();

        double nt = lata * liczbaodsetek;
        double potega = Math.pow(1 + oprocentowanie / lata, nt);
        double wynik;
        wynik = kwota * potega;

        System.out.println("kwota jaką deponujesz: " + kwota);
        System.out.println("kwota rocznej stopy oprocentowania: " + oprocentowanie);
        System.out.println("ile razy w ciągu roku odsetki są naliczane: " + liczbaodsetek);
        System.out.println("liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki: " + kwota);
        System.out.println("kwota po upływie lat: " + wynik);
    };
};