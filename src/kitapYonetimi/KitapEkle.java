package kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapEkle {
    public static int count=1000;
    public static List<EklenenKitaplar> kitaplar = new ArrayList<>();
    public static List<EklenenKitaplar> kitapEkle() {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Lutfen eklemek istediginiz kitap icin bilgiler giriniz : \n iptal icin : \"0\" basiniz");
            System.out.print("Kitap Ismi : ");
            String kitapIsmi = scan.nextLine();
            System.out.println();

            // String a = scan.nextLine(); //dummy

           // String a = scan.nextLine(); //dummy

            if (kitapIsmi.equals("0")) {
                System.out.println("Iptal islemi gerceklesti.. ");
                flag=false;
                break;
            }

            // String a = scan.nextLine(); // DUMMY

           // String a = scan.nextLine(); // DUMMY

            System.out.print("Yazar Ismi : ");
            String yazarIsmi = scan.nextLine();
            System.out.println();
            System.out.print("Kitap ucreti : ");
            int kitapUcreti= scan.nextInt();

            EklenenKitaplar eklenenKitap =new EklenenKitaplar(count,kitapIsmi,yazarIsmi,kitapUcreti);
            kitaplar.add(eklenenKitap);
            System.out.println("Kitap ekleme isleminiz basariyla gerceklesti");
            count++;

            Kitapci_Main.Menu();

        }while (flag==true);

        return kitaplar;

    }


}