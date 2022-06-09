/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

public class DichVu {
    String MaDV;
    String TenDV;
    double DonGia;
    String TenLoaiDV;
    String GhiChu;
    public DichVu() {
    }

    public DichVu(String MaDV, String TenDV, double DonGia, String TenLoaiDV, String GhiChu) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.DonGia = DonGia;
        this.TenLoaiDV = TenLoaiDV;
        this.GhiChu = GhiChu;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public String getTenLoaiDV() {
        return TenLoaiDV;
    }

    public void setTenLoaiDV(String TenLoaiDV) {
        this.TenLoaiDV = TenLoaiDV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
