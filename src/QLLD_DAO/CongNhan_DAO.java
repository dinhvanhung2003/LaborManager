/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import java.util.Date;
import java.util.regex.Pattern;
import Connection.ConnectSQL;
import QLLD_DTO.CongNhan;

/**
 *
 * @author Admin
 */
public class CongNhan_DAO {

    ArrayList<CongNhan> dsCongNhan;
    CongNhan cn;

    public CongNhan_DAO() {
        dsCongNhan = new ArrayList<CongNhan>();
    }

    public ArrayList<CongNhan> docTuBang() {
        try {
            Connection con = ConnectSQL.getInstance().getConnection();
            String sql = "SELECT * FROM CongNhan";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int maCN = rs.getInt(1);
                String tenCN = rs.getString(2);
                String CMND = rs.getString(3);
                String sDT = rs.getString(4);
                double luongcb = rs.getDouble(5);
                double phuCap = rs.getDouble(6);
                String diaChi = rs.getString(7);
                String gioiTinh = rs.getString(8);
                String chucVu = rs.getString(9);
                String ngaySinh = rs.getString(10);
                CongNhan congNhan = new CongNhan(maCN, tenCN, CMND, sDT, luongcb, phuCap, diaChi, gioiTinh, chucVu, ngaySinh);
                dsCongNhan.add(congNhan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCongNhan;
    }

    public ArrayList<CongNhan> getCongNhanTheoMaCN(int maCN) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "select * from CongNhan where MaCongNhan = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, maCN);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int ma = rs.getInt(1);
                String ten = rs.getString(2);
                String cmnd = rs.getString(3);
                String sdt = rs.getString(4);
                double luongcb = rs.getDouble(5);
                double phucap = rs.getDouble(6);
                String diaChi = rs.getString(7);
                String gioiTinh = rs.getString(8);
                String chucVu = rs.getString(9);
                String ngaySinh = rs.getString(10);
                CongNhan cn = new CongNhan(ma, ten, cmnd, sdt, luongcb, phucap, diaChi, gioiTinh, chucVu, ngaySinh);
                dsCongNhan.add(cn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsCongNhan;
    }
//Tao

    public static boolean create(CongNhan p) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("INSERT INTO CongNhan values (?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            stmt.setInt(1, p.getMaCN());
            stmt.setString(2, p.getTenCN());
            stmt.setString(3, p.getCMND());
            stmt.setString(4, p.getsDT());
            stmt.setDouble(5, p.getLuongcb());
            stmt.setDouble(6, p.getPhuCap());
            stmt.setString(7, p.getDiaChi());
            stmt.setString(8, p.getGioiTinh());
            stmt.setString(9, p.getChucVu());
            stmt.setString(10, p.getNgaySinh());
            n = stmt.executeUpdate();
        } catch (SQLException e) {

        }
        return n > 0;
    }
//cap nhat

    public boolean update(CongNhan p) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("UPDATE CongNhan SET TenCongNhan = ?, CMND = ?, SDT = ?, LuongCoBan = ?, PhuCap = ?, DiaChi = ?, GioiTinh = ?, ChucVu = ?, NgaySinh = ? where MaCongNhan = ?");
            stmt.setString(1, p.getTenCN());
            stmt.setString(2, p.getCMND());
            stmt.setString(3, p.getsDT());
            stmt.setDouble(4, p.getLuongcb());
            stmt.setDouble(5, p.getPhuCap());
            stmt.setString(6, p.getDiaChi());
            stmt.setString(7, p.getGioiTinh());
            stmt.setString(8, p.getChucVu());
            stmt.setString(9, p.getNgaySinh());
            stmt.setInt(10, p.getMaCN());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }
//Delete

    public boolean delete(int maCN) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("DELETE FROM CongNhan WHERE MaCongNhan = ?");
            stmt.setInt(1, maCN);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }
}
