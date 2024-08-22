/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DAO;

import Connection.ConnectSQL;
import QLLD_DTO.nguoiQuanLiCongTrinh;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tri Hieu
 */
public class NguoiQuanLiCongTrinh_DAO {
    List<QLLD_DTO.nguoiQuanLiCongTrinh> dsNQL;

	public NguoiQuanLiCongTrinh_DAO() {
		dsNQL = new ArrayList<QLLD_DTO.nguoiQuanLiCongTrinh>();
	}
        public List<QLLD_DTO.nguoiQuanLiCongTrinh> docTuBang(){
        try {
            Connection con = ConnectSQL.getInstance().getConnection();
            String sql = "SELECT * FROM NguoiQuanLyCongTrinh";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                int maQuanLy = rs.getInt(1);
                int ID = rs.getInt(2);
                String tenQuanLy = rs.getString(3);
                String maCongTrinh = rs.getString(4);
                String tenCongTrinh = rs.getString(5);
                String tenTaiKhoan = rs.getString(6);
                String matKhau = rs.getString(7);
                nguoiQuanLiCongTrinh nQL = new nguoiQuanLiCongTrinh( maQuanLy,  ID,  tenQuanLy,  maCongTrinh,  tenCongTrinh,  tenTaiKhoan,  matKhau);
                dsNQL.add(nQL);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNQL;
    }
}
