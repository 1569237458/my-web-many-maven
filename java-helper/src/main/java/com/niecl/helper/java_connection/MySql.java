package com.niecl.helper.java_connection;

import java.sql.*;

/**
 * @authar nieChenLiang
 * @date 2019-01-03 13:23
 */
public class MySql {
    private static final String url="jdbc:mysql://localhost:3306/ssm?useUnicode=true&characterEncoding=utf8";
    private static final  String user="root";
    private  static  final  String password="1234";
    private Connection conn=null;
    private PreparedStatement pst=null;
    private ResultSet resultSet=null;

    public MySql(){
        try {
            conn= DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
    }

    public  String getData(String sql,String book_id){
        String result=null;
        try {
            pst=conn.prepareStatement(sql);
            resultSet=pst.executeQuery();
            while (resultSet.next()){
                result=resultSet.getString(book_id);
            }
            this.clone();
        } catch (Exception e) {
            System.out.println("执行查询语句失败");
            e.printStackTrace();
        }
        return result;
    }

    private  void  close(){
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            System.out.println("关闭数据库连接失败");
            e.printStackTrace();
        }


    }



}
