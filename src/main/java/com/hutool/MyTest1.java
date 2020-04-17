package com.hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.CharsetUtil;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyTest1 {
    public static void main(String[] args) {
        System.out.println("============================转换为字符串===================================");
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println(aStr);//aStr为"1"

        long[] b = {1,2,3,4,5};
        String bStr = Convert.toStr(b);
        System.out.println(bStr);//bStr为："[1, 2, 3, 4, 5]"

        String str = null;
        Integer integer = Convert.toInt(str);
        System.out.println(integer);

        System.out.println("============================转换为指定类型数组===================================");
        String[] b1 = { "1", "2", "3", "4" };
        //结果为Integer数组
        Integer[] intArray = Convert.toIntArray(b1);
        System.out.println(Arrays.asList(intArray));

        long[] c = {1,2,3,4,5};
        //结果为Integer数组
        Integer[] intArray2 = Convert.toIntArray(c);
        System.out.println(Arrays.asList(intArray2));

        System.out.println("============================转换为日期对象===================================");
        String a1 = "2017-05-06";
        Date value = Convert.toDate(a1);
        System.out.println(value);

        System.out.println("============================转换为集合===================================");
        Object[] a2 = {"a", "你", "好", "", 1};
        List<?> list1 = Convert.convert(List.class, a2);
        //从4.1.11开始可以这么用
        List<?> list2 = Convert.toList(a2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("============================Unicode和字符串转换===================================");
        String a3 = "我是一个小小的可爱的字符串";

        //结果为："\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32"
        String unicode = Convert.strToUnicode(a3);
        System.out.println(unicode);
        //结果为："我是一个小小的可爱的字符串"
        String raw = Convert.unicodeToStr(unicode);
        System.out.println(raw);

        System.out.println("============================编码转换===================================");
        String a4 = "我不是乱码";
        //转换后result为乱码
        String result = Convert.convertCharset(a4, CharsetUtil.UTF_8, CharsetUtil.ISO_8859_1);
        System.out.println(result);
        String raw1 = Convert.convertCharset(result, CharsetUtil.ISO_8859_1, "UTF-8");
        System.out.println(raw1);
        Assert.assertEquals(raw1, a4);

        System.out.println("============================时间单位转换===================================");
        long a5 = 4535345;
        //结果为：75
        long minutes = Convert.convertTime(a5, TimeUnit.MILLISECONDS, TimeUnit.MINUTES);
        System.out.println(minutes);

        System.out.println("============================时间单位转换===================================");
        double a6 = 67556.32;
        //结果为："陆万柒仟伍佰伍拾陆元叁角贰分"
        String digitUppercase = Convert.digitToChinese(a6);
        System.out.println(digitUppercase);


    }
}
