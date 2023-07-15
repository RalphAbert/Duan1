package Views.ViewsQuanLy;

import DomainModels.NhaCungCap;
import Views.ViewsNhanVien.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Servicies.IServiceNhaCungCap;
import Servicies.impl.ServiceNhaCungCap;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class frameNhaCungCapQL extends javax.swing.JPanel {

    private IServiceNhaCungCap NccSer = new ServiceNhaCungCap();
    private DefaultTableModel model;
    int row = 1;

    public frameNhaCungCapQL() {
        initComponents();

        Icon iconFirt = new ImageIcon("Icon/firt.png");
        Icon iconRewind = new ImageIcon("Icon/rewind.png");
        Icon iconNext = new ImageIcon("Icon/next.png");
        Icon iconEnd = new ImageIcon("Icon/end.png");
        Icon iconClear = new ImageIcon("Icon/Edit.png");
        Icon iconThem = new ImageIcon("Icon/Add.png");
        Icon iconCapNhat = new ImageIcon("Icon/Up.png");

        this.btnFirt.setIcon(iconFirt);
        this.btnBack.setIcon(iconRewind);
        this.btnNext.setIcon(iconNext);
        this.btnEnd.setIcon(iconEnd);
        this.btnClear.setIcon(iconClear);
        this.btnThem.setIcon(iconThem);
        this.btnCapNhat.setIcon(iconCapNhat);

        addTableNCC(this.NccSer.getListNCC());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdoCon = new javax.swing.JRadioButton();
        txtMa = new javax.swing.JTextField();
        rdoNgung = new javax.swing.JRadioButton();
        txtDiaChi = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirt = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin nhà cung cấp");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ", "Trạng thái"
            }
        ));
        tblNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNCC);

        jButton1.setText("Refesh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quản Lý Nhà Cung Cấp");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Mã nhà cung cấp");

        jLabel5.setText("Tên nhà cung cấp");

        jLabel6.setText("Trạng thái");

        jLabel7.setText("Số điện thoại");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel8.setText("Địa chỉ");

        btnGroup.add(rdoCon);
        rdoCon.setSelected(true);
        rdoCon.setText("Còn hợp tác");

        btnGroup.add(rdoNgung);
        rdoNgung.setText("Ngừng hợp tác");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoCon)
                        .addGap(58, 58, 58)
                        .addComponent(rdoNgung)
                        .addGap(194, 194, 194))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(txtMa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(txtSDT))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCon)
                    .addComponent(jLabel6)
                    .addComponent(rdoNgung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirtActionPerformed(evt);
            }
        });

        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1)
                        .addGap(408, 408, 408))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFirt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(359, 359, 359))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear)
                                    .addComponent(btnThem)
                                    .addComponent(btnCapNhat)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFirt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
//        JOptionPane.showMessageDialog(this, "Bạn phải đăng nhập với vai trò quản lý!");
    }//GEN-LAST:event_btnClearMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addTableNCC(this.NccSer.getListNCC());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCCMouseClicked
        row = tblNCC.getSelectedRow();
        showDetail(row);
    }//GEN-LAST:event_tblNCCMouseClicked

    private void btnFirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirtActionPerformed
        row = 0;
        showDetail(row);
        tblNCC.setRowSelectionInterval(row, row);
    }//GEN-LAST:event_btnFirtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        row--;
        if (row <= 0) {
            row = 0;
        }
        showDetail(row);
        tblNCC.setRowSelectionInterval(row, row);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        row = tblNCC.getRowCount() - 1;
        showDetail(row);
        tblNCC.setRowSelectionInterval(row, row);

    }//GEN-LAST:event_btnEndActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        row++;
        if (row >= (tblNCC.getRowCount() - 1)) {
            row = tblNCC.getRowCount() - 1;
        }
        showDetail(row);
        tblNCC.setRowSelectionInterval(row, row);

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.txtMa.setText("");
        this.txtDiaChi.setText("");
        this.txtSDT.setText("");
        this.txtTen.setText("");
        rdoCon.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String ma = this.txtMa.getText();
        String ten = this.txtTen.getText();
        String sdt = this.txtSDT.getText();
        String diaChi = this.txtDiaChi.getText();
        int trangThai = rdoCon.isSelected() ? 0 : 1;

        String regPhone = "0[0-9]{9,10}";
        if (!sdt.matches(regPhone)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng phone!");
            txtSDT.requestFocus();
            return;
        }

        List<NhaCungCap> list = this.NccSer.checkMa(ma);
        if (list.size() == 0) {
            NhaCungCap nhacc = new NhaCungCap();
            nhacc.setMa(ma);
            nhacc.setTen(ten);
            nhacc.setDiaChi(diaChi);
            nhacc.setSdt(sdt);
            nhacc.setTrangThai(trangThai);

            JOptionPane.showMessageDialog(this, this.NccSer.themNCC(nhacc));
        } else {
            JOptionPane.showMessageDialog(this, "Nhà cung cấp này đã tồn tại!");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String ma = this.txtMa.getText();
        String ten = this.txtTen.getText();
        String sdt = this.txtSDT.getText();
        String diaChi = this.txtDiaChi.getText();
        int trangThai = rdoCon.isSelected() ? 0 : 1;

        List<NhaCungCap> list = this.NccSer.checkMa(ma);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nhà cung cấp này không tồn tại!");
            return;
        } else {
            String regPhone = "0[0-9]{9,10}";
            if (!sdt.matches(regPhone)) {
                JOptionPane.showMessageDialog(this, "Sai định dạng phone!");
                txtSDT.requestFocus();
                return;
            }

            NhaCungCap nhacc = new NhaCungCap();
            nhacc.setMa(ma);
            nhacc.setTen(ten);
            nhacc.setDiaChi(diaChi);
            nhacc.setSdt(sdt);
            nhacc.setTrangThai(trangThai);

            JOptionPane.showMessageDialog(this, this.NccSer.updateNCC(nhacc, ma));
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ma = this.txtSearch.getText();
        if (ma.length() == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền thông tin !");
            this.txtSearch.requestFocus();
            addTableNCC(this.NccSer.getListNCC());
            return;
        } else {
            for (NhaCungCap ncc : this.NccSer.getListNCC()) {
                if (ncc.getMa().equals(ma)) {
                    model = (DefaultTableModel) tblNCC.getModel();
                    model.setRowCount(0);
                    model.addRow(new Object[]{ncc.getMa(), ncc.getTen(), ncc.getSdt(), ncc.getDiaChi(), ncc.getTrangThai()});
                    JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Không có thông tin bạn cần tìm!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnFirt;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoNgung;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void addTableNCC(List<NhaCungCap> listNCC) {
        model = (DefaultTableModel) tblNCC.getModel();
        model.setRowCount(0);
        for (NhaCungCap ncc : listNCC) {
            model.addRow(new Object[]{ncc.getMa(), ncc.getTen(), ncc.getSdt(), ncc.getDiaChi(), ncc.getTrangThai()});
        }

    }

    private void showDetail(int row) {
        String ma = this.tblNCC.getValueAt(row, 0).toString();
        String ten = this.tblNCC.getValueAt(row, 1).toString();
        String sdt = this.tblNCC.getValueAt(row, 2).toString();
        String diaChi = this.tblNCC.getValueAt(row, 3).toString();
        int trangThai = Integer.parseInt(this.tblNCC.getValueAt(row, 4).toString());

        this.txtMa.setText(ma);
        this.txtDiaChi.setText(diaChi);
        this.txtSDT.setText(sdt);
        this.txtTen.setText(ten);
        if (trangThai == 0) {
            rdoCon.setSelected(true);
        } else {
            rdoNgung.setSelected(true);
        }
    }
}
