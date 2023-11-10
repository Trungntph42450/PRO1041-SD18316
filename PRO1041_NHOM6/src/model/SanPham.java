/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private boolean trangThai;
    private Integer soLuong;
    private double gia;
    private String moTa;
    private String maSac;
    private String chatLieu;
    private String kichThuoc;
    private String maLSP;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, boolean trangThai, Integer soLuong, double gia, String moTa, String maSac, String chatLieu, String kichThuoc, String maLSP) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.gia = gia;
        this.moTa = moTa;
        this.maSac = maSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
        this.maLSP = maLSP;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaSac() {
        return maSac;
    }

    public void setMaSac(String maSac) {
        this.maSac = maSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", trangThai=" + trangThai + ", soLuong=" + soLuong + ", gia=" + gia + ", moTa=" + moTa + ", maSac=" + maSac + ", chatLieu=" + chatLieu + ", kichThuoc=" + kichThuoc + ", maLSP=" + maLSP + '}';
    }
    
}
