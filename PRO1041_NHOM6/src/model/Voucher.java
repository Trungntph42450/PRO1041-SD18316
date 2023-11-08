/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class Voucher {
    private String maVoucher;
    private Integer soLuong;
    private boolean trangThai;

    public Voucher() {
    }

    public Voucher(String maVoucher, Integer soLuong, boolean trangThai) {
        this.maVoucher = maVoucher;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Voucher{" + "maVoucher=" + maVoucher + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
}
