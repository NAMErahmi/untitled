package day03typecastingwrapperscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // example1: sayilari kullanicidan alan ve toplama islemi yapan kodu yaz
        // 1. adim scanner classdan object olustur

        Scanner input = new Scanner(System.in);

        // 2. adim : kullaniciya ne yapacagini soyle
        System.out.println("ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);


    }



}
