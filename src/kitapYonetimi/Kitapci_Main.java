package kitapYonetimi;

import java.util.Scanner;

public class Kitapci_Main {
    public static void main(String[] args) {

        /*
         * ==================== PROJE==============================
         * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
         * baslayinca menu isminde bir method calissin
         * 1-kitap ekle
         * 2-numara ile kitap goruntule
         * 3-bilgi ile kitap goruntule
         * 4-numara ile kitap sil
         * 5-tum kitaplari listele
         * 6-cikis
         ************************************
         * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
         * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
         * olmali yani bir list'te tutmamiz gerek
         * 2-kitap numarasi 1000'den
         * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
         * count=1000; menu isminde bir method olusturmaliyim,
         * 3-kitap ekle diye bir
         * method olusturmliyim,bu method farkli bir classda
         * 4-kullanicidn kitap adi
         * yazar adi ve fiyat bilgileri istenmeli
         */
        // Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();

        Menu();

    }
    public static void Menu() {
        System.out.println("Aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-Kitap ekle\r\n"
                + "     2-Numara ile kitap goruntule\r\n"
                + "     3-bilgi ile kitap goruntule\r\n"
                + "     4-numara ile kitap sil\r\n"
                + "     5-tum kitaplari listele\r\n"
                + "     0-cikis");
        Scanner scan = new Scanner(System.in);
        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();



            switch (secilenIslem) {
                case 1:
                    scan.nextLine();
                    KitapEkle.kitapEkle();
                    break;
                case 2:
                    scan.nextLine();
                    NumaraIleKitapGoruntule.numaraIleKitapGoruntule();
                    break;
                case 3:
                    scan.nextLine();
                    BilgiIleKitapGoruntule.bilgiIleKitapGoruntule();
                    break;
                case 4:
                    scan.nextLine();
                    NumaraIleKitapSil.numaraIleKitapSil();

                    Menu();
                    break;


                case 5:
                    scan.nextLine();
                    TumKitaplariListele.kitapListesi();

                    break;
                    case 0:
                    scan.nextLine();
                    Cikis.cikis();
                    break;
                default:
                    System.out.println("lutfen gecerli bir islem secin");
                    Kitapci_Main.Menu();
                    break;
            }

        }
    }



