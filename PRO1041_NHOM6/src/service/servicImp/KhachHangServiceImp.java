/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.servicImp;

import java.util.List;
import service.KrantsStore;
import model.KhachHang;
import repository.KhachHangRepository;
/**
 *
 * @author ADMIN
 */
public class KhachHangServiceImp implements KrantsStore<KhachHang, String>{
    KhachHangRepository repo = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return repo.getAll();
    }

    @Override
    public int them(KhachHang k) {
        return repo.Them(k);
    }

    @Override
    public int sua(KhachHang k, String e) {
        return repo.CapNhat(k, e);
    }

    @Override
    public int xoa(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public KhachHang getOne(String e) {
        return repo.getOne(e);
    }

    @Override
    public List<KhachHang> getList(String e) {
        return repo.getList(e);
    }
    
    public List<KhachHang> listPageKH(int index){
        return repo.listPageKH(index);
    }
    
    public int tongBanGhi(){
        return repo.tongBanGhi();
    }
    
    
}
