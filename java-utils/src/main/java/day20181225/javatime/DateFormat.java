package day20181225.javatime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @authar nieChenLiang
 * @date 2018-12-27 10:25
 */
public class DateFormat {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateStr=simpleDateFormat.format(date);
        System.out.println(dateStr);
    }
}
