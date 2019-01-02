package day20181225.javatime;


import java.time.LocalDate;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * @authar nieChenLiang
 * @date 2018-12-25 8:38
 */
public class LocalDateTime1 {

    public static void main(String[] args) {
        java.time.LocalDateTime ldt= java.time.LocalDateTime.now();  //获取当前时间
        java.time.LocalDateTime ldt1= java.time.LocalDateTime.of(2018,12,25,8,44,35);//获取指定日期的时间
        //date转 LocalDateTime
        Date date=new Date();
        java.time.LocalDateTime idt2=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        //LocaltDateTime 转 date
        java.time.LocalDateTime ldt3= java.time.LocalDateTime.now(ZoneId.systemDefault());
        Date date1=Date.from(ldt3.atZone(ZoneId.systemDefault()).toInstant());

        //返回两个localDateTime 的 天数差
        java.time.LocalDateTime ldt4= java.time.LocalDateTime.of(2018,12,24,8,56,25);
        java.time.LocalDateTime ldt5= java.time.LocalDateTime.now();
        long cha=ldt4.until(ldt5, ChronoUnit.DAYS);

        //昨天
        java.time.LocalDateTime now= java.time.LocalDateTime.now();
        java.time.LocalDateTime now1=now.minusDays(1);

        //上个月的今天
        java.time.LocalDateTime now2=now.minus(1,ChronoUnit.MONTHS);

        // 获取这个月的第一天
        java.time.LocalDateTime firstDayOfMonth = now.withDayOfMonth(1);
        java.time.LocalDateTime firstDayOfMonth2 = now.with(TemporalAdjusters.firstDayOfMonth());


        // 判断今天是不是生日
        LocalDate birthday = LocalDate.parse("1995-12-25");
        MonthDay birthdayInMonthDay = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay today = MonthDay.from(now);
        boolean todayIsMyBrithday = birthdayInMonthDay.equals(today);
        System.out.println(todayIsMyBrithday);
    }
}
