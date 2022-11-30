package com.example.Website.dao;

import com.example.Website.model.Cothu;
import com.example.Website.model.Round;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoundDAO extends DAO {

    public RoundDAO() {
        super();
    }

    public List<Round> getDSRound() {
        String sql = "SELECT * FROM chessplayer.tbl_round ;";
        List<Round> roundList = new ArrayList<Round>();
        Round round = new Round();
        try (PreparedStatement pr = con.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                round = new Round(rs.getInt(1), rs.getString(2), rs.getString(3));
                roundList.add(round);
            }
            return roundList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
