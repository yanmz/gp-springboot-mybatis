package com.example.gpspringboot;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成唯一订单号 日期+3位递增数
 */
public class SerialGeneratorTest {
    private static final Object OBJECT = new Object();
    private static long bIndex = 0;

    /**
     * 可用多线程检测是否会产生相同随机数
     * @param length
     * @return
     */
    public static String createSerialNo(int length) {
        double max = Math.pow(10, length);
        String curSerial;
        synchronized (OBJECT) {
            if (++bIndex >= max){
                bIndex = 0;
            }
            curSerial = bIndex + "";
        }
        while (curSerial.length() < length) {
            curSerial = "0" + curSerial;
        }
        return curSerial;
    }

    @Test
    public void testCreateSerialNo() throws Exception {

        for (int i = 0; i < 1100; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String now = sdf.format(new Date());
            System.out.println(now + createSerialNo(3));
        }

    }
}
