
package proje;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Uyedb extends Yönetim{
    
    
    
    
            
    public String uyeparkyeriGetir(String plaka)
    {
        String sorgu = "Select parkyeri from üye where plaka = ?";
        String parkyeri = "";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, plaka);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                parkyeri = rs.getString("parkyeri");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return parkyeri;
    }
    public String uyelikturuGetir(String plaka)
    {
        String sorgu = "Select uyelikturu from üye where plaka = ?";
        String uyelikturu = "";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, plaka);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                uyelikturu = rs.getString("uyelikturu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uyelikturu;
        
    }
            
    public void uyeGirisyap(String plaka,String adsoyad,String giristarihi,String tur,String parkyeri,boolean durum)
    {
        String sorgu = "Insert Into kayit (plaka,adsoyad,giristarihi,tur,parkyeri,durum) VALUES(?,?,?,?,?,?)";
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, plaka);
            preparedStatement.setString(2, adsoyad);
            preparedStatement.setString(3, giristarihi);
            preparedStatement.setString(4,tur);
            preparedStatement.setString(5, parkyeri);
            preparedStatement.setBoolean(6, durum);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Misafirdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void uyeCikisyap(String plaka,String adsoyad,String cikistarihi,double tutar)
    {
        String sorgu =  "Update kayit set cikistarihi = ?, tutar = ? ,durum = 0 where plaka = ? and durum = 1";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, cikistarihi);
            preparedStatement.setDouble(2, tutar);
            preparedStatement.setString(3, plaka);
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void uyeEkle(String plaka,String adsoyad,String email,String uyelikturu,String parkyeri,String tutar)
    {
        String sorgu = "Insert Into üye (plaka,adsoyad,email,uyelikturu,parkyeri,tutar) VALUES(?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, plaka);
            preparedStatement.setString(2, adsoyad);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, uyelikturu);
            preparedStatement.setString(5, parkyeri);
            preparedStatement.setString(6, tutar);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void uyeSil (String plaka)
    {
        String sorgu = "delete from üye where plaka = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, plaka);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void uyeGuncelle(String adsoyad,String email,String uyelikturu,String parkyeri,String tutar,String plaka)
    {
        String sorgu =  "Update üye set  adsoyad = ? , email = ? , uyelikturu = ? , parkyeri = ? , tutar = ? where plaka = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, adsoyad);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, uyelikturu);
            preparedStatement.setString(4, parkyeri);
            preparedStatement.setString(5, tutar);
            preparedStatement.setString(6,plaka);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Uye> uyeleriGetir() {
        
        ArrayList<Uye> cikti = new ArrayList<Uye>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From üye";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                String plaka = rs.getString("plaka");
                String adsoyad = rs.getString("adsoyad");
                String email = rs.getString("email");
                String uyelikturu  = rs.getString("uyelikturu");
                String parkyeri = rs.getString("parkyeri");
                String tutar = rs.getString("tutar");
                
                cikti.add(new Uye(plaka, adsoyad, email, uyelikturu, parkyeri,tutar));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
            return null;   
        }      
    }
    
    /*public Boolean parkyeriSorgu(String parkyeritext,String sorgu)
    {
        Boolean flag = false;
        try {
            String sorgu = "Select * From üye where parkyeri = ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, parkyeritext);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Uyedb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;   
    }
*/

    @Override
    public Boolean parkyeriSorgu(String parkyeri, String sorgu) {
        return super.parkyeriSorgu(parkyeri, sorgu); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public Uyedb()
    {
        baglanti();
    }
}
