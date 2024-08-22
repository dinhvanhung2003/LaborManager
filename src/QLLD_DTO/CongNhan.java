/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DTO;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class CongNhan {

    private int maCN;
    private String tenCN;
    private String CMND;
    private String sDT;
    private double luongcb;
    private double phuCap;
    private String diaChi;
    private String gioiTinh;
    private String chucVu;
    private String ngaySinh;

    public CongNhan() {
    }

    public CongNhan(int maCN, String tenCN, String CMND, String sDT, double luongcb, double phuCap, String diaChi, String gioiTinh, String chucVu, String ngaySinh) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.CMND = CMND;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.luongcb = luongcb;
        this.phuCap = phuCap;
    }

    public CongNhan(int maCN, String tenCN, String CMND, String sDT, double luongcb, double phuCap, String diaChi, String gioiTinh, String chucVu) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.CMND = CMND;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.luongcb = luongcb;
        this.phuCap = phuCap;
    }

    public int getMaCN() {
        return maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public String getCMND() {
        return CMND;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
}
