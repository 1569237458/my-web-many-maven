import org.junit.Test;

import java.util.Calendar;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 17:10
 */
public class TestCalendar {

    @Test
    public  void  print(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

}
