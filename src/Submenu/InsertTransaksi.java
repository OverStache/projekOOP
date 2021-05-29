/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submenu;

import GUIZakat.DatabaseConnection;
import GUIZakat.Hitung;
import menu.Admin;
import menu.Login;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static menu.Login.idUser;
import menu.User;
/**
 *
 * @author Ivan
 */
public class InsertTransaksi extends javax.swing.JFrame {
    int input,JZpertanian,jz,nisob;
    static int count;
    Connection conn;
    Statement st;
    ResultSet rs;
    String sql;
    JFrame frame = new JFrame();
    Hitung kls = new Hitung();
    public InsertTransaksi() {
        initComponents();
        comboTable(); 
//        cmbMuzakki.setSelectedIndex(count-1);
        cmbJenisZakat.setSelectedIndex(0);
    }
    public final void comboTable(){
        try{
            conn = new DatabaseConnection().setConnection();
            sql="select * from tbl_muzakki";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String nama=rs.getString("NamaMuzakki");
                String id=rs.getString("idMuzakki");
                cmbMuzakki.addItem(nama);
                cmbIDMuzakki.addItem(id);
                count=cmbMuzakki.getItemCount();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbJenisZakat = new javax.swing.JComboBox<>();
        lblJumlahZakat = new javax.swing.JLabel();
        lblOutputZakat = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblReset = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblJumlah = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txfJumlah = new javax.swing.JTextField();
        lblRp1 = new javax.swing.JLabel();
        lblJZPertanian = new javax.swing.JLabel();
        cmbJZPertanian = new javax.swing.JComboBox<>();
        lblKeterangan = new javax.swing.JLabel();
        cmbMuzakki = new javax.swing.JComboBox<>();
        cmbIDMuzakki = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Transaksi Baru ");

        cmbJenisZakat.setBackground(new java.awt.Color(153, 153, 255));
        cmbJenisZakat.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cmbJenisZakat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih jenis zakat", "Zakat Maal", "Zakat Fitrah", "Zakat Pertanian" }));
        cmbJenisZakat.setBorder(null);
        cmbJenisZakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisZakatActionPerformed(evt);
            }
        });

        lblJumlahZakat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblJumlahZakat.setText("Jumlah Zakat (Rp.)");

        lblOutputZakat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblOutputZakat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnExit.setBackground(new java.awt.Color(102, 102, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblReset.setBackground(new java.awt.Color(102, 102, 255));
        lblReset.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lblReset.setForeground(new java.awt.Color(255, 255, 255));
        lblReset.setText("Reset");
        lblReset.setBorderPainted(false);
        lblReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblResetActionPerformed(evt);
            }
        });

        btnHitung.setBackground(new java.awt.Color(102, 102, 255));
        btnHitung.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(255, 255, 255));
        btnHitung.setText("Hitung");
        btnHitung.setBorderPainted(false);
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(102, 102, 255));
        btnBayar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.setBorderPainted(false);
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));

        jSeparator2.setBackground(new java.awt.Color(229, 229, 229));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblJumlah.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(153, 153, 255));

        txfJumlah.setBackground(new java.awt.Color(153, 153, 255));
        txfJumlah.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txfJumlah.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfJumlah.setBorder(null);

        lblRp1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblRp1.setText("Rp.");

        lblJZPertanian.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblJZPertanian.setText("Jenis Pengairan Zakat Pertanian");

        cmbJZPertanian.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbJZPertanian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alami", "Irigasi" }));
        cmbJZPertanian.setBorder(null);

        lblKeterangan.setText("*harga beras @ Rp.15000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblJZPertanian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbJZPertanian, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblKeterangan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfJumlah)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJZPertanian)
                    .addComponent(cmbJZPertanian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRp1)
                    .addComponent(txfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKeterangan)
                .addGap(10, 10, 10))
        );

        cmbMuzakki.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Muzakki" }));
        cmbMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMuzakkiActionPerformed(evt);
            }
        });

        cmbIDMuzakki.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih ID Muzakki" }));
        cmbIDMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDMuzakkiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(cmbJenisZakat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblJumlahZakat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOutputZakat, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbMuzakki, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbIDMuzakki, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(cmbJenisZakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJumlahZakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutputZakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbIDMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReset)
                            .addComponent(btnHitung))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnExit))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisZakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisZakatActionPerformed
        jz=cmbJenisZakat.getSelectedIndex();;       
        txfJumlah.setText(null);
        jPanel2.setVisible(true);
        lblKeterangan.setText("harga beras @ Rp. 15.000");
        lblJZPertanian.setVisible(false);
        cmbJZPertanian.setVisible(false);
        switch (jz) {
            case 1:
                lblRp1.setText("Rp");
                lblKeterangan.setText("harga emas @ Rp. 850.000, nisob @ Rp. 72.250.000");
                lblJumlah.setText("Masukkan jumlah harta");
                nisob=72250000;
                break;
            case 2:
                lblRp1.setText("");
                lblJumlah.setText("Masukkan jumlah jiwa yang ingin dibayarkan zakat");
                nisob=0;
                break;
            case 3:
                lblJZPertanian.setVisible(true);
                cmbJZPertanian.setVisible(true);                
                lblRp1.setText("Kg");
                lblKeterangan.setText(lblKeterangan.getText()+", nisob @ 750 Kg");
                lblJumlah.setText("Masukkan jumlah hasil panen");
                nisob=750;
                break;
            default:
                jPanel2.setVisible(false);
                break;
        }
    }//GEN-LAST:event_cmbJenisZakatActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        if(jz==0){
            JOptionPane.showMessageDialog(frame,"Silahkan pilih jenis zakat");
        }
        else{ 
            try{    
                input=Integer.parseInt(txfJumlah.getText());
                if(input>nisob){
                    switch(jz){
                        case 1: lblOutputZakat.setText(kls.maal(input));                        
                                break;
                        case 2: lblOutputZakat.setText(kls.fitrah(input));
                                break;
                        case 3: JZpertanian=cmbJZPertanian.getSelectedIndex();
                                lblOutputZakat.setText(kls.pertanian(input,JZpertanian));
                                break;
                        default:break;
                    }
                }
                else{ 
                JOptionPane.showMessageDialog(frame,"Anda belum mencapai nisob");
                }                      
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(frame,"Silahkan masukkan jumlah");
            }
        }           
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        if(jz==0|cmbMuzakki.getSelectedIndex()==0|lblOutputZakat.getText().equals("")){                    
            JOptionPane.showMessageDialog(frame,"Data belum lengkap");
        }
        else{
            conn = new DatabaseConnection().setConnection();
            try{
                sql = "INSERT INTO tbl_transaksi_zakat (idUSer, idMuzakki, idJenisZakat, JumlahZakat) "
                    + "VALUES ('"+idUser+"', '"+cmbIDMuzakki.getSelectedItem().toString()+"', "
                    + "'"+cmbJenisZakat.getSelectedIndex()+"', '"+lblOutputZakat.getText()+"')";
                st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(frame, 
                "Telah dibayarkan "+cmbJenisZakat.getSelectedItem().toString()+
                "\nAtas nama "+cmbMuzakki.getSelectedItem().toString()+
                "\nSebesar Rp."+lblOutputZakat.getText());  
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(frame,"anda harus login");
                System.out.println(e);
            }  
        } 
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblResetActionPerformed
        cmbJenisZakat.setSelectedIndex(0);
        txfJumlah.setText("");
        lblOutputZakat.setText("");
    }//GEN-LAST:event_lblResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        if (new Login().role==0) {
            System.out.println("anda admin"); 
            new Admin().setVisible(true);
        }
        else{
            System.out.println("anda usher");
            new User().setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMuzakkiActionPerformed
        cmbIDMuzakki.setSelectedIndex(cmbMuzakki.getSelectedIndex());
    }//GEN-LAST:event_cmbMuzakkiActionPerformed

    private void cmbIDMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDMuzakkiActionPerformed
        cmbMuzakki.setSelectedIndex(cmbIDMuzakki.getSelectedIndex());
    }//GEN-LAST:event_cmbIDMuzakkiActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Login().setVisible(true);
                new InsertTransaksi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbIDMuzakki;
    private javax.swing.JComboBox<String> cmbJZPertanian;
    public javax.swing.JComboBox<String> cmbJenisZakat;
    private javax.swing.JComboBox<String> cmbMuzakki;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblJZPertanian;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblJumlahZakat;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblOutputZakat;
    private javax.swing.JButton lblReset;
    private javax.swing.JLabel lblRp1;
    public javax.swing.JTextField txfJumlah;
    // End of variables declaration//GEN-END:variables
}
