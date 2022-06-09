/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.edusys.utils.JdbcHelper;


public class NhanVienDAO extends EduSysDAO<NhanVien, String>{
    String INSERT_SQL = "INSERT INTO NhanVien (MaNV, TenNV, Passwords,VaiTro,Hinh) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET TenNV=?, Passwords=?,VaiTro=?,Hinh=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    String SELECTALL_SQL = "SELECT * FROM NhanVien";
    String SELECTBYID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";
    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaNV(),entity.getTenNV(), entity.getPasswords(), entity.isVaiTro(),entity.getHinh());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenNV(), entity.getPasswords(), entity.isVaiTro(),entity.getHinh(),entity.getMaNV());    
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL,id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECTALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECTBYID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setPasswords(rs.getString("Passwords"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            //rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //return list;
    }
    
}
