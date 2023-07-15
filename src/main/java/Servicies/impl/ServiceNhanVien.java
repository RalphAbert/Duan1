package Servicies.impl;

import DomainModels.NhanVien;
import Repositories.impl.RepositoryNhanVien;
import ViewsModels.BanHang.NhanVienDangNhapViewModel;
import ViewsModels.NhanVien.NhanVienViewModels;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServiceNhanVien {
    
    RepositoryNhanVien repo;
    
    public ServiceNhanVien() {
        this.repo = new RepositoryNhanVien();
    }
    
    public NhanVienDangNhapViewModel dangNhap(String Email, String MatKhau) {
        NhanVienDangNhapViewModel user = new NhanVienDangNhapViewModel(this.repo.DangNhap(Email, MatKhau));
        if (user.getTrangThai() == 0) {
            return user;
        }
        return null;
    }
    
    public UUID checkEmail(String Email) {
        return this.repo.checkEmail(Email);
    }
    
    public NhanVien checkEmailNhanVien(String Email) {
        return this.repo.checkEmailNhanVien(Email);
    }
    
    public String checkMatKhau(String MatKhau) {
        return this.repo.checkMatKhau(MatKhau);
    }
    
    public boolean UpdateTaiKhoan(NhanVienDangNhapViewModel nvvm) {
        NhanVien nv = new NhanVien();
        nv.setMatKhau(nvvm.getMatKhau());
        return this.repo.UpdateTaiKhoan(nv);
    }
    
    public List<NhanVienViewModels> getAllNV() {
        try {
            List<NhanVien> lst = repo.getAllNV();
            return lst.stream().map(NhanVienViewModels::new).collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    public boolean Insert(NhanVienViewModels nhanVien) {
        NhanVien nvrp = new NhanVien();
        nvrp.setMa(nhanVien.getMaNV());
        nvrp.setTen(nhanVien.getTenNV());
        nvrp.setGioiTinh(nhanVien.getGioiTinh());
        nvrp.setNgaySinh(nhanVien.getNgaySinh());
        nvrp.setSdt(nhanVien.getSDT());
        nvrp.setMatKhau(nhanVien.getMatKhau());
        nvrp.setEmail(nhanVien.getEmail());
        nvrp.setDiaChi(nhanVien.getDiaChi());
        nvrp.set_Role(nhanVien.getVaiTro());
        nvrp.setTrangThai(nhanVien.getTrangThai());
        return repo.InsertTaiKhoan(nvrp);
    }
    
    public boolean Update(NhanVienViewModels nhanVien) {
        NhanVien nvrp = new NhanVien();
        nvrp.setMa(nhanVien.getMaNV());
        nvrp.setTen(nhanVien.getTenNV());
        nvrp.setGioiTinh(nhanVien.getGioiTinh());
        nvrp.setNgaySinh(nhanVien.getNgaySinh());
        nvrp.setSdt(nhanVien.getSDT());
        nvrp.setMatKhau(nhanVien.getMatKhau());
        nvrp.setEmail(nhanVien.getEmail());
        nvrp.setDiaChi(nhanVien.getDiaChi());
        nvrp.set_Role(nhanVien.getVaiTro());
        nvrp.setTrangThai(nhanVien.getTrangThai());
        return repo.UpdateNhanVien(nvrp);
    }
}
