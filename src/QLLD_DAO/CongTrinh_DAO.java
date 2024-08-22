/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DAO;

import java.sql.PreparedStatement;
import Connection.ConnectSQL;
import java.sql.Connection;
import java.util.ArrayList;
import QLLD_DTO.CongTrinh;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import QLLD_DTO.CongTrinh;
import QLLD_DTO.CongNhan;
import QLLD_DTO.nguoiQuanLiCongTrinh;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tri Hieu
 */
public class CongTrinh_DAO {

    ArrayList<CongTrinh> dsCT;
    CongTrinh cT;

    public CongTrinh_DAO() {
        dsCT = new ArrayList<CongTrinh>();
    }

    public ArrayList<CongTrinh> docTubang() {
        try {
            Connection con = ConnectSQL.getInstance().getConnection();
            String sql = "Select * from CongTrinh";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String maCongTrinh = rs.getString(1);
                String tenCongTrinh = rs.getString(2);
                String ngayhoanThanh = rs.getString(3);
                String maHopDong = rs.getString(4);
                String ngayKi = rs.getString(5);
                String tenNhanVien = rs.getString(6);
                String maNhanVien = rs.getString(7);
                long tongGiaTri = rs.getLong(8);
                CongTrinh ct = new CongTrinh(maCongTrinh, tenCongTrinh, ngayhoanThanh, maHopDong, ngayKi, new nguoiQuanLiCongTrinh(maNhanVien), tenNhanVien, tongGiaTri);
                dsCT.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCT;
    }

    public ArrayList<CongTrinh> getLopTheoMaCongTrinh(String MaCongTrinh) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "Select * from CongTrinh where MaCongTrinh = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, MaCongTrinh);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maCongTrinh = rs.getString(1);
                String tenCongTrinh = rs.getString(2);
                String ngayhoanThanh = rs.getString(3);
                String maHopDong = rs.getString(4);
                String ngayKi = rs.getString(5);
                String tenNhanVien = rs.getString(6);
                String maNhanVien = rs.getString(7);
                long tongGiaTri = rs.getLong(8);
                CongTrinh ct = new CongTrinh(maCongTrinh, tenCongTrinh, ngayhoanThanh, maHopDong, ngayKi, new nguoiQuanLiCongTrinh(maNhanVien), tenNhanVien, tongGiaTri);
                dsCT.add(ct);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsCT;
    }

    public String timKiemTenNhanVien(String maNV) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        String tenNV = "";
        try {
            String sql = "SELECT TenNhanVien FROM CongTrinh WHERE MaNhanVien=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maNV);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tenNV = rs.getString("TenNhanVien");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tenNV;
    }
//    //Tao

    public static boolean create(CongTrinh p) throws ParseException {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(p.getNgayKi());
            Date date1 = formatter.parse(p.getNgayHoanThanh());
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
            stmt = con.prepareStatement("INSERT INTO CongTrinh values (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getMaCongTrinh());
            stmt.setString(2, p.getTenCongTrinh());
            stmt.setDate(3, sqlDate1);
            stmt.setString(4, p.getMaHopDong());
            stmt.setDate(5, sqlDate);
            stmt.setString(6, p.getTenNhanVien());
            stmt.setString(7, String.valueOf(p.getnQLCT().getMaQuanLy()));
            stmt.setLong(8, p.getTongGiaTriHopDong());            
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public static boolean update(CongTrinh p) throws ParseException {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("UPDATE CongTrinh SET TenCongTrinh=?, NgayHoanThanh=?, MaHopDong=?, NgayKi=?,TenNhanVien=?, MaNhanVien=?, TongGiaTriHopDong=? WHERE MaCongTrinh=?");
            stmt.setString(1, p.getTenCongTrinh());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(p.getNgayKi());
            Date date1 = formatter.parse(p.getNgayHoanThanh());
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
            stmt.setDate(4, sqlDate);
            stmt.setDate(2, sqlDate1);
            stmt.setString(3, p.getMaHopDong());
            stmt.setString(5, p.getTenNhanVien());
            stmt.setInt(6, p.getnQLCT().getMaQuanLy());
            stmt.setFloat(7, p.getTongGiaTriHopDong());
            stmt.setString(8, p.getMaCongTrinh());
            n = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n > 0;
    }

    // Delete
    public boolean delete(String maCongTrinh) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("delete from CongTrinh where MaCongTrinh = ?");
            stmt.setString(1, maCongTrinh);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }
    public boolean checktrungma(String maCT){
        
         Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
//        int n=0;
         try {
            
           ConnectSQL cn = new ConnectSQL();
            con = cn.getConnection();
            String sql = "select * from CongTrinh where MaCongTrinh = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, maCT);
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showConfirmDialog(null, "Đã có mã CT");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}


