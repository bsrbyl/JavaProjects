package kitapYonetimi;


import java.util.Scanner;

public class NumaraIleKitapSil {


    public static void numaraIleKitapSil() {

        boolean sil = false;


        while (sil == false) {

        while (sil==false) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen silmek istediginiz kitap numarasini giriniz :");
            int silincekKitapNo = scan.nextInt();


            for (int i = 0; i < KitapEkle.kitaplar.size(); i++) { // kitaplar KitapEkle class'inda oldugu icin
                // classIsmi.deyip kitaplari cagisiyorum
                if (silincekKitapNo == KitapEkle.kitaplar.get(i).kitapNo) {
                    KitapEkle.kitaplar.remove(KitapEkle.kitaplar.get(i));
                    System.out.println("Silme isleminiz basariyla gerceklesti");
                    sil = true;

                    break;
                } else if (silincekKitapNo != KitapEkle.kitaplar.get(i).kitapNo) {
                    System.out.println("Gecerli bir kitap no girmediniz");
                    sil = false;
                    break;


                }


            }

        }
        if (sil = false) {
            System.out.println("Gecerli bir kitap no girmediniz ");

            if (sil==false) {
                System.out.println("Gecerli bir kitap no girmediniz");
              //  sil = false;

            }

        }



        }


    }
}


