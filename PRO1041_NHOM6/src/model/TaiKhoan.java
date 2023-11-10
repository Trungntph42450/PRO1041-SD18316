/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Thanh Trung
 */
public class TaiKhoan {
    private String maTk;
    private String userName;
    private String passWord;
    private String role;
    private boolean trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTk, String userName, String passWord, String role, boolean trangThai) {
        this.maTk = maTk;
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
        this.trangThai = trangThai;
    }

    public String getMaTk() {
        return maTk;
    }

    public void setMaTk(String maTk) {
        this.maTk = maTk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTk=" + maTk + ", userName=" + userName + ", passWord=" + passWord + ", role=" + role + ", trangThai=" + trangThai + '}';
    }
    
}
