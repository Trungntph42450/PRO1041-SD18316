/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Danh
 */
public class sanPham_BanHang {

    private String maSP;
    private String TenSP;
    private int soLuong;
    private double donGia;
    private String MauSac;
    private String kichThuoc;
    private String XuatSu;
    private String chatLieu;
    private boolean TrangThai;

    public sanPham_BanHang(String maSP, String TenSP, int soLuong, double donGia, String MauSac, String kichThuoc, String XuatSu, String chatLieu, boolean TrangThai) {
        this.maSP = maSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.MauSac = MauSac;
        this.kichThuoc = kichThuoc;
        this.XuatSu = XuatSu;
        this.chatLieu = chatLieu;
        this.TrangThai = TrangThai;
    }

    public sanPham_BanHang() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getXuatSu() {
        return XuatSu;
    }

    public void setXuatSu(String XuatSu) {
        this.XuatSu = XuatSu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
public  Object[] todatarow(){
    return new Object[]{
          this.maSP, this.TenSP ,this.soLuong,this.donGia,this.MauSac ,this.kichThuoc,  this.XuatSu ,this.chatLieu ,this.TrangThai
    };
}
}
