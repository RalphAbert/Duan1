use master
go

drop database if exists DA1_NHOM5
go

CREATE DATABASE DA1_NHOM5
GO

USE DA1_NHOM5
GO

CREATE TABLE [NhanVien] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Ten] NVARCHAR(255) NOT NULL,
  [GioiTinh] INT DEFAULT 0,
  [NgaySinh] DATE DEFAULT NULL,
  [Sdt] VARCHAR(255) NOT NULL,
  [MatKhau] VARCHAR(255) NOT NULL,
  [Email] VARCHAR(255) UNIQUE NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [_Role] INT DEFAULT 0,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [KhachHang] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [HoTen] NVARCHAR(255) NOT NULL,
  [GioiTinh] INT DEFAULT 0,
  [Sdt] VARCHAR(20) UNIQUE NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [NgaySinh] DATE DEFAULT NULL,
  [LoaiKH] int default 0,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [HoaDon] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Id_KH] UNIQUEIDENTIFIER,
  [Id_NV] UNIQUEIDENTIFIER,
  [Ma] VARCHAR(255) UNIQUE,
  [NgayTao] DATE DEFAULT NULL,
  [Sdt_KH] VARCHAR(20) NOT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [LoaiThanhToan] INT DEFAULT 0,
  [TongTien] decimal(20,0) DEFAULT 0,
  [TinhTrang] INT DEFAULT 0
)
GO

CREATE TABLE [NhaCungCap] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Ten] NVARCHAR(225) DEFAULT NULL,
  [DiaChi] NVARCHAR(255) DEFAULT NULL,
  [Sdt] NVARCHAR(20) DEFAULT NULL,
  [TrangThai] INT DEFAULT 0
)
GO

CREATE TABLE [SanPham] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
  [TrangThai] INT DEFAULT 0 --> 0 ? Con hang : Het hang ...
)
GO

CREATE TABLE [Loai] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
)
GO

CREATE TABLE [MauSac] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL, 
  [Ten] NVARCHAR(255) DEFAULT NULL,
)
GO


CREATE TABLE [ChiTietSP] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Ma] VARCHAR(255) UNIQUE NOT NULL,
  [Id_ncc] UNIQUEIDENTIFIER,
  [Id_sp] UNIQUEIDENTIFIER,
  [Id_Loai] UNIQUEIDENTIFIER,
  [Id_MauSac] UNIQUEIDENTIFIER,
  [KichCo] INT DEFAULT 0,
  [SoLuong] INT DEFAULT 0,
  [GiaBan] decimal(20,0) DEFAULT 0,
  [UrlAnh] varchar(50) default null,
  [MaQR] varchar(255) default null
)
GO

CREATE TABLE [HoaDonCT] (
  [Id] UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
  [Id_hd] UNIQUEIDENTIFIER,
  [Id_ctsp] UNIQUEIDENTIFIER,
  [soLuong] INT DEFAULT 0,
  [donGia] decimal(20,0) DEFAULT 0
)
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([Id_NV]) REFERENCES [NhanVien] ([Id])
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([Id_KH]) REFERENCES [KhachHang] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_ncc]) REFERENCES [NhaCungCap] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_sp]) REFERENCES [SanPham] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_Loai]) REFERENCES [Loai] ([Id])
GO

ALTER TABLE [ChiTietSP] ADD FOREIGN KEY ([Id_MauSac]) REFERENCES [MauSac] ([Id])
GO

ALTER TABLE [HoaDonCT] ADD FOREIGN KEY ([Id_ctsp]) REFERENCES [ChiTietSP] ([Id])
GO

ALTER TABLE [HoaDonCT] ADD FOREIGN KEY ([Id_hd]) REFERENCES [HoaDon] ([Id])
GO



select * from KhachHang
select * from NhanVien
select * from HoaDon h 

select * FROM HoaDon 
select * from ChiTietSP
select * from HoaDon

select * from ChiTietSP


select * from NhaCungCap
select * from SanPham
select * from Loai
select * from MauSac
select * from ChiTietSP



select * from HoaDonCT

select * FROM HoaDon 
select * from HoaDonCT 

go




insert into NhanVien(Ma, Ten, GioiTinh, NgaySinh, Sdt, MatKhau, Email, DiaChi, _Role, TrangThai)
values ('Qly',N'Quản Lý',0,'2003/10/18','0963707163','QuanLy','QuanLy@gmail.com',N'Vân Canh - Hà Nội',0,0),
('NhanVien',N'Nhân Viên',1,'2003/10/18','0963707163','NhanVien','NhanVien@gmail.com',N'Vân Canh - Hà Nội',1,1)
go

insert into KhachHang(Ma, HoTen, GioiTinh, Sdt,DiaChi,NgaySinh, TrangThai)
values ('KH1',N'Khách hàng 1',0,'0987654321',N'Hà Nội', '2003/10/18',0),
('KH2',N'Khách hàng 2',1,'0987654322',N'Hà Nội', '2003/10/18',1),
('KH3',N'Khách hàng 3',1,'0987654333',N'Hà Nội', '2003/10/18',0)
go

INSERT INTO NhaCungCap(Ma, Ten, DiaChi, Sdt, TrangThai)
VALUES ('NCC1',N'NHÀ CUNG CẤP 1',N'HÀ NỘI','0987656789',0),
('NCC2',N'NHÀ CUNG CẤP 2',N'HÀ NỘI','0987656789',1)
go

INSERT INTO SanPham(Ma, Ten,TrangThai)
VALUES ('SP1',N'SẢN PHẨM 1',0),
('SP2',N'SẢN PHẨM 2',1)
go
INSERT INTO HoaDon(Id_KH, Id_NV, Ma, NgayTao,Sdt_KH,DiaChi,LoaiThanhToan,TongTien,TinhTrang)
VALUES ('A5847368-E1C5-4D84-A4D4-2000BC34A9A5','B8CACAF3-C8A9-4293-9F94-10C05A364534','HD1','2022/11/29','0987654321',N'HÀ NỘI',0,NULL,0),
('61F7F1C6-7ACF-429D-A379-E557E95CE40B','E74C4E04-4911-49AB-A3F9-3ED8155528DB','HD2','2022/11/29','0987654321',N'HÀ NỘI',1,NULL,1),
('C9230C9A-0AF0-49DD-B4D7-FD6339BA6F22','244EC22B-CEDB-4480-AB5F-50A9BBD1D7C8','HD3','2022/11/29','0987654321',N'HÀ NỘI',2,NULL,2)


select s.Ma, s.Ten, l.Ten, m.Ten, c.KichCo, c.SoLuong, c.GiaBan
from ChiTietSP c
join SanPham s on c.Id_sp = s.Id
join MauSac m on c.Id_MauSac = m.Id
join Loai l on c.Id_Loai = l.Id