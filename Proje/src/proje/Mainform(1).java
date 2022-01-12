
package proje;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;

public class Mainform extends javax.swing.JFrame {

    private int xx;
    private int xy;
    DefaultTableModel model;
    Uyedb uyedb = new Uyedb();
    Misafirdb misafir = new Misafirdb();
    Yönetim yonetim = new Yönetim();

    
    public Mainform() {
        initComponents();
        mesaj_yazi_uyeol.setText("");
        
        jTabbedPane1.setSelectedIndex(1);
        Maintabbedpane.setSelectedIndex(0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        Kapat_simgesi = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        logopanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        yonetimpanel = new javax.swing.JPanel();
        btn_yntm_uye_listele = new javax.swing.JPanel();
        logo_uyelist = new javax.swing.JLabel();
        label_uyelist = new javax.swing.JLabel();
        btn_yntm_uye_ekle = new javax.swing.JPanel();
        logo_uyeekle = new javax.swing.JLabel();
        label_uyeekle = new javax.swing.JLabel();
        btn_yntm_uye_guncelle = new javax.swing.JPanel();
        logo_uyeguncelle = new javax.swing.JLabel();
        label_uyeguncelle = new javax.swing.JLabel();
        btn_yntm_uye_sil = new javax.swing.JPanel();
        logo_uyesil = new javax.swing.JLabel();
        label_uyesil = new javax.swing.JLabel();
        btn_geri = new javax.swing.JPanel();
        logo_geri = new javax.swing.JLabel();
        label_geri = new javax.swing.JLabel();
        btn_yntm_musteri_listele = new javax.swing.JPanel();
        logo_misafirlist = new javax.swing.JLabel();
        label_misafirlist = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        btn_yntm = new javax.swing.JPanel();
        logo_yonetim = new javax.swing.JLabel();
        label_yonetim = new javax.swing.JLabel();
        btn_misafir = new javax.swing.JPanel();
        logo_misafir = new javax.swing.JLabel();
        label_misafir = new javax.swing.JLabel();
        btn_uye = new javax.swing.JPanel();
        logo_uye = new javax.swing.JLabel();
        label_uye = new javax.swing.JLabel();
        misafirpanel = new javax.swing.JPanel();
        btn_otogirisyap = new javax.swing.JPanel();
        logo_Misafir_otogirisyap = new javax.swing.JLabel();
        label_Misfir_otogirisyap = new javax.swing.JLabel();
        btn_otocikisyap = new javax.swing.JPanel();
        logo_Misfir_otocikisyap = new javax.swing.JLabel();
        label_Misfir_otocikisyap = new javax.swing.JLabel();
        btn_uyeol = new javax.swing.JPanel();
        logo_Misfir_uyeol = new javax.swing.JLabel();
        label_Misfir_uyeol = new javax.swing.JLabel();
        btn_misafirgeri = new javax.swing.JPanel();
        logo_Misafir_geri = new javax.swing.JLabel();
        label_Misfir_geri = new javax.swing.JLabel();
        Uyepanel = new javax.swing.JPanel();
        btn_uyegeri = new javax.swing.JPanel();
        logo_Uye_geri = new javax.swing.JLabel();
        label_Uye_geri = new javax.swing.JLabel();
        btn_uye_otogirisyap = new javax.swing.JPanel();
        logo_Uye_otogirisyap = new javax.swing.JLabel();
        label_Uye_otogirisyap = new javax.swing.JLabel();
        btn_uye_otocikisyap = new javax.swing.JPanel();
        logo_Uye_otocikisyap = new javax.swing.JLabel();
        label_Uye_otocikisyap = new javax.swing.JLabel();
        Maintabbedpane = new javax.swing.JTabbedPane();
        Anasayfa = new javax.swing.JPanel();
        Hosgeldiniz = new javax.swing.JLabel();
        Hosgeldiniz1 = new javax.swing.JLabel();
        Misafir_giris = new javax.swing.JPanel();
        Plaka_misafirgiris = new javax.swing.JLabel();
        plakatext_misafirgiris = new javax.swing.JTextField();
        adsoyad_misafirgiris = new javax.swing.JLabel();
        adsoyadtext_misafirgiris = new javax.swing.JTextField();
        button_misafirgiris = new javax.swing.JButton();
        mesajyazi_misafirgiris = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mesajyazi_uyecikis3 = new javax.swing.JLabel();
        Misfir_cikis = new javax.swing.JPanel();
        button_misafircikis = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        plakatext_misafircikis = new javax.swing.JTextField();
        adsoyadtext_misafircikis = new javax.swing.JTextField();
        mesajyaz_misafircikis = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mesajyazi_uyecikis4 = new javax.swing.JLabel();
        Uye_giris = new javax.swing.JPanel();
        button_uyegiris = new javax.swing.JButton();
        adsoyadtext_uyegiris = new javax.swing.JTextField();
        adsoyad_uyegiris = new javax.swing.JLabel();
        plaka_uyegiris = new javax.swing.JLabel();
        plakatext_uyegiris = new javax.swing.JTextField();
        mesajyazi_uyegiris = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        mesajyazi_uyecikis2 = new javax.swing.JLabel();
        Uye_cikis = new javax.swing.JPanel();
        button_uyecikis = new javax.swing.JButton();
        adsoyadtext_uyecikis = new javax.swing.JTextField();
        adsoyad_uyecikis = new javax.swing.JLabel();
        plaka_uyecikis = new javax.swing.JLabel();
        plakatext_uyecikis = new javax.swing.JTextField();
        mesajyazi_uyecikis = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        mesajyazi_uyecikis1 = new javax.swing.JLabel();
        Uye_ol = new javax.swing.JPanel();
        button_uyeol = new javax.swing.JButton();
        adsoyadtext_uyeol = new javax.swing.JTextField();
        adsoyad_uyeol = new javax.swing.JLabel();
        plaka_uyeol = new javax.swing.JLabel();
        plakatext_uyeol = new javax.swing.JTextField();
        email_uyeol = new javax.swing.JLabel();
        emailtext_uyeol = new javax.swing.JTextField();
        uyelikturu_uyeol = new javax.swing.JLabel();
        cbox_uyelikturu_uyeol = new javax.swing.JComboBox<>();
        parkyeri_uyeol = new javax.swing.JLabel();
        cbox_parkyeri_uyeol = new javax.swing.JComboBox<>();
        Tutar_Label = new javax.swing.JLabel();
        tutar_yaz = new javax.swing.JLabel();
        mesaj_yazi_uyeol = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        Uye_sil = new javax.swing.JPanel();
        btn_uyesil_uyesil = new javax.swing.JButton();
        mesajyazi_uyesil = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uyesil_tablosu = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        Uye_guncelle = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        uyeguncelle_tablosu = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        Plaka_misafirgiris1 = new javax.swing.JLabel();
        plakatext_uyeguncelle = new javax.swing.JTextField();
        Plaka_misafirgiris2 = new javax.swing.JLabel();
        adsoyadtext_uyeguncelle = new javax.swing.JTextField();
        Plaka_misafirgiris3 = new javax.swing.JLabel();
        emailtext_uyeguncelle = new javax.swing.JTextField();
        Plaka_misafirgiris4 = new javax.swing.JLabel();
        Plaka_misafirgiris5 = new javax.swing.JLabel();
        parkyeritext_uyeguncelle = new javax.swing.JTextField();
        Plaka_misafirgiris6 = new javax.swing.JLabel();
        button_uyeguncelle = new javax.swing.JButton();
        tutaryazi_uyeguncelle = new javax.swing.JLabel();
        uyelikturutext_uyeguncelle = new javax.swing.JTextField();
        Misafir_listele = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kayit_tablosu = new javax.swing.JTable();
        Uye_listele = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uye_tablosu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Plaka_misafirgiris7 = new javax.swing.JLabel();
        kullaniciaditext_yonetim = new javax.swing.JTextField();
        Plaka_misafirgiris9 = new javax.swing.JLabel();
        button_yonetimgirisyap = new javax.swing.JButton();
        sifretext_yonetim = new javax.swing.JPasswordField();
        mesajyazi_yonetim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(51, 51, 255));
        toppanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        Kapat_simgesi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Kapat_simgesi.setForeground(new java.awt.Color(255, 51, 51));
        Kapat_simgesi.setText("X");
        Kapat_simgesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Kapat_simgesiMousePressed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("BankGothic Md BT", 2, 48)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("otopark otomasyonu");
        jLabel54.setToolTipText("");

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                .addContainerGap(895, Short.MAX_VALUE)
                .addComponent(Kapat_simgesi)
                .addGap(20, 20, 20))
            .addGroup(toppanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Kapat_simgesi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        bg.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 940, 180));

        sidepanel.setBackground(new java.awt.Color(51, 51, 255));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logopanel.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_wheel_100px.png"))); // NOI18N

        javax.swing.GroupLayout logopanelLayout = new javax.swing.GroupLayout(logopanel);
        logopanel.setLayout(logopanelLayout);
        logopanelLayout.setHorizontalGroup(
            logopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logopanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        logopanelLayout.setVerticalGroup(
            logopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logopanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        sidepanel.add(logopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, 160));

        yonetimpanel.setBackground(new java.awt.Color(51, 51, 255));

        btn_yntm_uye_listele.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm_uye_listele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_listeleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_listeleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_listeleMousePressed(evt);
            }
        });

        logo_uyelist.setForeground(new java.awt.Color(255, 255, 255));
        logo_uyelist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_list_16px.png"))); // NOI18N

        label_uyelist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_uyelist.setForeground(new java.awt.Color(255, 255, 255));
        label_uyelist.setText("Üyeleri Listele");

        javax.swing.GroupLayout btn_yntm_uye_listeleLayout = new javax.swing.GroupLayout(btn_yntm_uye_listele);
        btn_yntm_uye_listele.setLayout(btn_yntm_uye_listeleLayout);
        btn_yntm_uye_listeleLayout.setHorizontalGroup(
            btn_yntm_uye_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntm_uye_listeleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_uyelist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_uyelist)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_yntm_uye_listeleLayout.setVerticalGroup(
            btn_yntm_uye_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntm_uye_listeleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_yntm_uye_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_uyelist, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uyelist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_yntm_uye_ekle.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm_uye_ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_ekleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_ekleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_ekleMousePressed(evt);
            }
        });

        logo_uyeekle.setForeground(new java.awt.Color(255, 255, 255));
        logo_uyeekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_administrator_24px.png"))); // NOI18N

        label_uyeekle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_uyeekle.setForeground(new java.awt.Color(255, 255, 255));
        label_uyeekle.setText("Üye Ekle");

        javax.swing.GroupLayout btn_yntm_uye_ekleLayout = new javax.swing.GroupLayout(btn_yntm_uye_ekle);
        btn_yntm_uye_ekle.setLayout(btn_yntm_uye_ekleLayout);
        btn_yntm_uye_ekleLayout.setHorizontalGroup(
            btn_yntm_uye_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntm_uye_ekleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_uyeekle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_uyeekle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_yntm_uye_ekleLayout.setVerticalGroup(
            btn_yntm_uye_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntm_uye_ekleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_yntm_uye_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_uyeekle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uyeekle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_yntm_uye_guncelle.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm_uye_guncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_guncelleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_guncelleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_guncelleMousePressed(evt);
            }
        });

        logo_uyeguncelle.setForeground(new java.awt.Color(255, 255, 255));
        logo_uyeguncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Female_User_Update_24px_3.png"))); // NOI18N

        label_uyeguncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_uyeguncelle.setForeground(new java.awt.Color(255, 255, 255));
        label_uyeguncelle.setText("Üye Güncelle");

        javax.swing.GroupLayout btn_yntm_uye_guncelleLayout = new javax.swing.GroupLayout(btn_yntm_uye_guncelle);
        btn_yntm_uye_guncelle.setLayout(btn_yntm_uye_guncelleLayout);
        btn_yntm_uye_guncelleLayout.setHorizontalGroup(
            btn_yntm_uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntm_uye_guncelleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_yntm_uye_guncelleLayout.setVerticalGroup(
            btn_yntm_uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntm_uye_guncelleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_yntm_uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_yntm_uye_sil.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm_uye_sil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_silMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_silMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntm_uye_silMousePressed(evt);
            }
        });

        logo_uyesil.setForeground(new java.awt.Color(255, 255, 255));
        logo_uyesil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_user_male_24px.png"))); // NOI18N

        label_uyesil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_uyesil.setForeground(new java.awt.Color(255, 255, 255));
        label_uyesil.setText("Üye Sil");

        javax.swing.GroupLayout btn_yntm_uye_silLayout = new javax.swing.GroupLayout(btn_yntm_uye_sil);
        btn_yntm_uye_sil.setLayout(btn_yntm_uye_silLayout);
        btn_yntm_uye_silLayout.setHorizontalGroup(
            btn_yntm_uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntm_uye_silLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_yntm_uye_silLayout.setVerticalGroup(
            btn_yntm_uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntm_uye_silLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_yntm_uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_geri.setBackground(new java.awt.Color(51, 51, 255));
        btn_geri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_geriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_geriMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_geriMousePressed(evt);
            }
        });

        logo_geri.setForeground(new java.awt.Color(255, 255, 255));
        logo_geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_back.png"))); // NOI18N

        label_geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_geri.setForeground(new java.awt.Color(255, 255, 255));
        label_geri.setText("Geri");

        javax.swing.GroupLayout btn_geriLayout = new javax.swing.GroupLayout(btn_geri);
        btn_geri.setLayout(btn_geriLayout);
        btn_geriLayout.setHorizontalGroup(
            btn_geriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_geriLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_geriLayout.setVerticalGroup(
            btn_geriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_geriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_geriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_yntm_musteri_listele.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm_musteri_listele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntm_musteri_listeleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntm_musteri_listeleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntm_musteri_listeleMousePressed(evt);
            }
        });

        logo_misafirlist.setForeground(new java.awt.Color(255, 255, 255));
        logo_misafirlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_list_16px.png"))); // NOI18N

        label_misafirlist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_misafirlist.setForeground(new java.awt.Color(255, 255, 255));
        label_misafirlist.setText("Kayıt Listele");

        javax.swing.GroupLayout btn_yntm_musteri_listeleLayout = new javax.swing.GroupLayout(btn_yntm_musteri_listele);
        btn_yntm_musteri_listele.setLayout(btn_yntm_musteri_listeleLayout);
        btn_yntm_musteri_listeleLayout.setHorizontalGroup(
            btn_yntm_musteri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntm_musteri_listeleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_misafirlist, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_misafirlist, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        btn_yntm_musteri_listeleLayout.setVerticalGroup(
            btn_yntm_musteri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntm_musteri_listeleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_yntm_musteri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_misafirlist, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_misafirlist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout yonetimpanelLayout = new javax.swing.GroupLayout(yonetimpanel);
        yonetimpanel.setLayout(yonetimpanelLayout);
        yonetimpanelLayout.setHorizontalGroup(
            yonetimpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_yntm_uye_listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_geri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_yntm_uye_ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_yntm_uye_guncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_yntm_uye_sil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_yntm_musteri_listele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        yonetimpanelLayout.setVerticalGroup(
            yonetimpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yonetimpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_yntm_musteri_listele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_yntm_uye_listele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_yntm_uye_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_yntm_uye_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_yntm_uye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", yonetimpanel);

        homepanel.setBackground(new java.awt.Color(51, 51, 255));

        btn_yntm.setBackground(new java.awt.Color(51, 51, 255));
        btn_yntm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_yntmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_yntmMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_yntmMousePressed(evt);
            }
        });

        logo_yonetim.setForeground(new java.awt.Color(255, 255, 255));
        logo_yonetim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_business_network_24px_1.png"))); // NOI18N

        label_yonetim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_yonetim.setForeground(new java.awt.Color(255, 255, 255));
        label_yonetim.setText("Yönetim");

        javax.swing.GroupLayout btn_yntmLayout = new javax.swing.GroupLayout(btn_yntm);
        btn_yntm.setLayout(btn_yntmLayout);
        btn_yntmLayout.setHorizontalGroup(
            btn_yntmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_yntmLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_yntmLayout.setVerticalGroup(
            btn_yntmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_yntmLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(btn_yntmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_misafir.setBackground(new java.awt.Color(51, 51, 255));
        btn_misafir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_misafirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_misafirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_misafirMousePressed(evt);
            }
        });

        logo_misafir.setForeground(new java.awt.Color(255, 255, 255));
        logo_misafir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_account_30px_1.png"))); // NOI18N

        label_misafir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_misafir.setForeground(new java.awt.Color(255, 255, 255));
        label_misafir.setText("Misafir");

        javax.swing.GroupLayout btn_misafirLayout = new javax.swing.GroupLayout(btn_misafir);
        btn_misafir.setLayout(btn_misafirLayout);
        btn_misafirLayout.setHorizontalGroup(
            btn_misafirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_misafirLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_misafir)
                .addGap(38, 38, 38)
                .addComponent(label_misafir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        btn_misafirLayout.setVerticalGroup(
            btn_misafirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_misafirLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(btn_misafirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_misafir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_misafir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_uye.setBackground(new java.awt.Color(51, 51, 255));
        btn_uye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_uyeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_uyeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_uyeMousePressed(evt);
            }
        });

        logo_uye.setForeground(new java.awt.Color(255, 255, 255));
        logo_uye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_card_security_24px_1.png"))); // NOI18N

        label_uye.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_uye.setForeground(new java.awt.Color(255, 255, 255));
        label_uye.setText("Üye");

        javax.swing.GroupLayout btn_uyeLayout = new javax.swing.GroupLayout(btn_uye);
        btn_uye.setLayout(btn_uyeLayout);
        btn_uyeLayout.setHorizontalGroup(
            btn_uyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_uyeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        btn_uyeLayout.setVerticalGroup(
            btn_uyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_uyeLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(btn_uyeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_yntm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_misafir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_uye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_yntm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_uye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_misafir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", homepanel);

        misafirpanel.setBackground(new java.awt.Color(51, 51, 255));

        btn_otogirisyap.setBackground(new java.awt.Color(51, 51, 255));
        btn_otogirisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_otogirisyapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_otogirisyapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_otogirisyapMousePressed(evt);
            }
        });

        logo_Misafir_otogirisyap.setForeground(new java.awt.Color(255, 255, 255));
        logo_Misafir_otogirisyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_car_top_view_30px_2.png"))); // NOI18N

        label_Misfir_otogirisyap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Misfir_otogirisyap.setForeground(new java.awt.Color(255, 255, 255));
        label_Misfir_otogirisyap.setText("Otoparka Giriş Yap");
        label_Misfir_otogirisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Misfir_otogirisyapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_otogirisyapLayout = new javax.swing.GroupLayout(btn_otogirisyap);
        btn_otogirisyap.setLayout(btn_otogirisyapLayout);
        btn_otogirisyapLayout.setHorizontalGroup(
            btn_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_otogirisyapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Misafir_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Misfir_otogirisyap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_otogirisyapLayout.setVerticalGroup(
            btn_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_otogirisyapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Misafir_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Misfir_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_otocikisyap.setBackground(new java.awt.Color(51, 51, 255));
        btn_otocikisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_otocikisyapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_otocikisyapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_otocikisyapMousePressed(evt);
            }
        });

        logo_Misfir_otocikisyap.setForeground(new java.awt.Color(255, 255, 255));
        logo_Misfir_otocikisyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_car_theft_30px.png"))); // NOI18N

        label_Misfir_otocikisyap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Misfir_otocikisyap.setForeground(new java.awt.Color(255, 255, 255));
        label_Misfir_otocikisyap.setText("Otoparktan Çıkış Yap");

        javax.swing.GroupLayout btn_otocikisyapLayout = new javax.swing.GroupLayout(btn_otocikisyap);
        btn_otocikisyap.setLayout(btn_otocikisyapLayout);
        btn_otocikisyapLayout.setHorizontalGroup(
            btn_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_otocikisyapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Misfir_otocikisyap)
                .addGap(30, 30, 30)
                .addComponent(label_Misfir_otocikisyap)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_otocikisyapLayout.setVerticalGroup(
            btn_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_otocikisyapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Misfir_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Misfir_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_uyeol.setBackground(new java.awt.Color(51, 51, 255));
        btn_uyeol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_uyeolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_uyeolMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_uyeolMousePressed(evt);
            }
        });

        logo_Misfir_uyeol.setForeground(new java.awt.Color(255, 255, 255));
        logo_Misfir_uyeol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_administrator_24px.png"))); // NOI18N

        label_Misfir_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Misfir_uyeol.setForeground(new java.awt.Color(255, 255, 255));
        label_Misfir_uyeol.setText("Üye Ol");

        javax.swing.GroupLayout btn_uyeolLayout = new javax.swing.GroupLayout(btn_uyeol);
        btn_uyeol.setLayout(btn_uyeolLayout);
        btn_uyeolLayout.setHorizontalGroup(
            btn_uyeolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_uyeolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Misfir_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Misfir_uyeol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_uyeolLayout.setVerticalGroup(
            btn_uyeolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_uyeolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_uyeolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Misfir_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Misfir_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_misafirgeri.setBackground(new java.awt.Color(51, 51, 255));
        btn_misafirgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_misafirgeriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_misafirgeriMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_misafirgeriMousePressed(evt);
            }
        });

        logo_Misafir_geri.setForeground(new java.awt.Color(255, 255, 255));
        logo_Misafir_geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_back.png"))); // NOI18N

        label_Misfir_geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Misfir_geri.setForeground(new java.awt.Color(255, 255, 255));
        label_Misfir_geri.setText("Geri");

        javax.swing.GroupLayout btn_misafirgeriLayout = new javax.swing.GroupLayout(btn_misafirgeri);
        btn_misafirgeri.setLayout(btn_misafirgeriLayout);
        btn_misafirgeriLayout.setHorizontalGroup(
            btn_misafirgeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_misafirgeriLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Misafir_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Misfir_geri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_misafirgeriLayout.setVerticalGroup(
            btn_misafirgeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_misafirgeriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_misafirgeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Misafir_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Misfir_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout misafirpanelLayout = new javax.swing.GroupLayout(misafirpanel);
        misafirpanel.setLayout(misafirpanelLayout);
        misafirpanelLayout.setHorizontalGroup(
            misafirpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_otogirisyap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_otocikisyap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_uyeol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_misafirgeri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        misafirpanelLayout.setVerticalGroup(
            misafirpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(misafirpanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_misafirgeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", misafirpanel);

        Uyepanel.setBackground(new java.awt.Color(51, 51, 255));

        btn_uyegeri.setBackground(new java.awt.Color(51, 51, 255));
        btn_uyegeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_uyegeriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_uyegeriMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_uyegeriMousePressed(evt);
            }
        });

        logo_Uye_geri.setForeground(new java.awt.Color(255, 255, 255));
        logo_Uye_geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_back.png"))); // NOI18N

        label_Uye_geri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Uye_geri.setForeground(new java.awt.Color(255, 255, 255));
        label_Uye_geri.setText("Geri");

        javax.swing.GroupLayout btn_uyegeriLayout = new javax.swing.GroupLayout(btn_uyegeri);
        btn_uyegeri.setLayout(btn_uyegeriLayout);
        btn_uyegeriLayout.setHorizontalGroup(
            btn_uyegeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_uyegeriLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Uye_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Uye_geri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_uyegeriLayout.setVerticalGroup(
            btn_uyegeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_uyegeriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_uyegeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Uye_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Uye_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        btn_uye_otogirisyap.setBackground(new java.awt.Color(51, 51, 255));
        btn_uye_otogirisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_uye_otogirisyapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_uye_otogirisyapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_uye_otogirisyapMousePressed(evt);
            }
        });

        logo_Uye_otogirisyap.setForeground(new java.awt.Color(255, 255, 255));
        logo_Uye_otogirisyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_car_top_view_30px_2.png"))); // NOI18N

        label_Uye_otogirisyap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Uye_otogirisyap.setForeground(new java.awt.Color(255, 255, 255));
        label_Uye_otogirisyap.setText("Otoparka Giriş Yap");

        javax.swing.GroupLayout btn_uye_otogirisyapLayout = new javax.swing.GroupLayout(btn_uye_otogirisyap);
        btn_uye_otogirisyap.setLayout(btn_uye_otogirisyapLayout);
        btn_uye_otogirisyapLayout.setHorizontalGroup(
            btn_uye_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_uye_otogirisyapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Uye_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Uye_otogirisyap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_uye_otogirisyapLayout.setVerticalGroup(
            btn_uye_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_uye_otogirisyapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_uye_otogirisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Uye_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Uye_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btn_uye_otocikisyap.setBackground(new java.awt.Color(51, 51, 255));
        btn_uye_otocikisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_uye_otocikisyapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_uye_otocikisyapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_uye_otocikisyapMousePressed(evt);
            }
        });

        logo_Uye_otocikisyap.setForeground(new java.awt.Color(255, 255, 255));
        logo_Uye_otocikisyap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_car_theft_30px.png"))); // NOI18N

        label_Uye_otocikisyap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Uye_otocikisyap.setForeground(new java.awt.Color(255, 255, 255));
        label_Uye_otocikisyap.setText("Otoparktan Çıkış Yap");

        javax.swing.GroupLayout btn_uye_otocikisyapLayout = new javax.swing.GroupLayout(btn_uye_otocikisyap);
        btn_uye_otocikisyap.setLayout(btn_uye_otocikisyapLayout);
        btn_uye_otocikisyapLayout.setHorizontalGroup(
            btn_uye_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_uye_otocikisyapLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logo_Uye_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Uye_otocikisyap)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        btn_uye_otocikisyapLayout.setVerticalGroup(
            btn_uye_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_uye_otocikisyapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_uye_otocikisyapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo_Uye_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Uye_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout UyepanelLayout = new javax.swing.GroupLayout(Uyepanel);
        Uyepanel.setLayout(UyepanelLayout);
        UyepanelLayout.setHorizontalGroup(
            UyepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_uyegeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_uye_otogirisyap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_uye_otocikisyap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UyepanelLayout.setVerticalGroup(
            UyepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UyepanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_uyegeri, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_uye_otogirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_uye_otocikisyap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", Uyepanel);

        sidepanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 570));

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 270, 710));

        Maintabbedpane.setBackground(new java.awt.Color(255, 255, 255));

        Anasayfa.setBackground(new java.awt.Color(255, 255, 255));

        Hosgeldiniz.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 48)); // NOI18N
        Hosgeldiniz.setForeground(new java.awt.Color(51, 51, 255));
        Hosgeldiniz.setText("HOŞGELDİNİZ");

        Hosgeldiniz1.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 24)); // NOI18N
        Hosgeldiniz1.setForeground(new java.awt.Color(51, 51, 255));
        Hosgeldiniz1.setText("Lütfen giriş yönteminizi seçiniz...");

        javax.swing.GroupLayout AnasayfaLayout = new javax.swing.GroupLayout(Anasayfa);
        Anasayfa.setLayout(AnasayfaLayout);
        AnasayfaLayout.setHorizontalGroup(
            AnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnasayfaLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(Hosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(AnasayfaLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(Hosgeldiniz1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AnasayfaLayout.setVerticalGroup(
            AnasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnasayfaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Hosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hosgeldiniz1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        Maintabbedpane.addTab("Anasayfa", Anasayfa);

        Misafir_giris.setBackground(new java.awt.Color(255, 255, 255));

        Plaka_misafirgiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris.setText("Plaka");

        plakatext_misafirgiris.setForeground(new java.awt.Color(51, 51, 255));

        adsoyad_misafirgiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adsoyad_misafirgiris.setForeground(new java.awt.Color(51, 51, 255));
        adsoyad_misafirgiris.setText("Ad Soyad");

        adsoyadtext_misafirgiris.setForeground(new java.awt.Color(51, 51, 255));

        button_misafirgiris.setBackground(new java.awt.Color(51, 51, 255));
        button_misafirgiris.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_misafirgiris.setForeground(new java.awt.Color(255, 255, 255));
        button_misafirgiris.setText("Giriş Yap");
        button_misafirgiris.setBorder(null);
        button_misafirgiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_misafirgirisActionPerformed(evt);
            }
        });

        mesajyazi_misafirgiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_misafirgiris.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_misafirgiris.setText(".");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyecikis3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyecikis3.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyecikis3.setText("Otoparka girmek için lütfen Plaka ve AdSoyad Giriniz...");

        javax.swing.GroupLayout Misafir_girisLayout = new javax.swing.GroupLayout(Misafir_giris);
        Misafir_giris.setLayout(Misafir_girisLayout);
        Misafir_girisLayout.setHorizontalGroup(
            Misafir_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Misafir_girisLayout.createSequentialGroup()
                .addGroup(Misafir_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Misafir_girisLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(Misafir_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adsoyad_misafirgiris)
                            .addComponent(plakatext_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(adsoyadtext_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2)))
                    .addGroup(Misafir_girisLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(mesajyazi_uyecikis3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Misafir_girisLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(button_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Misafir_girisLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(mesajyazi_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        Misafir_girisLayout.setVerticalGroup(
            Misafir_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Misafir_girisLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(mesajyazi_uyecikis3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Plaka_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plakatext_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(adsoyad_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyadtext_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(mesajyazi_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_misafirgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        Maintabbedpane.addTab("Misafirgiris", Misafir_giris);

        Misfir_cikis.setBackground(new java.awt.Color(255, 255, 255));

        button_misafircikis.setBackground(new java.awt.Color(51, 51, 255));
        button_misafircikis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_misafircikis.setForeground(new java.awt.Color(255, 255, 255));
        button_misafircikis.setText("Çıkış Yap");
        button_misafircikis.setBorder(null);
        button_misafircikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_misafircikisActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 255));
        jLabel40.setText("Ad Soyad");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 255));
        jLabel41.setText("Plaka");

        plakatext_misafircikis.setForeground(new java.awt.Color(51, 51, 255));
        plakatext_misafircikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plakatext_misafircikisActionPerformed(evt);
            }
        });

        adsoyadtext_misafircikis.setForeground(new java.awt.Color(51, 51, 255));

        mesajyaz_misafircikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyaz_misafircikis.setForeground(new java.awt.Color(51, 51, 255));
        mesajyaz_misafircikis.setText(".");

        jSeparator3.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyecikis4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyecikis4.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyecikis4.setText("Otoparktan çıkmak için lütfen Plaka ve AdSoyad Giriniz...");

        javax.swing.GroupLayout Misfir_cikisLayout = new javax.swing.GroupLayout(Misfir_cikis);
        Misfir_cikis.setLayout(Misfir_cikisLayout);
        Misfir_cikisLayout.setHorizontalGroup(
            Misfir_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Misfir_cikisLayout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(button_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378))
            .addGroup(Misfir_cikisLayout.createSequentialGroup()
                .addGroup(Misfir_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Misfir_cikisLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(mesajyazi_uyecikis4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Misfir_cikisLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(Misfir_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Misfir_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(plakatext_misafircikis)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40)
                                .addComponent(adsoyadtext_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Misfir_cikisLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(mesajyaz_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Misfir_cikisLayout.setVerticalGroup(
            Misfir_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Misfir_cikisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mesajyazi_uyecikis4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plakatext_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adsoyadtext_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesajyaz_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(button_misafircikis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        Maintabbedpane.addTab("Misafircikis", Misfir_cikis);

        Uye_giris.setBackground(new java.awt.Color(255, 255, 255));

        button_uyegiris.setBackground(new java.awt.Color(51, 51, 255));
        button_uyegiris.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_uyegiris.setForeground(new java.awt.Color(255, 255, 255));
        button_uyegiris.setText("Üye Girişi Yap");
        button_uyegiris.setBorder(null);
        button_uyegiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_uyegirisActionPerformed(evt);
            }
        });

        adsoyadtext_uyegiris.setForeground(new java.awt.Color(51, 51, 255));

        adsoyad_uyegiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adsoyad_uyegiris.setForeground(new java.awt.Color(51, 51, 255));
        adsoyad_uyegiris.setText("Ad Soyad");

        plaka_uyegiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plaka_uyegiris.setForeground(new java.awt.Color(51, 51, 255));
        plaka_uyegiris.setText("Plaka");

        plakatext_uyegiris.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyegiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyegiris.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyegiris.setText(".");

        jSeparator5.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator6.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyecikis2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyecikis2.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyecikis2.setText("Otoparka girmek için lütfen Plaka ve AdSoyad Giriniz...");

        javax.swing.GroupLayout Uye_girisLayout = new javax.swing.GroupLayout(Uye_giris);
        Uye_giris.setLayout(Uye_girisLayout);
        Uye_girisLayout.setHorizontalGroup(
            Uye_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_girisLayout.createSequentialGroup()
                .addGroup(Uye_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_girisLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addGroup(Uye_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(adsoyadtext_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plakatext_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plaka_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsoyad_uyegiris)
                            .addComponent(jSeparator6)))
                    .addGroup(Uye_girisLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(mesajyazi_uyecikis2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 444, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_girisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Uye_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_girisLayout.createSequentialGroup()
                        .addComponent(button_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_girisLayout.createSequentialGroup()
                        .addComponent(mesajyazi_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        Uye_girisLayout.setVerticalGroup(
            Uye_girisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_girisLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(mesajyazi_uyecikis2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(plaka_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plakatext_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyad_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyadtext_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajyazi_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_uyegiris, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        Maintabbedpane.addTab("ÜyeGiriş", Uye_giris);

        Uye_cikis.setBackground(new java.awt.Color(255, 255, 255));

        button_uyecikis.setBackground(new java.awt.Color(51, 51, 255));
        button_uyecikis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_uyecikis.setForeground(new java.awt.Color(255, 255, 255));
        button_uyecikis.setText("Üye Çıkışı Yap");
        button_uyecikis.setBorder(null);
        button_uyecikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_uyecikisActionPerformed(evt);
            }
        });

        adsoyadtext_uyecikis.setForeground(new java.awt.Color(51, 51, 255));
        adsoyadtext_uyecikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsoyadtext_uyecikisActionPerformed(evt);
            }
        });

        adsoyad_uyecikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adsoyad_uyecikis.setForeground(new java.awt.Color(51, 51, 255));
        adsoyad_uyecikis.setText("Ad Soyad");

        plaka_uyecikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plaka_uyecikis.setForeground(new java.awt.Color(51, 51, 255));
        plaka_uyecikis.setText("Plaka");

        plakatext_uyecikis.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyecikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyecikis.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyecikis.setText(".");

        jSeparator7.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator8.setForeground(new java.awt.Color(51, 51, 255));

        mesajyazi_uyecikis1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyecikis1.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyecikis1.setText("Otoparktan çıkmak için lütfen Plaka ve AdSoyad Giriniz...");

        javax.swing.GroupLayout Uye_cikisLayout = new javax.swing.GroupLayout(Uye_cikis);
        Uye_cikis.setLayout(Uye_cikisLayout);
        Uye_cikisLayout.setHorizontalGroup(
            Uye_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_cikisLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(Uye_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(Uye_cikisLayout.createSequentialGroup()
                        .addGroup(Uye_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plakatext_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plaka_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsoyad_uyecikis)
                            .addComponent(adsoyadtext_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(Uye_cikisLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(mesajyazi_uyecikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_cikisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Uye_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_cikisLayout.createSequentialGroup()
                        .addComponent(button_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_cikisLayout.createSequentialGroup()
                        .addComponent(mesajyazi_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        Uye_cikisLayout.setVerticalGroup(
            Uye_cikisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_cikisLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(mesajyazi_uyecikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(plaka_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plakatext_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyad_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyadtext_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajyazi_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_uyecikis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        Maintabbedpane.addTab("ÜyeÇıkış", Uye_cikis);

        Uye_ol.setBackground(new java.awt.Color(255, 255, 255));

        button_uyeol.setBackground(new java.awt.Color(51, 51, 255));
        button_uyeol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_uyeol.setForeground(new java.awt.Color(255, 255, 255));
        button_uyeol.setText("Üye Ol");
        button_uyeol.setBorder(null);
        button_uyeol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_uyeolActionPerformed(evt);
            }
        });

        adsoyadtext_uyeol.setForeground(new java.awt.Color(51, 51, 255));

        adsoyad_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adsoyad_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        adsoyad_uyeol.setText("Ad Soyad");

        plaka_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plaka_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        plaka_uyeol.setText("Plaka");

        plakatext_uyeol.setForeground(new java.awt.Color(51, 51, 255));

        email_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        email_uyeol.setText("E-mail");

        emailtext_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        emailtext_uyeol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailtext_uyeolKeyPressed(evt);
            }
        });

        uyelikturu_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uyelikturu_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        uyelikturu_uyeol.setText("Üyelik Türü");

        cbox_uyelikturu_uyeol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "Bronze", "Silver", "Gold" }));
        cbox_uyelikturu_uyeol.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbox_uyelikturu_uyeol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_uyelikturu_uyeolActionPerformed(evt);
            }
        });

        parkyeri_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parkyeri_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        parkyeri_uyeol.setText("Park Yeri:");

        cbox_parkyeri_uyeol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz..." }));
        cbox_parkyeri_uyeol.setSelectedItem(cbox_uyelikturu_uyeol.getSelectedItem());

        Tutar_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tutar_Label.setForeground(new java.awt.Color(51, 51, 255));
        Tutar_Label.setText("TUTAR:");

        tutar_yaz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tutar_yaz.setForeground(new java.awt.Color(51, 51, 255));
        tutar_yaz.setText("sonuç");

        mesaj_yazi_uyeol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesaj_yazi_uyeol.setForeground(new java.awt.Color(51, 51, 255));
        mesaj_yazi_uyeol.setText(".");

        jSeparator9.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator10.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator11.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator12.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator13.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout Uye_olLayout = new javax.swing.GroupLayout(Uye_ol);
        Uye_ol.setLayout(Uye_olLayout);
        Uye_olLayout.setHorizontalGroup(
            Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_olLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_olLayout.createSequentialGroup()
                        .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plakatext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plaka_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsoyad_uyeol)
                            .addComponent(adsoyadtext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_uyeol)
                            .addComponent(emailtext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyelikturu_uyeol))
                        .addContainerGap(681, Short.MAX_VALUE))
                    .addGroup(Uye_olLayout.createSequentialGroup()
                        .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_uyelikturu_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_parkyeri_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parkyeri_uyeol)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(Tutar_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutar_yaz)
                        .addGap(55, 55, 55)
                        .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesaj_yazi_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Uye_olLayout.setVerticalGroup(
            Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_olLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(plaka_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plakatext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyad_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adsoyadtext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(email_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailtext_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(uyelikturu_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_olLayout.createSequentialGroup()
                        .addComponent(cbox_uyelikturu_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parkyeri_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Uye_olLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tutar_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutar_yaz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesaj_yazi_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Uye_olLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_olLayout.createSequentialGroup()
                        .addComponent(cbox_parkyeri_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_olLayout.createSequentialGroup()
                        .addComponent(button_uyeol, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        Maintabbedpane.addTab("Üyeol", Uye_ol);

        Uye_sil.setBackground(new java.awt.Color(255, 255, 255));

        btn_uyesil_uyesil.setBackground(new java.awt.Color(51, 51, 255));
        btn_uyesil_uyesil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_uyesil_uyesil.setForeground(new java.awt.Color(255, 255, 255));
        btn_uyesil_uyesil.setText("Üye Sil");
        btn_uyesil_uyesil.setBorder(null);
        btn_uyesil_uyesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyesil_uyesilActionPerformed(evt);
            }
        });

        mesajyazi_uyesil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_uyesil.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_uyesil.setText(".");

        uyesil_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Ad Soyad", "E-mail", "Üyelik Türü", "Park Yeri", "Tutar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(uyesil_tablosu);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 255));
        jLabel56.setText("Lütfen silmek istediğiniz üyeyi seçiniz...");

        javax.swing.GroupLayout Uye_silLayout = new javax.swing.GroupLayout(Uye_sil);
        Uye_sil.setLayout(Uye_silLayout);
        Uye_silLayout.setHorizontalGroup(
            Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_silLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajyazi_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Uye_silLayout.createSequentialGroup()
                .addGap(0, 662, Short.MAX_VALUE)
                .addComponent(btn_uyesil_uyesil, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Uye_silLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
        );
        Uye_silLayout.setVerticalGroup(
            Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_silLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_uyesil_uyesil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesajyazi_uyesil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(Uye_silLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Uye_silLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(469, Short.MAX_VALUE)))
        );

        Maintabbedpane.addTab("ÜyeSil", Uye_sil);

        Uye_guncelle.setBackground(new java.awt.Color(255, 255, 255));

        uyeguncelle_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Ad Soyad", "E-mail", "Üyelik Türü", "Park Yeri", "Tutar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uyeguncelle_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeguncelle_tablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(uyeguncelle_tablosu);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 255));
        jLabel55.setText("Lütfen güncellemek istediğiniz üyeyi seçiniz...");

        Plaka_misafirgiris1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris1.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris1.setText("Plaka");

        plakatext_uyeguncelle.setEditable(false);
        plakatext_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));

        Plaka_misafirgiris2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris2.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris2.setText("Ad Soyad");

        adsoyadtext_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));

        Plaka_misafirgiris3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris3.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris3.setText("Üyelik Türü");

        emailtext_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));

        Plaka_misafirgiris4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris4.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris4.setText("E-Mail");

        Plaka_misafirgiris5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris5.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris5.setText("Park Yeri");

        parkyeritext_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));

        Plaka_misafirgiris6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris6.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris6.setText("Tutar");

        button_uyeguncelle.setBackground(new java.awt.Color(51, 51, 255));
        button_uyeguncelle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_uyeguncelle.setForeground(new java.awt.Color(255, 255, 255));
        button_uyeguncelle.setText("Üye Güncelle");
        button_uyeguncelle.setBorder(null);
        button_uyeguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_uyeguncelleActionPerformed(evt);
            }
        });

        tutaryazi_uyeguncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tutaryazi_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));
        tutaryazi_uyeguncelle.setText(".");

        uyelikturutext_uyeguncelle.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout Uye_guncelleLayout = new javax.swing.GroupLayout(Uye_guncelle);
        Uye_guncelle.setLayout(Uye_guncelleLayout);
        Uye_guncelleLayout.setHorizontalGroup(
            Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_guncelleLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plakatext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plaka_misafirgiris1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plaka_misafirgiris3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyelikturutext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adsoyadtext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plaka_misafirgiris2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plaka_misafirgiris5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parkyeritext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_guncelleLayout.createSequentialGroup()
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plaka_misafirgiris4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 359, Short.MAX_VALUE))
                    .addGroup(Uye_guncelleLayout.createSequentialGroup()
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Plaka_misafirgiris6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(tutaryazi_uyeguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
            .addGroup(Uye_guncelleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_guncelleLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Uye_guncelleLayout.setVerticalGroup(
            Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_guncelleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Uye_guncelleLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(button_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Uye_guncelleLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Plaka_misafirgiris1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plakatext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsoyadtext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Plaka_misafirgiris3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Uye_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parkyeritext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutaryazi_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyelikturutext_uyeguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );

        Maintabbedpane.addTab("ÜyeGüncelle", Uye_guncelle);

        Misafir_listele.setBackground(new java.awt.Color(255, 255, 255));

        kayit_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "Ad Soyad", "Plaka", "Giriş Tarihi", "Çıkış Tarihi", "Tür", "Parkyeri", "Tutar", "Durum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(kayit_tablosu);

        javax.swing.GroupLayout Misafir_listeleLayout = new javax.swing.GroupLayout(Misafir_listele);
        Misafir_listele.setLayout(Misafir_listeleLayout);
        Misafir_listeleLayout.setHorizontalGroup(
            Misafir_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Misafir_listeleLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        Misafir_listeleLayout.setVerticalGroup(
            Misafir_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Misafir_listeleLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        Maintabbedpane.addTab("MisafirListele", Misafir_listele);

        Uye_listele.setBackground(new java.awt.Color(255, 255, 255));

        uye_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Ad-Soyad", "E-mail", "Uyelik Türü", "Parkyeri", "Tutar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(uye_tablosu);

        javax.swing.GroupLayout Uye_listeleLayout = new javax.swing.GroupLayout(Uye_listele);
        Uye_listele.setLayout(Uye_listeleLayout);
        Uye_listeleLayout.setHorizontalGroup(
            Uye_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_listeleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        Uye_listeleLayout.setVerticalGroup(
            Uye_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Uye_listeleLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Maintabbedpane.addTab("ÜyeListele", Uye_listele);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Plaka_misafirgiris7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris7.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris7.setText("Kullanıcı Adı");

        kullaniciaditext_yonetim.setForeground(new java.awt.Color(51, 51, 255));

        Plaka_misafirgiris9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plaka_misafirgiris9.setForeground(new java.awt.Color(51, 51, 255));
        Plaka_misafirgiris9.setText("Şifre");

        button_yonetimgirisyap.setBackground(new java.awt.Color(51, 51, 255));
        button_yonetimgirisyap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_yonetimgirisyap.setForeground(new java.awt.Color(255, 255, 255));
        button_yonetimgirisyap.setText("Giriş Yap");
        button_yonetimgirisyap.setBorder(null);
        button_yonetimgirisyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_yonetimgirisyapActionPerformed(evt);
            }
        });

        sifretext_yonetim.setText("jPasswordField1");

        mesajyazi_yonetim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajyazi_yonetim.setForeground(new java.awt.Color(51, 51, 255));
        mesajyazi_yonetim.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plaka_misafirgiris9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sifretext_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(mesajyazi_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kullaniciaditext_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plaka_misafirgiris7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(button_yonetimgirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Plaka_misafirgiris7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciaditext_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Plaka_misafirgiris9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajyazi_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifretext_yonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(button_yonetimgirisyap, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        Maintabbedpane.addTab("yönetim", jPanel1);

        bg.add(Maintabbedpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 940, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kapat_simgesiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kapat_simgesiMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Kapat_simgesiMousePressed

    private void btn_yntmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntmMousePressed
        /*Yönetim Butonuna tıklanan kodlar için geçerli*/
        //jTabbedPane1.setSelectedIndex(0);
        setColor(btn_yntm);
        resetColor(btn_uye);
        resetColor(btn_misafir);
        kullaniciaditext_yonetim.setText("");
        sifretext_yonetim.setText("");
        Maintabbedpane.setSelectedIndex(10);
        mesajyazi_yonetim.setText("");
        
    }//GEN-LAST:event_btn_yntmMousePressed

    private void btn_uyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeMousePressed
        /*Üye Butonuna tıklanan kodlar için geçerli*/
        jTabbedPane1.setSelectedIndex(3);
        setColor(btn_uye);
        resetColor(btn_yntm);
        resetColor(btn_misafir);
    }//GEN-LAST:event_btn_uyeMousePressed

    private void btn_misafirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirMousePressed
        /*Misafir Butonuna tıklanan kodlar için geçerli*/
        jTabbedPane1.setSelectedIndex(2);
        setColor(btn_misafir);
        resetColor(btn_yntm);
        resetColor(btn_uye);
    }//GEN-LAST:event_btn_misafirMousePressed

    private void btn_yntm_uye_listeleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_listeleMousePressed
        // TODO add your handling code here:
        Maintabbedpane.setSelectedIndex(9);
        setColor(btn_yntm_uye_listele);
        resetColor(btn_yntm_uye_ekle);
        resetColor(btn_yntm_uye_guncelle);
        resetColor(btn_yntm_uye_sil);
        resetColor(btn_yntm_musteri_listele);
        
        model = (DefaultTableModel) uye_tablosu.getModel();
        uyeGoruntule(model);
        
    }//GEN-LAST:event_btn_yntm_uye_listeleMousePressed

    private void btn_yntm_uye_ekleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_ekleMousePressed
        // TODO add your handling code here:
        
        Maintabbedpane.setSelectedIndex(5);
        setColor(btn_yntm_uye_ekle);
        resetColor(btn_yntm_uye_listele);
        resetColor(btn_yntm_uye_guncelle);
        resetColor(btn_yntm_uye_sil);
        resetColor(btn_yntm_musteri_listele);
        
        plakatext_uyeol.setText("");
        adsoyadtext_uyeol.setText("");
        emailtext_uyeol.setText("");
        cbox_uyelikturu_uyeol.setSelectedItem("Seçiniz...");
        cbox_parkyeri_uyeol.setSelectedItem("Seçiniz...");
        tutar_yaz.setText("");
        button_uyeol.setText("Üye Ekle");
    }//GEN-LAST:event_btn_yntm_uye_ekleMousePressed

    private void btn_yntm_uye_guncelleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_guncelleMousePressed
        // TODO add your handling code here:
        
        plakatext_uyeguncelle.setText("");
        adsoyadtext_uyeguncelle.setText("");
        emailtext_uyeguncelle.setText("");
        uyelikturutext_uyeguncelle.setText("");
        parkyeritext_uyeguncelle.setText("");
        tutaryazi_uyeguncelle.setText("");
        
        
        
        Maintabbedpane.setSelectedIndex(7);
        setColor(btn_yntm_uye_guncelle);
        resetColor(btn_yntm_uye_ekle);
        resetColor(btn_yntm_uye_listele);
        resetColor(btn_yntm_uye_sil);
        resetColor(btn_yntm_musteri_listele);
        
        model = (DefaultTableModel) uyeguncelle_tablosu.getModel();
        uyeGoruntule(model);
    }//GEN-LAST:event_btn_yntm_uye_guncelleMousePressed

    private void btn_yntm_uye_silMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_silMousePressed
        // TODO add your handling code here:
        Maintabbedpane.setSelectedIndex(6);
        setColor(btn_yntm_uye_sil);
        resetColor(btn_yntm_uye_ekle);
        resetColor(btn_yntm_uye_guncelle);
        resetColor(btn_yntm_uye_listele);
        resetColor(btn_yntm_musteri_listele);
        
        model = (DefaultTableModel) uyesil_tablosu.getModel();
        uyeGoruntule(model);
        mesajyazi_uyesil.setText("");
        
    }//GEN-LAST:event_btn_yntm_uye_silMousePressed

    private void btn_geriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriMousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        resetColor(btn_yntm);
    }//GEN-LAST:event_btn_geriMousePressed

    private void btn_yntm_musteri_listeleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_musteri_listeleMousePressed
        // TODO add your handling code here:
        Maintabbedpane.setSelectedIndex(8);
        setColor(btn_yntm_musteri_listele);
        resetColor(btn_yntm_uye_listele);
        resetColor(btn_yntm_uye_ekle);
        resetColor(btn_yntm_uye_guncelle);
        resetColor(btn_yntm_uye_sil);
        
        model = (DefaultTableModel) kayit_tablosu.getModel();
        kayitGoruntule(model);
        
        
    }//GEN-LAST:event_btn_yntm_musteri_listeleMousePressed

    private void btn_geriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriMouseEntered
        // TODO add your handling code here:
        setColor(btn_geri);
    }//GEN-LAST:event_btn_geriMouseEntered

    private void btn_geriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geriMouseExited
        // TODO add your handling code here:
        resetColor(btn_geri);
    }//GEN-LAST:event_btn_geriMouseExited

    private void btn_yntmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntmMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm);
    }//GEN-LAST:event_btn_yntmMouseEntered

    private void btn_yntmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntmMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm);
    }//GEN-LAST:event_btn_yntmMouseExited

    private void btn_uyeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeMouseEntered
        // TODO add your handling code here:
        setColor(btn_uye);
    }//GEN-LAST:event_btn_uyeMouseEntered

    private void btn_uyeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeMouseExited
        // TODO add your handling code here:
        resetColor(btn_uye);
    }//GEN-LAST:event_btn_uyeMouseExited

    private void btn_misafirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirMouseEntered
        // TODO add your handling code here:
        setColor(btn_misafir);
    }//GEN-LAST:event_btn_misafirMouseEntered

    private void btn_misafirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirMouseExited
        // TODO add your handling code here:
        resetColor(btn_misafir);
    }//GEN-LAST:event_btn_misafirMouseExited

    private void btn_yntm_uye_listeleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_listeleMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm_uye_listele);
    }//GEN-LAST:event_btn_yntm_uye_listeleMouseEntered

    private void btn_yntm_uye_listeleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_listeleMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm_uye_listele);
    }//GEN-LAST:event_btn_yntm_uye_listeleMouseExited

    private void btn_yntm_uye_ekleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_ekleMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm_uye_ekle);
    }//GEN-LAST:event_btn_yntm_uye_ekleMouseEntered

    private void btn_yntm_uye_ekleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_ekleMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm_uye_ekle);
    }//GEN-LAST:event_btn_yntm_uye_ekleMouseExited

    private void btn_yntm_uye_guncelleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_guncelleMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm_uye_guncelle);
    }//GEN-LAST:event_btn_yntm_uye_guncelleMouseEntered

    private void btn_yntm_uye_guncelleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_guncelleMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm_uye_guncelle);
    }//GEN-LAST:event_btn_yntm_uye_guncelleMouseExited

    private void btn_yntm_uye_silMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_silMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm_uye_sil);
    }//GEN-LAST:event_btn_yntm_uye_silMouseEntered

    private void btn_yntm_uye_silMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_uye_silMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm_uye_sil);
    }//GEN-LAST:event_btn_yntm_uye_silMouseExited

    private void btn_yntm_musteri_listeleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_musteri_listeleMouseEntered
        // TODO add your handling code here:
        setColor(btn_yntm_musteri_listele);
    }//GEN-LAST:event_btn_yntm_musteri_listeleMouseEntered

    private void btn_yntm_musteri_listeleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yntm_musteri_listeleMouseExited
        // TODO add your handling code here:
        resetColor(btn_yntm_musteri_listele);
    }//GEN-LAST:event_btn_yntm_musteri_listeleMouseExited

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx,y-xy);
                
    }//GEN-LAST:event_bgMouseDragged

    private void btn_otogirisyapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otogirisyapMouseEntered
        // TODO add your handling code here:
        setColor(btn_otogirisyap);
    }//GEN-LAST:event_btn_otogirisyapMouseEntered

    private void btn_otogirisyapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otogirisyapMouseExited
        // TODO add your handling code here:
        resetColor(btn_otogirisyap);
    }//GEN-LAST:event_btn_otogirisyapMouseExited

    private void btn_otogirisyapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otogirisyapMousePressed

        //Oto GİRİŞ YAPA TIKLANDIĞINDA
        Maintabbedpane.setSelectedIndex(1);
        mesajyazi_misafirgiris.setText("");
    }//GEN-LAST:event_btn_otogirisyapMousePressed

    private void btn_otocikisyapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otocikisyapMouseEntered
        // TODO add your handling code here:
        setColor(btn_otocikisyap);
    }//GEN-LAST:event_btn_otocikisyapMouseEntered

    private void btn_otocikisyapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otocikisyapMouseExited

        resetColor(btn_otocikisyap);
    }//GEN-LAST:event_btn_otocikisyapMouseExited

    private void btn_otocikisyapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_otocikisyapMousePressed
        //OTO ÇIKIŞ YAP KODLARI
        Maintabbedpane.setSelectedIndex(2);
        mesajyaz_misafircikis.setText("");
        
    }//GEN-LAST:event_btn_otocikisyapMousePressed

    private void btn_uyeolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeolMouseEntered
        
        setColor(btn_uyeol);
    }//GEN-LAST:event_btn_uyeolMouseEntered

    private void btn_uyeolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeolMouseExited
        
        resetColor(btn_uyeol);
    }//GEN-LAST:event_btn_uyeolMouseExited

    private void btn_uyeolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyeolMousePressed
        // ÜYE OL BUTONU İÇİN GEREKEN KODLAR
        Maintabbedpane.setSelectedIndex(5);
        mesaj_yazi_uyeol.setText("");
        plakatext_uyeol.setText("");
        adsoyadtext_uyeol.setText("");
        emailtext_uyeol.setText("");
        cbox_uyelikturu_uyeol.setSelectedItem("Seçiniz...");
        cbox_parkyeri_uyeol.setSelectedItem("Seçiniz...");
        tutar_yaz.setText("");
        button_uyeol.setText("Üye Ol");
    }//GEN-LAST:event_btn_uyeolMousePressed

    private void btn_misafirgeriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirgeriMouseEntered
        
        setColor(btn_misafirgeri);
    }//GEN-LAST:event_btn_misafirgeriMouseEntered

    private void btn_misafirgeriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirgeriMouseExited
        
        resetColor(btn_misafirgeri);
    }//GEN-LAST:event_btn_misafirgeriMouseExited

    private void btn_misafirgeriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_misafirgeriMousePressed
        //misafir geri kodları 
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_misafirgeriMousePressed

    private void btn_uye_otogirisyapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otogirisyapMouseEntered
        
        setColor(btn_uye_otogirisyap);
    }//GEN-LAST:event_btn_uye_otogirisyapMouseEntered

    private void btn_uye_otogirisyapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otogirisyapMouseExited
        resetColor(btn_uye_otogirisyap);
    }//GEN-LAST:event_btn_uye_otogirisyapMouseExited

    private void btn_uye_otogirisyapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otogirisyapMousePressed
       //ÜYE GİRİŞ YAP KODLARININ BULUNDUĞU YER 
       Maintabbedpane.setSelectedIndex(3);
       mesajyazi_uyegiris.setText("");
    }//GEN-LAST:event_btn_uye_otogirisyapMousePressed

    private void btn_uyegeriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyegeriMouseEntered
        setColor(btn_uyegeri); 
    }//GEN-LAST:event_btn_uyegeriMouseEntered

    private void btn_uyegeriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyegeriMouseExited
        resetColor(btn_uyegeri);
    }//GEN-LAST:event_btn_uyegeriMouseExited

    private void btn_uyegeriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uyegeriMousePressed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_uyegeriMousePressed

    private void btn_uye_otocikisyapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otocikisyapMouseEntered
        setColor(btn_uye_otocikisyap);
    }//GEN-LAST:event_btn_uye_otocikisyapMouseEntered

    private void btn_uye_otocikisyapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otocikisyapMouseExited
        resetColor(btn_uye_otocikisyap);
    }//GEN-LAST:event_btn_uye_otocikisyapMouseExited

    private void btn_uye_otocikisyapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uye_otocikisyapMousePressed
        //üye çıkış yap kodları
        Maintabbedpane.setSelectedIndex(4);
        mesajyazi_uyecikis.setText("");
    }//GEN-LAST:event_btn_uye_otocikisyapMousePressed

    private void button_misafirgirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_misafirgirisActionPerformed
        //MİSAFİR GİRİŞİ İÇİN AYRILAN YER
        String plaka = plakatext_misafirgiris.getText();
        String adsoyad = adsoyadtext_misafirgiris.getText();
        if(misafir.aracKontrol(plaka))
        {
            mesajyazi_misafirgiris.setText("Bu araç halihazırda içeride bulunmaktadır!!!");
        }
        else
        {
            String rndparkyeri=misafir.randomParkyeri();
            String sorgu = "Select * From kayit where parkyeri = ? and durum = 1";
            while(misafir.parkyeriSorgu(rndparkyeri,sorgu))
            {
                rndparkyeri=misafir.randomParkyeri();
            }
            mesajyazi_misafirgiris.setText("Sayın "+adsoyad+" "+rndparkyeri+" no'lu yere geçebilirisiz.");
            //Şimdi kayıt ettirme kısmı 
            String giristarihi = misafir.tarihAl();
            misafir.misafirGirisyap(plaka, adsoyad, giristarihi, rndparkyeri, true);
        }
        
    }//GEN-LAST:event_button_misafirgirisActionPerformed

    private void button_misafircikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_misafircikisActionPerformed
        //MİSAFİR ÇIKIŞI İÇİN AYRILAN YER 
        String plaka = plakatext_misafircikis.getText();
        String adsoyad = adsoyadtext_misafircikis.getText();
        
        String cikistarihi = misafir.tarihAl();
        String giristarihi = misafir.giristarihiGetir(plaka);
        
        long dakika = misafir.tarihFarki(giristarihi, cikistarihi);
        double tutar = misafir.misafirTutarhesapla(dakika);
        
        misafir.misafirCikisyap(plaka, cikistarihi, tutar);
        mesajyaz_misafircikis.setText("Ödemeniz gereken Tutar: "+tutar+" TL'dir. İyi Günler...");
        
        
        
    }//GEN-LAST:event_button_misafircikisActionPerformed

    private void button_uyegirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_uyegirisActionPerformed
        //ÜYE GİRİŞ İÇİN AYRILAN YER
        String plaka = plakatext_uyegiris.getText();
        String adsoyad = adsoyadtext_uyegiris.getText();
        
        if(uyedb.aracKontrol(plaka))
        {
            mesajyazi_uyegiris.setText("Bu araç halihazırda içeride bulunmaktadır!!!");
        }
        else
        {
            String giristarihi = uyedb.tarihAl();
            String uyelikturu = uyedb.uyelikturuGetir(plaka);
            String parkyeri = uyedb.uyeparkyeriGetir(plaka);
            uyedb.uyeGirisyap(plaka, adsoyad, giristarihi, uyelikturu, parkyeri, true);
            mesajyazi_uyegiris.setText("Sayın "+adsoyad+" "+parkyeri+" no'lu yerinize geçebilirisiz.");
        }
    }//GEN-LAST:event_button_uyegirisActionPerformed

    private void button_uyecikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_uyecikisActionPerformed
        //ÜYE ÇIKIŞ İÇİN AYRILAN YER 
        String plakatext = plakatext_uyecikis.getText();
        String adsoyadtext = adsoyadtext_uyecikis.getText();
        
        String cikistarihi = uyedb.tarihAl();
        String giristarihi = uyedb.giristarihiGetir(plakatext);
        String uyelikturu = uyedb.uyelikturuGetir(plakatext);
        long dakika = uyedb.tarihFarki(giristarihi, cikistarihi);
        double tutar = uyedb.uyeTutarhesapla(uyelikturu, dakika);
        uyedb.uyeCikisyap(plakatext, adsoyadtext, cikistarihi, tutar);
        mesajyazi_uyecikis.setText("Ödemeniz gereken Tutar: "+tutar+" TL'dir. İyi Günler...");
        
        
        
        
    }//GEN-LAST:event_button_uyecikisActionPerformed

    private void button_uyeolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_uyeolActionPerformed
        //  ÜYE EKLE BUTONU 
        String plakatext = plakatext_uyeol.getText();
        String adsoyadtext = adsoyadtext_uyeol.getText();
        String emailtext = emailtext_uyeol.getText();
        String uyeliktext = (String) cbox_uyelikturu_uyeol.getSelectedItem();
        String parkyeritext = (String) cbox_parkyeri_uyeol.getSelectedItem();
        String tutartext =  tutar_yaz.getText();
        
        String sorgu = "Select * From üye where parkyeri = ?";
        if(uyedb.parkyeriSorgu(parkyeritext,sorgu))
        {
            mesaj_yazi_uyeol.setText("LÜTFEN BAŞKA BİR PARK YERİ SEÇİNİZ!!!");
        }
        else
        {
            uyedb.uyeEkle(plakatext, adsoyadtext, emailtext, uyeliktext, parkyeritext, tutartext);
            mesaj_yazi_uyeol.setText("Üyelik sisteme eklendi!");
            
        }  
    }//GEN-LAST:event_button_uyeolActionPerformed

    private void cbox_uyelikturu_uyeolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_uyelikturu_uyeolActionPerformed
        //ÜYELİK TÜRÜ COMBOBOX
        cbox_parkyeri_uyeol.removeAllItems();
        if(cbox_uyelikturu_uyeol.getSelectedIndex()==1)
        {
            tutar_yaz.setText("50");
            cbox_parkyeri_uyeol.addItem("Seçiniz...");
            cbox_parkyeri_uyeol.addItem("e1");
            cbox_parkyeri_uyeol.addItem("e2");
            cbox_parkyeri_uyeol.addItem("e3");
            cbox_parkyeri_uyeol.addItem("e4");
            cbox_parkyeri_uyeol.addItem("e5");
            cbox_parkyeri_uyeol.addItem("e6");
            cbox_parkyeri_uyeol.addItem("e7");
            cbox_parkyeri_uyeol.addItem("e8");
            cbox_parkyeri_uyeol.addItem("e9");
            cbox_parkyeri_uyeol.addItem("e10"); 
        }
        else if(cbox_uyelikturu_uyeol.getSelectedIndex()== 2)
        {
            tutar_yaz.setText("70");
            cbox_parkyeri_uyeol.addItem("Seçiniz...");
            cbox_parkyeri_uyeol.addItem("f1");
            cbox_parkyeri_uyeol.addItem("f2");
            cbox_parkyeri_uyeol.addItem("f3");
            cbox_parkyeri_uyeol.addItem("f4");
            cbox_parkyeri_uyeol.addItem("f5");
            cbox_parkyeri_uyeol.addItem("f6");
            cbox_parkyeri_uyeol.addItem("f7");
            cbox_parkyeri_uyeol.addItem("f8");
            cbox_parkyeri_uyeol.addItem("f9");
            cbox_parkyeri_uyeol.addItem("f10");
            
            
        }
        else if(cbox_uyelikturu_uyeol.getSelectedIndex()== 3)
        {
            tutar_yaz.setText("90");
            cbox_parkyeri_uyeol.addItem("Seçiniz...");
            cbox_parkyeri_uyeol.addItem("g1");
            cbox_parkyeri_uyeol.addItem("g2");
            cbox_parkyeri_uyeol.addItem("g3");
            cbox_parkyeri_uyeol.addItem("g4");
            cbox_parkyeri_uyeol.addItem("g5");
            cbox_parkyeri_uyeol.addItem("g6");
            cbox_parkyeri_uyeol.addItem("g7");
            cbox_parkyeri_uyeol.addItem("g8");
            cbox_parkyeri_uyeol.addItem("g9");
            cbox_parkyeri_uyeol.addItem("g10");  
        }
    }//GEN-LAST:event_cbox_uyelikturu_uyeolActionPerformed

    private void plakatext_misafircikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plakatext_misafircikisActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_plakatext_misafircikisActionPerformed

    private void label_Misfir_otogirisyapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Misfir_otogirisyapMouseClicked
        // sistem zamanı alınıp veri tabanına kaydedilecek.
    }//GEN-LAST:event_label_Misfir_otogirisyapMouseClicked

    private void btn_uyesil_uyesilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uyesil_uyesilActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) uyesil_tablosu.getModel();
        int secilensatir = uyesil_tablosu.getSelectedRow();
        
        if (secilensatir == -1) {
           if (model.getRowCount() == 0 ) {
               mesajyazi_uyesil.setText("Üye tablosu şu anda boş...");
           }
           else {
               mesajyazi_uyesil.setText("Lütfen silinecek bir çalışan seçin...");
           }
       }
       else {
           String plaka = (String) model.getValueAt(secilensatir,0);
           
           uyedb.uyeSil(plaka);
           
           uyeGoruntule(model);
           
           mesajyazi_uyesil.setText(plaka+" 'lı araç üyelik sisteminden silinmiştir.");
       }     
    }//GEN-LAST:event_btn_uyesil_uyesilActionPerformed

    private void button_uyeguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_uyeguncelleActionPerformed
        //ÜYE GÜNCELLEME KOMUTLARI
        model = (DefaultTableModel) uyeguncelle_tablosu.getModel();
        String plakatext = plakatext_uyeguncelle.getText();
        String adsoyadtext = adsoyadtext_uyeguncelle.getText();
        String emailtext = emailtext_uyeguncelle.getText();
        String uyelikturu = uyelikturutext_uyeguncelle.getText();
        String parkyeri = parkyeritext_uyeguncelle.getText();
        String tutartext =  tutaryazi_uyeguncelle.getText();
        
        uyedb.uyeGuncelle(adsoyadtext, emailtext, uyelikturu, parkyeri, tutartext, plakatext);
        uyeGoruntule(model);
        plakatext_uyeguncelle.setText("");
        adsoyadtext_uyeguncelle.setText("");
        emailtext_uyeguncelle.setText("");
        uyelikturutext_uyeguncelle.setText("");
        parkyeritext_uyeguncelle.setText("");
        tutaryazi_uyeguncelle.setText("");
        
             
    }//GEN-LAST:event_button_uyeguncelleActionPerformed

    private void uyeguncelle_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeguncelle_tablosuMouseClicked
        int secilensatir = uyeguncelle_tablosu.getSelectedRow();
        plakatext_uyeguncelle.setText(model.getValueAt(secilensatir,0).toString());
        adsoyadtext_uyeguncelle.setText(model.getValueAt(secilensatir,1).toString());
        emailtext_uyeguncelle.setText(model.getValueAt(secilensatir,2).toString());
        uyelikturutext_uyeguncelle.setText(model.getValueAt(secilensatir,3).toString());
        parkyeritext_uyeguncelle.setText(model.getValueAt(secilensatir,4).toString());
        tutaryazi_uyeguncelle.setText(model.getValueAt(secilensatir,5).toString());
        
        
    }//GEN-LAST:event_uyeguncelle_tablosuMouseClicked

    private void button_yonetimgirisyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_yonetimgirisyapActionPerformed
      String kullaniciadi = kullaniciaditext_yonetim.getText();
      String sifre = sifretext_yonetim.getText();
      if(uyedb.yonetimGiris(kullaniciadi,sifre))
      {
          jTabbedPane1.setSelectedIndex(0);
          mesajyazi_yonetim.setText("Giriş Başarılı");
      }
      else 
      {
          mesajyazi_yonetim.setText("Yanlış id veya şifre!");
  
      }

    }//GEN-LAST:event_button_yonetimgirisyapActionPerformed

    private void adsoyadtext_uyecikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsoyadtext_uyecikisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adsoyadtext_uyecikisActionPerformed

    private void emailtext_uyeolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtext_uyeolKeyPressed
        String email = emailtext_uyeol.getText();
        if(checkEmail(email))
        {
            mesaj_yazi_uyeol.setText("");
        }
        else
        {
            mesaj_yazi_uyeol.setText("Lütfen geçerli bir e mail giriniz....");
        }
        
    }//GEN-LAST:event_emailtext_uyeolKeyPressed

    public static boolean checkEmail(String email){
        return Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email);
    }
    public void uyeGoruntule(DefaultTableModel model){
        model.setRowCount(0);
        
        ArrayList<Uye> uyeler = new ArrayList<Uye>();
        uyeler = uyedb.uyeleriGetir();
        
        if (uyeler!= null ) {
            
            for (Uye uyek : uyeler) {
                Object[] ekle = {uyek.getPlaka(),uyek.getAdsoyad(),uyek.getEmail(),uyek.getUyelikturu(),uyek.getParkyeri(),uyek.getTutar()};
                
                model.addRow(ekle);   
            }  
        }
    }
    public void kayitGoruntule(DefaultTableModel model)
    {
        model.setRowCount(0);
        ArrayList<Kayit> kayitlar = new ArrayList<Kayit>();
        
        kayitlar = misafir.kayitlariGetir();
        
        if(kayitlar != null)
        {
            for(Kayit kayitek :kayitlar)
            {
                Object[] ekle = {kayitek.getId(),kayitek.getPlaka(),kayitek.getAdsoyad(),kayitek.getGiristarihi(),kayitek.getCikistarihi(),kayitek.getTur(),kayitek.getParkyeri(),kayitek.getTutar(),kayitek.isDurum()};
                model.addRow(ekle);
            }
        }  
    }
    
    void setColor(JPanel panel)
    {
        panel.setBackground(new Color(0,102,255));
    }
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(51,51,255));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anasayfa;
    private javax.swing.JLabel Hosgeldiniz;
    private javax.swing.JLabel Hosgeldiniz1;
    private javax.swing.JLabel Kapat_simgesi;
    private javax.swing.JTabbedPane Maintabbedpane;
    private javax.swing.JPanel Misafir_giris;
    private javax.swing.JPanel Misafir_listele;
    private javax.swing.JPanel Misfir_cikis;
    private javax.swing.JLabel Plaka_misafirgiris;
    private javax.swing.JLabel Plaka_misafirgiris1;
    private javax.swing.JLabel Plaka_misafirgiris2;
    private javax.swing.JLabel Plaka_misafirgiris3;
    private javax.swing.JLabel Plaka_misafirgiris4;
    private javax.swing.JLabel Plaka_misafirgiris5;
    private javax.swing.JLabel Plaka_misafirgiris6;
    private javax.swing.JLabel Plaka_misafirgiris7;
    private javax.swing.JLabel Plaka_misafirgiris9;
    private javax.swing.JLabel Tutar_Label;
    private javax.swing.JPanel Uye_cikis;
    private javax.swing.JPanel Uye_giris;
    private javax.swing.JPanel Uye_guncelle;
    private javax.swing.JPanel Uye_listele;
    private javax.swing.JPanel Uye_ol;
    private javax.swing.JPanel Uye_sil;
    private javax.swing.JPanel Uyepanel;
    private javax.swing.JLabel adsoyad_misafirgiris;
    private javax.swing.JLabel adsoyad_uyecikis;
    private javax.swing.JLabel adsoyad_uyegiris;
    private javax.swing.JLabel adsoyad_uyeol;
    private javax.swing.JTextField adsoyadtext_misafircikis;
    private javax.swing.JTextField adsoyadtext_misafirgiris;
    private javax.swing.JTextField adsoyadtext_uyecikis;
    private javax.swing.JTextField adsoyadtext_uyegiris;
    private javax.swing.JTextField adsoyadtext_uyeguncelle;
    private javax.swing.JTextField adsoyadtext_uyeol;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_geri;
    private javax.swing.JPanel btn_misafir;
    private javax.swing.JPanel btn_misafirgeri;
    private javax.swing.JPanel btn_otocikisyap;
    private javax.swing.JPanel btn_otogirisyap;
    private javax.swing.JPanel btn_uye;
    private javax.swing.JPanel btn_uye_otocikisyap;
    private javax.swing.JPanel btn_uye_otogirisyap;
    private javax.swing.JPanel btn_uyegeri;
    private javax.swing.JPanel btn_uyeol;
    private javax.swing.JButton btn_uyesil_uyesil;
    private javax.swing.JPanel btn_yntm;
    private javax.swing.JPanel btn_yntm_musteri_listele;
    private javax.swing.JPanel btn_yntm_uye_ekle;
    private javax.swing.JPanel btn_yntm_uye_guncelle;
    private javax.swing.JPanel btn_yntm_uye_listele;
    private javax.swing.JPanel btn_yntm_uye_sil;
    private javax.swing.JButton button_misafircikis;
    private javax.swing.JButton button_misafirgiris;
    private javax.swing.JButton button_uyecikis;
    private javax.swing.JButton button_uyegiris;
    private javax.swing.JButton button_uyeguncelle;
    private javax.swing.JButton button_uyeol;
    private javax.swing.JButton button_yonetimgirisyap;
    private javax.swing.JComboBox<String> cbox_parkyeri_uyeol;
    private javax.swing.JComboBox<String> cbox_uyelikturu_uyeol;
    private javax.swing.JLabel email_uyeol;
    private javax.swing.JTextField emailtext_uyeguncelle;
    private javax.swing.JTextField emailtext_uyeol;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable kayit_tablosu;
    private javax.swing.JTextField kullaniciaditext_yonetim;
    private javax.swing.JLabel label_Misfir_geri;
    private javax.swing.JLabel label_Misfir_otocikisyap;
    private javax.swing.JLabel label_Misfir_otogirisyap;
    private javax.swing.JLabel label_Misfir_uyeol;
    private javax.swing.JLabel label_Uye_geri;
    private javax.swing.JLabel label_Uye_otocikisyap;
    private javax.swing.JLabel label_Uye_otogirisyap;
    private javax.swing.JLabel label_geri;
    private javax.swing.JLabel label_misafir;
    private javax.swing.JLabel label_misafirlist;
    private javax.swing.JLabel label_uye;
    private javax.swing.JLabel label_uyeekle;
    private javax.swing.JLabel label_uyeguncelle;
    private javax.swing.JLabel label_uyelist;
    private javax.swing.JLabel label_uyesil;
    private javax.swing.JLabel label_yonetim;
    private javax.swing.JLabel logo_Misafir_geri;
    private javax.swing.JLabel logo_Misafir_otogirisyap;
    private javax.swing.JLabel logo_Misfir_otocikisyap;
    private javax.swing.JLabel logo_Misfir_uyeol;
    private javax.swing.JLabel logo_Uye_geri;
    private javax.swing.JLabel logo_Uye_otocikisyap;
    private javax.swing.JLabel logo_Uye_otogirisyap;
    private javax.swing.JLabel logo_geri;
    private javax.swing.JLabel logo_misafir;
    private javax.swing.JLabel logo_misafirlist;
    private javax.swing.JLabel logo_uye;
    private javax.swing.JLabel logo_uyeekle;
    private javax.swing.JLabel logo_uyeguncelle;
    private javax.swing.JLabel logo_uyelist;
    private javax.swing.JLabel logo_uyesil;
    private javax.swing.JLabel logo_yonetim;
    private javax.swing.JPanel logopanel;
    private javax.swing.JLabel mesaj_yazi_uyeol;
    private javax.swing.JLabel mesajyaz_misafircikis;
    private javax.swing.JLabel mesajyazi_misafirgiris;
    private javax.swing.JLabel mesajyazi_uyecikis;
    private javax.swing.JLabel mesajyazi_uyecikis1;
    private javax.swing.JLabel mesajyazi_uyecikis2;
    private javax.swing.JLabel mesajyazi_uyecikis3;
    private javax.swing.JLabel mesajyazi_uyecikis4;
    private javax.swing.JLabel mesajyazi_uyegiris;
    private javax.swing.JLabel mesajyazi_uyesil;
    private javax.swing.JLabel mesajyazi_yonetim;
    private javax.swing.JPanel misafirpanel;
    private javax.swing.JLabel parkyeri_uyeol;
    private javax.swing.JTextField parkyeritext_uyeguncelle;
    private javax.swing.JLabel plaka_uyecikis;
    private javax.swing.JLabel plaka_uyegiris;
    private javax.swing.JLabel plaka_uyeol;
    private javax.swing.JTextField plakatext_misafircikis;
    private javax.swing.JTextField plakatext_misafirgiris;
    private javax.swing.JTextField plakatext_uyecikis;
    private javax.swing.JTextField plakatext_uyegiris;
    private javax.swing.JTextField plakatext_uyeguncelle;
    private javax.swing.JTextField plakatext_uyeol;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPasswordField sifretext_yonetim;
    private javax.swing.JPanel toppanel;
    private javax.swing.JLabel tutar_yaz;
    private javax.swing.JLabel tutaryazi_uyeguncelle;
    private javax.swing.JTable uye_tablosu;
    private javax.swing.JTable uyeguncelle_tablosu;
    private javax.swing.JLabel uyelikturu_uyeol;
    private javax.swing.JTextField uyelikturutext_uyeguncelle;
    private javax.swing.JTable uyesil_tablosu;
    private javax.swing.JPanel yonetimpanel;
    // End of variables declaration//GEN-END:variables
}
