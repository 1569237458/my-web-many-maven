package com.niecl.helper.java_test_connection.test_mysql;

import org.junit.Test;

/**
 * @authar nieChenLiang
 * @date 2019-01-03 13:32
 */
public class TestMySql {

    @Test
    public void getDataFromMySql(){
        MySql mySql=new MySql();
        String result=mySql.getData("SELECT `name` from book where book_id=1000","name");
        System.out.println(result);
    }
}
