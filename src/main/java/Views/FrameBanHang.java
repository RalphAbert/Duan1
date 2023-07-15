package Views;

import DomainModels.HoaDon;
import DomainModels.KhachHang;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.Result;
import Servicies.impl.ServiceBanHang;
import ViewsModels.BanHang.GioHangInRespone;
import ViewsModels.BanHang.GioHangRespone;
import ViewsModels.BanHang.HoaDonBanHangRespone;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import ViewsModels.BanHang.SanPhamBanHangResponse;
import ViewsModels.BanHang.khachHangBanHangRespone;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class FrameBanHang extends javax.swing.JPanel {

    private NhanVienDangNhapViewModel us = new NhanVienDangNhapViewModel();
    private Thread t1;
    private khachHangBanHangRespone kh = new khachHangBanHangRespone();
    private DefaultTableModel dtm = new DefaultTableModel();
    private ServiceBanHang bhs = new ServiceBanHang();
    private List<HoaDonBanHangRespone> lstHoaDon = new ArrayList<>();
    private List<SanPhamBanHangResponse> lstSP = new ArrayList<>();
    private List<GioHangRespone> lstGH = new ArrayList<>();
    private ArrayList<GioHangInRespone> lstGHIRP = new ArrayList<>();
    private int indexHD = -1;
    private int indexSP = -1;
    private int indexGH = -1;
    private int indexImel = -1;
    private int indexImelBan = -1;

    public FrameBanHang(NhanVienDangNhapViewModel user) {
        initComponents();
        us = user;

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdoTatCa);
        bg.add(rdoDaThanhToan);
        bg.add(rdoChoThanhToan);
        bg.add(rdoDaHuy);

        rdoTatCa.setSelected(true);

        Icon thanhToan = new ImageIcon("Icon/Money.png");
        Icon taoHD = new ImageIcon("Icon/Add.png");
        Icon lamTrong = new ImageIcon("Icon/No.png");
        Icon search = new ImageIcon("Icon/Search.png");

        this.btnThanhToan.setIcon(thanhToan);
        this.btnHoaDonMoi.setIcon(taoHD);
        this.btnHuyHoaDon.setIcon(lamTrong);
        this.btnSearchHD.setIcon(search);
        this.btnSearchSP.setIcon(search);
        btnThemKhachHang.setIcon(taoHD);

        fillTableSP(bhs.listSanPhamBanHang());
        fillTableHoaDon(bhs.listHoaDonBanHang());
        FilltoTableGH();
        scannerImel();
    }

    private void clearForm() {
        txtMaKH.setText("");
        txtTenKhachHang.setText("");
        txtSdtKH.setText("");
        txtMaHD.setText("");
        txtMaNV.setText("");
        txtTongTien.setText("0");
        cbHinhThuc.setSelectedIndex(0);
        txtTienKhachDua.setText("0");
        txtTienThua.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        btnSearchHD = new javax.swing.JButton();
        txtSearchHD = new javax.swing.JTextField();
        rdoDaHuy = new javax.swing.JRadioButton();
        rdoDaThanhToan = new javax.swing.JRadioButton();
        rdoChoThanhToan = new javax.swing.JRadioButton();
        rdoTatCa = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        btnSearchSP = new javax.swing.JButton();
        txtSearchSP = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbHinhThuc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnThanhToan = new javax.swing.JButton();
        btnHoaDonMoi = new javax.swing.JButton();
        btnHuyHoaDon = new javax.swing.JButton();
        txtTongTien = new javax.swing.JTextField();
        txtTienThua = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSdtKH = new javax.swing.JTextField();
        btnThemKhachHang = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        pnlCam = new javax.swing.JPanel();
        pnlWebCam = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Hóa Đơn");

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Nhân viên", "Khách Hàng", "Ngày tạo", "Hình thức", "Trạng thái"
            }
        ));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbHoaDon);

        btnSearchHD.setText("Search");
        btnSearchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHDActionPerformed(evt);
            }
        });

        rdoDaHuy.setText("Đã hủy");
        rdoDaHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaHuyActionPerformed(evt);
            }
        });

        rdoDaThanhToan.setText("Đã thanh toán");
        rdoDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaThanhToanActionPerformed(evt);
            }
        });

        rdoChoThanhToan.setText("Chờ thanh toán");
        rdoChoThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChoThanhToanActionPerformed(evt);
            }
        });

        rdoTatCa.setText("Tất cả");
        rdoTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTatCaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdoTatCa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoChoThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoDaThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoDaHuy))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(109, 109, 109)
                            .addComponent(btnSearchHD)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearchHD)
                    .addComponent(txtSearchHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDaHuy)
                    .addComponent(rdoDaThanhToan)
                    .addComponent(rdoChoThanhToan)
                    .addComponent(rdoTatCa))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Giỏ hàng");

        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbGioHang);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Danh Sách Sản Phẩm");

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên SP", "Loại", "Màu sắc", "Kích cỡ", "Số lượng tồn", "Đơn giá"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbSanPham);

        btnSearchSP.setText("Search");
        btnSearchSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnSearchSP)
                    .addComponent(txtSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Mã HD");

        txtMaHD.setForeground(new java.awt.Color(0, 0, 255));
        txtMaHD.setEnabled(false);

        jLabel7.setText("Tổng tiền hàng");

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel8.setText("Hình thức");

        cbHinhThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));

        jLabel10.setText("Tiền khách đưa");

        txtTienKhachDua.setForeground(new java.awt.Color(255, 51, 51));
        txtTienKhachDua.setText("0");
        txtTienKhachDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKhachDuaActionPerformed(evt);
            }
        });

        jLabel11.setText("Tiền thừa");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHoaDonMoi.setText("Tạo");
        btnHoaDonMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonMoiActionPerformed(evt);
            }
        });

        btnHuyHoaDon.setText("Hủy");
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        txtTongTien.setForeground(new java.awt.Color(255, 51, 51));
        txtTongTien.setText("0");
        txtTongTien.setEnabled(false);

        txtTienThua.setForeground(new java.awt.Color(255, 51, 51));
        txtTienThua.setText("0");
        txtTienThua.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel6.setText("Mã KH");

        txtMaKH.setForeground(new java.awt.Color(0, 0, 255));
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        jLabel9.setText("Tên KH");

        txtTenKhachHang.setForeground(new java.awt.Color(0, 0, 255));
        txtTenKhachHang.setEnabled(false);
        txtTenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHangActionPerformed(evt);
            }
        });

        jLabel13.setText("Sdt KH");

        txtSdtKH.setForeground(new java.awt.Color(0, 0, 255));
        txtSdtKH.setEnabled(false);

        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSdtKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSdtKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Mã NV");

        txtMaNV.setForeground(new java.awt.Color(0, 0, 255));
        txtMaNV.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txtTienThua)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHoaDonMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHinhThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThanhToan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHoaDonMoi)
                    .addComponent(btnHuyHoaDon))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quét mã", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 102))); // NOI18N

        pnlCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWebCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlCam.add(pnlWebCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCam, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoChoThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChoThanhToanActionPerformed
        fillTableHoaDonCTT();
    }//GEN-LAST:event_rdoChoThanhToanActionPerformed

    private void rdoDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaThanhToanActionPerformed
        fillTableHoaDonDTT();
    }//GEN-LAST:event_rdoDaThanhToanActionPerformed

    private void rdoDaHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaHuyActionPerformed
        fillTableHoaDonDH();
    }//GEN-LAST:event_rdoDaHuyActionPerformed

    private void rdoTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTatCaActionPerformed
        fillTableHoaDon(bhs.listHoaDonBanHang());
    }//GEN-LAST:event_rdoTatCaActionPerformed

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        int row = tbHoaDon.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaHD.setText(tbHoaDon.getValueAt(row, 0).toString());
        txtMaKH.setText(tbHoaDon.getValueAt(row, 2).toString());
        kh = bhs.getkhachHang(txtMaKH.getText());
        txtTenKhachHang.setText(kh.getTen());
        txtSdtKH.setText(kh.getSdt());
        txtMaNV.setText(tbHoaDon.getValueAt(row, 1).toString());
        double tong = 0;
        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            tong = (Double.parseDouble(tbGioHang.getValueAt(i, 3).toString()));
        }
        txtTongTien.setText(tong + "");
        cbHinhThuc.setSelectedItem(tbHoaDon.getValueAt(row, 4).toString());
        fillTableGHByMa(txtMaHD.getText());
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void btnSearchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHDActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        List<HoaDonBanHangRespone> listHDBHRP = new ArrayList<>();
        String searchHD = txtSearchHD.getText();
        if (searchHD.equals("")) {
            fillTableHoaDon(bhs.listHoaDonBanHang());
            return;
        }
        if (tbHoaDon.getRowCount() > 0) {
            for (HoaDonBanHangRespone hdbhrp : bhs.getALLHoaDonBanHang()) {
                if (searchHD.equals(hdbhrp.getMa()) || searchHD.equals(hdbhrp.getNguoiTao()) || searchHD.equals(hdbhrp.getKhachHang())
                        || searchHD.equals(hdbhrp.getNgayTao().toString())) {
                    listHDBHRP.add(hdbhrp);
                    fillTableHoaDon(listHDBHRP);
                }
            }
        }
    }//GEN-LAST:event_btnSearchHDActionPerformed

    private void txtTenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHangActionPerformed


    }//GEN-LAST:event_txtTenKhachHangActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed

        kh = bhs.getkhachHang(txtMaKH.getText());
        txtTenKhachHang.setText(kh.getTen());
        txtSdtKH.setText(kh.getSdt());
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnHoaDonMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonMoiActionPerformed

        int ltt = cbHinhThuc.getSelectedIndex();
        try {
            if (txtMaKH.getText().equals("") || txtTenKhachHang.getText().equals("") || txtSdtKH.getText().equals("")) {
                return;
            }
            if (bhs.createHoaDon(us.getId(), txtMaKH.getText(), ltt)) {
                JOptionPane.showMessageDialog(this, "Tạo hóa đơn thành công");
                fillTableHoaDon(bhs.listHoaDonBanHang());
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tạo hóa đơn thất bại");
        }

    }//GEN-LAST:event_btnHoaDonMoiActionPerformed

    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHoaDonActionPerformed
        int row = tbHoaDon.getSelectedRow();
        if (row == -1) {
            return;
        }

        String trangThai = tbHoaDon.getValueAt(row, 5).toString();
        if (trangThai.equals("Đã thanh toán") || trangThai.equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Bạn chỉ được hủy đơn chờ thanh toán!");
            return;
        }
        if (bhs.updateHuy(txtMaHD.getText())) {
            fillTableGHByMa(txtMaHD.getText());
            clearForm();
            JOptionPane.showMessageDialog(this, "Hủy hóa đơn thành công!");
            fillTableHoaDon(bhs.listHoaDonBanHang());
            return;
        }
        JOptionPane.showMessageDialog(this, "Hủy hóa đơn thất bại!");
    }//GEN-LAST:event_btnHuyHoaDonActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        int rowHD = tbHoaDon.getSelectedRow();
        if (txtMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chọn hóa đơn cần mua hàng!");
            return;
        }
        String trangThaiStr = tbHoaDon.getValueAt(rowHD, 5).toString();
        if (trangThaiStr.equals("Đã thanh toán") || trangThaiStr.equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn hóa đơn chưa thanh toán!");
            return;
        }

        getSPfillGH();
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void tbGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGioHangMouseClicked
        getSPunGH();

    }//GEN-LAST:event_tbGioHangMouseClicked

    private void tbHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseEntered

    }//GEN-LAST:event_tbHoaDonMouseEntered

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

        if (txtMaHD.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chọn hóa đơn cần mua hàng!");
            return;
        }

        double tienKhachDua = Double.parseDouble(txtTienKhachDua.getText());
        double tongTien = Double.parseDouble(txtTongTien.getText());
        if (tienKhachDua < tongTien) {
            JOptionPane.showMessageDialog(this, "Khách chưa trả đủ số tiền!");
            return;
        }

        int vitri = tbHoaDon.getSelectedRow();

        if (tbHoaDon.getValueAt(vitri, 5).toString().equals("Đã thanh toán") || tbHoaDon.getValueAt(vitri, 5).toString().equals("Đã hủy")) {
            JOptionPane.showMessageDialog(this, "Lỗi thanh toán!");
            return;
        }
        HoaDon hd = bhs.SelectHoaDonByMa(txtMaHD.getText());
        insertHDCT();
        bhs.updateHD(txtMaHD.getText());
        clearMouclickAll();
        clearForm();
        fillTableHoaDon(bhs.listHoaDonBanHang());
        fillTableSP(bhs.listSanPhamBanHang());
        JOptionPane.showMessageDialog(this, "Thanh toán thành công");
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtTienKhachDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKhachDuaActionPerformed
        double tongTien = Double.parseDouble(txtTongTien.getText());
        double tkd = Double.parseDouble(txtTienKhachDua.getText());
        double tienThua = 0;
        if (tongTien > tkd) {
            tienThua = tienThua;
            txtTienThua.setText(tienThua + "");
        }
        if (tongTien < tkd) {
            tienThua = tkd - tongTien;
            txtTienThua.setText(tienThua + "");
        }
    }//GEN-LAST:event_txtTienKhachDuaActionPerformed

    private void btnSearchSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSPActionPerformed
        List<SanPhamBanHangResponse> listHDBHRP = new ArrayList<>();
        String searchSP = txtSearchSP.getText();
        if (searchSP.equals("")) {
            fillTableSP(bhs.listSanPhamBanHang());
            return;
        }
        if (tbHoaDon.getRowCount() > 0) {
            for (SanPhamBanHangResponse spbhrp : bhs.listSanPhamBanHang()) {
                if (searchSP.equals(spbhrp.getMaSP()) || searchSP.equals(spbhrp.getTenSP()) || searchSP.equals(spbhrp.getLoai())
                        || searchSP.equals(spbhrp.getMauSac()) || searchSP.equals(String.valueOf(spbhrp.getKichCo())) || searchSP.equals(String.valueOf(spbhrp.getSoLuong())) || searchSP.equals(spbhrp.getGiaBan().toString())) {
                    listHDBHRP.add(spbhrp);
                    fillTableSP(listHDBHRP);
                    return;
                }
            }
        }

    }//GEN-LAST:event_btnSearchSPActionPerformed

    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        new ViewThemKHBanHang(us).setVisible(true);
    }//GEN-LAST:event_btnThemKhachHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDonMoi;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnSearchHD;
    private javax.swing.JButton btnSearchSP;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JComboBox<String> cbHinhThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCam;
    private javax.swing.JPanel pnlWebCam;
    private javax.swing.JRadioButton rdoChoThanhToan;
    private javax.swing.JRadioButton rdoDaHuy;
    private javax.swing.JRadioButton rdoDaThanhToan;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSdtKH;
    private javax.swing.JTextField txtSearchHD;
    private javax.swing.JTextField txtSearchSP;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    public void scannerImel() {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.QVGA.getSize());

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setPreferredSize(WebcamResolution.VGA.getSize());
        panel.setFPSDisplayed(true);

        pnlWebCam.add(panel, new AbsoluteConstraints(0, 0, 272, 182));

        t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                    BufferedImage image = null;
                    Result result = null;
                    if (webcam.isOpen()) {
                        if ((image = webcam.getImage()) == null) {
                            continue;
                        }
                    }
                    try {
                        LuminanceSource source = new BufferedImageLuminanceSource(image);
                        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                        Reader reader = new MultiFormatReader();
                        result = reader.decode(bitmap);
                    } catch (Exception e) {
                    }
                    if (result != null) {
                        JOptionPane.showMessageDialog(null, result.getText());

                    }
                }
            }
        };
        t1.start();
    }

    private void fillTableHoaDon(List<HoaDonBanHangRespone> listHD) {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);

        for (HoaDonBanHangRespone s : listHD) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableSP(List<SanPhamBanHangResponse> listSPBH) {
        dtm = (DefaultTableModel) tbSanPham.getModel();
        dtm.setRowCount(0);
        for (SanPhamBanHangResponse s : listSPBH) {
            if (s.getSoLuong() > 0) {
                dtm.addRow(s.toDataRow());
            }
        }
    }

    private void fillTableHoaDonDTT() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonDaThanhToan();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableHoaDonDH() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonDaHuy();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableHoaDonCTT() {
        dtm = (DefaultTableModel) tbHoaDon.getModel();
        dtm.setRowCount(0);
        lstHoaDon = bhs.getALLHoaDonChoThanhToan();
        if (lstHoaDon.isEmpty()) {
            return;
        }
        for (HoaDonBanHangRespone s : lstHoaDon) {
            dtm.addRow(s.toDataRow());
        }
        btnHuyHoaDon.setBackground(Color.red);
        btnHuyHoaDon.setEnabled(true);
    }

    private void fillTableGH(ArrayList<GioHangRespone> listGHBH) {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        for (GioHangRespone s : listGHBH) {
            dtm.addRow(s.toDataRow());
        }
    }

    private void fillTableGHByMa(String ma) {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        try {
            lstGH = bhs.getAllGHByMaHD(ma);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (GioHangRespone s : lstGH) {
            dtm.addRow(s.toDataRow());
        }
        indexGH = -1;
        double tong = 0;
        for (int i = 0; i < tbGioHang.getRowCount(); i++) {
            tong += (Double.parseDouble(tbGioHang.getValueAt(i, 3).toString()));
        }
        txtTongTien.setText(tong + "");
    }

    private void showdetailDH() {
        int row = tbHoaDon.getSelectedRow();

        if (row == -1) {
            return;
        }

    }

    private void tinhTienThua() {
        double tienKhachDua = 0;
        try {
            tienKhachDua = Double.parseDouble(txtTienKhachDua.getText());
        } catch (Exception e) {
        }
        try {
            double tienThua = tienKhachDua - Double.parseDouble(txtTongTien.getText());
            txtTienThua.setText(tienThua + "");
        } catch (Exception e) {
        }
    }

    private void getSPfillGH() {
        int row = tbSanPham.getSelectedRow();
        int rowGH = tbGioHang.getSelectedRow();

        for (GioHangInRespone x : lstGHIRP) {
            if (tbSanPham.getValueAt(row, 0).toString().equalsIgnoreCase(x.getMaSP())) {
                int sl = 0;
                try {
                    sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
                    if (sl < 0 || sl > bhs.listSanPhamBanHang().get(row).getSoLuong()) {
                        JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                        return;
                    }
                    if (sl == 0) {
                        lstGHIRP.remove(x);
                        return;
                    }
                    x.setSoLuong(sl);
                    bhs.UpdateSanPhamBan(tbSanPham.getValueAt(row, 0).toString(), sl);
                    FilltoTableGH();
                    showtien();
                    return;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                    return;
                }

            }
        }
        int sl = 0;
        try {
            sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng"));
            if (sl < 0 || sl > bhs.listSanPhamBanHang().get(row).getSoLuong()) {
                JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số");
        }

        double dg = Double.parseDouble(tbSanPham.getValueAt(row, 6).toString());

        String idCTSP = bhs.listSanPhamBanHang().get(row).getId();
        String maCTSP = tbSanPham.getValueAt(row, 0).toString();
        String tenSP = tbSanPham.getValueAt(row, 1).toString();
        BigDecimal donGia = BigDecimal.valueOf(dg);

        GioHangInRespone ghirp = new GioHangInRespone(idCTSP, maCTSP, tenSP, sl, donGia);

        lstGHIRP.add(ghirp);
        bhs.UpdateSanPhamBan(tbSanPham.getValueAt(row, 0).toString(), sl);
        FilltoTableGH();
        fillTableSP(bhs.listSanPhamBanHang());
        showtien();
    }

    private void getSPunGH() {
        int row = tbGioHang.getSelectedRow();

        int slm = Integer.parseInt(tbGioHang.getValueAt(row, 2).toString());
        for (GioHangInRespone x : lstGHIRP) {
            if (tbGioHang.getValueAt(row, 0).toString().equalsIgnoreCase(x.getMaSP())) {
                int sl = -1;
                try {
                    sl = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng bỏ ra"));
                    if (sl < 0 || sl > lstGHIRP.get(row).getSoLuong()) {
                        JOptionPane.showMessageDialog(this, "Nhập sai số lượng");
                        return;
                    }
                    if (sl == 0) {
                        lstGH.remove(x);
                        return;
                    }
                    if (Integer.parseInt(tbGioHang.getValueAt(row, 2).toString()) == 0) {
                        tbGioHang.remove(row);
                    }
                    int slmh = slm - sl;
                    x.setSoLuong(slmh);
                    bhs.updateSanPhamMua(tbGioHang.getValueAt(row, 0).toString(), sl);
                    FilltoTableGH();
                    fillTableSP(bhs.listSanPhamBanHang());
                    showtien();
                    return;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                }

            }
        }
    }

    private void FilltoTableGH() {
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
        for (GioHangInRespone x : lstGHIRP) {
            if (x.getSoLuong() > 0) {
                dtm.addRow(new Object[]{x.getMaSP(), x.getTenSP(), x.getSoLuong(), x.getDonGia(), x.getThanhtien()});
            }
        }
    }

    private void showtien() {
        double tt = 0;
        for (GioHangInRespone x : lstGHIRP) {
            tt += Double.parseDouble(x.getThanhtien().toString());
        }
        txtTongTien.setText(String.valueOf(tt));
    }

    private void insertHDCT() {
        int rowSP = tbSanPham.getSelectedRow();
        int rowHD = tbHoaDon.getSelectedRow();
        String idHD = bhs.listHoaDonBanHang().get(rowHD).getId().toString();
        bhs.INSERT(idHD, lstGHIRP.get(rowSP).getIdCTSP().toString(), lstGHIRP);
        System.out.println(idHD);
    }

    private void clearMouclickAll() {
        tbSanPham.clearSelection();
        tbHoaDon.clearSelection();
        dtm = (DefaultTableModel) tbGioHang.getModel();
        dtm.setRowCount(0);
    }
}
