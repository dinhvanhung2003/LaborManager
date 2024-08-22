/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DAO;

import QLLD_DTO.CongNhan;
import java.util.ArrayList;
import QLLD_DTO.PhanCong;
import Connection.ConnectSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinhh
 */
public class PhanCong_DAO {

    ArrayList<PhanCong> dsPhanCong;
    PhanCong pc;

    public PhanCong_DAO() {
        dsPhanCong = new ArrayList<PhanCong>();
    }

    public ArrayList<PhanCong> docTuBang() {
        try {
            Connection con = ConnectSQL.getInstance().getConnection();
            String sql = "SELECT * FROM PhanCong";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int maCN = rs.getInt(1);
                String tenCN = rs.getString(2);
                String maPC = rs.getString(3);
                String tenCT = rs.getString(4);
                String maCT = rs.getString(5);

                PhanCong phanCong = new PhanCong(maCN, tenCN, maPC, tenCT, maCT);
                dsPhanCong.add(phanCong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanCong;
    }

    public ArrayList<PhanCong> getPhanCongTheoMaPC(String maPC) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        ArrayList<PhanCong> dsPhanCong = new ArrayList<>();
        try {
            String sql = "select * from PhanCong where MaPhanCong = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maPC);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int ma = rs.getInt(1);
                String tenCN = rs.getString(2);
                String maPC_ = rs.getString(3);
                String tenCT = rs.getString(4);
                String maCT = rs.getString(5);
                PhanCong pc = new PhanCong(ma, tenCN, maPC_, tenCT, maCT);
                dsPhanCong.add(pc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsPhanCong;
    }

    public static boolean create(PhanCong pc) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("INSERT INTO PhanCong values (?, ?, ?, ?, ?)");
            stmt.setInt(1, pc.getMaCN());
            stmt.setString(2, pc.getTenCN());
            stmt.setString(3, pc.getMaPC());
            stmt.setString(4, pc.getTenCongTrinh());
            stmt.setString(5, pc.getMaCongTrinh());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean delete(String maPC) {
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("DELETE FROM PhanCong WHERE MaPhanCong= ?");
            stmt.setString(1, maPC);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public List<PhanCong> timTheoMaCongTrinh(String maCT) {
        List<PhanCong> result = new ArrayList<>();
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT * FROM PhanCong WHERE MaCongTrinh = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maCT);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int maCN = rs.getInt(1);
                String tenCN = rs.getString(2);
                String maPC = rs.getString(3);
                String tenCT = rs.getString(4);
                String maCT_ = rs.getString(5);
                PhanCong pc = new PhanCong(maCN, tenCN, maPC, tenCT, maCT_);
                result.add(pc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<PhanCong> timTheoMaCongCongNhan(int maCN1) {
        List<PhanCong> result = new ArrayList<>();
        Connection con = ConnectSQL.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            String sql = "SELECT * FROM PhanCong WHERE MaCongNhan = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, String.valueOf(maCN1));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int maCN = rs.getInt(1);
                String tenCN = rs.getString(2);
                String maPC = rs.getString(3);
                String tenCT = rs.getString(4);
                String maCT_ = rs.getString(5);
                PhanCong pc = new PhanCong(maCN, tenCN, maPC, tenCT, maCT_);
                result.add(pc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
