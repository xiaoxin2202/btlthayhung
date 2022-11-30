package com.example.Website.dao;

import java.sql.*;

public class TestDAO {
    public static Connection con;
    public static void main(String[] args){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/micro_db";
            String dbClass = "com.mysql.cj.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "123456789");
                Statement stmt= con.createStatement();
                String username="quanli1";
                String password="123456";
                System.out.println("SELECT * FROM chessplayer.tbl_manager where username = "+username+" and password = "+password+" ;");
                String sql="SELECT * FROM chessplayer.tbl_manager where username = ? and password = ? ;";
//                ResultSet rs=stmt.executeQuery();
                try(PreparedStatement pr=con.prepareStatement(sql)){
                    pr.setString(1,username);
                    pr.setString(2,password);
                    ResultSet rs=pr.executeQuery();
                    while (rs.next()){
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

                System.out.println("test");
                con.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
