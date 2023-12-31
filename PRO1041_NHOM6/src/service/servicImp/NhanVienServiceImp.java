/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.servicImp;
import java.util.List;
import model.NhanVien;
import repository.NhanVienRepository;
import service.KrantsStore;
/**
 *
 * @author ADMIN
 */
public class NhanVienServiceImp implements KrantsStore<NhanVien, String>{
    NhanVienRepository repo = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return repo.getAll();
    }

    @Override
    public int them(NhanVien k) {
        return repo.insert(k);
    }

    @Override
    public int sua(NhanVien k, String e) {
        return repo.update(k, e);
    }

    @Override
    public int xoa(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien getOne(String e) {
        return repo.getOne(e);
    }

    @Override
    public List<NhanVien> getList(String e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<NhanVien> getList2(String mot ,String hai){
        return repo.getList2(mot, hai);
    }
    
    public List<NhanVien> getList3(String mot, String hai){
        return repo.getList3(mot, hai);
    }
    
    
}
