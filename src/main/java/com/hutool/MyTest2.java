package com.hutool;

import cn.hutool.core.date.*;

import java.util.Calendar;
import java.util.Date;

public class MyTest2 {
    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        System.out.println("=================Date、long、Calendar之间的相互转换==================");
        //当前时间
        Date date = DateUtil.date();
        System.out.println(date);


        //当前时间
        Date date2 = DateUtil.date(Calendar.getInstance());
        System.out.println(date2);

        //当前时间
        Date date3 = DateUtil.date(System.currentTimeMillis());
        System.out.println(date3);

        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        System.out.println(now);

        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println(today);

        System.out.println("===================字符串转日期========================");
        String dateStr = "2017-03-01";
        Date date4 = DateUtil.parse(dateStr);
        System.out.println(date4);

        String dateStr1 = "2017-03-01";
        Date date5 = DateUtil.parse(dateStr1, "yyyy-MM-dd");
        System.out.println(date5);

        System.out.println("======================格式化日期输出=======================");
        String dateStr2 = "2017-03-01";
        Date date6 = DateUtil.parse(dateStr2);
        System.out.println(date6);

        //结果 2017/03/01
        String format = DateUtil.format(date, "yyyy/MM/dd");
        System.out.println(format);

        //常用格式的格式化，结果：2017-03-01
        String formatDate = DateUtil.formatDate(date);
        System.out.println(formatDate);

        //结果：2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date);
        System.out.println(formatDateTime);

        //结果：00:00:00
        String formatTime = DateUtil.formatTime(date);
        System.out.println(formatTime);

        System.out.println("====================获取Date对象的某个部分======================");
        Date date7 = DateUtil.date();
        //获得年的部分
        DateUtil.year(date7);
        //获得月份，从0开始计数
        DateUtil.month(date7);
        //获得月份枚举
        DateUtil.monthEnum(date7);

        System.out.println("====================开始和结束时间========================");
        String dateStr3 = "2017-03-01 22:33:23";
        Date date8 = DateUtil.parse(dateStr3);
        System.out.println(date8);
        //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date8);
        System.out.println(beginOfDay);
        //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(date8);
        System.out.println(endOfDay);

        System.out.println("=====================日期时间偏移======================");

        String dateStr5 = "2017-03-01 22:33:23";
        Date date9 = DateUtil.parse(dateStr5);

        //结果：2017-03-03 22:33:23
        Date newDate = DateUtil.offset(date9, DateField.DAY_OF_MONTH, 2);

        //常用偏移，结果：2017-03-04 22:33:23
        DateTime newDate2 = DateUtil.offsetDay(date9, 3);

        //常用偏移，结果：2017-03-01 19:33:23
        DateTime newDate3 = DateUtil.offsetHour(date9, -3);


        //昨天
        DateUtil.yesterday();
        //明天
        DateUtil.tomorrow();
        //上周
        DateUtil.lastWeek();
        //下周
        DateUtil.nextWeek();
        //上个月
        DateUtil.lastMonth();
        //下个月
        DateUtil.nextMonth();

        System.out.println("===============日期时间差================");
        String dateStr0= "2017-03-01 22:33:23";
        Date date1 = DateUtil.parse(dateStr0);

        String dateStr10 = "2017-04-01 23:33:23";
        Date da = DateUtil.parse(dateStr10);

        //相差一个月，31天
        long betweenDay = DateUtil.between(date1, da, DateUnit.DAY);
        System.out.println(betweenDay);
        //Level.MINUTE表示精确到分
        String formatBetween = DateUtil.formatBetween(betweenDay, BetweenFormater.Level.MINUTE);
        System.out.println(formatBetween);

        System.out.println(timer.interval());//花费毫秒数);
        timer.intervalRestart();//返回花费时间，并重置开始时间
        timer.intervalMinute();//花费分钟数
        System.out.println(timer.intervalMinute());
    }
}
