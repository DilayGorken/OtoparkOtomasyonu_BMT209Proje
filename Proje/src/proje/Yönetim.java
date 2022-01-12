
package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Yönetim {
    
     Connection con = null;
     Statement statement = null;
     PreparedStatement preparedStatement;
    public Yönetim()
    {
        
    }
    
    public Boolean yonetimGiris(String kullaniciadi,String sifre)
    {
        String sorgu = "Select * from yönetim where kullaniciadi = ? and sifre = ?";
        boolean isaretci = false;
         try {
             preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setString(1, kullaniciadi);
             preparedStatement.setString(2, sifre);
             ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                
                isaretci = true;
            }
         } catch (SQLException ex) {
             Logger.getLogger(Yönetim.class.getName()).log(Level.SEVERE, null, ex);
         }
        return isaretci;
    }
    public String tarihAl()
    {
        Date simdikizaman = new Date();
        DateFormat tarihformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tarih = tarihformat.format(simdikizaman);
        return tarih;
    }
    public String giristarihiGetir(String plaka)
    {
        String giristarihi= "";
        String sorgu = "Select giristarihi From kayit where plaka = ? and durum = 1";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, plaka);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                giristarihi = rs.getString("giristarihi");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Yönetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return giristarihi;
    }
    
    public Long tarihFarki(String giristarihi,String cikistarihi)
    {
        SimpleDateFormat tarihformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long dakika, saat,gun,toplamdakika = 0;
        
        
        try{
        Date tarih1 = tarihformat.parse(giristarihi);
        Date tarih2 = tarihformat.parse(cikistarihi);
        
        long zamanfarki = tarih2.getTime() - tarih1.getTime();
        
         dakika = (zamanfarki / (1000 * 60))%60;
        
         saat = (zamanfarki /((1000 *60 *60))%24)*60;
        
         gun = (zamanfarki /((1000*60*60*24))%365)*3600;
        toplamdakika = dakika + saat + gun;
        } catch(ParseException e){
            e.printStackTrace();
        }
        return toplamdakika;
    }
    
    
    
    public String randomParkyeri()
    {
        Random rnd = new Random();
        String kat = "";
        int rndharfsayi = rnd.nextInt(4);
        if(rndharfsayi == 0)
        {
            kat="a";
        }
        else if (rndharfsayi == 1)
        {
            kat = "b";
        }
        else if (rndharfsayi == 2)
        {
            kat = "c";
        }
        else if (rndharfsayi == 3)
        {
            kat = "d";
        }
        int rndsayi = 1 + rnd.nextInt(11);
        String numara = Integer.toString(rndsayi);
        String rndparkyeri = kat + numara;  
        return rndparkyeri;
    }
    
    public Boolean aracKontrol(String plaka)//Bu method aracın içeride olup olmadığını kontrol etmek için 
    {
        Boolean isaretci = false;
        String sorgu = "Select * From kayit where plaka = ? and durum = 1";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, plaka);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                isaretci = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Yönetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isaretci;
    }
    
    public double misafirTutarhesapla(long dakika){
         double tutar=0;
         
         tutar = dakika * 0.33;
        
        return tutar;
    }
    
    public double uyeTutarhesapla(String uyelikturu,long dakika)
    {
        double tutar=0;
        if(uyelikturu == "Bronze")
        {
            tutar = dakika *0.25;
        }
        else if (uyelikturu == "Silver")
        {
            tutar = dakika *0.20;
        }
        else if (uyelikturu == "Gold")
        {
            tutar = dakika *0.16;
        }
        return tutar;
        
    }
    public Boolean parkyeriSorgu(String parkyeritext,String sorgu)
    {
         Boolean isaretci=false;
         try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, parkyeritext);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                isaretci = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isaretci;
    }
    
    
    
    public void baglanti()
    {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");   
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        try {
            con = (Connection) DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");  
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }
}
