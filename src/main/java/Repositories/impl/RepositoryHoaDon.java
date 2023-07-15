/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import Repositories.IRepositoryHoaDon;
import Utilies.HibernateUtil;
import com.google.zxing.Result;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ADMIN
 */
public class RepositoryHoaDon implements IRepositoryHoaDon {

    @Override
    public List<HoaDon> getListHD() {
        Session ss = HibernateUtil.getSession();
        Query query = ss.createQuery("From HoaDon");
        List<HoaDon> list = query.getResultList();
        return list;
    }

    @Override
    public List<HDCTRepo> getListHDCT() {
        List<HDCTRepo> list = new ArrayList<>();
        String query = "select HoaDon.Ma, SanPham.Ma,soLuong,donGia from HoaDonCT inner join HoaDon on HoaDonCT.Id_hd = HoaDon.Id\n"
                + "inner join SanPham on HoaDonCT.Id_sp = SanPham.Id ";
        try (Connection conn = HibernateUtil.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HDCTRepo hdct = new HDCTRepo();
                hdct.setMaHD(rs.getString(1));
                hdct.setMaSP(rs.getString(2));
                hdct.setSoLuong(rs.getInt(3));
                hdct.setDonGia(rs.getBigDecimal(4));

                list.add(hdct);
            }
        } catch (Exception e) {
        }
        return list;
    }

    

}
