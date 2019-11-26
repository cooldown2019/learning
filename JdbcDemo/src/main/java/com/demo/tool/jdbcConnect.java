package com.demo.tool;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnect {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String userName = "root";
    private static String userPwd = "admin";
    public static Connection getDBconnection(){
        String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";
        //这里的3306/后面接的test是数据库名！
        try{
            Class.forName(driverName);
            Connection con= DriverManager.getConnection(url, userName, userPwd);
            return con;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


