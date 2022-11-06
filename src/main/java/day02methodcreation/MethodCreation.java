package day02methodcreation;

public class MethodCreation {

    // main method icinde kullancaginiz her sey "static" olmaliidr
    public static void main(String[] args) {

      System.out.println(toplamaYap(1.2, 5));

      System.out.println(ucSayiyiCarp(2,3,4));

       System.out.println(ilkIkiyiToplaUcuncuyuCarp(2, 6, 8));

       // sout yazip enter a basin System.out.println otomatik gelir
        // ekrana bir sey yazdirmak icin 1 System.out.println() >>>> satirbasi yapar
        //                               2 System.out.print() >>>> satirbasi yapmaz




    }
// example 1 : toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //example 2: uc sayiyi birbiriyle carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a , double b ,double c){
        return a*b*c;
    }

    // example3 uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup sonucu ekrana yansitiniz


    public static double ilkIkiyiToplaUcuncuyuCarp(double a ,double b, double c ){

        return (a+b) * c;
    }

}
