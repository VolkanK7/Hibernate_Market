/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lesson.hibernate.view;

import com.lesson.hibernate.entity.urunler;
import com.lesson.hibernate.util.HibernateUtil;
import java.awt.TrayIcon;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author volka
 */
public class UrunGuncelleFrame extends javax.swing.JFrame {

    /**
     * Creates new form UrunGuncelleFrame
     */
    public UrunGuncelleFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_UrunAdedi = new javax.swing.JTextField();
        txt_AlisFiyati = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_SatisFiyati = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_KDV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbx_Kategori = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Temizle = new javax.swing.JButton();
        btn_Guncelle = new javax.swing.JButton();
        txt_BarkodNo = new javax.swing.JTextField();
        txt_UrunAdi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("??r??n G??ncelleme Ekran??");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        txt_UrunAdedi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_UrunAdedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UrunAdediActionPerformed(evt);
            }
        });

        txt_AlisFiyati.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("??r??n Adedi :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("??r??n Ad?? :");

        txt_SatisFiyati.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("??r??n Kategorisi :");

        txt_KDV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_KDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KDVActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("??r??n Al???? Fiyat?? :");

        cbx_Kategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbx_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuru G??da", "??ark??teri", "Bak??m ??r??nleri", "Et ve Et ??r??nleri", "S??t ve S??t ??r??nleri", "Meyve Sebze", "????ecek", "Temizlik ??r??nleri", "Kozmetik ve Ki??isel Bak??m" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("??r??n Sat???? Fiyat?? :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("KDV Oran?? :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Barkod No :");

        btn_Temizle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Temizle.setText("TEM??ZLE");
        btn_Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TemizleActionPerformed(evt);
            }
        });

        btn_Guncelle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Guncelle.setText("G??NCELLE");
        btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuncelleActionPerformed(evt);
            }
        });

        txt_BarkodNo.setBackground(new java.awt.Color(255, 102, 0));
        txt_BarkodNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_BarkodNo.setForeground(new java.awt.Color(255, 255, 255));
        txt_BarkodNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BarkodNoActionPerformed(evt);
            }
        });

        txt_UrunAdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel1.setText("* G??ncellemek istedi??iniz ??r??n??n barkod no'sunu girdikten sonra 'ENTER' tu??una bas??n??z.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(txt_BarkodNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel12)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SatisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_KDV, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btn_Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14)
                        .addGap(31, 31, 31)
                        .addComponent(txt_UrunAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_AlisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbx_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(txt_BarkodNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_UrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_AlisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(btn_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SatisFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_KDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(btn_Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_UrunAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UrunAdediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UrunAdediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UrunAdediActionPerformed

    private void txt_KDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_KDVActionPerformed

    private void btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {
        Transaction transaction = null;
        //Hibernate hql ile veriler ??r??n barkod numaras??na g??re bulundu ve listelendi.
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM urunler E WHERE E.u_barkodno = " + txt_BarkodNo.getText();
            Query query = session.createQuery(hql);
            List <urunler> result = (List<urunler>)query.list();
            for(urunler u : result){
                //d??ng?? yard??m??yla t??m verilere gerekli component'ler ile set i??lemi uyguland??.
                u.setU_adi(txt_UrunAdi.getText());
                u.setU_kategori(cbx_Kategori.getSelectedItem().toString());
                u.setU_alisfiyati(Double.parseDouble(txt_AlisFiyati.getText()));
                u.setU_satisfiyati(Double.parseDouble(txt_SatisFiyati.getText()));
                u.setU_kdv(Integer.parseInt(txt_KDV.getText())); 
                u.setU_miktar(Integer.parseInt(txt_UrunAdedi.getText()));
                //Set i??lemi uygulanan veriler hibernate update metodu ile g??ncellendi.
                session.update(u);
                //kullan??c??ya bilgi mesaj?? verildi.
                JOptionPane.showMessageDialog(null,u.getU_barkodno() 
                    +" barkodlu ??r??n ba??ar??yla g??ncellendi !","Ba??ar??l??",JOptionPane.INFORMATION_MESSAGE);
            }           
            transaction.commit(); 
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    //Barkod no ??zerinden ??r??n bilgilerini component'lere getirme i??lemi
    private void txt_BarkodNoActionPerformed(java.awt.event.ActionEvent evt) {
        Transaction transaction = null;
        //Hibernate hql ile select sorgusu yaz??ld?? ve barkodNo'ya g??re ??r??n bilgileri liste ??eklinde al??nd??.
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM urunler E WHERE E.u_barkodno = " + txt_BarkodNo.getText();
            Query query = session.createQuery(hql);
            List <urunler> result = (List<urunler>)query.list();
            //for d??ng??s?? ile listeden istenen veriler gerekli component'lere aktar??ld??.
            for(urunler u : result){
                txt_UrunAdi.setText(u.getU_adi());
                cbx_Kategori.setSelectedItem(u.getU_kategori());
                txt_AlisFiyati.setText(String.valueOf(u.getU_alisfiyati()));
                txt_SatisFiyati.setText(String.valueOf(u.getU_satisfiyati()));
                txt_KDV.setText(String.valueOf(u.getU_kdv()));
                txt_UrunAdedi.setText(String.valueOf(u.getU_miktar())); 
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    private void btn_TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TemizleActionPerformed
        txt_AlisFiyati.setText("");
        txt_BarkodNo.setText("");
        txt_KDV.setText("");
        txt_SatisFiyati.setText("");
        txt_UrunAdedi.setText("");
        txt_UrunAdi.setText("");
    }//GEN-LAST:event_btn_TemizleActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MarketFrame mf = new MarketFrame();
        mf.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UrunGuncelleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunGuncelleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunGuncelleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunGuncelleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrunGuncelleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guncelle;
    private javax.swing.JButton btn_Temizle;
    private javax.swing.JComboBox<String> cbx_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_AlisFiyati;
    private javax.swing.JTextField txt_BarkodNo;
    private javax.swing.JTextField txt_KDV;
    private javax.swing.JTextField txt_SatisFiyati;
    private javax.swing.JTextField txt_UrunAdedi;
    private javax.swing.JTextField txt_UrunAdi;
    // End of variables declaration//GEN-END:variables
}
