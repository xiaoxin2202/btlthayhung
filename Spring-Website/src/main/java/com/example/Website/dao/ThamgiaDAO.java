package com.example.Website.dao;

import com.example.Website.model.Thamgia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThamgiaDAO extends DAO{
    public ThamgiaDAO() {
        super();
    }
    public List<Thamgia> getThamgia(int id){
        List<Thamgia> thamgiaList=new ArrayList<Thamgia>();
        Thamgia thamgia=new Thamgia();

        String sql="SELECT * FROM chessplayer.tbl_joining where idCoThu = ? ;";
        try (PreparedStatement pr=con.prepareStatement(sql)){
            pr.setInt(1, id);
            ResultSet rs=pr.executeQuery();

            while (rs.next()){
                thamgia=new Thamgia(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                thamgiaList.add(thamgia);
            }
            return thamgiaList;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
