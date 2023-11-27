/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GioHang {
    private String STT;
    private String MaHoaDon ;
    private String MaSanPham ;
    private String TenSanPham ;
    private int SoLuong ;
    private String MauSac ;
    private String KichThuoc ;
    private double DonGia ;
    private double ThanhTien ;

    public GioHang(String STT, String MaHoaDon, String MaSanPham, String TenSanPham, int SoLuong, String MauSac, String KichThuoc, double DonGia, double ThanhTien) {
        this.STT = STT;
        this.MaHoaDon = MaHoaDon;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.MauSac = MauSac;
        this.KichThuoc = KichThuoc;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
    }

    public GioHang() {
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String KichThuoc) {
        this.KichThuoc = KichThuoc;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    public Object[] DataGioHang(){
        return new Object[]{
         this.STT ,  this.MaHoaDon ,  this.MaSanPham ,this.TenSanPham , this.SoLuong , this.MauSac , this.KichThuoc ,this.DonGia , this.ThanhTien 
        };
    }
    
}
