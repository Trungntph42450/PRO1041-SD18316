/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.servicImp;

import java.util.List;
import service.KrantsStore;
import model.KichThuoc;
import repository.KichThuocRepository;
/**
 *
 * @author ADMIN
 */
public class KichThuocServiceImp implements KrantsStore<KichThuoc, String>{
    KichThuocRepository repo = new KichThuocRepository();

    @Override
    public List<KichThuoc> getAll() {
        return repo.getAll();
    }

    @Override
    public int them(KichThuoc k) {
        return repo.them(k);
    }

    @Override
    public int sua(KichThuoc k, String e) {
        return repo.sua(k, e);
    }

    @Override
    public int xoa(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public KichThuoc getOne(String e) {
        return repo.getOne(e);
    }

    @Override
    public List<KichThuoc> getList(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<KichThuoc> listPageKT(int index){
        return repo.listPageKT(index);
    }
    public int tongBanGhi(){
        return repo.tongBanGhi();
    }
    
}
