/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DTO;
import java.util.Date;
import java.util.Objects;
import QLLD_DTO.nguoiQuanLiCongTrinh;
/**
 *
 * @author Tri Hieu
 */
public class CongTrinh {
    private String maCongTrinh;
    private String tenCongTrinh;
    private String NgayHoanThanh;
    private String maHopDong;
    private String ngayKi;
    private String tenNhanVien;
    private long tongGiaTriHopDong;
    private nguoiQuanLiCongTrinh nQLCT;
    
    public CongTrinh(String maCongTrinh){
        this.maCongTrinh = maCongTrinh;
    }
    public CongTrinh(String maCongTrinh, String tenCongTrinh, String NgayHoanThanh, String maHopDong, String ngayKi, nguoiQuanLiCongTrinh nQLCT, String tenNhanVien, long tongGiaTriHopDong ) {
        this.maCongTrinh = maCongTrinh;
        this.tenCongTrinh = tenCongTrinh;
        this.NgayHoanThanh = NgayHoanThanh;
        this.maHopDong = maHopDong;
        this.ngayKi = ngayKi;
        this.tenNhanVien = tenNhanVien;
        this.tongGiaTriHopDong = tongGiaTriHopDong;
        setnQLCT( nQLCT);
    }

    public String getMaCongTrinh() {
        return maCongTrinh;
    }

    public void setMaCongTrinh(String maCongTrinh) {
        this.maCongTrinh = maCongTrinh;
    }

    public String getTenCongTrinh() {
        return tenCongTrinh;
    }

    public void setTenCongTrinh(String tenCongTrinh) {
        this.tenCongTrinh = tenCongTrinh;
    }

    public String getNgayHoanThanh() {
        return NgayHoanThanh;
    }

    public void setNgayHoanThanh(String NgayHoanThanh) {
        this.NgayHoanThanh = NgayHoanThanh;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getNgayKi() {
        return ngayKi;
    }

    public void setNgayKi(String ngayKi) {
        this.ngayKi = ngayKi;
    }
    
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public long getTongGiaTriHopDong() {
        return tongGiaTriHopDong;
    }

    public void setTongGiaTriHopDong(long tongGiaTriHopDong) {
        this.tongGiaTriHopDong = tongGiaTriHopDong;
    }

    
    public nguoiQuanLiCongTrinh getnQLCT() {
        return nQLCT;
    }

    public void setnQLCT(nguoiQuanLiCongTrinh nQLCT) {
        this.nQLCT = nQLCT;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.maCongTrinh);
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
        final CongTrinh other = (CongTrinh) obj;
        return Objects.equals(this.maCongTrinh, other.maCongTrinh);
    }

//    public String getMaNhanVien() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

   

   
    
    
    
}
