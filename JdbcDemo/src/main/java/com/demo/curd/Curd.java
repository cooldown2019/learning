package com.demo.curd;

import com.demo.tool.jdbcConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Curd {
    public static void main(String[] args) throws Exception {
        Curd curd =new Curd();
        curd.add();
        curd.add();
        curd.add();
        curd.add();
        curd.selectAll();
        curd.del();
        curd.update();
    }
    public void selectAll() throws Exception{
        Connection con = jdbcConnect.getDBconnection();
        String sql = "select * from person";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("id")+"\t"+rs.getString("name")+"\t"+rs.getString("price")+"\t"+rs.getString("dsc"));
        }
        // 关闭资源
        rs.close();
        pst.close();
        con.close();
    }
    public void update() throws Exception{
        Connection con = jdbcConnect.getDBconnection();
        String sql = "UPDATE person SET name=?,price=? WHERE id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, "小明");
        pst.setObject(2, 3988);
        pst.setObject(003, 1);
        pst.executeUpdate();
        //关闭资源
        pst.close();
        con.close();
    }
    public void add() throws Exception{
        Connection con = jdbcConnect.getDBconnection();
        String sql = "insert  into person (name,price,dsc) value(?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, "小明");
        pst.setObject(2, 3988);
        pst.setObject(3, "1234211244");
        pst.executeUpdate();
        // 关闭资源
        pst.close();
        con.close();
    }

    public void del() throws Exception{
        Connection con = jdbcConnect.getDBconnection();
        String sql = "DELETE FROM Person WHERE id = ? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1, 2);
        pst.executeUpdate();
        // 关闭资源
        pst.close();
        con.close();
    }
}
