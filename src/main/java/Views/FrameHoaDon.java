package Views;

import DomainModels.HoaDon;
import DomainModels.HoaDonCT;
import Servicies.IServiceHoaDon;
import Servicies.impl.ServiceHoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrameHoaDon extends javax.swing.JPanel {

    private IServiceHoaDon HDSer = new ServiceHoaDon();
    DefaultTableModel model = new DefaultTableModel();
    int row;

    public FrameHoaDon() {
        initComponents();

//        addTableHD(this.HDSer.getListHD());
//        addTableHDCT(this.HDSer.getListHDCT());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        txtSearchHD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSLHD = new javax.swing.JTextField();
        btnSearchHD = new javax.swing.JButton();
        btnRefeshHD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTinhTrang = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLoaiThanhToan = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMaCT = new javax.swing.JTextField();
        txtSLCT = new javax.swing.JTextField();
        txtDGCT = new javax.swing.JTextField();
        txtMaSPCT = new javax.swing.JTextField();
        txtThanhTienCT = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSLHDCT = new javax.swing.JTextField();
        txtSearchHDCT = new javax.swing.JTextField();
        btnSearchHDCT = new javax.swing.JButton();
        btnRefeshHDCT = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Ngày Tạo", "SĐT khách hàng", "Địa chỉ", "Loại thanh toán", "Tổng tiền", "tình trạng"
            }
        ));
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHD);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Danh sách hóa đơn");

        jLabel1.setText("Số lượng hóa đơn:");

        txtSLHD.setEnabled(false);

        btnSearchHD.setText("Search");
        btnSearchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDActionPerformed(evt);
            }
        });

        btnRefeshHD.setText("Refesh");
        btnRefeshHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchHD))
                            .addComponent(btnRefeshHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchHD))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtSLHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRefeshHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Hóa Đơn");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Mã hóa đơn");

        txtMa.setEnabled(false);

        jLabel8.setText("Ngày tạo");

        jLabel9.setText("SĐT khách hàng");

        jLabel10.setText("Địa chỉ");

        jLabel11.setText("Tình trạng");

        txtSDT.setEnabled(false);

        txtNgayTao.setEnabled(false);

        txtDiaChi.setEnabled(false);

        txtTinhTrang.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Hóa Đơn");

        jLabel3.setText("Loại thanh toán");

        jLabel6.setText("Tổng tiền");

        txtLoaiThanhToan.setEnabled(false);

        txtTongTien.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayTao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(127, 127, 127))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMa))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi)
                            .addComponent(txtSDT)
                            .addComponent(txtTinhTrang)
                            .addComponent(txtLoaiThanhToan)
                            .addComponent(txtTongTien))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtLoaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Mã hóa đơn");

        jLabel16.setText("Mã sản phẩm");

        jLabel17.setText("Số lượng");

        jLabel18.setText("Đơn giá");

        jLabel19.setText("Thành tiền");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Chi Tiết Hóa Đơn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaCT))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDGCT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSLCT)
                            .addComponent(txtThanhTienCT))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(106, 106, 106))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtMaSPCT)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMaCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMaSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSLCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDGCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtThanhTienCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHDCT);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Danh sách chi tiết hóa đơn");

        jLabel2.setText("Số lượng hóa đơn:");

        txtSLHDCT.setEnabled(false);

        btnSearchHDCT.setText("Search");
        btnSearchHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDCTActionPerformed(evt);
            }
        });

        btnRefeshHDCT.setText("Refesh");
        btnRefeshHDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshHDCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(166, 166, 166)
                        .addComponent(btnRefeshHDCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtSLHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchHDCT)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSLHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchHDCT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefeshHDCT)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefeshHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshHDActionPerformed
        addTableHD(this.HDSer.getListHD());
    }//GEN-LAST:event_btnRefeshHDActionPerformed

    private void btnRefeshHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshHDCTActionPerformed
        addTableHDCT(this.HDSer.getListHDCT());

    }//GEN-LAST:event_btnRefeshHDCTActionPerformed

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
//        row = this.tblHD.getSelectedRow();
//        String ma = this.tblHD.getValueAt(row, 0).toString();
//        String ngayTao = this.tblHD.getValueAt(row, 1).toString();
//        String SDT = this.tblHD.getValueAt(row, 2).toString();
//        String DiaChi = this.tblHD.getValueAt(row, 3).toString();
//        String LoaiThanhToan = this.tblHD.getValueAt(row, 4).toString();
//        String TongTien = this.tblHD.getValueAt(row, 5).toString();
//        String TinhTrang = this.tblHD.getValueAt(row, 6).toString();
//        
//        this.txtMa.setText(ma);
//        this.txtNgayTao.setText(ngayTao);
//        this.txtSDT.setText(SDT);
//        this.txtDiaChi.setText(DiaChi);
//        this.txtLoaiThanhToan.setText(LoaiThanhToan);
//        this.txtTongTien.setText(TongTien);
//        this.txtTinhTrang.setText(TinhTrang);

        for (HoaDon a : this.HDSer.getListHD()) {
            this.txtMa.setText(a.getMa());
            this.txtNgayTao.setText(a.getNgayTao() + "");
            this.txtSDT.setText(a.getSdt_KH());
            this.txtDiaChi.setText(a.getDiaChi());
            this.txtLoaiThanhToan.setText(a.getLoaiThanhToan() + "");
            this.txtTongTien.setText(a.getTongTien() + "");
            this.txtTinhTrang.setText(a.getTinhTrang() + "");
        }


    }//GEN-LAST:event_tblHDMouseClicked

    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        for (HDCTRepo a : this.HDSer.getListHDCT()) {
            this.txtMaCT.setText(a.getMaHD());
            this.txtMaSPCT.setText(a.getMaSP());
            this.txtSLCT.setText(a.getSoLuong()+"");
            this.txtDGCT.setText(a.getDonGia()+"");
            this.txtThanhTienCT.setText(a.getThanhTien()+"");
        }
    }//GEN-LAST:event_tblHDCTMouseClicked

    private void btnSearchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDActionPerformed
        String ma = this.txtSearchHD.getText();
        for (HoaDon hd : this.HDSer.getListHD()) {
            if (hd.getMa().equals(ma)) {
                model = (DefaultTableModel) tblHD.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{hd.getMa(),hd.getNgayTao(),hd.getSdt_KH(),hd.getDiaChi(),hd.getLoaiThanhToan(),hd.getTongTien(),hd.getTinhTrang()});
            }
        }
    }//GEN-LAST:event_btnSearchHDActionPerformed

    private void btnSearchHDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDCTActionPerformed
        String ma = this.txtSearchHDCT.getText();
        for (HDCTRepo hd : this.HDSer.getListHDCT()) {
            if (hd.getMaHD().equals(ma)) {
                model = (DefaultTableModel) tblHDCT.getModel();
                model.setRowCount(0);
                model.addRow(new Object[]{hd.getMaHD(),hd.getMaSP(),hd.getSoLuong(),hd.getDonGia(),hd.getThanhTien()});
            }
        }
    }//GEN-LAST:event_btnSearchHDCTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefeshHD;
    private javax.swing.JButton btnRefeshHDCT;
    private javax.swing.JButton btnSearchHD;
    private javax.swing.JButton btnSearchHDCT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTextField txtDGCT;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLoaiThanhToan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCT;
    private javax.swing.JTextField txtMaSPCT;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSLCT;
    private javax.swing.JTextField txtSLHD;
    private javax.swing.JTextField txtSLHDCT;
    private javax.swing.JTextField txtSearchHD;
    private javax.swing.JTextField txtSearchHDCT;
    private javax.swing.JTextField txtThanhTienCT;
    private javax.swing.JTextField txtTinhTrang;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void addTableHD(List<HoaDon> listHD) {
        model = (DefaultTableModel) tblHD.getModel();
        model.setRowCount(0);
        for (HoaDon hd : listHD) {
            model.addRow(new Object[]{hd.getMa(), hd.getNgayTao(), hd.getSdt_KH(), hd.getDiaChi(), hd.getLoaiThanhToan(), hd.getTongTien(), hd.getTinhTrang()});
        }

        this.txtSLHD.setText(String.valueOf(model.getRowCount()));
    }

    private void addTableHDCT(List<HDCTRepo> listHDCT) {
        model = (DefaultTableModel) tblHDCT.getModel();
        model.setRowCount(0);
        for (HDCTRepo hd : listHDCT) {
            model.addRow(new Object[]{hd.getMaHD(), hd.getMaSP(), hd.getSoLuong(), hd.getDonGia(), hd.getThanhTien()});
        }

        this.txtSLHDCT.setText(String.valueOf(model.getRowCount()));
    }
}
