package day20181225.javatime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @authar nieChenLiang
 * @date 2018-12-25 9:31
 */
public class CalenderTest {

    public static void main(String[] args) {
        Date date = new  Date();
        Calendar calendar = Calendar.getInstance();  //得到日历
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);//获取到前一天时间..
        date = calendar.getTime();
        System.out.println(date);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String currentTime = sdf.format(date);
        System.out.println(currentTime);
    }
}
