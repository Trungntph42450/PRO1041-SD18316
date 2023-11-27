/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class HoaDon {
    private String maHoaDon;
    private String  ManhanVien;
    private String MakhachHang;
    private String hinhThucThanhToan;
    private Date ngayTao;
    private double tongTien;
    private String trangThai;
    private String ghiChu;
    private String voucher;

    public HoaDon() {
    }

 

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getManhanVien() {
        return ManhanVien;
    }

    public void setManhanVien(String ManhanVien) {
        this.ManhanVien = ManhanVien;
    }

    public String getMakhachHang() {
        return MakhachHang;
    }

    public void setMakhachHang(String MakhachHang) {
        this.MakhachHang = MakhachHang;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }



    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

//    public void setMaNV(NhanVien nhanVien) {
//         
//         NhanVien nv = new NhanVien();
//         String nv =nv.getMaNhanVien();
//}

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon(String maHoaDon, String ManhanVien, String MakhachHang, String hinhThucThanhToan, Date ngayTao, double tongTien, String trangThai, String ghiChu, String voucher) {
        this.maHoaDon = maHoaDon;
        this.ManhanVien = ManhanVien;
        this.MakhachHang = MakhachHang;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.voucher = voucher;
    }


       public Object[] dataHD(){
        return new Object[] {
            
            this.maHoaDon,this.ManhanVien,this.MakhachHang,this.hinhThucThanhToan,this.ngayTao,this.tongTien,this.trangThai,this.ghiChu,this.voucher
        };
    }

    
}
