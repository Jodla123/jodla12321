import java.util.Scanner;

public class zadanie10 {

    public static void main(String[] args) {
        System.out.println("podaj cene produktu ktory chcesz kupic");
        Scanner klawiatura = new Scanner(System.in);

        double cenaproduktu;

    double podatekSta = 0.04;
    double podatekLok = 0.02;

    cenaproduktu =klawiatura.nextInt();

    double podatekSta1 = cenaproduktu + podatekSta;
    double podatekLok2 = cenaproduktu + podatekLok;
    double calaCena = cenaproduktu + (cenaproduktu + podatekLok) + (cenaproduktu + podatekSta);

    System.out.println("cena bez podatku wynosi:" + cenaproduktu);
    System.out.println("podatek stanowy jest wynosi:" + podatekSta);
    System.out.println("podatek lokalny wynosi:" + podatekLok);
    System.out.println("cena z podatkiem wynosi:" + calaCena);







    }
}