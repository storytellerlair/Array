package com.haiyang.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class FileReanWrite {

    public static void main(String[] args) throws Exception {
        //创建字节输出流和字节输入流
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");

        //读数据
       int byt = 0;

        while ((byt = fis.read()) != -1){
            fos.write(byt);
        }
        fis.close();
        fos.close();
    }



}
