/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.ViewsQuanLy;

import DomainModels.NhanVien;
import Servicies.impl.ServiceNhanVien;
import ViewsModels.NhanVien.NhanVienViewModels;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameNhanVien extends javax.swing.JPanel {
    
    private DefaultTableModel dtm = new DefaultTableModel();
    private ServiceNhanVien snv = new ServiceNhanVien();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public FrameNhanVien() {
        initComponents();
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");
        
        this.btnClear.setIcon(iconClear);
        this.btnThem.setIcon(iconThem);
        this.btnCapNhat.setIcon(iconCapNhat);
        
        ButtonGroup b = new ButtonGroup();
        b.add(rdoNam);
        b.add(rdoNu);
        
        ButtonGroup c = new ButtonGroup();
        c.add(rdoQuanLy);
        c.add(rdoNhanVien);
        
        ButtonGroup d = new ButtonGroup();
        d.add(rdoDangLam);
        d.add(rdoNghiLam);
        
        rdoNam.setSelected(true);
        rdoQuanLy.setSelected(true);
        rdoDangLam.setSelected(true);
        
        fillTableNhanVien(snv.getAllNV());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoDangLam = new javax.swing.JRadioButton();
        txtMaNV = new javax.swing.JTextField();
        rdoNu = new javax.swing.JRadioButton();
        rdoNghiLam = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin nhân viên");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới Tính", "Ngày Sinh", "SĐT", "Mật khẩu", "Email", "Địa chỉ", "Role", "Trạng thái"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nhân Viên");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã nhân viên");

        jLabel5.setText("Tên nhân viên");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Trạng thái");

        rdoNam.setText("Nam");

        rdoDangLam.setText("Đang làm");

        rdoNu.setText("Nữ");

        rdoNghiLam.setText("Nghỉ làm");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel10.setText("Ngày sinh");

        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        jLabel11.setText("SĐT");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel12.setText("Role");

        rdoQuanLy.setText("Quản lý");

        rdoNhanVien.setText("Nhân viên");

        jLabel2.setText("Mật khẩu");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(rdoNam)
                                .addGap(112, 112, 112)
                                .addComponent(rdoNu))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenNV)
                                    .addComponent(txtSDT)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoQuanLy)
                            .addComponent(rdoDangLam))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoNghiLam)
                            .addComponent(rdoNhanVien))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDiaChi)
                            .addComponent(txtEmail)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(jLabel8)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdoQuanLy)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNhanVien))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(rdoDangLam)
                        .addComponent(rdoNghiLam)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Làm trống");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm Excel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1)
                        .addGap(469, 469, 469))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnClear)
                    .addComponent(btnThem)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        int row = tbNhanVien.getSelectedRow();
        
        if (row == -1) {
            return;
        }
        
        txtMaNV.setText(tbNhanVien.getValueAt(row, 0).toString());
        txtTenNV.setText(tbNhanVien.getValueAt(row, 1).toString());
        if (tbNhanVien.getValueAt(row, 2).toString().equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(tbNhanVien.getValueAt(row, 3).toString());
        txtSDT.setText(tbNhanVien.getValueAt(row, 4).toString());
        txtMatKhau.setText(tbNhanVien.getValueAt(row, 5).toString());
        txtEmail.setText(tbNhanVien.getValueAt(row, 6).toString());
        txtDiaChi.setText(tbNhanVien.getValueAt(row, 7).toString());
        if (tbNhanVien.getValueAt(row, 8).toString().equals("Quản Lý")) {
            rdoQuanLy.setSelected(true);
        } else {
            rdoNhanVien.setSelected(true);
        }
        if (tbNhanVien.getValueAt(row, 9).toString().equals("Đang làm")) {
            rdoDangLam.setSelected(true);
        } else {
            rdoNghiLam.setSelected(true);
        }

    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        List<NhanVienViewModels> listNVVM = new ArrayList<>();
        String searchNV = txtSearch.getText();
        if (searchNV.equals("")) {
            fillTableNhanVien(snv.getAllNV());
            return;
        }
        if (tbNhanVien.getRowCount() > 0) {
            for (NhanVienViewModels nvvm : snv.getAllNV()) {
                if (searchNV.equals(nvvm.getMaNV()) || searchNV.equals(nvvm.getTenNV()) || searchNV.equals(nvvm.getGioiTinh() == 0 ? "Nam" : "Nữ") || searchNV.equals(nvvm.getNgaySinh().toString()) || searchNV.equals(nvvm.getSDT())
                        || searchNV.equals(nvvm.getMatKhau()) || searchNV.equals(nvvm.getEmail()) || searchNV.equals(nvvm.getDiaChi()) || searchNV.equals(nvvm.getVaiTro() == 0 ? "Quản Lý" : "Nhân Viên") || searchNV.equals(nvvm.getTrangThai() == 0 ? "Đang làm" : "Nghỉ làm")) {
                    listNVVM.add(nvvm);
                    fillTableNhanVien(listNVVM);
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        update();
    }//GEN-LAST:event_btnCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDangLam;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNghiLam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    private void fillTableNhanVien(List<NhanVienViewModels> listNV) {
        dtm = (DefaultTableModel) tbNhanVien.getModel();
        dtm.setRowCount(0);
        
        for (NhanVienViewModels s : listNV) {
            dtm.addRow(s.toDataRow());
        }
    }
    
    private void clearForm() {
        txtMaNV.setText("");
        txtTenNV.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        txtMatKhau.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtSearch.setText("");
        rdoNam.setSelected(true);
        rdoQuanLy.setSelected(true);
        rdoDangLam.setSelected(true);
    }
    
    public NhanVien getFormData() {
        String ma = txtMaNV.getText().trim();
        String hoTen = txtTenNV.getText().trim();
        int gioiTinh = rdoNam.isSelected() ? 0 : 1;
        String ngaySinh = txtNgaySinh.getText();
        String sdt = txtSDT.getText();
        String matKhau = txtMatKhau.getText().trim();
        String email = txtEmail.getText().trim();
        String diaChi = txtDiaChi.getText().trim();
        int vaiTro = rdoQuanLy.isSelected() ? 0 : 1;
        int tranThai = rdoDangLam.isSelected() ? 0 : 1;

        // check rỗng
        if (ma.equals("") || hoTen.equals("") || sdt.equals("") || matKhau.equals("") || email.equals("")
                || diaChi.equals("") || ngaySinh.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ dữ liệu!");
            return null;
        }

        // check kiểu string
        String patternString = "[A-Za-z0-9]{6,32}";
        if (!ma.matches(patternString)) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên có độ dài 6-32 ký tự. Không có ký tự đặc biệt!");
            return null;
        }
        
        if (hoTen.length() < 6 || hoTen.length() > 32) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên phải có độ dài 6-32 ký tự!");
            return null;
        }
        
        Date ns = Date.valueOf(ngaySinh);

        // check sđt
        String patternsdt = "0\\d{10,20}";
        if (!sdt.matches(patternsdt)) {
            JOptionPane.showMessageDialog(this, "SDT không đúng định dạng (Độ dài 10 - 20 số)!");
            return null;
        }

        // check mật khẩu
        String patternMatKhau = "[A-Za-z0-9]{8,32}";
        if (!matKhau.matches(patternMatKhau)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có độ dài 8-32 ký tự. Không có ký tự đặc biệt!");
            return null;
        }
        
        String patternemail = "\\w+@\\w+\\.\\w+";
        if (!email.matches(patternemail)) {
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng!");
            return null;
        }
        
        if (diaChi.length() > 255) {
            JOptionPane.showMessageDialog(this, "Địa chỉ tối đa 255 ký tự!");
        }
        
        NhanVien nv = new NhanVien();
        nv.setMa(ma);
        nv.setTen(hoTen);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ns);
        nv.setSdt(sdt);
        nv.setMatKhau(matKhau);
        nv.setEmail(email);
        nv.setDiaChi(diaChi);
        nv.set_Role(vaiTro);
        nv.setTrangThai(tranThai);
        return nv;
    }
    
    private void insert() {
        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }
        try {
            NhanVienViewModels nvrp = new NhanVienViewModels();
            nvrp.setMaNV(nv.getMa());
            nvrp.setTenNV(nv.getTen());
            nvrp.setGioiTinh(nv.getGioiTinh());
            nvrp.setNgaySinh(nv.getNgaySinh());
            nvrp.setSDT(nv.getSdt());
            nvrp.setMatKhau(nv.getMatKhau());
            nvrp.setEmail(nv.getEmail());
            nvrp.setDiaChi(nv.getDiaChi());
            nvrp.setVaiTro(nv.get_Role());
            nvrp.setTrangThai(nv.getTrangThai());
            snv.Insert(nvrp);
            clearForm();
            fillTableNhanVien(snv.getAllNV());
        } catch (Exception e) {
        }
    }
    
    private void update() {
        String ma = txtMaNV.getText().trim();
        String hoTen = txtTenNV.getText().trim();
        int gioiTinh = rdoNam.isSelected() ? 0 : 1;
        Date ngaySinh = Date.valueOf(txtNgaySinh.getText());
        String sdt = txtSDT.getText();
        String matKhau = txtMatKhau.getText().trim();
        String email = txtEmail.getText().trim();
        String diaChi = txtDiaChi.getText().trim();
        int vaiTro = rdoQuanLy.isSelected() ? 0 : 1;
        int tranThai = rdoDangLam.isSelected() ? 0 : 1;
        
        NhanVienViewModels nvrp = new NhanVienViewModels();
        nvrp.setMaNV(ma);
        nvrp.setTenNV(hoTen);
        nvrp.setGioiTinh(gioiTinh);
        nvrp.setNgaySinh(ngaySinh);
        nvrp.setSDT(sdt);
        nvrp.setMatKhau(matKhau);
        nvrp.setEmail(email);
        nvrp.setDiaChi(diaChi);
        nvrp.setVaiTro(vaiTro);
        nvrp.setTrangThai(tranThai);
        snv.Update(nvrp);
        clearForm();
        fillTableNhanVien(snv.getAllNV());
    }
}
