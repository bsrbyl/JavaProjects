package okulYonetimi;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{

    static Scanner scan = new Scanner(System.in);

    public static void giris() {
        AnaMenu object = new AnaMenu();

        System.out.println("Okul Yönetimi");
        System.out.println("lütfen seçiminizi yapınız :");
        System.out.println("ogrenci islemleri-1 \n Ogretmen Işlemleri-2\n Cıkıs-Q");

        String scm = scan.next().toUpperCase();

        switch(scm){
            case "1":
                object.ogrenciIslemleri();
                break;
            case "2":
                object.ogretmenIslemleri();
                break;
            case "Q":
                object.cikis();
                break;
            default :
                System.out.println("lütfen geçerli bir seçim yapınız");
                giris();
        }
    }


    @Override
    public void ogrenciIslemleri() {
        Islemler.IslemlerMenu(1);
    }

    @Override
    public void ogretmenIslemleri() {
        Islemler.IslemlerMenu(2);
    }

    @Override
    public void cikis() {

    }
}
