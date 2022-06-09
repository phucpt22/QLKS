/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.DichVu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.edusys.utils.JdbcHelper;

public class DichVuDAO {
    final String INSERT_SQL = "INSERT INTO DichVu (MaDV, TenDV, DonGia, TenLoaiDV, GhiChu) VALUES (?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE DichVu SET TenDV=?, DonGia=?, TenLoaiDV=?, GhiChu=? WHERE MaDV=?";
    final String DELETE_SQL = "DELETE FROM DichVu WHERE MaDV=?";
    final String SELECTALL_SQL = "SELECT * FROM DichVu";
    final String SELECTBYID_SQL = "SELECT * FROM DichVu WHERE MaDV=?";

    public void insert(DichVu entity) {
        JdbcHelper.update(INSERT_SQL, entity.getMaDV(), entity.getTenDV(), entity.getDonGia(), entity.getTenLoaiDV(),entity.getGhiChu());
    }


    public void update(DichVu entity) {
        JdbcHelper.update(UPDATE_SQL, entity.getTenDV(), entity.getDonGia(), entity.getTenLoaiDV(),entity.getGhiChu(),entity.getMaDV());    }


    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL,id);
    }


    public List<DichVu> selectAll() {
        return selectBySql(SELECTALL_SQL);
    }


    public DichVu selectById(String id) {
        List<DichVu> list = selectBySql(SELECTBYID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }


    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while(rs.next()){
                DichVu entity = new DichVu();
                entity.setMaDV(rs.getString("MaDV"));
                entity.setTenDV(rs.getString("TenDV"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setTenLoaiDV(rs.getString("TenLoaiDV"));
                entity.setGhiChu(rs.getString("GhiChu"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
