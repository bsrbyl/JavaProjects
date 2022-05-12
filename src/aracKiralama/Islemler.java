package aracKiralama;

import java.util.*;

public class Islemler implements aracYonetimi {

    static Scanner scanner = new Scanner(System.in);
    public static final String BLACK = "\u001B[30m";
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    int aracId; // Methodlar seçilen araca göre işlem yapıyor. id'yi seçtikten sonra class level'da tanımlarsak sorunsuz
                //    bir şekilde tekrar kullanabiliriz

    int count;  //sistem başlatılırken default araç listesini sisteme kaydetmemiz gerekiyor. sisteme ilk girişte sadece
                // 1 defa default araç listesi tanımlansın diye konulan flag

    int kiralamaCount;  // araç kiralama işlemleri yapılmadan müşteriye teslimi engellemek için oluşturuldu

    double toplamOdenecek;  // toplam fiyat hesaplandıktan sonra ödeme methodunda da kullanabilmek için oluşturuldu

    static int deger = 1000; // unique id'ler oluşturmak için oluşturuldu

    Map<Integer, AracOzellikleri> arac = new HashMap<>();
    Map<Integer, MusteriBilgileri> musteri = new HashMap<>();
    Map<Integer, KiralamaBilgileri> kiralama = new HashMap<>();

    public void secim() {

        System.out.println("========================== AUTOKING GALERI YONETICI PANELI =======================\r\n"

                + "   ____________________             ____________________    \n"
                + "   | 1-ARAC LISTELEME  |            | 2-ARAC KIRALAMA   |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________             ____________________    \n"
                + "   | 3-MUSTERIYE TESLIM |            | 4-ARAC CIKARMA    |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   _____________________            _____________________   \n"
                + "   | 5- ARAÇ EKLEME    |            | 6- CIKIS          |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  " + B);

        System.out.print("ISLEM SECİNİZ : ");

        /*
        seçim ekranından direkt 3'e basılırsa işlem yaptırılmayacak çünkü müşteri yok
        1- tüm araçlar listelenecek
        2- araç kiralamak için seçilen aracın id si istenece
           kiralama tarihleri istenecek
           fiyat çıkartılacak
           müşteri fiyatı kabul ederse müşterinin kaydı yapılacak
           ödeme alınacak
        3- (2. aşama 3'ün görevlerini yapıyor o yüzden fonksiyonsuz kaldı?)
        4- Araç listesinden araç çıkarılıyor
        5- yeni araç ekleniyor
        6- sistemden çıkış yapılıyor
         */

        //defaultAraclar methodunu sadece bir defa ilk girişte çalıştırmak için oluşturuldu.
        //Runner class'ında çağırlabilirdi bununla uğraşmamak için
        if (count == 0) {
            defaultAraclar();
            count++;
        }


        int sec = TryCatch01.intGirisi();

        switch (sec) {
            case 1:
                aracListeleme();
                TryCatch01.threadSleep(1000);
                secim();
                break;
            case 2:
                aracKirala();
                TryCatch01.threadSleep(1000);

                kiralamaCount++;
                break;
            case 3:
                if (kiralamaCount == 0) {
                    System.out.println("Araç kiralama menüsü doldurulmadan müşteriye teslim menüsü kullanılamaz!\n" +
                            "Ana Menüye yönlendiriliyorsunuz");
                    TryCatch01.threadSleep(1000);
                    secim();
                } else {
                    aracTalebi();
                }
                break;
            case 4:
                aracCikarma();
                break;
            case 5:
                aracEkleme();
                secim();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                secim();

        }

    }

    @Override
    public void aracKirala() {



    }

    @Override
    public void aracTalebi() { //tarihler set methodunun içerisinde alınmamalı !!!


    }

    @Override
    public void kiralananAracBilgileri() {


    }

    @Override
    public void musteriKaydi() {

    }


    @Override
    public void odeme(int id) {


    }

    @Override
    public void aracTeslim() {

    }


    @Override
    public void aracEkleme() {



    }


    @Override
    public void aracListeleme() {


    }


    @Override
    public void cikis() {

    }

    @Override
    public void aracCikarma() {



    }

    public void aracYazdirma(Map<Integer, AracOzellikleri> arac) {


    }

    public static void banner() {
        System.out.println(B + "ID\t\tMODEL\t\t\tMARKA\t\tYAKIT\t\t\tVITES\t\t\tKOLTUKSAYISI\tUCRET\tMUSAITLIKDURUMU" +
                "\n============================================================================================================");

    }

    @Override
    public void defaultAraclar() {



    }

}
