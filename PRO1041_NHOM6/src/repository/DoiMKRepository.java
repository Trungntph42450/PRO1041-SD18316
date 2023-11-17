/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBConnect;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class DoiMKRepository {

    PreparedStatement pst = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = null;

//    public int updatePass(String maTK) {
//        sql = "update TaiKhoan set Password=? where MaTK=?";
//        try {
//            conn = DBConnect.getConnection();
//            pst = conn.prepareStatement(sql);
//            return pst.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
//}
    public int updatePass(String maTK, String newPassword) {
        sql = "UPDATE TaiKhoan SET PassWord = ? WHERE MaTK = ?";
        try {
            conn = DBConnect.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, newPassword);
            pst.setString(2, maTK);
            return pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
