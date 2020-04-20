package com.io;

import java.io.*;

public class MyTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\workspace");
//        listAllFiles(file);
//        copyFile("D:\\test.txt","D:\\test2.txt");
        readFileContent("D:\\test.txt");
    }
    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream inputStream = new FileInputStream(src);
        FileOutputStream outputStream = new FileOutputStream(dist);
        try {
            byte[] buffer = new byte[1*1024];
            while(inputStream.read(buffer,0,buffer.length)!=-1){
                outputStream.write(buffer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        inputStream.close();
        outputStream.close();
    }

    public static void readFileContent(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
        // 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
        // 因此只要一个 close() 调用即可
        bufferedReader.close();
    }
}
