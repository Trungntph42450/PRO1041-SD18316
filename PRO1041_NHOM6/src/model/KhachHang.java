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
public class KhachHang {
    private String maKH;
    private String hoTen;
    private java.sql.Date ngaySinh;
    private String sdt;
    private String email;
    private boolean gioiTinh;
    private String DiaChi;
    private boolean trangThai;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, Date ngaySinh, String sdt, String email, boolean gioiTinh, String DiaChi, boolean trangThai) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.DiaChi = DiaChi;
        this.trangThai = trangThai;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", email=" + email + ", gioiTinh=" + gioiTinh + ", DiaChi=" + DiaChi + ", trangThai=" + trangThai + '}';
    }
    
}
