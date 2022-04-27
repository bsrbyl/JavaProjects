package kitapYonetimi;

import java.util.Scanner;

public class NumaraIleKitapGoruntule {

    public static void numaraIleKitapGoruntule(){



       boolean flag=true;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen goruntulemek istediginiz kitap no giriniz : ");
            int kitapNumarasi=scan.nextInt();
            boolean ktpVarMi=false;
            if (kitapNumarasi<1000){
                System.out.println("gecerli bir numara giriniz(1000'den buyuk)");
                ktpVarMi=false;
                break;
            }
            for (EklenenKitaplar ktp : KitapEkle.kitaplar) {
                if (ktp.kitapNo == kitapNumarasi) {
                    System.out.println("Kitap no : " + ktp.kitapNo + " Kitap adi: " +
                            ktp.kitapAdi + " Yazar adi : " + ktp.yazarAdi + " fiyat : " + ktp.kitapFiyati);
                    ktpVarMi=true;

                }

            }if (ktpVarMi==false){
                System.out.println("aradiginiz numara ile kitap bulunamadi tekrar deneyiniz");

            }
            Kitapci_Main.Menu();
        }while(flag==true);



    }

}



