/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DTO;

/**
 *
 * @author Admin
 */
public class TaiKhoan_DTO {
    private int maCN;
    private String tenTaiKhoan;
    private String matKhau;
    private String quyenTC;
    private String tenNV;

    public TaiKhoan_DTO() {
    }

    public TaiKhoan_DTO(int maCN, String tenTaiKhoan, String matKhau, String quyenTC, String tenNV) {
        this.maCN = maCN;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.quyenTC = quyenTC;
        this.tenNV = tenNV;
    }
    

    public int getMaCN() {
        return maCN;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getQuyenTC() {
        return quyenTC;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setQuyenTC(String quyenTC) {
        this.quyenTC = quyenTC;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

   
    
    
    
    
    
    
}
