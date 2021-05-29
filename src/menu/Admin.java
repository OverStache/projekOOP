package menu;


import GUIZakat.DatabaseConnection;
import Submenu.*;
import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Admin extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    String sql;
    Statement st;
    
    JFrame frame = new JFrame();
    public Admin() {
        initComponents();
        showTable();
        sum();
    }
    public final void showTable(){
        ResultSet rs1,rs2,rs3;
        String sql1,sql2,sql3;
        Statement st1, st2, st3;
        try{       
            conn = new DatabaseConnection().setConnection();
            sql= "select idJenisZakat as 'ID', JenisZakat as 'Jenis Zakat', JumlahZakat as 'Jumlah' from tbl_jenis_zakat";
            st = conn.createStatement();
            rs=st.executeQuery(sql);
            tblTotalZakat.setModel(DbUtils.resultSetToTableModel(rs)); 
            
            sql1= "select idMuzakki as 'ID', NamaMuzakki as 'Nama Muzakki', JumlahZakat as 'Jumlah' from tbl_muzakki";
            st1 = conn.createStatement();
            rs1=st1.executeQuery(sql1);
            tblTotalMuzakki.setModel(DbUtils.resultSetToTableModel(rs1));
            
            sql2= "select idTransaksi as 'ID Transaksi', idUser as 'ID User', idMuzakki as 'ID Muzakki', idJenisZakat as 'ID Jenis Zakat', JumlahZakat as 'Jumlah' from tbl_transaksi_zakat";
            st2 = conn.createStatement();
            rs2=st2.executeQuery(sql2);
            tblPembayaranZakat.setModel(DbUtils.resultSetToTableModel(rs2));
            
            sql3= "select idMuzakki as 'ID', NamaMuzakki as 'Nama', AlamatMuzakki as 'Alamat', email as 'e-mail', hp as 'No. HP' from tbl_muzakki";
            st3 = conn.createStatement();
            rs3=st3.executeQuery(sql3);
            tblMuzakki.setModel(DbUtils.resultSetToTableModel(rs3));                                
        }
        catch(Exception e){
            System.out.println("showTable"+e);
        }
    }
    public final void sum(){
        int jmlMuzakki=0,jmlJenisZakat=0;
        try{
            conn = new DatabaseConnection().setConnection();
            sql="select sum(JumlahZakat) from tbl_muzakki";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                jmlMuzakki=rs.getInt("sum(JumlahZakat)");    
            }
            sql="select sum(JumlahZakat) from tbl_jenis_zakat";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                jmlJenisZakat=rs.getInt("sum(JumlahZakat)");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        lblTotalZakatType.setText("Total : "+jmlJenisZakat);
        lblTotalMuzakki.setText("Total : "+jmlMuzakki);
        if(jmlMuzakki!=jmlJenisZakat){
            lblEqual.setForeground(Color.red);
            lblTotalZakatType.setForeground(Color.red);
            lblTotalMuzakki.setForeground(Color.red);
            separatorTotalZakat.setForeground(Color.red);
            separatorTotalZakat.setBackground(Color.red);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlTblPembayaranZakat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPembayaranZakat = new javax.swing.JTable();
        lblPembayaranZakat = new javax.swing.JLabel();
        btnTambahTransaksi = new javax.swing.JButton();
        lblDelTransaksi = new javax.swing.JLabel();
        txfDelTransaksi = new javax.swing.JTextField();
        btnDelTransaksi1 = new javax.swing.JButton();
        cmbID = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        pnlMuzakki = new javax.swing.JPanel();
        jScrollPaneMuzakki = new javax.swing.JScrollPane();
        tblMuzakki = new javax.swing.JTable();
        lblMuzakki = new javax.swing.JLabel();
        lblInsertMuzakki = new javax.swing.JLabel();
        txfInsertMuzakki = new javax.swing.JTextField();
        btnDelMuzakki = new javax.swing.JButton();
        btnAddMuzakki = new javax.swing.JButton();
        btnEditMuzakki = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblTotalZakat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTotalZakat = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTotalMuzakki = new javax.swing.JTable();
        lblByZakatType = new javax.swing.JLabel();
        lblEqual = new javax.swing.JLabel();
        lblByMuzakki = new javax.swing.JLabel();
        lblTotalMuzakki = new javax.swing.JLabel();
        lblTotalZakatType = new javax.swing.JLabel();
        separatorTotalZakat = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        pnlTblPembayaranZakat.setBackground(new java.awt.Color(153, 153, 255));

        tblPembayaranZakat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblPembayaranZakat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idPembayaran", "Nama Muzakki", "Jenis Zakat", "Jumlah Zakat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPembayaranZakat);

        lblPembayaranZakat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPembayaranZakat.setText("Transaksi Zakat");

        btnTambahTransaksi.setBackground(new java.awt.Color(229, 229, 229));
        btnTambahTransaksi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnTambahTransaksi.setText("Tambah Transaksi");
        btnTambahTransaksi.setBorder(null);
        btnTambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahTransaksiActionPerformed(evt);
            }
        });

        lblDelTransaksi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDelTransaksi.setText("Masukkan");

        txfDelTransaksi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnDelTransaksi1.setBackground(new java.awt.Color(229, 229, 229));
        btnDelTransaksi1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDelTransaksi1.setText("Hapus Transaksi");
        btnDelTransaksi1.setBorder(null);
        btnDelTransaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelTransaksi1ActionPerformed(evt);
            }
        });

        cmbID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cmbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "idTransaksi", "idMuzakki" }));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlTblPembayaranZakatLayout = new javax.swing.GroupLayout(pnlTblPembayaranZakat);
        pnlTblPembayaranZakat.setLayout(pnlTblPembayaranZakatLayout);
        pnlTblPembayaranZakatLayout.setHorizontalGroup(
            pnlTblPembayaranZakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTblPembayaranZakatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTblPembayaranZakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlTblPembayaranZakatLayout.createSequentialGroup()
                        .addComponent(lblDelTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)
                        .addComponent(txfDelTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelTransaksi1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTblPembayaranZakatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTambahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTblPembayaranZakatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPembayaranZakat)
                .addGap(145, 145, 145))
        );
        pnlTblPembayaranZakatLayout.setVerticalGroup(
            pnlTblPembayaranZakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTblPembayaranZakatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPembayaranZakat)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlTblPembayaranZakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelTransaksi1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDelTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelTransaksi)
                    .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnTambahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMuzakki.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPaneMuzakki.setAutoscrolls(true);

        tblMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblMuzakki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Muzakki", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneMuzakki.setViewportView(tblMuzakki);

        lblMuzakki.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMuzakki.setText("Daftar Muzakki");

        lblInsertMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblInsertMuzakki.setText("Masukkan idMuzakki");

        txfInsertMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnDelMuzakki.setBackground(new java.awt.Color(229, 229, 229));
        btnDelMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDelMuzakki.setText("Hapus");
        btnDelMuzakki.setBorder(null);
        btnDelMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelMuzakkiActionPerformed(evt);
            }
        });

        btnAddMuzakki.setBackground(new java.awt.Color(229, 229, 229));
        btnAddMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddMuzakki.setText("Tambah Muzakki");
        btnAddMuzakki.setBorder(null);
        btnAddMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMuzakkiActionPerformed(evt);
            }
        });

        btnEditMuzakki.setBackground(new java.awt.Color(229, 229, 229));
        btnEditMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditMuzakki.setText("Edit");
        btnEditMuzakki.setBorder(null);
        btnEditMuzakki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMuzakkiActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlMuzakkiLayout = new javax.swing.GroupLayout(pnlMuzakki);
        pnlMuzakki.setLayout(pnlMuzakkiLayout);
        pnlMuzakkiLayout.setHorizontalGroup(
            pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblMuzakki)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMuzakkiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                        .addComponent(lblInsertMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(txfInsertMuzakki, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );
        pnlMuzakkiLayout.setVerticalGroup(
            pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuzakkiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMuzakki)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlMuzakkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsertMuzakki)
                    .addComponent(txfInsertMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnAddMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnUser.setBackground(new java.awt.Color(102, 102, 255));
        btnUser.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setText("Users");
        btnUser.setBorder(null);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(114, 114, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(790, 200));

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

        tblTotalMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblTotalMuzakki.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblTotalMuzakki);

        lblByZakatType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblByZakatType.setText("By Jenis Zakat");

        lblEqual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEqual.setText("=");

        lblByMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblByMuzakki.setText("By Muzakki");

        lblTotalMuzakki.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalMuzakki.setText("Total :");

        lblTotalZakatType.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalZakatType.setText("Total :");

        separatorTotalZakat.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblByZakatType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblByMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(lblTotalZakat)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separatorTotalZakat)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTotalZakatType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblEqual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalZakat)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblByZakatType)
                    .addComponent(lblByMuzakki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalMuzakki)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalZakatType, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTotalZakat)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlTblPembayaranZakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pnlMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblPembayaranZakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMuzakki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
//        try{       
//            conn = new DatabaseConnection().setConnection();
//            sql= "select idJenisZakat as 'ID', JenisZakat as 'Jenis Zakat', JumlahZakat as 'Jumlah' from tbl_jenis_zakat where idJenisZakat='1'";
//            st = conn.createStatement();
//            rs=st.executeQuery(sql);
//            tblTotalZakat.setModel(DbUtils.resultSetToTableModel(rs));
//            }
//        catch(Exception e){
//            System.out.println("showTable"+e);
//        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnTambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahTransaksiActionPerformed
        this.dispose();
        new InsertTransaksi().setVisible(true);
    }//GEN-LAST:event_btnTambahTransaksiActionPerformed

    private void btnDelTransaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelTransaksi1ActionPerformed
        String del=txfDelTransaksi.getText();
        if(del.equals("")){
            JOptionPane.showMessageDialog(frame,"idTransaksi tidak ditemukan");
        }
        else{ 
            conn = new DatabaseConnection().setConnection();
            try{
                sql = "delete from tbl_transaksi_zakat where "+cmbID.getSelectedItem().toString()+" = '"+del+"'";
                st = conn.createStatement();
                st.executeUpdate(sql);
            }
            catch(Exception e){
                System.out.println(e);
            } 
            showTable();
            sum();
        }       
    }//GEN-LAST:event_btnDelTransaksi1ActionPerformed

    private void btnDelMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelMuzakkiActionPerformed
        if(txfInsertMuzakki.getText().equals("")){
            JOptionPane.showMessageDialog(frame,"idMuzakki tidak ditemukan");
        }else{ 
            conn = new DatabaseConnection().setConnection(); 
            try{                
                sql = "delete from tbl_muzakki where idMuzakki='"+txfInsertMuzakki.getText()+"'";
                st = conn.createStatement();
                st.executeUpdate(sql);     
            }
            catch(Exception e){
                System.out.println("tableview "+e);
                JOptionPane.showMessageDialog(frame,"Maaf, Muzakki masih memiliki riwayat transaksi");
            }
            showTable();
        }        
    }//GEN-LAST:event_btnDelMuzakkiActionPerformed

    private void btnAddMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMuzakkiActionPerformed
        new InsertMuzakki().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddMuzakkiActionPerformed

    private void btnEditMuzakkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMuzakkiActionPerformed
        conn = new DatabaseConnection().setConnection();
        UpdateMuzakki um = new UpdateMuzakki();        
            try{                
                sql= "select * from tbl_muzakki where idMuzakki='"+txfInsertMuzakki.getText()+"'";
                st = conn.createStatement();
                rs=st.executeQuery(sql);
                if(rs.next()){
                    st = conn.createStatement();
                    rs=st.executeQuery(sql);
                    tblMuzakki.setModel(DbUtils.resultSetToTableModel(rs));
                    this.dispose();    
                    um.setVisible(true);
                    
                    DefaultTableModel muzaki = (DefaultTableModel)tblMuzakki.getModel();
                    um.txfID.setText(muzaki.getValueAt(0,0).toString());
                    um.txfNama.setText(muzaki.getValueAt(0,1).toString());
                    um.tareaAlamat.setText(muzaki.getValueAt(0,2).toString());
                    um.txfEmail.setText(muzaki.getValueAt(0,3).toString());
                    um.txfHp.setText(muzaki.getValueAt(0,4).toString());
                }
                else{
                    System.out.println("masukin id");
                    JOptionPane.showMessageDialog(frame,"idMuzakki tidak ditemukan ");
                }
            }            
            catch(Exception e){
                System.out.println("editMuzakki "+e);
            }             
    }//GEN-LAST:event_btnEditMuzakkiActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        this.dispose();
        new UserOption().setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed
                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
//                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMuzakki;
    private javax.swing.JButton btnDelMuzakki;
    private javax.swing.JButton btnDelTransaksi1;
    private javax.swing.JButton btnEditMuzakki;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahTransaksi;
    private javax.swing.JButton btnUser;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cmbID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPaneMuzakki;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblByMuzakki;
    private javax.swing.JLabel lblByZakatType;
    private javax.swing.JLabel lblDelTransaksi;
    private javax.swing.JLabel lblEqual;
    private javax.swing.JLabel lblInsertMuzakki;
    private javax.swing.JLabel lblMuzakki;
    private javax.swing.JLabel lblPembayaranZakat;
    private javax.swing.JLabel lblTotalMuzakki;
    private javax.swing.JLabel lblTotalZakat;
    private javax.swing.JLabel lblTotalZakatType;
    public javax.swing.JPanel pnlMuzakki;
    public javax.swing.JPanel pnlTblPembayaranZakat;
    private javax.swing.JSeparator separatorTotalZakat;
    public javax.swing.JTable tblMuzakki;
    public static javax.swing.JTable tblPembayaranZakat;
    public javax.swing.JTable tblTotalMuzakki;
    public javax.swing.JTable tblTotalZakat;
    private javax.swing.JTextField txfDelTransaksi;
    private javax.swing.JTextField txfInsertMuzakki;
    // End of variables declaration//GEN-END:variables
}
