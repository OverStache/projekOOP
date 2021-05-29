/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submenu;

import GUIZakat.DatabaseConnection;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.Admin;
import menu.Login;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ivan
 */
public class UserOption extends javax.swing.JFrame {
    Connection conn;
    Statement st;
    ResultSet rs;
    String sql;
    JFrame frame = new JFrame();
    public UserOption() {
        initComponents();
        showTable();
    }

    public final void showTable(){
        conn = new DatabaseConnection().setConnection();
        try{
            sql = "SELECT * FROM tbl_user";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            tblUser.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println("Error Coy "+e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlUser = new javax.swing.JPanel();
        jScrollPaneMuzakki = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblUser = new javax.swing.JLabel();
        lblInsertUser = new javax.swing.JLabel();
        txfID = new javax.swing.JTextField();
        btnDelUser = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btnZakat = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        pnlUser.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPaneMuzakki.setAutoscrolls(true);

        tblUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Muzakki", "null", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClick(evt);
            }
        });
        jScrollPaneMuzakki.setViewportView(tblUser);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUser.setText("Daftar User");

        lblInsertUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblInsertUser.setText("ID");

        txfID.setEditable(false);
        txfID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnDelUser.setBackground(new java.awt.Color(229, 229, 229));
        btnDelUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDelUser.setText("Hapus");
        btnDelUser.setBorder(null);
        btnDelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelUserActionPerformed(evt);
            }
        });

        btnAddUser.setBackground(new java.awt.Color(229, 229, 229));
        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddUser.setText("Tambah User");
        btnAddUser.setBorder(null);
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnEditUser.setBackground(new java.awt.Color(229, 229, 229));
        btnEditUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditUser.setText("Edit");
        btnEditUser.setBorder(null);
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(153, 153, 255));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPassword.setText("Password");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblUsername.setText("Username");

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblRole.setText("Role");

        txfUsername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txfPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel1.setText("Klik baris pada tabel");

        cmbRole.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblUser)))
                .addGap(18, 18, 18)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlUserLayout.createSequentialGroup()
                                    .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblInsertUser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfPassword)
                                        .addComponent(txfUsername)
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                            .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(cmbRole, 0, 84, Short.MAX_VALUE)))
                                .addGroup(pnlUserLayout.createSequentialGroup()
                                    .addComponent(btnDelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEditUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblUser)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInsertUser)
                            .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRole)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        btnZakat.setBackground(new java.awt.Color(102, 102, 255));
        btnZakat.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnZakat.setForeground(new java.awt.Color(255, 255, 255));
        btnZakat.setText("Zakat Menu");
        btnZakat.setBorder(null);
        btnZakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZakatActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(102, 102, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(102, 102, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnZakat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZakat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelUserActionPerformed
        if(txfID.getText().equals("")){
            JOptionPane.showMessageDialog(frame,"Silahkan pilih User pada tabel");
        }
        else{
            conn = new DatabaseConnection().setConnection();
            try{
                sql = "delete from tbl_user where id='"+txfID.getText()+"' ";
                st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(frame, "User berhasil dihapus");
            }
            catch(Exception e){
                System.out.println("tableview "+e);
                JOptionPane.showMessageDialog(frame, "User memiliki riwayat");
            }
            showTable();
            txfID.setText("");
            txfUsername.setText("");
            txfPassword.setText("");
            cmbRole.setSelectedIndex(0);
        }                 
    }//GEN-LAST:event_btnDelUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        if(txfID.getText().equals("")){
            JOptionPane.showMessageDialog(frame,"Silahkan pilih User pada tabel");
        }  
        else{
            conn = new DatabaseConnection().setConnection(); 
            try{                
                sql = "UPDATE tbl_user SET username = '"+txfUsername.getText()+"', password = '"+txfPassword.getText()+"', "
                      + "role = '"+cmbRole.getSelectedItem().toString()+"' WHERE id = '"+txfID.getText()+"'";
                st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(frame,"User berhasil diupdate");                
            }
            catch(Exception e){
                System.out.println("updateMuzakki "+e);
            }
            showTable();
            txfID.setText("");
            txfUsername.setText("");
            txfPassword.setText("");
            cmbRole.setSelectedIndex(0);
        }            
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        if(txfUsername.getText().equals("")|txfPassword.getText().equals("")){
            JOptionPane.showMessageDialog(frame,"Username dan password tidak boleh kosong");
        }
        else{
            conn = new DatabaseConnection().setConnection(); 
            try{                
                sql = "insert into tbl_user (username, password, role) "
                      + "values ('"+txfUsername.getText()+"','"+txfPassword.getText()+"','"+cmbRole.getSelectedItem().toString()+"')";           
                st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(frame,"User berhasil ditambahkan");
            }
            catch(Exception e){
                System.out.println("updateuser "+e);
            }
            showTable();
            txfID.setText("");
            txfUsername.setText("");
            txfPassword.setText("");
            cmbRole.setSelectedIndex(0);
        }        
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void tblUserMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClick
        int row = tblUser.getSelectedRow();
        DefaultTableModel user = (DefaultTableModel)tblUser.getModel();
        txfID.setText(user.getValueAt(row,0).toString());
        txfUsername.setText(user.getValueAt(row,1).toString());
        txfPassword.setText(user.getValueAt(row,2).toString());
        cmbRole.setSelectedItem(user.getValueAt(row,3).toString());
    }//GEN-LAST:event_tblUserMouseClick

    private void btnZakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZakatActionPerformed
        this.dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_btnZakatActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    
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
            java.util.logging.Logger.getLogger(UserOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOption().setVisible(true);
//                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDelUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnZakat;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneMuzakki;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblInsertUser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsername;
    public javax.swing.JPanel pnlUser;
    public javax.swing.JTable tblUser;
    private javax.swing.JTextField txfID;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
