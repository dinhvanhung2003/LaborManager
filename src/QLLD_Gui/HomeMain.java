/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLLD_Gui;

import Connection.ConnectSQL;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.BreakIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.management.timer.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class HomeMain extends javax.swing.JFrame {

    DangNhap dn= new  DangNhap();
    ConnectSQL cn = new ConnectSQL();
   
    Connection conn;
    ResultSet rs;

     private String username;
    public void clock() {
        javax.swing.Timer Time;

        //date  
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(d);

//time
        Time = new javax.swing.Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss a");
                String time = st.format(dt);

                lblClock.setText("Ngày: " + date + "    Giờ: " + time);
            }
        });
        Time.start();
    }

    public HomeMain() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
 
        clock();
    }
   
     public void setUsername(String username) {
        this.username = username;
        lblUser.setText(username);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                execute();
            }
        });
    }
    

    public String getUsername() {
        return this.username;
    }

 

private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }
    public String quyentruycap(){
       conn = cn.getConnection();
        
      
         String query = "Select QuyenTruyCap as quyen from TaiKhoan where TenTaiKhoan=? ";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            System.out.println("TenTaiKhoan: " + getUsername());
            st.setString(1, getUsername());
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
               return  rs.getString("quyen"); 
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return "CN";
    }
    public boolean checkquyen(MenuItem menuCongNhan, MenuItem menuPhongBan,MenuItem menuCongTrinh,MenuItem menuAdmin){
        String quyen= quyentruycap();
        if(quyen.equals("CN")){
             addMenu(menuCongNhan);
             return false;
        }else if(quyen.equals("QLCN")){
             addMenu(menuCongNhan,menuPhongBan);
             return false;
        }else if(quyen.equals("QLCT")){
             addMenu(menuCongNhan, menuCongTrinh);
             return false;
        }else if(quyen.equals("Admin")){
             addMenu(menuCongNhan, menuPhongBan,menuCongTrinh,menuAdmin);
             return false;
        }
        
        
        
        
        return true;
    }
    private void execute() {
        //icon
       
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/Image/IconDot.png"));


        //Create submenu
        MenuItem menuCN1 = new MenuItem(iconSubMenu, "Cập nhật thông tin cá nhân", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new Thaydoithongtin(username));
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem menuPB1 = new MenuItem(iconSubMenu, "Quản lý công nhân", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new CapNhatCN());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem menuPB2 = new MenuItem(iconSubMenu, "Phân công công nhân", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new PhanCongCN());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem menuPB3 = new MenuItem(iconSubMenu, "Quản lý ngày công", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                try {
                    pnlBody.add(new QuanLyNgayCong());
                } catch (SQLException ex) {
                    Logger.getLogger(HomeMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(HomeMain.class.getName()).log(Level.SEVERE, null, ex);
                }
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem menuCT1 = new MenuItem(iconSubMenu, "Quản lý công trình", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new QuanLyCongTrinh());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem menuCT2 = new MenuItem(iconSubMenu, "Thống kê", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new Thaydoithongtin(username));
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
                MenuItem menuadmin1 = new MenuItem(iconSubMenu, "Cấp tài khoản", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new CapTK());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });

        //create menu
        ImageIcon iconSanPham = new ImageIcon(getClass().getResource("/Image/IconCN.png"));
        ImageIcon iconPB = new ImageIcon(getClass().getResource("/Image/comattatca (1).png"));
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/Image/IconHome.png"));
        ImageIcon iconAdmin = new ImageIcon(getClass().getResource("/Image/IconSanPham.png"));
        MenuItem menuCongNhan = new MenuItem(iconSanPham, "Công nhân", null, menuCN1);
        MenuItem menuPhongBan = new MenuItem(iconPB, "Quản lý công nhân", null, menuPB1, menuPB2, menuPB3);
        MenuItem menuCongTrinh = new MenuItem(iconHome, "Công trình", null, menuCT1);
        MenuItem menuAdmin = new MenuItem(iconAdmin, "Admin", null, menuadmin1);
        checkquyen(menuCongNhan, menuPhongBan, menuCongTrinh, menuAdmin);

    }

    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        pnlBody = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblClock = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlashWork_Phần mềm chấm công");

        pnlMenu.setBackground(new java.awt.Color(153, 255, 255));
        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(0, 60, 179));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlBody.setBackground(new java.awt.Color(227, 255, 255));
        pnlBody.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home (3).png"))); // NOI18N
        pnlBody.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FW (2).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        lblClock.setBackground(new java.awt.Color(255, 255, 255));
        lblClock.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblClock.setText("Ngày");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("admin");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1480, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DangNhap dangNhap = new DangNhap();
        dangNhap.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
