package com.haiyang.iotest;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutPutStameTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        //字节输入流
        FileInputStream fis = null;
        try {
            //创建字节输出流
             fos = new FileOutputStream("a.txt",true);
             fis = new FileInputStream("a.txt");
             for (int i = 0 ; i < 10 ; i ++){
                 try {
                     fos.write(("hello" + i).getBytes());
                     fos.write("\n\r".getBytes());

                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             int num = 0;
             while ((num = fis.read()) != -1){
                 System.out.print((char) num);
             }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
