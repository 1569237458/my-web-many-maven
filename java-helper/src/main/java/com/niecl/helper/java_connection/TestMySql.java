package com.niecl.helper.java_connection;

import org.junit.Test;

/**
 * @authar nieChenLiang
 * @date 2019-01-03 13:32
 */
public class TestMySql {

    @Test
    public void getDataFromMySql(){
        MySql mySql=new MySql();
        String result=mySql.getData("select name from book ","name");
        System.out.println(result);
    }
}