package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public  int fiyat = 20000;

    public static void main(String[] args) {

        // object nasil olusturulur
        //1 class ismini yaziniz 2 objeye isim ver 3 =   4 new    5class ismini parantezle kullan
                      Car          myHonda           =      new                 Car();
       System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obj = new MethodCreation();
    }

    public  void hareketEt (){

        System.out.println("Honda guzel hareket eder....");
    }

    public  void dur(){
        System.out.println("Honda guvenli durur...");
    }




}
