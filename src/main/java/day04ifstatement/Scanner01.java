package day04ifstatement;

    import java.util.Scanner;
    public class Scanner01 {
    public static void main(String[] args) {

        /*

    kullanicidan ilk orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz

     */

        Scanner input = new Scanner(System.in);

        // 1. yol
//
//
//        System.out.println("ilk isminizi giriniz...");
//
//        String ilkIsim = input.next(); // next() methodu kullanicidan string datasi almak icin kullanilir
//        System.out.println("orta isminizi giriniz..");
//
//        String ortaIsim = input.next();
//        System.out.println("soy isminizi giriniz..");
//
//        String soyIsim = input.next();
//        System.out.println("kimlik numaranizi giriniz...");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
//        System.out.println(kimlikNo);

        // 2. yol
/*
        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz....");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

*/

        /* next ile nextline method farki nedir
        next kullanicidan gelen stringin sadec ilk kelimesini alir
        nextline gelen string in tamamini alir

         */


        // 3.yol
        System.out.println("ilk, orta ve soy isminizi girin");
        String tamIsim = input.nextLine();

        System.out.println(tamIsim);

        System.out.println("kimlik numaranizi girin...");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);


    }

}
