package com.example.Website.dao;

import com.example.Website.model.Cothu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CothuDAO extends DAO {
    public CothuDAO() {
        super();
    }
    public List<Cothu> getDSCothu(){
        String sql="SELECT * FROM chessplayer.tbl_player ;";
        List<Cothu> cothuList=new ArrayList<Cothu>();
        Cothu cothu=new Cothu();
        try (PreparedStatement pr=con.prepareStatement(sql)){
            ResultSet rs=pr.executeQuery();
            while (rs.next()){
                cothu=new Cothu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
                cothuList.add(cothu);
            }
            return cothuList;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
