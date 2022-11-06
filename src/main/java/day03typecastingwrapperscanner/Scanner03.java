package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // example:kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaz

        Scanner input = new Scanner(System.in);

        System.out.println("dikdortgenin enini giriniz...");
        int en = input.nextInt();
        System.out.println("dikdortgenin uzun kenarini giriniz....");
        int boy = input.nextInt();
        System.out.println("alan " + en*boy);
        System.out.println("cevre " + 2*(en+boy));

    }

}
