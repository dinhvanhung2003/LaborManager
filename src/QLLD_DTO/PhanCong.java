/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLLD_DTO;

/**
 *
 * @author Admin
 */
public class PhanCong {

    private int maCN;
    private String tenCN;
    private String maPC;
    private String tenCongTrinh;
    private String maCongTrinh;

    public PhanCong() {
    }

    public PhanCong(int maCN, String tenCN, String maPC, String tenCongTrinh, String maCongTrinh) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.maPC = maPC;
        this.tenCongTrinh = tenCongTrinh;
        this.maCongTrinh = maCongTrinh;

    }
    public String getMaCongTrinh() {
        return maCongTrinh;
    }

    public void setMaCongTrinh(String maCongTrinh) {
        this.maCongTrinh = maCongTrinh;
    }

    public String getMaPC() {
        return maPC;
    }

    public void setMaPC(String maPC) {
        this.maPC = maPC;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public String getTenCongTrinh() {
        return tenCongTrinh;
    }

    public void setTenCongTrinh(String tenCongTrinh) {
        this.tenCongTrinh = tenCongTrinh;
    }
    
}
