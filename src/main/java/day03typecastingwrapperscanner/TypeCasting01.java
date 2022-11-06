package day03typecastingwrapperscanner;

public class TypeCasting01 {

     // type casting: bir numerik data tipini diger numerik data tipine cevirmke demektir.
     //  byte<short<int<long<fload<double
     // Auto widening: kucuk data tipini buyuk data tipine cevirmeye denir
     // Explicit narrowing: buyukten kucuge cevirmek

    public static void main(String[] args) {

         byte age = 23;
         int newAge = age;

         long population = 1234;
         int newpopulation =(int)population;

         // example1 : shortu doubleye ceviren kodu yaziniz
         short kisi = 50;
         double newKisi = kisi;

        // example2: float i byte yapan kodu yaz
        float fidan = 96.2F;
        byte newFidan =(byte)fidan;

        System.out.println(newFidan);//96 >> java cevirirken ondalik kismi siler



        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber); // 3 return etti cunku byte -128den127 ye idi yani 256 eleman ve 515i256 ya boldu mod aldi sonuc 3 yapti


        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);//-2 retun etti cunku 510/256yapti yani mod256 yapti
     }

}
