public class zadanie5 {

    public static void main(String[] args) {


        int pomieszczenie1 ;
        int pomieszczenie2 ;
        int pomieszczenie3 ;
        int pomieszczenie4 ;

        int wymiar1 = 3;
        int wymiar2 = 4;

        int wymiar3 = 2;
        int wymiar4 = 3;

        int wymiar5 = 3;
        int wymiar6 = 4;

        int wymiar7 = 2;
        int wymiar8 = 2;


        pomieszczenie1 = wymiar1 * wymiar2;
        pomieszczenie2 = wymiar3 * wymiar4;
        pomieszczenie3 = wymiar4 * wymiar6;
        pomieszczenie4 = wymiar7 * wymiar8;


        System.out.println("powierzchnia pomiszczenia 1: " +pomieszczenie1);
        System.out.println("powierzchnia pomiszczenia 2: " +pomieszczenie2);
        System.out.println("powierzchnia pomiszczenia 3: " +pomieszczenie3);
        System.out.println("powierzchnia pomiszczenia 4: " +pomieszczenie4);

        int powierzchniabudynku;

        powierzchniabudynku = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("powierzchnia calkowita wynosi: " + powierzchniabudynku);
    }
}
