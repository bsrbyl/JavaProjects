package kitapYonetimi;

public class EklenenKitaplar {

    public int kitapNo;
    public String kitapAdi;
    public String yazarAdi;
    public int kitapFiyati;


    public EklenenKitaplar(){

    }


    public EklenenKitaplar(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyati) {
        this.kitapNo = KitapEkle.count;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
    }
}
