
package proje;


public class Uye {

   
    private String plaka;
    private String adsoyad;
    private String email;
    private String uyelikturu;
    private String parkyeri;
    private String tutar;
    
    public Uye(String plaka, String adsoyad, String email, String uyelikturu, String parkyeri, String tutar) {
        this.plaka = plaka;
        this.adsoyad = adsoyad;
        this.email = email;
        this.uyelikturu = uyelikturu;
        this.parkyeri = parkyeri;
        this.tutar = tutar;
    }

    
    public String getPlaka() {
        return plaka;
    }

    
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    
    public String getAdsoyad() {
        return adsoyad;
    }

    
    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getUyelikturu() {
        return uyelikturu;
    }

    
    public void setUyelikturu(String uyelikturu) {
        this.uyelikturu = uyelikturu;
    }

    
    public String getParkyeri() {
        return parkyeri;
    }

    
    public void setParkyeri(String parkyeri) {
        this.parkyeri = parkyeri;
    }

    
    public String getTutar() {
        return tutar;
    }

    
    public void setTutar(String tutar) {
        this.tutar = tutar;
    }
    
    
}
