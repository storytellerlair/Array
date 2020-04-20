package com.haiyang.iotest;

import java.io.*;

public class Test2 {

    public static void main(String[] args) throws IOException {
        //创建字符输入流
        FileReader fr = new FileReader("a.txt");
        //创建字符输出流
        FileWriter fw = new FileWriter("c.txt");

        //一次读取一个字符
        int len = 0;

        while ((len = fr.read()) != -1){
            fw.write(len);
        }

        fr.close();
        fw.close();




    }
}
