/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.sanPham_BanHang;
import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import model.Events;
import model.GioHang;
import model.HinhThucThanhToan;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import model.SanPham;
import util.DBConnect;

public class BanHangRespon {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    List<sanPham_BanHang> sanPhamList = new ArrayList<>();
    List<HoaDon> listhd = new ArrayList<>();
    List<GioHang> listGH = new ArrayList<>();

    public List<GioHang> getallGioHangByMaHD(String ma) {
        try {
            con = DBConnect.getConnection();
            sql = "Select * from GioHang where MaHoaDon=? order by Stt ";
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                GioHang gh = new GioHang(rs.getString("STT"), rs.getString("MaHoaDon"), rs.getString("MaSanPham"), rs.getString("TenSanPham"), rs.getInt("SoLuong"), rs.getString("MauSac"), rs.getString("KichThuoc"), rs.getDouble("DonGia"), rs.getDouble("ThanhTien"));
                listGH.add(gh);
            }
        } catch (Exception e) {
        }
        return listGH;
    }

    public List<sanPham_BanHang> getAllSanPham_BanHang() {
        try {
            con = DBConnect.getConnection();
            sql = "SELECT SP.MaSanPham, SP.TenSanPham, CTSP.SoLuong, CTSP.Gia, MS.TenMauSac, CL.TenChatLieu, "
                    + "KT.TenKichThuoc, SP.XuatXu, SP.TrangThai "
                    + "FROM SanPham SP "
                    + "JOIN ChiTietSanPham CTSP ON SP.MaSanPham = CTSP.MaSanPham "
                    + "JOIN MauSac MS ON CTSP.MaMauSac = MS.MaMauSac "
                    + "JOIN ChatLieu CL ON CTSP.MaChatLieu = CL.MaChatLieu "
                    + "JOIN KichThuoc KT ON CTSP.MaKichThuoc = KT.MaKichThuoc "
                    + "ORDER BY SP.MaSanPham, SP.TenSanPham, CTSP.SoLuong, CTSP.Gia, MS.TenMauSac, KT.TenKichThuoc, SP.XuatXu, CL.TenChatLieu, SP.TrangThai";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                sanPham_BanHang sp = new sanPham_BanHang(
                        rs.getString("MaSanPham"),
                        rs.getString("TenSanPham"),
                        rs.getInt("SoLuong"),
                        rs.getDouble("Gia"),
                        rs.getString("TenMauSac"),
                        rs.getString("TenKichThuoc"),
                        rs.getString("XuatXu"),
                        rs.getString("TenChatLieu"),
                        rs.getBoolean("TrangThai")
                //Thêm các trường khác tương ứng
                );
                sanPhamList.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sanPhamList;
    }

    public List<HoaDon> getAllHoaDon() {
        List<HoaDon> listhd = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            sql = "select MaHoaDon, MaNV, MaKH, HinhThucThanhToan, NgayTao, TongTien, TrangThai, GhiChu, MaEvents from hoadon where TrangThai=N'Chờ Thanh Toán'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String trangThai = "Chờ Thanh Toán";
                String httt;

                if (rs.getInt("HinhThucThanhToan") == 1) {
                    httt = "Chuyển Khoản";
                } else {
                    httt = "Tiền Mặt";
                }
                HoaDon hoaDon = new HoaDon(rs.getString("MaHoaDon"), rs.getString("MaNV"), rs.getString("MaKH"), httt, rs.getDate("NgayTao"), rs.getDouble("TongTien"), trangThai, rs.getString("GhiChu"), rs.getString("Maevents"));
                listhd.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listhd;
    }

    public int maxSTT(GioHang gh, String ma) {
        sql = "select top 1 STT from GioHang where MaHoaDon=? order by STT desc  ";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("STT");
            }

        } catch (Exception e) {
            System.out.println("Không thể lấy mã ");

        }
        return 0;
    }

    public int addGioHang(SanPham sp, int STT, String ma, String maSP, String tenSP, int soLuong, String mauSac, String kichThuoc, double donGia, double ThanhTien) {

        try {
            sql = "INSERT INTO GioHang (STT,MaHoaDon, MaSanPham, TenSanPham, SoLuong, MauSac, KichThuoc, DonGia, ThanhTien) VALUES (?, ?,?, ?, ?, ?, ?, ?, ?)";
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, STT);
            ps.setObject(2, ma);
            ps.setObject(3, maSP);
            ps.setObject(4, tenSP);
            ps.setObject(5, soLuong);
            ps.setObject(6, mauSac);
            ps.setObject(7, kichThuoc);
            ps.setObject(8, donGia);
            ps.setObject(9, ThanhTien);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lỗi");
            return 0;
        }

    }

    public int updateTongTien(GioHang gh, String ma, double thanhTien) {
        sql = "update  HoaDon set TongTien = (\n"
                + "select sum(thanhTien) from gioHang where MaHoaDon =?) where MaHoaDon =?";

        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            ps.setObject(2, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }

    public int ADDHOADON(HoaDon hoadon) {

        sql = "INSERT INTO HoaDon (MaHoaDon, MaKH, MaNV, HinhThucThanhToan, NgayTao, TongTien, TrangThai, GhiChu, MaEvents) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, hoadon.getMaHoaDon());
            ps.setObject(2, hoadon.getMakhachHang());
            ps.setObject(3, hoadon.getManhanVien());
            ps.setObject(4, hoadon.getHinhThucThanhToan());
            ps.setObject(5, hoadon.getNgayTao());
            ps.setObject(6, hoadon.getTongTien());
            ps.setObject(7, hoadon.getTrangThai());
            ps.setObject(8, hoadon.getGhiChu());
            ps.setObject(9, hoadon.getVoucher());
            int ThemRow = ps.executeUpdate();

            if (ThemRow > 0) {
                System.out.println("Hóa đơn đã được thêm thành công.");
                return 1; // Thêm thành công
            } else {
                System.out.println("Không có hóa đơn nào được thêm.");
                return 0; // Không có hàng nào được thêm
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // Lỗi trong quá trình thêm
        }

    }

    public int loadMANV(NhanVien nv) {
        sql = "SELECT MaNV FROM NhanVien";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rs.getString("MaNV");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return -1;
    }

    public int addHDCT(String ma) {
        sql = "INSERT INTO HoaDonChiTiet (MaHoaDon, MaKH, MaNV, NgayTao, GhiChu, MaSanPham, TenSanPham, SoLuong, MauSac, KichThuoc, DonGia, ThanhTien, MaEvents, TongTien, TongTienGiam, TongTienSauGiam, TrangThai) "
                + "SELECT hd.MaHoaDon, hd.MaKH, hd.MaNV, GETDATE() AS NgayTao, hd.GhiChu, gh.MaSanPham, gh.TenSanPham, gh.SoLuong, gh.MauSac, gh.KichThuoc, gh.DonGia, gh.ThanhTien, hd.MaEvents, hd.TongTien, NULL AS TongTienGiam, NULL AS TongTienSauGiam, N'Đã Hủy' AS TrangThai "
                + "FROM HoaDon hd INNER JOIN GioHang gh ON gh.MaHoaDon = hd.MaHoaDon WHERE hd.MaHoaDon = ?;";

        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
            return 0;
        }

    }
    public int upDateTrangThai(String ma){
        sql = "Update  HoaDon set TrangThai= N'Đã Hủy' where MaHoaDon =?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql);
            ps.setObject(1, ma);
           return  ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
    public int addThanhToan(String ma) {
        sql = "INSERT INTO HoaDonChiTiet (MaHoaDon, MaKH, MaNV, NgayTao, GhiChu, MaSanPham, TenSanPham, SoLuong, MauSac, KichThuoc, DonGia, ThanhTien, MaEvents, TongTien, TongTienGiam, TongTienSauGiam, TrangThai) "
                + "SELECT hd.MaHoaDon, hd.MaKH, hd.MaNV, GETDATE() AS NgayTao, hd.GhiChu, gh.MaSanPham, gh.TenSanPham, gh.SoLuong, gh.MauSac, gh.KichThuoc, gh.DonGia, gh.ThanhTien, hd.MaEvents, hd.TongTien, NULL AS TongTienGiam, NULL AS TongTienSauGiam, N'Đã Thanh Toán' AS TrangThai "
                + "FROM HoaDon hd INNER JOIN GioHang gh ON gh.MaHoaDon = hd.MaHoaDon WHERE hd.MaHoaDon = ?;";

        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
            return 0;
        }

    }
    public int upDateTrangThaiThanhToan(String ma){
        sql = "Update  HoaDon set TrangThai= N'Đã Thanh Toán' where MaHoaDon =?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql);
            ps.setObject(1, ma);
           return  ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
        public int updateSoLuong(int SoLuong,String MaSp){
        sql = "update ChiTietSanPham set SoLuong = ? where MaSanPham =?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql);
            ps.setObject(1, SoLuong);
            ps.setObject(2, MaSp);
           return  ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
          public int UpdateGhiCHu(String GhiChu,String ma){
        sql = "Update  HoaDon set GhiChu= ? where MaHoaDon =?";
        try {
            con = DBConnect.getConnection();
            ps= con.prepareStatement(sql);
            ps.setObject(1, GhiChu);
            ps.setObject(2, ma);
           return  ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
}
