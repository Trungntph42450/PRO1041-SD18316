/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;



/**
 *
 * @author Nguyen Thanh Trung
 */
public class HoaDon {
    private String maHoaDon;
    private String maNV;
    private String maKH;
    private String hTTT;
    private java.sql.Date ngayTao;
    private double thanhTien;
    private boolean  tranThai;
    private String ghiChu;
    private String maVoucher;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maNV, String maKH, String hTTT, Date ngayTao, double thanhTien, boolean tranThai, String ghiChu, String maVoucher) {
        this.maHoaDon = maHoaDon;
        this.maNV = maNV;
        this.maKH = maKH;
        this.hTTT = hTTT;
        this.ngayTao = ngayTao;
        this.thanhTien = thanhTien;
        this.tranThai = tranThai;
        this.ghiChu = ghiChu;
        this.maVoucher = maVoucher;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String gethTTT() {
        return hTTT;
    }

    public void sethTTT(String hTTT) {
        this.hTTT = hTTT;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public boolean isTranThai() {
        return tranThai;
    }

    public void setTranThai(boolean tranThai) {
        this.tranThai = tranThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", maNV=" + maNV + ", maKH=" + maKH + ", hTTT=" + hTTT + ", ngayTao=" + ngayTao + ", thanhTien=" + thanhTien + ", tranThai=" + tranThai + ", ghiChu=" + ghiChu + ", maVoucher=" + maVoucher + '}';
    }
    
    
}
