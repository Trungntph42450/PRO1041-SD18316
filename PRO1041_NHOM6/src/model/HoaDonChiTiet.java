/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class HoaDonChiTiet {

    private String maHoaDonChiTiet;
    private String maSanPham;
    private String maHoaDon;
    private Integer soLuong;
    private double gia;
    private double giamGia;
    private double thanhTien;
    private String ghiChu;
    private boolean trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHoaDonChiTiet, String maSanPham, String maHoaDon, Integer soLuong, double gia, double giamGia, double thanhTien, String ghiChu, boolean trangThai) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
        this.maSanPham = maSanPham;
        this.maHoaDon = maHoaDon;
        this.soLuong = soLuong;
        this.gia = gia;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public String getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(String maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "maHoaDonChiTiet=" + maHoaDonChiTiet + ", maSanPham=" + maSanPham + ", maHoaDon=" + maHoaDon + ", soLuong=" + soLuong + ", gia=" + gia + ", giamGia=" + giamGia + ", thanhTien=" + thanhTien + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + '}';
    }

}
