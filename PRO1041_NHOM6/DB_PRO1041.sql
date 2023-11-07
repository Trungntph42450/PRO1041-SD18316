CREATE DATABASE KrantsStore
GO
USE KrantsStore
GO 
CREATE TABLE [TaiKhoan] (
  [MaTK] varchar(10),
  [UserName] varchar(20),
  [PassWord] varchar(20),
  [Role] varchar(10),
  [TrangThai] bit,
  PRIMARY KEY ([MaTK])
);
CREATE TABLE [NhanVien] (
  [MaNV] varchar(10),
  [MaTK] varchar(10) not null,
  CONSTRAINT FK_NV_TK foreign key(MaTK) references TaiKhoan(MaTK),
  [HoTen] nvarchar(50),
  [GioiTinh] bit,
  [DiaChi] nvarchar(100),
  [SoDienThoai] varchar(10),
  [CCCD] nvarchar(50),
  [NgayVaoLam] date,
  [TrangThai] bit,
  [Anh] varchar(MAX),
  PRIMARY KEY ([MaNV])
);

CREATE TABLE [KhachHang] (
  [MaKH] varchar(10),
  [HoTen] nvarchar(50),
  [NgaySinh] date,
  [SoDienThoai] varchar(10),
  [Email] varchar(100),
  [GioiTinh] bit,
  [DiaChi] nvarchar(100),
  [TrangThai] bit,
  PRIMARY KEY ([MaKH])
);


CREATE TABLE [MaVoucher] (
  [MaVoucher] varchar(10),
  [SoLuong] int,
  [TrangThai] bit,
  PRIMARY KEY ([MaVoucher])
);

CREATE TABLE [HoaDon] (
  [MaHoaDon] varchar(10),
  [MaNV] varchar(10) not null,
  CONSTRAINT FK_HD_NV foreign key(MaNV) references NhanVien(MaNV),
  [MaKH] varchar(10) not null,
  CONSTRAINT FK_HD_KH foreign key(MaKH) references KhachHang(MaKH),
  [HTTT] varchar(10)not null,
  [NgayTao] datetime,
  [ThanhTien] Money,
  [TrangThai] bit,
  [GhiChu] nvarchar(100),
  [MaVoucher] varchar(10) not null,
  CONSTRAINT FK_HD_VC foreign key(MaVoucher) references MaVoucher(MaVoucher),
  PRIMARY KEY ([MaHoaDon])
);


CREATE TABLE [LoaiSanPham] (
  [MaLSP] varchar(10),
  [TenLSP] nvarchar(50),
  [TrangThai] bit,
  [Mota] nvarchar(100),
  PRIMARY KEY ([MaLSP])
);
CREATE TABLE [SanPham] (
  [MaSanPham] varchar(10),
  [TenSanPham] nvarchar(100),
  [TrangThai] bit,
  [SoLuong] int,
  [Gia] money,
  [Mota] nvarchar(100),
  [MauSac] nvarchar(50),
  [ChatLieu] nvarchar(50),
  [KichThuoc] nvarchar(50),
  [MaLSP] varchar(10) not null,
  CONSTRAINT FK_SP_LSP foreign key(MaLSP) references LoaiSanPham(MaLSP),
  PRIMARY KEY ([MaSanPham])
);


CREATE TABLE [HoaDonChiTiet] (
  [MaHoaDonChiTiet] varchar(10),
  [MaSanPham] varchar(10) not null,
  CONSTRAINT FK_HDCT_SP foreign key(MaSanPham) references SanPham(MaSanPham),
  [MaHoaDon] varchar(10) not null,
  CONSTRAINT FK_HDCT_HD foreign key(MaHoaDon) references HoaDon(MaHoaDon),
  [SoLuong] int,
  [Gia] money,
  [GiamGia] money,
  [ThanhTien] money,
  [GhiChu] nvarchar(100),
  [TrangThai] bit,
  PRIMARY KEY ([MaHoaDonChiTiet])
);




