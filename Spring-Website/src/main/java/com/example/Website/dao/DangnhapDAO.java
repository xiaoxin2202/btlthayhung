package com.example.Website.dao;

import com.example.Website.model.Quanli;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DangnhapDAO extends DAO{
    public DangnhapDAO() {
        super();
    }
    public Quanli dangNhap(String username,String password) {
        String sql="SELECT * FROM chessplayer.tbl_manager where username = ? and password = ? ;";
        try (PreparedStatement pr=con.prepareStatement(sql)){
            pr.setString(1,username);
            pr.setString(2,password);
            ResultSet rs=pr.executeQuery();
            while (rs.next()){
                return new Quanli(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
