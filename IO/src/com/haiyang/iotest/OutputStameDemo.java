package com.haiyang.iotest;

import java.io.*;

public class OutputStameDemo {

        public static void main(String[] args) throws IOException {
            //创建字符转换输出流
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("a.txt"));
            //创建字符转换输入流
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("b.txt"));

        /*
        一次读取一个字符
         */
//        int len = 0;
//        while ((len = inputStreamReader.read()) != -1){
//            outputStreamWriter.write(len);
//        }
//        inputStreamReader.close();
//        outputStreamWriter.close();
//        }

            //一次读取一个字节数组
            int len = 0 ;
            char[] chars = new char[1024];
            while ((len = inputStreamReader.read(chars)) != -1){
                outputStreamWriter.write(chars,0,len);
            }
            inputStreamReader.close();
            outputStreamWriter.close();
        }

}
