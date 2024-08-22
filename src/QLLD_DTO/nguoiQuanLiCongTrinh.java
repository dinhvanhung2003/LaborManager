/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DTO;

import java.util.Objects;

/**
 *
 * @author Tri Hieu
 */

public class nguoiQuanLiCongTrinh {
    private int MaQuanLy;
    private int ID;
    private String TenQuanLy; 
    private String MaCongTrinh;
    private String TenCongTrinh;
    private String TenTaiKhoan;
    private String MatKhau;

    public nguoiQuanLiCongTrinh(int MaQuanLy, int ID, String TenQuanLy, String MaCongTrinh, String TenCongTrinh, String TenTaiKhoan, String MatKhau) {
        this.MaQuanLy = MaQuanLy;
        this.ID = ID;
        this.TenQuanLy = TenQuanLy;
        this.MaCongTrinh = MaCongTrinh;
        this.TenCongTrinh = TenCongTrinh;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
    }
   
    public nguoiQuanLiCongTrinh(String maQuanLy){
        this.MaQuanLy = Integer.parseInt(maQuanLy);;
    }
    public int getMaQuanLy() {
        return MaQuanLy;
    }

    public void setMaQuanLy(int MaQuanLy) {
        this.MaQuanLy = MaQuanLy;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenQuanLy() {
        return TenQuanLy;
    }

    public void setTenQuanLy(String TenQuanLy) {
        this.TenQuanLy = TenQuanLy;
    }

    public String getMaCongTrinh() {
        return MaCongTrinh;
    }

    public void setMaCongTrinh(String MaCongTrinh) {
        this.MaCongTrinh = MaCongTrinh;
    }

    public String getTenCongTrinh() {
        return TenCongTrinh;
    }

    public void setTenCongTrinh(String TenCongTrinh) {
        this.TenCongTrinh = TenCongTrinh;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    @Override
    public String toString() {
        return ""+ MaQuanLy ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.MaCongTrinh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final nguoiQuanLiCongTrinh other = (nguoiQuanLiCongTrinh) obj;
        return Objects.equals(this.MaCongTrinh, other.MaCongTrinh);
    }
    
}
