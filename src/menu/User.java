package menu;


import GUIZakat.DatabaseConnection;
import Submenu.InsertMuzakki;
import Submenu.InsertTransaksi;
import java.sql.*;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;


public class User extends javax.swing.JFrame {

    Connection conn;
    Statement st, st1;
    ResultSet rs,rs1;
    String sql,sql1;
    public User() {
        initComponents();
        showTable();
    }
    public final void showTable(){
        try{       
            conn = new DatabaseConnection().setConnection();
            sql= "select idJenisZakat as 'ID', JenisZakat as 'Jenis Zakat', JumlahZakat as 'Jumlah' from tbl_jenis_zakat";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            tblTotalZakat.setModel(DbUtils.resultSetToTableModel(rs)); 
            
            sql1= "select idMuzakki as 'ID', NamaMuzakki as 'Nama', AlamatMuzakki as 'Alamat', email as 'e-mail', hp as 'no. HP' from tbl_muzakki";
            st1 = conn.createStatement();
            rs1 = st1.executeQuery(sql1);
            tblMuzakki.setModel(DbUtils.resultSetToTableModel(rs1));                                
        }
        catch(Exception e){
            System.out.println("showTable"+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlMuzakki = new javax.swing.JPanel();
        jScrollPaneMuzakki = new javax.swing.JScrollPane();
        tblMuzakki = new javax.swing.JTable();
        lblMuzakki = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTotalZakat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTotalZakat = new javax.swing.JTable();
        btnAddMuzakki = new javax.swing.JButton();
        btnAddTransaksi = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        pnlMuzakki.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPaneMuzakki.setAutoscrolls(true);

        tblMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblMuzakki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Muzakki", "alamat", "email", "hp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMuzakki.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMuzakki.setAutoscrolls(false);
        tblMuzakki.setDragEnabled(true);
        tblMuzakki.setFillsViewportHeight(true);
        jScrollPaneMuzakki.setViewportView(tblMuzakki);
        if (tblMuzakki.getColumnModel().getColumnCount() > 0) {
            tblMuzakki.getColumnModel().getColumn(0).setResizable(false);
            tblMuzakki.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblMuzakki.getColumnModel().getColumn(1).setResizable(false);
            tblMuzakki.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblMuzakki.getColumnModel().getColumn(2).setResizable(false);
            tblMuzakki.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblMuzakki.getColumnModel().getColumn(3).setResizable(false);
            tblMuzakki.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblMuzakki.getColumnModel().getColumn(4).setResizable(false);
            tblMuzakki.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        lblMuzakki.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMuzakki.setText("Daftar Muzakki");

        javax.swing.GroupLayout pnlMuzakkiLayout = new javax.swing.GroupLayout(pnlMuzakki);
        pnlMuzakki.setLayout(pnlMuzakkiLayout);
        pnlMuzakkiLayout.setHorizontalGroup(
            pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMuzakkiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblMuzakki)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMuzakkiLayout.setVerticalGroup(
            pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMuzakki)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        lblTotalZakat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTotalZakat.setText("Total Zakat");

        tblTotalZakat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblTotalZakat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Jenis Zakat", "Jumlah Zakat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTotalZakat);

        btnAddMuzakki.setBackground(new java.awt.Color(102, 102, 255));
        btnAddMuzakki.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnAddMuzakki.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMuzakki.setText("Muzakki Baru");
        btnAddMuzakki.setBorder(null);
        btnAddMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMuzakkiActionPerformed(evt);
            }
        });

        btnAddTransaksi.setBackground(new java.awt.Color(102, 102, 255));
        btnAddTransaksi.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnAddTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTransaksi.setText("Transkasi Baru");
        btnAddTransaksi.setBorder(null);
        btnAddTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransaksiActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlMuzakki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblTotalZakat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTotalZakat)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMuzakkiActionPerformed
        this.dispose();
        new InsertMuzakki().setVisible(true);
    }//GEN-LAST:event_btnAddMuzakkiActionPerformed

    private void btnAddTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransaksiActionPerformed
        this.dispose();
        new InsertTransaksi().setVisible(true);
    }//GEN-LAST:event_btnAddTransaksiActionPerformed
                

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
//                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMuzakki;
    private javax.swing.JButton btnAddTransaksi;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneMuzakki;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMuzakki;
    private javax.swing.JLabel lblTotalZakat;
    public javax.swing.JPanel pnlMuzakki;
    public javax.swing.JTable tblMuzakki;
    public javax.swing.JTable tblTotalZakat;
    // End of variables declaration//GEN-END:variables
}
