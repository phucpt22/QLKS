/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;


public class NhanVien {
    String maNV;
    String TenNV;
    String passwords;
    boolean VaiTro;
    String Hinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String TenNV, String passwords, boolean VaiTro, String Hinh) {
        this.maNV = maNV;
        this.TenNV = TenNV;
        this.passwords = passwords;
        this.VaiTro = VaiTro;
        this.Hinh = Hinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    @Override
    public String toString(){
        return this.TenNV;
    }
}
