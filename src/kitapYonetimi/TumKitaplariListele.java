package kitapYonetimi;

public class TumKitaplariListele {
    public static void kitapListesi(){


        System.out.println("************** KITAP LISTENIZ ************** ");
        for (EklenenKitaplar  each : KitapEkle.kitaplar
        ) {
            System.out.println("Kitap No: " +  each.kitapNo +
                    ", Kitap Adı: " + each.kitapAdi +
                    ", Yazar Adı: "+ each.yazarAdi+
                    ", Fiyatı: " + each.kitapFiyati);
        }
        Kitapci_Main.Menu();
    }
}



