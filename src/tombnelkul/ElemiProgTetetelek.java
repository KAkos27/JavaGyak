package tombnelkul;

import java.util.Scanner;

public class ElemiProgTetetelek {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = -1;
        while (n < 0) {
            System.out.print("N= ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i < n + 1; i++) {
            ossz += i;
        }

        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);

        int db = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                db++;
            }
        }
        System.out.printf("10-től 100-ig %d db páros szám van\n", db);

        final int VEGE = -1;
        db = 0;
        int min = Integer.MAX_VALUE;
        int szam = 0;
        System.out.print(VEGE + "-ra/re kilép: ");
        while ((szam = sc.nextInt()) != VEGE){
            if (szam < min) {
                min = szam;
            }
            db++;
        }
        System.out.printf("%d db számból a legkisebb: %d\n", db, min);

    }

}
