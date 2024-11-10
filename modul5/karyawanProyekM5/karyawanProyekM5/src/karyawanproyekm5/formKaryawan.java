/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karyawanproyekm5;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.PopupMenu;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class formKaryawan extends javax.swing.JFrame {
    int row1 = 0;
    /**
     * Creates new form formKaryawan
     */
    public formKaryawan() {
        initComponents();
        load_tabelKaryawan();
        load_tabelProyek();
        load_tabelTransaksi();
        load_comboBoxKaryawanProyek();  
    }

        private void load_tabelKaryawan(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Jabatan");
        model.addColumn("Departemen");
        try {
            String sql = "select * from karyawan";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{
                            res.getString("id"),
                            res.getString("nama"),
                            res.getString("jabatan"),
                            res.getString("departemen"),   
                    }
                );
            }
            jTableKaryawan.setModel(model);
            System.out.println("njay");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
        private void load_tabelProyek(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Proyek");
        model.addColumn("Durasi");
        try { 
            String sql = "select * from proyek";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{
                            res.getString("id"),
                            res.getString("nama_proyek"),
                            res.getString("durasi_pengerjaan"),
                        }
                    );
                }
            jTableProyek.setModel(model);
            System.out.println("njay");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        private void load_comboBoxKaryawanProyek(){
        try {
            jComboBoxNamaKaryawanTransaksi.removeAllItems();
            jComboBoxNamaProyekTransaksi.removeAllItems();
            String sql = "select * from karyawan";
            String sql1 = "select * from proyek";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.Statement stm1 = conn.createStatement();
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
          
            while (res.next()){
                String namaKaryawan = res.getString("nama");
                String idKaryawan = res.getString("id");
                jComboBoxNamaKaryawanTransaksi.addItem(namaKaryawan);
            }
            while (res1.next()){
                String namaProyek = res1.getString("nama_proyek");
                jComboBoxNamaProyekTransaksi.addItem(namaProyek);
                String idProyek = res1.getString("id");
            }
            System.out.println("njaydar");
        }catch(Exception e){
            System.out.println("123");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        private void load_tabelTransaksi(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Karyawan");
        model.addColumn("Proyek");
        model.addColumn("Peran");
        try {
            String sql = "SELECT karyawan.nama AS nama_karyawan, proyek.nama_proyek AS nama_proyek, peran FROM transaksi JOIN karyawan ON transaksi.id_karyawan = karyawan.id JOIN proyek ON transaksi.id_proyek = proyek.id;";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{            
                            res.getString("nama_karyawan"),
                            res.getString("nama_proyek"),
                            res.getString("peran")
                            }
                        );
                    }
            jTableTransaksi.setModel(model);
            System.out.println("njay");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelJabatan = new javax.swing.JLabel();
        jLabelIdKaryawan = new javax.swing.JLabel();
        jLabelNamaKaryawan = new javax.swing.JLabel();
        jLabelDepartemen = new javax.swing.JLabel();
        jTextFieldIdKaryawan = new javax.swing.JTextField();
        jTextFieldNamaKaryawan = new javax.swing.JTextField();
        jTextFieldJabatan = new javax.swing.JTextField();
        jTextFieldDepartemen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKaryawan = new javax.swing.JTable();
        jButtonTambahKaryawan = new javax.swing.JButton();
        jButtonUpdateKaryawan = new javax.swing.JButton();
        jButtonDeleteKaryawan = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDurasiProyek = new javax.swing.JLabel();
        jLabelIdProyek = new javax.swing.JLabel();
        jLabelNamaProyek = new javax.swing.JLabel();
        jTextFieldIdProyek = new javax.swing.JTextField();
        jTextFieldNamaProyek = new javax.swing.JTextField();
        jTextFieldDurasiProyek = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProyek = new javax.swing.JTable();
        jButtonTambahProyek = new javax.swing.JButton();
        jButtonUpdateProyek = new javax.swing.JButton();
        jButtonDeleteProyek = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelNamaProyekTransaksi = new javax.swing.JLabel();
        jLabel1NamaKaryawanTransaksi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTransaksi = new javax.swing.JTable();
        jButtonTambahTransaksi = new javax.swing.JButton();
        jButtonUpdateTransaksi = new javax.swing.JButton();
        jButtonDeleteTransaksi = new javax.swing.JButton();
        jComboBoxNamaKaryawanTransaksi = new javax.swing.JComboBox<>();
        jComboBoxNamaProyekTransaksi = new javax.swing.JComboBox<>();
        jLabelPeran = new javax.swing.JLabel();
        jTextFieldPeran = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KARYAWAN");

        jLabelJabatan.setText("Jabatan");

        jLabelIdKaryawan.setText("ID");

        jLabelNamaKaryawan.setText("Nama");

        jLabelDepartemen.setText("Departemen");

        jTableKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nama", "Jabatan", "Departemen"
            }
        ));
        jTableKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKaryawan);

        jButtonTambahKaryawan.setText("Tambah");
        jButtonTambahKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahKaryawanActionPerformed(evt);
            }
        });

        jButtonUpdateKaryawan.setText("Update");
        jButtonUpdateKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateKaryawanActionPerformed(evt);
            }
        });

        jButtonDeleteKaryawan.setText("Delete");
        jButtonDeleteKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteKaryawanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdKaryawan)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNamaKaryawan)
                            .addComponent(jTextFieldJabatan)
                            .addComponent(jTextFieldDepartemen)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jButtonTambahKaryawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdateKaryawan)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteKaryawan)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTambahKaryawan)
                            .addComponent(jButtonUpdateKaryawan)
                            .addComponent(jButtonDeleteKaryawan)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Karyawan", jPanel3);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Proyek");

        jLabelDurasiProyek.setText("Durasi Pengerjaan");

        jLabelIdProyek.setText("ID");

        jLabelNamaProyek.setText("Nama Proyek");

        jTableProyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Proyek", "Durasi"
            }
        ));
        jTableProyek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProyekMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProyek);

        jButtonTambahProyek.setText("Tambah");
        jButtonTambahProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahProyekActionPerformed(evt);
            }
        });

        jButtonUpdateProyek.setText("Update");
        jButtonUpdateProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateProyekActionPerformed(evt);
            }
        });

        jButtonDeleteProyek.setText("Delete");
        jButtonDeleteProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteProyekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdProyek)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIdProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDurasiProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNamaProyek)
                            .addComponent(jTextFieldDurasiProyek)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jButtonTambahProyek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdateProyek)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteProyek)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelIdProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDurasiProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDurasiProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTambahProyek)
                            .addComponent(jButtonUpdateProyek)
                            .addComponent(jButtonDeleteProyek)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proyek", jPanel6);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Transaksi");

        jLabelNamaProyekTransaksi.setText("Nama Proyek");

        jLabel1NamaKaryawanTransaksi.setText("Nama Karyawan");

        jTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Karyawan", "Proyek", "Peran"
            }
        ));
        jTableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransaksiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableTransaksi);

        jButtonTambahTransaksi.setText("Tambah");
        jButtonTambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahTransaksiActionPerformed(evt);
            }
        });

        jButtonUpdateTransaksi.setText("Update");
        jButtonUpdateTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateTransaksiActionPerformed(evt);
            }
        });

        jButtonDeleteTransaksi.setText("Delete");

        jLabelPeran.setText("Peran");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonTambahTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdateTransaksi)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteTransaksi))
                    .addComponent(jLabelPeran, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNamaProyekTransaksi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNamaProyekTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1NamaKaryawanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNamaKaryawanTransaksi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPeran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1NamaKaryawanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBoxNamaKaryawanTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNamaProyekTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNamaProyekTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelPeran, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPeran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTambahTransaksi)
                            .addComponent(jButtonUpdateTransaksi)
                            .addComponent(jButtonDeleteTransaksi)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaksi", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 255, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(641, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahKaryawanActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "insert into karyawan (nama, jabatan, departemen) values ('" + jTextFieldNamaKaryawan.getText() + "','" + jTextFieldJabatan.getText() + "','" + jTextFieldDepartemen.getText() + "')";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            load_tabelKaryawan();
            load_comboBoxKaryawanProyek();
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahKaryawanActionPerformed

    public void kosong(){
        jTextFieldNamaKaryawan.setText("");
//        jTextFieldNim.setText("");
//        jTextFieldEmail.setText("");
//        jComboBoxKelamin.setSelectedIndex(0);
    }
    
    private void jButtonTambahProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahProyekActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "insert into proyek (nama_proyek, durasi_pengerjaan) values ('" + jTextFieldNamaProyek.getText() + "','" + jTextFieldDurasiProyek.getText() + " minggu')";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            load_tabelProyek();
            load_comboBoxKaryawanProyek();
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahProyekActionPerformed

    private void jButtonUpdateKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateKaryawanActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "UPDATE karyawan SET nama = '" + jTextFieldNamaKaryawan.getText() + "', " + "jabatan = '" + jTextFieldJabatan.getText() + "', " + "departemen = '" + jTextFieldDepartemen.getText() + "' " + "WHERE id = '" + jTextFieldIdKaryawan.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            load_tabelKaryawan();
            load_comboBoxKaryawanProyek();
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateKaryawanActionPerformed

    private void jButtonUpdateProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProyekActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "UPDATE proyek SET nama_proyek = '" + jTextFieldNamaProyek.getText() + "', " + "durasi_pengerjaan = '" + jTextFieldDurasiProyek.getText() + "'" + "WHERE id = '" + jTextFieldIdKaryawan.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            load_tabelProyek();
            load_comboBoxKaryawanProyek();
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateProyekActionPerformed

    private void jTableKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKaryawanMouseClicked
        // TODO add your handling code here:
        int row = jTableKaryawan.getSelectedRow(); 
        
        if (row != -1) {
            jTextFieldIdKaryawan.setText(jTableKaryawan.getValueAt(row, 0).toString());
            jTextFieldNamaKaryawan.setText(jTableKaryawan.getValueAt(row, 1).toString());
            jTextFieldJabatan.setText(jTableKaryawan.getValueAt(row, 2).toString()); 
            jTextFieldDepartemen.setText(jTableKaryawan.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_jTableKaryawanMouseClicked

    private void jTableProyekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProyekMouseClicked
        // TODO add your handling code here:
        int row = jTableProyek.getSelectedRow(); 
        
        if (row != -1) {
            jTextFieldIdProyek.setText(jTableProyek.getValueAt(row, 0).toString());
            jTextFieldNamaProyek.setText(jTableProyek.getValueAt(row, 1).toString());
            jTextFieldDurasiProyek.setText(jTableProyek.getValueAt(row, 2).toString());   
        }
    }//GEN-LAST:event_jTableProyekMouseClicked

    private void jButtonDeleteKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteKaryawanActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "DELETE from karyawan where id = '" + jTextFieldIdKaryawan.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            int pilihan = JOptionPane.showConfirmDialog(this, "apakah anda yakin lurd?");
            if (pilihan == JOptionPane.YES_OPTION) {
            pst.execute();
            load_tabelKaryawan();
            }
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteKaryawanActionPerformed

    private void jButtonDeleteProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteProyekActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            sql = "DELETE from proyek where id = '" + jTextFieldIdProyek.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            int pilihan = JOptionPane.showConfirmDialog(this, "apakah anda yakin lurd?");
            if (pilihan == JOptionPane.YES_OPTION) {
            pst.execute();
            load_tabelProyek();
            load_comboBoxKaryawanProyek();
            }
//            kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteProyekActionPerformed

    private void jButtonTambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahTransaksiActionPerformed
        // TODO add your handling code here:
        int idKaryawan = jComboBoxNamaKaryawanTransaksi.getSelectedIndex()+1;
        int idProyek = jComboBoxNamaProyekTransaksi.getSelectedIndex()+1;
        int id_proyek = 0;
        int id_karyawan = 0;
        try{
            String sql = "select id from karyawan ;";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            int ulang = 1;
            while (res.next()){
                System.out.println(ulang);
                if(ulang == idKaryawan){
                    id_karyawan = res.getInt("id");
//                    System.out.println(res.getString("id"));
                }
                ulang++;
            }  
            ulang = 1;
            String sql1 = "select id from proyek; ";
            java.sql.Statement stm1 = conn.createStatement();
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
             while (res1.next()){
                if(ulang == idProyek){
//                    System.out.println(res1.getString("id"));
                    id_proyek = res1.getInt("id");
                }
                ulang++;
            }  
            ulang = 1;
            
            String addTransaksi = "INSERT INTO transaksi (id_karyawan, id_proyek, peran) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(addTransaksi);
            ps.setInt(1, id_karyawan);
            ps.setInt(2, id_proyek);
            ps.setString(3, jTextFieldPeran.getText());
            ps.executeUpdate();
            load_tabelTransaksi();
        } catch (SQLException e) {
          System.out.println("Error Save Data Transaksi" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonTambahTransaksiActionPerformed

    private void jTableTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransaksiMouseClicked
        // TODO add your handling code here:
        row1 = jTableTransaksi.getSelectedRow(); 
        
        if (row1 != -1) {
            jTextFieldPeran.setText(jTableTransaksi.getValueAt(row1, 2).toString());
            jComboBoxNamaKaryawanTransaksi.setSelectedItem(jTableTransaksi.getValueAt(row1, 0).toString());
            jComboBoxNamaProyekTransaksi.setSelectedItem(jTableTransaksi.getValueAt(row1, 1).toString());
        }
    }//GEN-LAST:event_jTableTransaksiMouseClicked

    private void jButtonUpdateTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateTransaksiActionPerformed
        // TODO add your handling code here:
        int idKaryawan = jComboBoxNamaKaryawanTransaksi.getSelectedIndex()+1;
        int idProyek = jComboBoxNamaProyekTransaksi.getSelectedIndex()+1;
        int id_proyek = 0;
        int id_karyawan = 0;
        try{
            String sql = "select * from karyawan ";
            java.sql.Connection conn = (Connection) koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            int ulang = 1;
            while (res.next()){
//                System.out.println(ulang);
                if(ulang == idKaryawan){
                    id_karyawan = res.getInt("id");
                    System.out.println(res.getString("id"));
                    System.out.println(res.getString("nama"));
                }
                ulang++;
            }  
            ulang = 1;
            String sql1 = "select * from proyek ";
            java.sql.Statement stm1 = conn.createStatement();
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res1.next()){
                if(ulang == idProyek){
                    System.out.println(res1.getString("id"));
                    System.out.println(res1.getString("nama_proyek"));
                    id_proyek = res1.getInt("id");
                }
                ulang++;
            }  
            ulang = 1;
            String sql2 = "select id_karyawan, id_proyek from transaksi";
            java.sql.Statement stm2 = conn.createStatement();
            java.sql.ResultSet res2 = stm2.executeQuery(sql2);
            int row2 = row1 + 1;
            while (res2.next()){
                if(ulang == row1+1){
                System.out.println("warr");
                int idKaryawanTransaksi = res2.getInt("id_karyawan");
                int idProyekTransaksi = res2.getInt("id_proyek");
                System.out.println("ini row ke " + row2);
                System.out.println(res2.getInt("id_karyawan"));
                System.out.println(res2.getInt("id_proyek"));
                String addTransaksi = "UPDATE transaksi SET id_karyawan = ?, id_proyek = ?, peran = ? WHERE id_karyawan = ? AND id_proyek = ?;";
                System.out.println("duarrr156234");
                PreparedStatement ps = conn.prepareStatement(addTransaksi);
                ps.setInt(1, id_karyawan);
                ps.setInt(2, id_proyek);
                ps.setString(3, jTextFieldPeran.getText());
                ps.setInt(4, idKaryawanTransaksi);
                ps.setInt(5, idProyekTransaksi);
                ps.executeUpdate();
                load_tabelTransaksi();
                System.out.println("berhasil");
            }ulang++;  }
            
            
        } catch (SQLException e) {
          System.out.println("Error Save Data Transaksi" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateTransaksiActionPerformed
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteKaryawan;
    private javax.swing.JButton jButtonDeleteProyek;
    private javax.swing.JButton jButtonDeleteTransaksi;
    private javax.swing.JButton jButtonTambahKaryawan;
    private javax.swing.JButton jButtonTambahProyek;
    private javax.swing.JButton jButtonTambahTransaksi;
    private javax.swing.JButton jButtonUpdateKaryawan;
    private javax.swing.JButton jButtonUpdateProyek;
    private javax.swing.JButton jButtonUpdateTransaksi;
    private javax.swing.JComboBox<String> jComboBoxNamaKaryawanTransaksi;
    private javax.swing.JComboBox<String> jComboBoxNamaProyekTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1NamaKaryawanTransaksi;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDepartemen;
    private javax.swing.JLabel jLabelDurasiProyek;
    private javax.swing.JLabel jLabelIdKaryawan;
    private javax.swing.JLabel jLabelIdProyek;
    private javax.swing.JLabel jLabelJabatan;
    private javax.swing.JLabel jLabelNamaKaryawan;
    private javax.swing.JLabel jLabelNamaProyek;
    private javax.swing.JLabel jLabelNamaProyekTransaksi;
    private javax.swing.JLabel jLabelPeran;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableKaryawan;
    private javax.swing.JTable jTableProyek;
    private javax.swing.JTable jTableTransaksi;
    private javax.swing.JTextField jTextFieldDepartemen;
    private javax.swing.JTextField jTextFieldDurasiProyek;
    private javax.swing.JTextField jTextFieldIdKaryawan;
    private javax.swing.JTextField jTextFieldIdProyek;
    private javax.swing.JTextField jTextFieldJabatan;
    private javax.swing.JTextField jTextFieldNamaKaryawan;
    private javax.swing.JTextField jTextFieldNamaProyek;
    private javax.swing.JTextField jTextFieldPeran;
    // End of variables declaration//GEN-END:variables
}
