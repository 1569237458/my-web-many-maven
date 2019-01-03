package com.niecl.helper.java_connection;

import java.sql.*;

/**
 * @authar nieChenLiang
 * @date 2019-01-03 13:23
 */
public class MySql {
    private static final String url="jdbc:mysql://127.0.0.1:3306/ssm?useUnicode=true&amp;characterEncoding=utf-8";
    private static final  String user="root";
    private  static  final  String password="1234";
    private Connection conn=null;
    private PreparedStatement pst=null;
    private ResultSet resultSet=null;

    public MySql(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到驱动类");
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
