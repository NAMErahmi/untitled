package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    // scanner kullanicidan data almaya yarar kullaniciyla etkilesim saglar
    // scanner bir java clasidir kullanabilmek icin import etmek gerekir javanin util kutuphanesndedir


    public static void main(String[] args) {

        // kullanicidan data almak icin yapilmasi gerekenler
        // 1. adim scanner clasinda object olusturun

        Scanner input = new Scanner(System.in);

       //2. adim kullaniciya ne yapacagini soyle
        System.out.println("hey kullanici yasini gir");

        // 3. adim kullanicidan aldiginiz datayi bir veriablenin icine koyun
        byte age = input.nextByte();

        System.out.println("hey kullanici senin yasin " + age);

    }
}
