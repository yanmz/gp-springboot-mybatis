package com.hutool;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class MyTest3 {
    public static void main(String[] args) {
        BufferedInputStream in = FileUtil.getInputStream("d:/test.txt");
        BufferedOutputStream out = FileUtil.getOutputStream("d:/test2.txt");
        long copySize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);
        System.out.println(copySize);
    }
}
