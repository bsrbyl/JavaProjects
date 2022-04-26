package okulYonetimi;

import java.util.Scanner;

public class Islemler implements IslemlerInterface {


    static Scanner scan = new Scanner(System.in);
    static int secim = 0;

    public static void IslemlerMenu(int i) {
        secim = i;
        Islemler obj = new Islemler();

        System.out.println("Lütfen seçim yapınız");
        System.out.println("ekleme-1 arama-2 listeleme-3  silme-4  anamenu-5 cıkış-6");

        int scm = TryCatches.integerGiris();               //try catch


        switch (scm) {

            case 1:
                obj.ekleme();
                IslemlerMenu(secim);
                break;
            case 2:
                obj.arama();
                IslemlerMenu(secim);
                break;
            case 3:
                obj.listeleme();
                IslemlerMenu(secim);
                break;
            case 4:
                obj.silme();
                IslemlerMenu(secim);
                break;
            case 5:
                obj.anaMenu();

                break;
            case 6:
                obj.cikis();
                IslemlerMenu(secim);
                break;
            default :
                System.out.println("lütfen geçerli bir giriş yapınız");
                IslemlerMenu(secim);

        }

}

    @Override
    public void ekleme() {
        System.out.println("kimlik numarası giriniz: ");
        String kimlikID = scan.next();
        kimlikIDKontrol(kimlikID);
        if (secim == 1) {
            ogrenciBilgiAlKaydet(kimlikID);
        } else {
            ogretmenBilgiAlKaydet(kimlikID);
        }
    }
    private  void kimlikIDKontrol(String kimlikID) {
        if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID) || Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
            System.out.println("Bu ID kayıt yapılmış");
            AnaMenu.giris();
        }
    }
    private void ogretmenBilgiAlKaydet(String kimlikID) {
        System.out.println("Sirayla giriniz : adSoyad, yas,numara, bolüm ,sicil");
        System.out.print("Ad-soyad : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.print("Yas : ");
        String yas = scan.next();
        System.out.print("Bolum : ");
        String bolum = scan.next();
        System.out.print("Sicil : ");
        String sicil = scan.next();
        Ogretmen obj = new Ogretmen(adSoyad, yas, bolum, sicil);
        Ogretmen.ogretmenListesiMap.put(kimlikID, obj);

    }

    private void ogrenciBilgiAlKaydet(String kimlikID) {
        System.out.println("Sirayla giriniz : adSoyad ,yas, numara, sinif ,giriniz");
        System.out.print("Ad-Soyad: ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.print("Yas : ");
        String yas = scan.next();
        System.out.print("Numara : ");
        String numara = scan.next();
        System.out.print("Sinif : ");
        String sinif = scan.next();
        Ogrenci obj = new Ogrenci(adSoyad, yas, numara, sinif);
        Ogrenci.ogrenciListesiMap.put(kimlikID, obj);
    }

    @Override
    public void arama() {
        System.out.println("kimlik numarası giriniz");
        String kimlikID = scan.next();
        if (secim == 1) {
            if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
                System.out.println(Ogrenci.ogrenciListesiMap.get(kimlikID));
            } else System.out.println("Kayıtlı degil");
        } else if (secim == 2) {
            if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
                System.out.println(Ogretmen.ogretmenListesiMap.get(kimlikID));
            } else System.out.println("kayıtlı degil");
        }
    }

    @Override
    public void listeleme() {
        if (secim == 1) {
            System.out.println(Ogrenci.ogrenciListesiMap);
        } else if (secim == 2) {
            System.out.println(Ogretmen.ogretmenListesiMap);
        }
    }

    @Override
    public void silme() {
        System.out.println("kimlik numarası giriniz");
        String kimlikID = scan.next();
        if (secim == 1) {
            if (Ogrenci.ogrenciListesiMap.containsKey(kimlikID)) {
                Ogrenci.ogrenciListesiMap.remove(kimlikID);
            } else System.out.println("KimlikID mevcut değil");
        } else if (secim == 2) {
            if (Ogretmen.ogretmenListesiMap.containsKey(kimlikID)) {
                Ogretmen.ogretmenListesiMap.remove(kimlikID);
            }else System.out.println("KimlikID mevcut değil");
        }
    }

    @Override
    public void anaMenu() {
        AnaMenu.giris();
    }

    @Override
    public void cikis() {
        System.out.println("Cikis islemi gerceklesti");
    }
}
