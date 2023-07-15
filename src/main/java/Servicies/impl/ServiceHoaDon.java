/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicies.impl;
import DomainModels.HoaDon;
import ViewsModels.SanPhamAndChiTietSP.HDCTRepo;
import Servicies.IServiceHoaDon;
import Repositories.IRepositoryHoaDon;
import Repositories.impl.RepositoryHoaDon;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ServiceHoaDon implements IServiceHoaDon{
    private IRepositoryHoaDon HDRepo = new RepositoryHoaDon();

    @Override
    public List<HoaDon> getListHD() {
        return this.HDRepo.getListHD();
    }

    @Override
    public List<HDCTRepo> getListHDCT() {
        List<HDCTRepo> list = new ArrayList<>();
        
        for (HDCTRepo hd : HDRepo.getListHDCT()) {
            HDCTRepo hdct = new HDCTRepo();
            hdct.setMaHD(hd.getMaHD());
            hdct.setMaSP(hd.getMaSP());
            hdct.setSoLuong(Integer.valueOf(hd.getSoLuong()));
            hdct.setDonGia(hd.getDonGia());
            int TongTien = hd.getSoLuong()*Integer.parseInt(hd.getDonGia()+"");
            hdct.setThanhTien(BigDecimal.valueOf(TongTien));
            
            list.add(hdct);
        }
        
        return list;
    }

    
    

    
    
    
}
