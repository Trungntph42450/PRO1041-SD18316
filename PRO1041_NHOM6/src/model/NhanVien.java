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
public class NhanVien {
    private String maNhanVien;
    private String maTK;
    private String hoTen;
    private boolean gioiTinh;
    private String diaChi;
    private String soDienThoai;
    private String CCCD;
    private java.sql.Date ngayVaoLam;
    private boolean trangThai;
    private String anh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String maTK, String hoTen, boolean gioiTinh, String diaChi, String soDienThoai, String CCCD, Date ngayVaoLam, boolean trangThai, String anh) {
        this.maNhanVien = maNhanVien;
        this.maTK = maTK;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.CCCD = CCCD;
        this.ngayVaoLam = ngayVaoLam;
        this.trangThai = trangThai;
        this.anh = anh;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", maTK=" + maTK + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", CCCD=" + CCCD + ", ngayVaoLam=" + ngayVaoLam + ", trangThai=" + trangThai + ", anh=" + anh + '}';
    }
    
}
