package day03typecastingwrapperscanner;

public class WrapperClass01 {


    public static void main(String[] args) {

/*

java primitivlere method ekleyerek yeni bir yapi olusturdu bu yapiya "wrapper class" denir
        aslinda wrapper classlarda non primitivdir

        Primitive Wrapper
        byte ==>Byte
        short==>Short
        int==>> Integer
        long ==> Long
        float==>Float
        double==)Double
        boolean==>Boolean
        char  ==>Character
 */
byte primitiveByte = 12; // java burda metot vermez "wrapperByte." yaz bekle metot onermez
                        // cunku prpmtiveler metot icermez deger icerir

 Byte wrapperByte = 12; // wrapperByte. yazarsak bir cok method goruruz


        // example1 : byte data tipinin en kucuk ve en buyuk degerini ekrana yazdiriniz

        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127


        // example2 : short int long data tiplerinin en kucuk en buyuk degerlriniekrana yazdirimn


        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);

        // primitivler nasil wrapperlere cevrilir autoboxing

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        // wrapperler i primitivlere cevirme  (unboxing)

     Character w1 = 's';
     char primitiveW1 = w1;

    }
}
