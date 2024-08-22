/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QLLD_Gui;

import java.util.*;
import java.io.IOException;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Connection.ConnectSQL;
import QLLD_DAO.CongNhan_DAO;
import QLLD_DTO.CongNhan;
import custom.MyTable;
import java.time.ZoneId;
import javax.swing.table.DefaultTableModel;

public class CapNhatCN extends javax.swing.JPanel {

    Connection con;
    ResultSet rs;
    CongNhan_DAO dSCN = new CongNhan_DAO();
    private DefaultTableModel dataModel;

    public CapNhatCN() {
        initComponents();
        dataModel = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Mã Công Nhân", "Tên Công Nhân", "CMND", "Số Điện Thoại", "Lương Cơ Bản", "Phụ Cấp", "Địa Chỉ", "Giới Tính", "Chức Vụ", "Ngày Sinh"
                }
        );
        TableDSCN.setModel(dataModel);
        ConnectSQL.getInstance().connect();
        updateTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCapNhatCongNhan = new javax.swing.JLabel();
        PanelCenter = new javax.swing.JPanel();
        lblMaCN = new javax.swing.JLabel();
        txtHoTenCN = new javax.swing.JTextField();
        lblHoTenCN = new javax.swing.JLabel();
        lblCMNDCN = new javax.swing.JLabel();
        txtCMNDCN = new javax.swing.JTextField();
        lblNgaySinhCN = new javax.swing.JLabel();
        lblGioiTinhCN = new javax.swing.JLabel();
        cboGioiTinhCN = new javax.swing.JComboBox<>();
        lblSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblDiaChiCN = new javax.swing.JLabel();
        txtDiaChiCN = new javax.swing.JTextField();
        lblPhuCapCN = new javax.swing.JLabel();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();
        lblLuongCB = new javax.swing.JLabel();
        txtLuongcb = new javax.swing.JTextField();
        txtMaCN = new javax.swing.JTextField();
        lblChucVu = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        txtPhuCapCN = new javax.swing.JTextField();
        PanelChucNang = new javax.swing.JPanel();
        PanelXoa = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnLamMoi = new javax.swing.JButton();
        lblDSCN = new javax.swing.JLabel();
        JScrollTableDSCN = new javax.swing.JScrollPane();
        TableDSCN = new MyTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblCapNhatCongNhan.setBackground(new java.awt.Color(255, 255, 255));
        lblCapNhatCongNhan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCapNhatCongNhan.setForeground(new java.awt.Color(51, 51, 255));
        lblCapNhatCongNhan.setText("CẬP NHẬTCÔNG NHÂN");
        lblCapNhatCongNhan.setOpaque(true);

        PanelCenter.setBackground(new java.awt.Color(204, 204, 204));
        PanelCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin công nhân", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        PanelCenter.setPreferredSize(new java.awt.Dimension(200, 250));

        lblMaCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMaCN.setText("Mã CN");

        txtHoTenCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblHoTenCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHoTenCN.setText("Họ Tên");

        lblCMNDCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCMNDCN.setText("CMND");

        txtCMNDCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblNgaySinhCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNgaySinhCN.setText("Ngày Sinh");

        lblGioiTinhCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGioiTinhCN.setText("Giới Tính");

        cboGioiTinhCN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        lblSDT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSDT.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblDiaChiCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDiaChiCN.setText("Địa Chỉ");

        txtDiaChiCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblPhuCapCN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPhuCapCN.setText("Phụ cấp");

        lblLuongCB.setText("Lương Cơ Bản");

        lblChucVu.setText("Chức Vụ");

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công Nhân", "Quản Lý Công Nhân", "Quản Lý Công Trình", "Admin" }));

        javax.swing.GroupLayout PanelCenterLayout = new javax.swing.GroupLayout(PanelCenter);
        PanelCenter.setLayout(PanelCenterLayout);
        PanelCenterLayout.setHorizontalGroup(
            PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCenterLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgaySinhCN)
                            .addComponent(lblCMNDCN))
                        .addGap(13, 13, 13)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCenterLayout.createSequentialGroup()
                                .addComponent(txtCMNDCN)
                                .addGap(2, 2, 2))))
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHoTenCN)
                            .addComponent(lblMaCN))
                        .addGap(37, 37, 37)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTenCN, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtMaCN))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 58, Short.MAX_VALUE)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLuongCB)
                    .addComponent(lblGioiTinhCN)
                    .addComponent(lblDiaChiCN)
                    .addComponent(lblSDT)
                    .addComponent(lblChucVu))
                .addGap(18, 18, 18)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(txtDiaChiCN, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuongcb)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCenterLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cboGioiTinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblPhuCapCN)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhuCapCN))
                    .addComponent(cboChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(713, 713, 713))
        );
        PanelCenterLayout.setVerticalGroup(
            PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCenterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaCN)
                            .addComponent(txtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoTenCN)
                            .addComponent(txtHoTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCMNDCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCMNDCN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCenterLayout.createSequentialGroup()
                                .addComponent(lblNgaySinhCN)
                                .addGap(5, 5, 5))
                            .addComponent(dateNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(PanelCenterLayout.createSequentialGroup()
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSDT))
                        .addGap(16, 16, 16)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChiCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChiCN))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLuongCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChucVu)
                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboGioiTinhCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhuCapCN)
                            .addComponent(lblGioiTinhCN)
                            .addComponent(txtPhuCapCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        PanelChucNang.setBackground(new java.awt.Color(255, 255, 255));
        PanelChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), java.awt.Color.blue)); // NOI18N

        PanelXoa.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/xoaaa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelXoaLayout = new javax.swing.GroupLayout(PanelXoa);
        PanelXoa.setLayout(PanelXoaLayout);
        PanelXoaLayout.setHorizontalGroup(
            PanelXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXoaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addContainerGap())
        );
        PanelXoaLayout.setVerticalGroup(
            PanelXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/themm.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setToolTipText("");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sua.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChucNangLayout = new javax.swing.GroupLayout(PanelChucNang);
        PanelChucNang.setLayout(PanelChucNangLayout);
        PanelChucNangLayout.setHorizontalGroup(
            PanelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChucNangLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelChucNangLayout.setVerticalGroup(
            PanelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChucNangLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(PanelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        lblDSCN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDSCN.setForeground(new java.awt.Color(51, 51, 255));
        lblDSCN.setText("Danh sách công nhân");

        TableDSCN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Công Nhân", "CMND", "Họ Tên Công Nhân", "SDT", "Địa chỉ", "Lương Cơ Bản", "Phụ Cấp", "Chức Vụ"
            }
        ));
        TableDSCN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDSCNMouseClicked(evt);
            }
        });
        JScrollTableDSCN.setViewportView(TableDSCN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCapNhatCongNhan)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 1422, Short.MAX_VALUE))
                    .addComponent(PanelChucNang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDSCN)
                            .addComponent(JScrollTableDSCN, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCapNhatCongNhan)
                .addGap(12, 12, 12)
                .addComponent(PanelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDSCN)
                .addGap(18, 18, 18)
                .addComponent(JScrollTableDSCN, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateTableData() {
        CongNhan_DAO ds = new CongNhan_DAO();
        List<CongNhan> list = ds.docTuBang();
        for (CongNhan cn : list) {
            String[] rowData = {String.valueOf(cn.getMaCN()), cn.getTenCN(), cn.getCMND(), cn.getsDT(), String.valueOf(cn.getLuongcb()), String.valueOf(cn.getPhuCap()), cn.getDiaChi(), cn.getGioiTinh(), cn.getChucVu(), String.valueOf(cn.getNgaySinh())};
            dataModel.addRow(rowData);
        }
        TableDSCN.setModel(dataModel);
    }

    private CongNhan revertCNFormTextFile() {
        int maCN = Integer.parseInt(txtMaCN.getText().toString());
        if (!Integer.toString(maCN).matches("^\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "Mã công nhân phải là 4 chữ số", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        String tenCN = txtHoTenCN.getText().toString();
        if (!tenCN.matches("^[\\p{L}\\s]{3,}$")) {
            JOptionPane.showMessageDialog(null, "Tên công nhân không hợp lệ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String cmnd = txtCMNDCN.getText().toString();
        if (!cmnd.matches("^[0-9]{9}$")) {
            JOptionPane.showMessageDialog(null, "Số CMND phải có 9 chữ số", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String sdt = txtSDT.getText().toString();
        if (!sdt.matches("^[0-9]{10}$")) {
            JOptionPane.showMessageDialog(null, "Số điện thoại phải có 10 số", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        double luongcb, phucap;
        try {
            luongcb = Double.parseDouble(txtLuongcb.getText());
            phucap = Double.parseDouble(txtPhuCapCN.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lương cơ bản và phụ cấp phải là số", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String diachi = txtDiaChiCN.getText().toString();
        if (!diachi.matches("^[\\p{L}\\s]{3,}$")) {
            JOptionPane.showMessageDialog(null, "Địa chỉ không hợp lệ", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        String gioitinh = cboGioiTinhCN.getSelectedItem().toString();
        String chucvu = cboChucVu.getSelectedItem().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateNgaySinh.getDate();
        String ngaySinh = sdf.format(date);
        // Lấy ngày hiện tại    
        Date currentDate = new Date();
        // Kiểm tra ngày sinh có sau ngày hiện tại hay không
        if (date.after(currentDate)) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ,phải sau ngày hiện tại", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return new CongNhan(maCN, tenCN, cmnd, sdt, luongcb, phucap, diachi, gioitinh, chucvu, ngaySinh);
    }

    private void xoaRongTextfields() {
        txtMaCN.setText("");
        txtHoTenCN.setText("");
        txtCMNDCN.setText("");
        dateNgaySinh.setDate(null);
        cboGioiTinhCN.setSelectedIndex(0);
        cboChucVu.setSelectedIndex(0);
        txtDiaChiCN.setText("");
        txtSDT.setText("");
        txtLuongcb.setText("");
        txtPhuCapCN.setText("");
    }


    private void TableDSCNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDSCNMouseClicked
        int row = TableDSCN.getSelectedRow();
        txtMaCN.setText(TableDSCN.getValueAt(row, 0).toString());
        txtHoTenCN.setText(TableDSCN.getValueAt(row, 1).toString());
        txtCMNDCN.setText(TableDSCN.getValueAt(row, 2).toString());
        txtSDT.setText(TableDSCN.getValueAt(row, 3).toString());
        txtLuongcb.setText(TableDSCN.getValueAt(row, 4).toString());
        txtPhuCapCN.setText(TableDSCN.getValueAt(row, 5).toString());
        txtDiaChiCN.setText(TableDSCN.getValueAt(row, 6).toString());
        cboGioiTinhCN.setSelectedItem(TableDSCN.getValueAt(row, 7).toString());
        cboChucVu.setSelectedItem(TableDSCN.getValueAt(row, 8).toString());
        String dateString = TableDSCN.getValueAt(row, 9).toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dateNgaySinh.setDate(date);
    }//GEN-LAST:event_TableDSCNMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        xoaRongTextfields();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = TableDSCN.getSelectedRow();
        if (row >= 0) {
            CongNhan cn = revertCNFormTextFile();
            if (dSCN.update(cn)) {
                TableDSCN.setValueAt(cn.getMaCN(), row, 0);
                TableDSCN.setValueAt(cn.getTenCN(), row, 1);
                TableDSCN.setValueAt(cn.getCMND(), row, 2);
                TableDSCN.setValueAt(cn.getsDT(), row, 3);
                TableDSCN.setValueAt(cn.getLuongcb(), row, 4);
                TableDSCN.setValueAt(cn.getPhuCap(), row, 5);
                TableDSCN.setValueAt(cn.getDiaChi(), row, 6);
                TableDSCN.setValueAt(cn.getGioiTinh(), row, 7);
                TableDSCN.setValueAt(cn.getChucVu(), row, 8);
                TableDSCN.setValueAt(cn.getNgaySinh(), row, 9);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        try {
            CongNhan cn = revertCNFormTextFile();
            if (dSCN.create(cn)) {
                Object[] rowData = {String.valueOf(cn.getMaCN()), cn.getTenCN(), cn.getCMND(), cn.getsDT(), String.valueOf(cn.getLuongcb()), String.valueOf(cn.getPhuCap()), cn.getDiaChi(), cn.getGioiTinh(), cn.getChucVu(), cn.getNgaySinh()};
                dataModel.addRow(rowData);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = TableDSCN.getSelectedRow();
        if (row >= 0) {
            int maCN = Integer.parseInt(TableDSCN.getValueAt(row, 0).toString());
            if (dSCN.delete(maCN)) {
                dataModel.removeRow(row);
                xoaRongTextfields();
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollTableDSCN;
    private javax.swing.JPanel PanelCenter;
    private javax.swing.JPanel PanelChucNang;
    private javax.swing.JPanel PanelXoa;
    private javax.swing.JTable TableDSCN;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboGioiTinhCN;
    private com.toedter.calendar.JDateChooser dateNgaySinh;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCMNDCN;
    private javax.swing.JLabel lblCapNhatCongNhan;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDSCN;
    private javax.swing.JLabel lblDiaChiCN;
    private javax.swing.JLabel lblGioiTinhCN;
    private javax.swing.JLabel lblHoTenCN;
    private javax.swing.JLabel lblLuongCB;
    private javax.swing.JLabel lblMaCN;
    private javax.swing.JLabel lblNgaySinhCN;
    private javax.swing.JLabel lblPhuCapCN;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JTextField txtCMNDCN;
    private javax.swing.JTextField txtDiaChiCN;
    private javax.swing.JTextField txtHoTenCN;
    private javax.swing.JTextField txtLuongcb;
    private javax.swing.JTextField txtMaCN;
    private javax.swing.JTextField txtPhuCapCN;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
