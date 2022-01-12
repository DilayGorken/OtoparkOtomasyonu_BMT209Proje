
package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.sql.ResultSet;
import java.util.ArrayList;



public class Misafirdb extends Yönetim {
    
    
    
    
   /* public Boolean parkyeriKontrol(String parkyeri)//Park yerinin dolu olup olmadığını anlamak için 
    {
        boolean isaretci = false;
        String sorgu = "Select * From kayit where parkyeri = ? and durum = 1";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, parkyeri);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                isaretci = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Misafirdb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return isaretci;
    }*/
    
    
    @Override
    public Boolean parkyeriSorgu(String parkyeri, String sorgu)
    {
        return super.parkyeriSorgu(parkyeri, sorgu); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void misafirGirisyap(String plaka, String adsoyad, String giristarihi, String parkyeri, boolean durum) {
        String sorgu = "Insert Into kayit (plaka,adsoyad,giristarihi,tur,parkyeri,durum) VALUES(?,?,?,?,?,?)";
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, plaka);
            preparedStatement.setString(2, adsoyad);
            preparedStatement.setString(3, giristarihi);
            preparedStatement.setString(4,"misafir");
            preparedStatement.setString(5, parkyeri);
            preparedStatement.setBoolean(6, durum);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Misafirdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void misafirCikisyap(String plaka,String cikistarihi,double tutar)
    {
        String sorgu =  "Update kayit set cikistarihi = ?, tutar = ? ,durum = 0 where plaka = ? and durum = 1";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,  cikistarihi);
            preparedStatement.setDouble(2, tutar);
            preparedStatement.setString(3, plaka);
            
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Misafirdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Kayit> kayitlariGetir() {
        
        ArrayList<Kayit> cikti = new ArrayList<Kayit>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From kayit";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String plaka = rs.getString("plaka");
                String adsoyad = rs.getString("adsoyad");
                String giristarihi = rs.getString("giristarihi");
                String cikistarihi  = rs.getString("cikistarihi");
                String tur = rs.getString("tur");
                String parkyeri = rs.getString("parkyeri");
                int tutar = rs.getInt("tutar");
                boolean durum = rs.getBoolean("durum");
                
                
                cikti.add(new Kayit(id,plaka, adsoyad, giristarihi, cikistarihi, tur,parkyeri,tutar, durum));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Yönetim.class.getName()).log(Level.SEVERE, null, ex);
            return null;   
        }  
        return cikti;
    }
    
    public Misafirdb()
    {
        baglanti();
    }
}
