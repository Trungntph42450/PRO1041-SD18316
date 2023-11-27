/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.servicImp;

import java.util.List;
import service.KrantsStore;
import model.Events;
import repository.KhuyenMaiRepository;
/**
 *
 * @author ADMIN
 */
public class KhuyenMaiServiceImp implements KrantsStore<Events, String>{
    KhuyenMaiRepository repo = new KhuyenMaiRepository();

    @Override
    public List<Events> getAll() {
        return repo.getAll();
    }

    @Override
    public int them(Events k) {
        return repo.themEvents(k);
    }

    @Override
    public int sua(Events k, String e) {
        return repo.suaEvents(k, e);
    }

    @Override
    public int xoa(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Events getOne(String e) {
        return repo.getOne(e);
    }

    @Override
    public List<Events> getList(String e) {
        return repo.getList(e);
    }
    
    public List<Events> getList2(boolean tt){
        return repo.searchTheoTrangThai(tt);
    }
    public int suaTrangThai(){
        return repo.updateTrangThai();
    }
    
    
}
