
package proje;

import java.util.Date;


public class Kayit {
    private int id;
    private String adsoyad;
    private String plaka;
    private String giristarihi;
    private String cikistarihi;
    private String tur;
    private String parkyeri;
    private int tutar;
    private boolean durum;

    public Kayit(int id, String adsoyad, String plaka, String giristarihi, String cikistarihi,String tur, String parkyeri, int tutar, boolean durum) {
        this.id = id;
        this.adsoyad = adsoyad;
        this.plaka = plaka;
        this.giristarihi = giristarihi;
        this.cikistarihi = cikistarihi;
        this.tur = tur;
        this.parkyeri = parkyeri;
        this.tutar = tutar;
        this.durum = durum;
    }


    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

   
    public String getAdsoyad() {
        return adsoyad;
    }

    
    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    
    public String getPlaka() {
        return plaka;
    }

    
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    
    public String getGiristarihi() {
        return giristarihi;
    }

    
    public void setGiristarihi(String giristarihi) {
        this.giristarihi = giristarihi;
    }


    
    public String getCikistarihi() {
        return cikistarihi;
    }

    
    public void setCikistarihi(String cikistarihi) {
        this.cikistarihi = cikistarihi;
    }

  
    public String getParkyeri() {
        return parkyeri;
    }

    
    public void setParkyeri(String parkyeri) {
        this.parkyeri = parkyeri;
    }

    
    public int getTutar() {
        return tutar;
    }

    
    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    
    public boolean isDurum() {
        return durum;
    }

    
    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
    
    
    
}
