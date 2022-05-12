package aracKiralama;

import static aracKiralama.Islemler.*;

public class AracOzellikleri {

    private int id ;
    private String model="Model Girilmedi";
    private String marka="Marka Girilmedi";
    private String yakit="Yakıt Girilmedi";
    private String vites="Vites Girilmedi";
    private int koltukSayisi;
    private double ucret;
    private String musaitlikDurumu ="Bilgi Girilmedi";

    public AracOzellikleri(int id, String model, String marka, String yakit, String vites, int koltukSayisi, double ucret, String musaitlikDurumu) {
        this.id=id;
        this.model = model;
        this.marka = marka;
        this.yakit = yakit;
        this.vites = vites;
        this.koltukSayisi = koltukSayisi;
        this.ucret = ucret;
        this.musaitlikDurumu = musaitlikDurumu;

    }

    public AracOzellikleri(){
    }

    public String getMusaitlikDurumu() {
        return musaitlikDurumu;
    }

    public void setMusaitlikDurumu(String musaitlikDurumu) {
        this.musaitlikDurumu = musaitlikDurumu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Arac Ozellikleri: " +
                " ID= " + id +
                ", MODEL= " + model.toUpperCase()  +
                ", MARKA= " + marka.toUpperCase() +
                ", YAKIT= " + yakit.toUpperCase() +
                ", VITES= " + vites.toUpperCase() +
                ", KOLTUK NO= " + koltukSayisi +
                ", FIYAT= " + ucret ;
    }
}
