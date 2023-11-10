/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class LoaiSanPham {
    private String maLSP;
    private String tenSP;
    private boolean trangThai;
    private String moTa;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLSP, String tenSP, boolean trangThai, String moTa) {
        this.maLSP = maLSP;
        this.tenSP = tenSP;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "maLSP=" + maLSP + ", tenSP=" + tenSP + ", trangThai=" + trangThai + ", moTa=" + moTa + '}';
    }
    
}
